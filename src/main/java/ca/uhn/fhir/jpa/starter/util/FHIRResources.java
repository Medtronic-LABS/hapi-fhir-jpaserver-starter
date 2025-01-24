package ca.uhn.fhir.jpa.starter.util;

import java.util.Arrays;
import java.util.List;

public class FHIRResources {
	public static final String FHIR_URI_REGEX = ".*/fhir/";
	public static final String SYSTEM_LEVEL_OPERATIONS = "System Level Operations";
	public static final String PATIENT = "Patient";
	public static final String OBSERVATION = "Observation";
	public static final String PRACTITIONER = "Practitioner";
	public static final String PRACTITIONER_ROLE = "PractitionerRole";
	public static final String ACCOUNT = "Account";
	public static final String ACTIVITY_DEFINITION = "ActivityDefinition";
	public static final String ADVERSE_EVENT = "AdverseEvent";
	public static final String ALLERGY_INTOLERANCE = "AllergyIntolerance";
	public static final String APPOINTMENT = "Appointment";
	public static final String APPOINTMENT_RESPONSE = "AppointmentResponse";
	public static final String AUDIT_EVENT = "AuditEvent";
	public static final String BASIC = "Basic";
	public static final String BINARY = "Binary";
	public static final String BIOLOGICALLY_DERIVED_PRODUCT = "BiologicallyDerivedProduct";
	public static final String BODY_STRUCTURE = "BodyStructure";
	public static final String BUNDLE = "Bundle";
	public static final String CAPABILITY_STATEMENT = "CapabilityStatement";
	public static final String CARE_PLAN = "CarePlan";
	public static final String CARE_TEAM = "CareTeam";
	public static final String CATALOG_ENTRY = "CatalogEntry";
	public static final String CHARGE_ITEM = "ChargeItem";
	public static final String CHARGE_ITEM_DEFINITION = "ChargeItemDefinition";
	public static final String CLAIM = "Claim";
	public static final String CLAIM_RESPONSE = "ClaimResponse";
	public static final String CLINICAL_IMPRESSION = "ClinicalImpression";
	public static final String CODE_SYSTEM = "CodeSystem";
	public static final String COMMUNICATION = "Communication";
	public static final String COMMUNICATION_REQUEST = "CommunicationRequest";
	public static final String COMPARTMENT_DEFINITION = "CompartmentDefinition";
	public static final String COMPOSITION = "Composition";
	public static final String CONCEPT_MAP = "ConceptMap";
	public static final String CONDITION = "Condition";
	public static final String CONSENT = "Consent";
	public static final String CONTRACT = "Contract";
	public static final String COVERAGE = "Coverage";
	public static final String COVERAGE_ELIGIBILITY_REQUEST = "CoverageEligibilityRequest";
	public static final String COVERAGE_ELIGIBILITY_RESPONSE = "CoverageEligibilityResponse";
	public static final String DETECTED_ISSUE = "DetectedIssue";
	public static final String DEVICE = "Device";
	public static final String DEVICE_DEFINITION = "DeviceDefinition";
	public static final String DEVICE_METRIC = "DeviceMetric";
	public static final String DEVICE_REQUEST = "DeviceRequest";
	public static final String DEVICE_USE_STATEMENT = "DeviceUseStatement";
	public static final String DIAGNOSTIC_REPORT = "DiagnosticReport";
	public static final String DOCUMENT_MANIFEST = "DocumentManifest";
	public static final String DOCUMENT_REFERENCE = "DocumentReference";
	public static final String EFFECT_EVIDENCE_SYNTHESIS = "EffectEvidenceSynthesis";
	public static final String ENCOUNTER = "Encounter";
	public static final String ENDPOINT = "Endpoint";
	public static final String ENROLLMENT_REQUEST = "EnrollmentRequest";
	public static final String ENROLLMENT_RESPONSE = "EnrollmentResponse";
	public static final String EPISODE_OF_CARE = "EpisodeOfCare";
	public static final String EVENT_DEFINITION = "EventDefinition";
	public static final String EVIDENCE = "Evidence";
	public static final String EVIDENCE_VARIABLE = "EvidenceVariable";
	public static final String EXAMPLE_SCENARIO = "ExampleScenario";
	public static final String EXPLANATION_OF_BENEFIT = "ExplanationOfBenefit";
	public static final String FAMILY_MEMBER_HISTORY = "FamilyMemberHistory";
	public static final String FLAG = "Flag";
	public static final String GOAL = "Goal";
	public static final String GRAPH_DEFINITION = "GraphDefinition";
	public static final String GROUP = "Group";
	public static final String GUIDANCE_RESPONSE = "GuidanceResponse";
	public static final String HEALTHCARE_SERVICE = "HealthcareService";
	public static final String IMAGING_STUDY = "ImagingStudy";
	public static final String IMMUNIZATION = "Immunization";
	public static final String IMMUNIZATION_EVALUATION = "ImmunizationEvaluation";
	public static final String IMMUNIZATION_RECOMMENDATION = "ImmunizationRecommendation";
	public static final String IMPLEMENTATION_GUIDE = "ImplementationGuide";
	public static final String INSURANCE_PLAN = "InsurancePlan";
	public static final String INVOICE = "Invoice";
	public static final String LIBRARY = "Library";
	public static final String LINKAGE = "Linkage";
	public static final String LIST = "List";
	public static final String LOCATION = "Location";
	public static final String MEASURE = "Measure";
	public static final String MEASURE_REPORT = "MeasureReport";
	public static final String MEDIA = "Media";
	public static final String MEDICATION = "Medication";
	public static final String MEDICATION_ADMINISTRATION = "MedicationAdministration";
	public static final String MEDICATION_DISPENSE = "MedicationDispense";
	public static final String MEDICATION_KNOWLEDGE = "MedicationKnowledge";
	public static final String MEDICATION_REQUEST = "MedicationRequest";
	public static final String MEDICATION_STATEMENT = "MedicationStatement";
	public static final String MEDICINAL_PRODUCT = "MedicinalProduct";
	public static final String MEDICINAL_PRODUCT_AUTHORIZATION = "MedicinalProductAuthorization";
	public static final String MEDICINAL_PRODUCT_CONTRAINDICATION = "MedicinalProductContraindication";
	public static final String MEDICINAL_PRODUCT_INDICATION = "MedicinalProductIndication";
	public static final String MEDICINAL_PRODUCT_INGREDIENT = "MedicinalProductIngredient";
	public static final String MEDICINAL_PRODUCT_INTERACTION = "MedicinalProductInteraction";
	public static final String MEDICINAL_PRODUCT_MANUFACTURED = "MedicinalProductManufactured";
	public static final String MEDICINAL_PRODUCT_PACKAGED = "MedicinalProductPackaged";
	public static final String MEDICINAL_PRODUCT_PHARMACEUTICAL = "MedicinalProductPharmaceutical";
	public static final String MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT = "MedicinalProductUndesirableEffect";
	public static final String MESSAGE_DEFINITION = "MessageDefinition";
	public static final String MESSAGE_HEADER = "MessageHeader";
	public static final String MOLECULAR_SEQUENCE = "MolecularSequence";
	public static final String NAMING_SYSTEM = "NamingSystem";
	public static final String NUTRITION_ORDER = "NutritionOrder";
	public static final String OBSERVATION_DEFINITION = "ObservationDefinition";
	public static final String OPERATION_DEFINITION = "OperationDefinition";
	public static final String OPERATION_OUTCOME = "OperationOutcome";
	public static final String ORGANIZATION = "Organization";
	public static final String ORGANIZATION_AFFILIATION = "OrganizationAffiliation";
	public static final String PARAMETERS = "Parameters";
	public static final String PAYMENT_NOTICE = "PaymentNotice";
	public static final String PAYMENT_RECONCILIATION = "PaymentReconciliation";
	public static final String PERSON = "Person";
	public static final String PLAN_DEFINITION = "PlanDefinition";
	public static final String PROCEDURE = "Procedure";
	public static final String PROVENANCE = "Provenance";
	public static final String QUESTIONNAIRE = "Questionnaire";
	public static final String QUESTIONNAIRE_RESPONSE = "QuestionnaireResponse";
	public static final String RELATED_PERSON = "RelatedPerson";
	public static final String REQUEST_GROUP = "RequestGroup";
	public static final String RESEARCH_DEFINITION = "ResearchDefinition";
	public static final String RESEARCH_ELEMENT_DEFINITION = "ResearchElementDefinition";
	public static final String RESEARCH_STUDY = "ResearchStudy";
	public static final String RESEARCH_SUBJECT = "ResearchSubject";
	public static final String RISK_ASSESSMENT = "RiskAssessment";
	public static final String RISK_EVIDENCE_SYNTHESIS = "RiskEvidenceSynthesis";
	public static final String SCHEDULE = "Schedule";
	public static final String SEARCH_PARAMETER = "SearchParameter";
	public static final String SERVICE_REQUEST = "ServiceRequest";
	public static final String SLOT = "Slot";
	public static final String SPECIMEN = "Specimen";
	public static final String SPECIMEN_DEFINITION = "SpecimenDefinition";
	public static final String STRUCTURE_DEFINITION = "StructureDefinition";
	public static final String STRUCTURE_MAP = "StructureMap";
	public static final String SUBSCRIPTION = "Subscription";
	public static final String SUBSTANCE = "Substance";
	public static final String SUBSTANCE_NUCLEIC_ACID = "SubstanceNucleicAcid";
	public static final String SUBSTANCE_POLYMER = "SubstancePolymer";
	public static final String SUBSTANCE_PROTEIN = "SubstanceProtein";
	public static final String SUBSTANCE_REFERENCE_INFORMATION = "SubstanceReferenceInformation";
	public static final String SUBSTANCE_SOURCE_MATERIAL = "SubstanceSourceMaterial";
	public static final String SUBSTANCE_SPECIFICATION = "SubstanceSpecification";
	public static final String SUPPLY_DELIVERY = "SupplyDelivery";
	public static final String SUPPLY_REQUEST = "SupplyRequest";
	public static final String TASK = "Task";
	public static final String TERMINOLOGY_CAPABILITIES = "TerminologyCapabilities";
	public static final String TEST_REPORT = "TestReport";
	public static final String TEST_SCRIPT = "TestScript";
	public static final String VALUE_SET = "ValueSet";
	public static final String VERIFICATION_RESULT = "VerificationResult";
	public static final String VISION_PRESCRIPTION = "VisionPrescription";
	public static final String BACK_SLASH = "/";
	public static final String FHIR = "fhir";
	public static final int UNAUTHORIZED_CODE = 401;
	public static final int OTHER_EXCEPTION_CODE = 500;
	public static final String AUTHORIZATION = "Authorization";
	public static final String CLIENT = "client";
	public static final String UNAUTHORIZED_ERROR_MESSAGE = "Unauthorized";
	public static final String UNAUTHORIZED_MESSAGE = "{ \"message\": %s,\"Status\": %d}";
	public static final String BEARER = "Bearer ";
	public static final String SWAGGER = "swagger-ui";
	public static final String APPLICATION_JSON = "text/x-json;charset=UTF-8";
	public static final String META_DATA = "metadata";


