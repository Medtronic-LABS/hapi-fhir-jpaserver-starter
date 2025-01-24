package ca.uhn.fhir.jpa.starter.util;

import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import ca.uhn.fhir.interceptor.api.Interceptor;
import ca.uhn.fhir.rest.server.interceptor.InterceptorAdapter;

@Component
@Interceptor
public class AuthenticationInterceptor extends InterceptorAdapter {

	private static final Logger log = LoggerFactory.getLogger(AuthenticationInterceptor.class);

	@Value("${app.validate-token-api}")
	private String targetUrl;

	/**
	 * Overrides the incomingRequestPreProcessed method to handle authentication
	 * logic.
	 *
	 * @param request  The incoming HttpServletRequest.
	 * @param response The HttpServletResponse to be modified if needed.
	 * @return True if the request has been pre-processed; false otherwise.
	 */
	@Override
	public boolean incomingRequestPreProcessed(HttpServletRequest request, HttpServletResponse response) {
		String uri = request.getRequestURI();
		String token = request.getHeader(HttpHeaders.AUTHORIZATION);
		String client = request.getHeader(FHIRResources.CLIENT);
		Pattern pattern = Pattern.compile(FHIRResources.FHIR_URI_REGEX);
		Matcher matcher = pattern.matcher(uri);
		log.info("Incoming request URI {} ", request.getRequestURI());
		if (request.getRequestURI().contains(FHIRResources.SWAGGER)) {
			return super.incomingRequestPreProcessed(request, response);
		}
		try {
			if (StringUtils.isNoneBlank(token) && StringUtils.isNoneBlank(client)
				&& token.startsWith(FHIRResources.BEARER) && (matcher.matches()
				|| isFhirResourceRequest(uri))) {
				makeRestCallWithAuthorization(token, 	client);
				return super.incomingRequestPreProcessed(request, response);
			} else {
				errorResponseWriter(response, FHIRResources.UNAUTHORIZED_ERROR_MESSAGE,
					FHIRResources.UNAUTHORIZED_CODE);
			}
		} catch (HttpClientErrorException.Unauthorized exception) {
			errorResponseWriter(response, FHIRResources.UNAUTHORIZED_ERROR_MESSAGE, FHIRResources.UNAUTHORIZED_CODE);
		} catch (HttpStatusCodeException exception) {
			errorResponseWriter(response, exception.getMessage(), exception.getRawStatusCode());
		} catch (Exception exception) {
			errorResponseWriter(response, exception.getMessage(), FHIRResources.OTHER_EXCEPTION_CODE);
		}
		return false;
	}

	/**
	 * Checks if the given URI corresponds to a FHIR resource request.
	 *
	 * @param uri The URI to be checked.
	 * @return True if the URI represents a FHIR resource request; false otherwise.
	 */
	private boolean isFhirResourceRequest(String uri) {
		List<String> resources = FHIRResources.ALL_RESOURCES;
		return resources.stream().anyMatch(resource -> uri
			.contains(FHIRResources.BACK_SLASH + FHIRResources.FHIR + FHIRResources.BACK_SLASH + resource));
	}

	/**
	 * Write Error Messages in Response
	 *
	 * @param message Error Message
	 * @param code    status code
	 * @throws IOException If an I/O error occurs.
	 */
	private void errorResponseWriter(HttpServletResponse response, String message, int code) {
		try {
			response.setStatus(code);
			response.getWriter().write(String.format(FHIRResources.UNAUTHORIZED_MESSAGE, message, code));
			response.setContentType(FHIRResources.APPLICATION_JSON);
		} catch (IOException e) {
			log.error("Exception during Response Write", e);
			throw new UnsupportedOperationException(e);
		}
	}

	/**
	 * Makes a REST call with the provided access key ID and secret access key for
	 * authorization.
	 *
	 * @param token access token.
	 * @throws IOException If an I/O error occurs.
	 */
	private ResponseEntity<String> makeRestCallWithAuthorization(String token, String client) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set(FHIRResources.AUTHORIZATION, token);
		headers.set(FHIRResources.CLIENT, client);
		HttpEntity<String> requestEntity = new HttpEntity<>(headers);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> authResponse = restTemplate.postForEntity(targetUrl, requestEntity, String.class);
		return authResponse;
	}

}