	protected static final List<String> ALL_RESOURCES = Arrays.asList(
		SYSTEM_LEVEL_OPERATIONS, PATIENT, OBSERVATION, PRACTITIONER, PRACTITIONER_ROLE, ACCOUNT,
		ACTIVITY_DEFINITION, ADVERSE_EVENT, ALLERGY_INTOLERANCE, APPOINTMENT, APPOINTMENT_RESPONSE,
		AUDIT_EVENT, BASIC, BINARY, BIOLOGICALLY_DERIVED_PRODUCT, BODY_STRUCTURE, BUNDLE,
		CAPABILITY_STATEMENT, CARE_PLAN, CARE_TEAM, CATALOG_ENTRY, CHARGE_ITEM,
		CHARGE_ITEM_DEFINITION, CLAIM, CLAIM_RESPONSE, CLINICAL_IMPRESSION, CODE_SYSTEM,
		COMMUNICATION, COMMUNICATION_REQUEST, COMPARTMENT_DEFINITION, COMPOSITION, CONCEPT_MAP,
		CONDITION, CONSENT, CONTRACT, COVERAGE, COVERAGE_ELIGIBILITY_REQUEST,
		COVERAGE_ELIGIBILITY_RESPONSE, DETECTED_ISSUE, DEVICE, DEVICE_DEFINITION, DEVICE_METRIC,
		DEVICE_REQUEST, DEVICE_USE_STATEMENT, DIAGNOSTIC_REPORT, DOCUMENT_MANIFEST,
		DOCUMENT_REFERENCE, EFFECT_EVIDENCE_SYNTHESIS, ENCOUNTER, ENDPOINT,
		ENROLLMENT_REQUEST, ENROLLMENT_RESPONSE, EPISODE_OF_CARE, EVENT_DEFINITION, EVIDENCE,
		EVIDENCE_VARIABLE, EXAMPLE_SCENARIO, EXPLANATION_OF_BENEFIT, FAMILY_MEMBER_HISTORY, FLAG,
		GOAL, GRAPH_DEFINITION, GROUP, GUIDANCE_RESPONSE, HEALTHCARE_SERVICE, IMAGING_STUDY,
		IMMUNIZATION, IMMUNIZATION_EVALUATION, IMMUNIZATION_RECOMMENDATION, IMPLEMENTATION_GUIDE,
		INSURANCE_PLAN, INVOICE, LIBRARY, LINKAGE, LIST, LOCATION, MEASURE, MEASURE_REPORT,
		MEDIA, MEDICATION, MEDICATION_ADMINISTRATION, MEDICATION_DISPENSE, MEDICATION_KNOWLEDGE,
		MEDICATION_REQUEST, MEDICATION_STATEMENT, MEDICINAL_PRODUCT, MEDICINAL_PRODUCT_AUTHORIZATION,
		MEDICINAL_PRODUCT_CONTRAINDICATION, MEDICINAL_PRODUCT_INDICATION, MEDICINAL_PRODUCT_INGREDIENT,
		MEDICINAL_PRODUCT_INTERACTION, MEDICINAL_PRODUCT_MANUFACTURED, MEDICINAL_PRODUCT_PACKAGED,
		MEDICINAL_PRODUCT_PHARMACEUTICAL, MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT, MESSAGE_DEFINITION,
		MESSAGE_HEADER, MOLECULAR_SEQUENCE, NAMING_SYSTEM, NUTRITION_ORDER, OBSERVATION_DEFINITION,
		OPERATION_DEFINITION, OPERATION_OUTCOME, ORGANIZATION, ORGANIZATION_AFFILIATION, PARAMETERS,
		PAYMENT_NOTICE, PAYMENT_RECONCILIATION, PERSON, PLAN_DEFINITION, PROCEDURE, PROVENANCE,
		QUESTIONNAIRE, QUESTIONNAIRE_RESPONSE, RELATED_PERSON, REQUEST_GROUP, RESEARCH_DEFINITION,
		RESEARCH_ELEMENT_DEFINITION, RESEARCH_STUDY, RESEARCH_SUBJECT, RISK_ASSESSMENT,
		RISK_EVIDENCE_SYNTHESIS, SCHEDULE, SEARCH_PARAMETER, SERVICE_REQUEST, SLOT, SPECIMEN,
		SPECIMEN_DEFINITION, STRUCTURE_DEFINITION, STRUCTURE_MAP, SUBSCRIPTION, SUBSTANCE,
		SUBSTANCE_NUCLEIC_ACID, SUBSTANCE_POLYMER, SUBSTANCE_PROTEIN, SUBSTANCE_REFERENCE_INFORMATION,
		SUBSTANCE_SOURCE_MATERIAL, SUBSTANCE_SPECIFICATION, SUPPLY_DELIVERY, SUPPLY_REQUEST, TASK,
		TERMINOLOGY_CAPABILITIES, TEST_REPORT, TEST_SCRIPT, VALUE_SET, VERIFICATION_RESULT,
		VISION_PRESCRIPTION, META_DATA);

	private FHIRResources() {

	}
}