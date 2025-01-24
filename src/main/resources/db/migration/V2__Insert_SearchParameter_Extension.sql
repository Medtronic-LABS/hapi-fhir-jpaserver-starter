-- V2024_05__Insert_SearchParameter_Extension.sql
CREATE SEQUENCE IF NOT EXISTS SEQ_HFJ_RESOURCE START WITH 1 INCREMENT BY 1 NO MINVALUE NO MAXVALUE CACHE 1;
SELECT SETVAL('SEQ_HFJ_RESOURCE', (SELECT MAX(RES_ID) FROM HFJ_RESOURCE));

CREATE SEQUENCE IF NOT EXISTS SEQ_HFJ_RES_VER START WITH 1 INCREMENT BY 1 NO MINVALUE NO MAXVALUE CACHE 1;
SELECT SETVAL('SEQ_HFJ_RES_VER', (SELECT MAX(PID) FROM HFJ_RES_VER));

CREATE SEQUENCE IF NOT EXISTS SEQ_HFJ_RES_LINK START WITH 1 INCREMENT BY 1 NO MINVALUE NO MAXVALUE CACHE 1;
SELECT SETVAL('SEQ_HFJ_RES_LINK', (SELECT MAX(PID) FROM HFJ_RES_LINK));

INSERT INTO public.hfj_resource
(res_id, partition_date, partition_id, res_deleted_at, res_version, has_tags, res_published, res_updated, fhir_id, sp_has_links, hash_sha256, sp_index_status, res_language, sp_cmpstr_uniq_present, sp_cmptoks_present, sp_coords_present, sp_date_present, sp_number_present, sp_quantity_nrml_present, sp_quantity_present, sp_string_present, sp_token_present, sp_uri_present, res_type, search_url_present, res_ver)
VALUES(nextval('SEQ_HFJ_RESOURCE'), NULL, NULL, NULL, 'R4', false, now(), now(), currval('SEQ_HFJ_RESOURCE'), false, NULL, 1, NULL, false, false, false, false, false, false, false, true, true, true, 'SearchParameter', false, 1);

INSERT INTO public.hfj_res_ver
(pid, partition_date, partition_id, res_deleted_at, res_version, has_tags, res_published, res_updated, res_encoding, request_id, res_text, res_id, res_text_vc, res_type, res_ver, source_uri)
VALUES(nextval('SEQ_HFJ_RES_VER'), NULL, NULL, NULL, 'R4', false, now(), now(), 'JSON', NULL, NULL, currval('SEQ_HFJ_RESOURCE'), '{
                                                                                                                                    "resourceType": "SearchParameter",
                                                                                                                                    "url": "http://mdtlabs.com/fhir/SearchParameter/RelatedPerson-phone",
                                                                                                                                    "name": "Search RelatedPerson by phone number",
                                                                                                                                    "status": "active",
                                                                                                                                    "publisher": "Medtronic LABS",
                                                                                                                                    "purpose": "Need to search for RelatedPerson by phone number",
                                                                                                                                    "description": "Search RelatedPerson by phone number",
                                                                                                                                    "code": "phone-search",
                                                                                                                                    "base": [
                                                                                                                                      "RelatedPerson"
                                                                                                                                    ],
                                                                                                                                    "type": "string",
                                                                                                                                    "expression": "RelatedPerson.telecom.where(system=''phone'')",
                                                                                                                                    "xpath": "f:RelatedPerson/f:telecom[f:system/@value=''phone'']/f:value",
                                                                                                                                    "xpathUsage": "normal"
                                                                                                                                  }', 'SearchParameter', 1, NULL);

INSERT INTO public.hfj_resource
(res_id, partition_date, partition_id, res_deleted_at, res_version, has_tags, res_published, res_updated, fhir_id, sp_has_links, hash_sha256, sp_index_status, res_language, sp_cmpstr_uniq_present, sp_cmptoks_present, sp_coords_present, sp_date_present, sp_number_present, sp_quantity_nrml_present, sp_quantity_present, sp_string_present, sp_token_present, sp_uri_present, res_type, search_url_present, res_ver)
VALUES(nextval('SEQ_HFJ_RESOURCE'), NULL, NULL, NULL, 'R4', false, now(), now(), currval('SEQ_HFJ_RESOURCE'), false, NULL, 1, NULL, false, false, false, false, false, false, false, true, true, true, 'SearchParameter', false, 1);

INSERT INTO public.hfj_res_ver
(pid, partition_date, partition_id, res_deleted_at, res_version, has_tags, res_published, res_updated, res_encoding, request_id, res_text, res_id, res_text_vc, res_type, res_ver, source_uri)
VALUES(nextval('SEQ_HFJ_RES_VER'), NULL, NULL, NULL, 'R4', false, now(), now(), 'JSON', NULL, NULL, currval('SEQ_HFJ_RESOURCE'), '{
                                                                                                                                  "resourceType": "SearchParameter",
                                                                                                                                  "url": "http://mdtlabs.com/fhir/SearchParameter/Patient-phone",
                                                                                                                                  "name": "Search Patient by phone number",
                                                                                                                                  "status": "active",
                                                                                                                                  "publisher": "Medtronic LABS",
                                                                                                                                  "purpose": "Need to search for Patient by phone number",
                                                                                                                                  "description": "Search Patient by phone number",
                                                                                                                                  "code": "phone-search",
                                                                                                                                  "base": [
                                                                                                                                  "Patient"
                                                                                                                                  ],
                                                                                                                                  "type": "string",
                                                                                                                                  "expression": "Patient.telecom.where(system=''phone'')",
                                                                                                                                  "xpath": "f:Patient/f:telecom[f:system/@value=''phone'']/f:value",
                                                                                                                                  "xpathUsage": "normal"
                                                                                                                                  }', 'SearchParameter', 1, NULL);

INSERT INTO public.hfj_resource
(res_id, partition_date, partition_id, res_deleted_at, res_version, has_tags, res_published, res_updated, fhir_id, sp_has_links, hash_sha256, sp_index_status, res_language, sp_cmpstr_uniq_present, sp_cmptoks_present, sp_coords_present, sp_date_present, sp_number_present, sp_quantity_nrml_present, sp_quantity_present, sp_string_present, sp_token_present, sp_uri_present, res_type, search_url_present, res_ver)
VALUES(nextval('SEQ_HFJ_RESOURCE'), NULL, NULL, NULL, 'R4', false, now(), now(), currval('SEQ_HFJ_RESOURCE'), false, NULL, 1, NULL, false, false, false, false, false, false, false, true, true, true, 'SearchParameter', false, 1);

INSERT INTO public.hfj_res_ver
(pid, partition_date, partition_id, res_deleted_at, res_version, has_tags, res_published, res_updated, res_encoding, request_id, res_text, res_id, res_text_vc, res_type, res_ver, source_uri)
VALUES(nextval('SEQ_HFJ_RES_VER'), NULL, NULL, NULL, 'R4', false, now(), now(), 'JSON', NULL, NULL, currval('SEQ_HFJ_RESOURCE'), '{
                                                                                                                                  "resourceType": "SearchParameter",
                                                                                                                                  "url": "http://mdtlabs.com/fhir/SearchParameter/RelatedPerson-patient-id",
                                                                                                                                  "name": "Search RelatedPerson by Patient Unique ID (Publisher generated)",
                                                                                                                                  "status": "active",
                                                                                                                                  "publisher": "Medtronic LABS",
                                                                                                                                  "purpose": "Need to search for RelatedPerson by Patient Unique ID (Publisher generated)",
                                                                                                                                  "description": "Search RelatedPerson by Patient Unique ID (Publisher generated)",
                                                                                                                                  "code": "patient-id-search",
                                                                                                                                  "base": [
                                                                                                                                  "RelatedPerson"
                                                                                                                                  ],
                                                                                                                                  "type": "string",
                                                                                                                                  "expression": "RelatedPerson.identifier.where(system=''http://mdtlabs.com/patient-id'').value",
                                                                                                                                  "xpath": "f:RelatedPerson/f:identifier[f:system/@value=''http://mdtlabs.com/patient-id'']/f:value",
                                                                                                                                  "xpathUsage": "normal"
                                                                                                                                  }', 'SearchParameter', 1, NULL);

INSERT INTO public.hfj_resource
(res_id, partition_date, partition_id, res_deleted_at, res_version, has_tags, res_published, res_updated, fhir_id, sp_has_links, hash_sha256, sp_index_status, res_language, sp_cmpstr_uniq_present, sp_cmptoks_present, sp_coords_present, sp_date_present, sp_number_present, sp_quantity_nrml_present, sp_quantity_present, sp_string_present, sp_token_present, sp_uri_present, res_type, search_url_present, res_ver)
VALUES(nextval('SEQ_HFJ_RESOURCE'), NULL, NULL, NULL, 'R4', false, now(), now(), currval('SEQ_HFJ_RESOURCE'), false, NULL, 1, NULL, false, false, false, false, false, false, false, true, true, true, 'SearchParameter', false, 1);

INSERT INTO public.hfj_res_ver
(pid, partition_date, partition_id, res_deleted_at, res_version, has_tags, res_published, res_updated, res_encoding, request_id, res_text, res_id, res_text_vc, res_type, res_ver, source_uri)
VALUES(nextval('SEQ_HFJ_RES_VER'), NULL, NULL, NULL, 'R4', false, now(), now(), 'JSON', NULL, NULL, currval('SEQ_HFJ_RESOURCE'), '{
                                                                                                                                  "resourceType": "SearchParameter",
                                                                                                                                  "url": "http://mdtlabs.com/fhir/SearchParameter/Patient-patient-id",
                                                                                                                                  "name": "Search Patient by Patient Unique ID (Publisher generated)",
                                                                                                                                  "status": "active",
                                                                                                                                  "publisher": "Medtronic LABS",
                                                                                                                                  "purpose": "Need to search for Patient by Patient Unique ID (Publisher generated)",
                                                                                                                                  "description": "Search Patient by Patient Unique ID (Publisher generated)",
                                                                                                                                  "code": "patient-id-search",
                                                                                                                                  "base": [
                                                                                                                                  "Patient"
                                                                                                                                  ],
                                                                                                                                  "type": "string",
                                                                                                                                  "expression": "Patient.identifier.where(system=''http://mdtlabs.com/patient-id'').value",
                                                                                                                                  "xpath": "f:Patient/f:identifier[f:system/@value=''http://mdtlabs.com/patient-id'']/f:value",
                                                                                                                                  "xpathUsage": "normal"
                                                                                                                                  }', 'SearchParameter', 1, NULL);

INSERT INTO public.hfj_resource
(res_id, partition_date, partition_id, res_deleted_at, res_version, has_tags, res_published, res_updated, fhir_id, sp_has_links, hash_sha256, sp_index_status, res_language, sp_cmpstr_uniq_present, sp_cmptoks_present, sp_coords_present, sp_date_present, sp_number_present, sp_quantity_nrml_present, sp_quantity_present, sp_string_present, sp_token_present, sp_uri_present, res_type, search_url_present, res_ver)
VALUES(nextval('SEQ_HFJ_RESOURCE'), NULL, NULL, NULL, 'R4', false, now(), now(), currval('SEQ_HFJ_RESOURCE'), true, NULL, 1, NULL, false, false, false, false, false, false, false, true, true, true, 'StructureDefinition', false, 1);

INSERT INTO public.hfj_res_ver
(pid, partition_date, partition_id, res_deleted_at, res_version, has_tags, res_published, res_updated, res_encoding, request_id, res_text, res_id, res_text_vc, res_type, res_ver, source_uri)
VALUES(nextval('SEQ_HFJ_RES_VER'), NULL, NULL, NULL, 'R4', false, now(), now(), 'JSON', NULL, NULL, currval('SEQ_HFJ_RESOURCE'), '{
                                                                                                                                    "resourceType": "StructureDefinition",
                                                                                                                                    "url": "http://mdtlabs.com/fhir/StructureDefinition/pregnant-status",
                                                                                                                                    "name": "ExtensionIsPregnantYesorNo",
                                                                                                                                    "title": "Is Pregnant Yes or No Extension",
                                                                                                                                    "status": "active",
                                                                                                                                    "publisher": "Medtronic Labs",
                                                                                                                                    "description": "An extension to capture the pregnancy status of a patient or related person.",
                                                                                                                                    "kind": "complex-type",
                                                                                                                                    "abstract": false,
                                                                                                                                    "context": [
                                                                                                                                      {
                                                                                                                                        "type": "element",
                                                                                                                                        "expression": "Patient"
                                                                                                                                      },
                                                                                                                                      {
                                                                                                                                        "type": "element",
                                                                                                                                        "expression": "RelatedPerson"
                                                                                                                                      }
                                                                                                                                    ],
                                                                                                                                    "type": "Extension",
                                                                                                                                    "baseDefinition": "http://hl7.org/fhir/StructureDefinition/Extension"
                                                                                                                                  }', 'StructureDefinition', 1, NULL);

INSERT INTO public.hfj_res_link
(pid, partition_date, partition_id, src_path, src_resource_id, source_resource_type, target_resource_id, target_resource_type, target_resource_url, target_resource_version, sp_updated)
VALUES(nextval('SEQ_HFJ_RES_LINK'), NULL, NULL, 'StructureDefinition.baseDefinition', currval('SEQ_HFJ_RESOURCE'), 'StructureDefinition', NULL, '(unknown)', 'http://hl7.org/fhir/StructureDefinition/Extension', NULL, now());

INSERT INTO public.hfj_resource
(res_id, partition_date, partition_id, res_deleted_at, res_version, has_tags, res_published, res_updated, fhir_id, sp_has_links, hash_sha256, sp_index_status, res_language, sp_cmpstr_uniq_present, sp_cmptoks_present, sp_coords_present, sp_date_present, sp_number_present, sp_quantity_nrml_present, sp_quantity_present, sp_string_present, sp_token_present, sp_uri_present, res_type, search_url_present, res_ver)
VALUES(nextval('SEQ_HFJ_RESOURCE'), NULL, NULL, NULL, 'R4', false, now(), now(), currval('SEQ_HFJ_RESOURCE'), false, NULL, 1, NULL, false, false, false, false, false, false, false, true, true, true, 'SearchParameter', false, 1);

INSERT INTO public.hfj_res_ver
(pid, partition_date, partition_id, res_deleted_at, res_version, has_tags, res_published, res_updated, res_encoding, request_id, res_text, res_id, res_text_vc, res_type, res_ver, source_uri)
VALUES(nextval('SEQ_HFJ_RES_VER'), NULL, NULL, NULL, 'R4', false, now(), now(), 'JSON', NULL, NULL, currval('SEQ_HFJ_RESOURCE'), '{
                                                                                                                                  "resourceType": "SearchParameter",
                                                                                                                                  "url": "http://mdtlabs.com/fhir/SearchParameter/Patient-isPregnant-extension",
                                                                                                                                  "name": "Search Patient by extension",
                                                                                                                                  "status": "active",
                                                                                                                                  "publisher": "Medtronic LABS",
                                                                                                                                  "purpose": "Need to search for Patient by extension",
                                                                                                                                  "description": "Search Patient by extension",
                                                                                                                                  "code": "pregnancy-extension-search",
                                                                                                                                  "base": [
                                                                                                                                        "Patient"
                                                                                                                                  ],
                                                                                                                                  "type": "string",
                                                                                                                                  "expression": "Patient.extension.where(url=''http://mdtlabs.com/fhir/StructureDefinition/pregnant-status'')"
                                                                                                                                  }', 'SearchParameter', 1, NULL);

INSERT INTO public.hfj_resource
(res_id, partition_date, partition_id, res_deleted_at, res_version, has_tags, res_published, res_updated, fhir_id, sp_has_links, hash_sha256, sp_index_status, res_language, sp_cmpstr_uniq_present, sp_cmptoks_present, sp_coords_present, sp_date_present, sp_number_present, sp_quantity_nrml_present, sp_quantity_present, sp_string_present, sp_token_present, sp_uri_present, res_type, search_url_present, res_ver)
VALUES(nextval('SEQ_HFJ_RESOURCE'), NULL, NULL, NULL, 'R4', false, now(), now(), currval('SEQ_HFJ_RESOURCE'), false, NULL, 1, NULL, false, false, false, false, false, false, false, true, true, true, 'SearchParameter', false, 1);

INSERT INTO public.hfj_res_ver
(pid, partition_date, partition_id, res_deleted_at, res_version, has_tags, res_published, res_updated, res_encoding, request_id, res_text, res_id, res_text_vc, res_type, res_ver, source_uri)
VALUES(nextval('SEQ_HFJ_RES_VER'), NULL, NULL, NULL, 'R4', false, now(), now(), 'JSON', NULL, NULL, currval('SEQ_HFJ_RESOURCE'), '{
                                                                                                                                  "resourceType": "SearchParameter",
                                                                                                                                  "url": "http://mdtlabs.com/fhir/SearchParameter/RelatedPerson-isPregnant-extension",
                                                                                                                                  "name": "Search RelatedPerson by extension",
                                                                                                                                  "status": "active",
                                                                                                                                  "publisher": "Medtronic LABS",
                                                                                                                                  "purpose": "Need to search for RelatedPerson by extension",
                                                                                                                                  "description": "Search RelatedPerson by extension",
                                                                                                                                  "code": "pregnancy-extension-search",
                                                                                                                                  "base": [
                                                                                                                                      "RelatedPerson"
                                                                                                                                  ],
                                                                                                                                  "type": "string",
                                                                                                                                  "expression": "RelatedPerson.extension.where(url=''http://mdtlabs.com/fhir/StructureDefinition/pregnant-status'')"
                                                                                                                                  }', 'SearchParameter', 1, NULL);

INSERT INTO public.hfj_resource
(res_id, partition_date, partition_id, res_deleted_at, res_version, has_tags, res_published, res_updated, fhir_id, sp_has_links, hash_sha256, sp_index_status, res_language, sp_cmpstr_uniq_present, sp_cmptoks_present, sp_coords_present, sp_date_present, sp_number_present, sp_quantity_nrml_present, sp_quantity_present, sp_string_present, sp_token_present, sp_uri_present, res_type, search_url_present, res_ver)
VALUES(nextval('SEQ_HFJ_RESOURCE'), NULL, NULL, NULL, 'R4', false, now(), now(), currval('SEQ_HFJ_RESOURCE'), false, NULL, 1, NULL, false, false, false, false, false, false, false, true, true, true, 'SearchParameter', false, 1);

INSERT INTO public.hfj_res_ver
(pid, partition_date, partition_id, res_deleted_at, res_version, has_tags, res_published, res_updated, res_encoding, request_id, res_text, res_id, res_text_vc, res_type, res_ver, source_uri)
VALUES(nextval('SEQ_HFJ_RES_VER'), NULL, NULL, NULL, 'R4', false, now(), now(), 'JSON', NULL, NULL, currval('SEQ_HFJ_RESOURCE'), '{
                                                                                                                                    "resourceType": "SearchParameter",
                                                                                                                                    "url": "http://mdtlabs.com/fhir/SearchParameter/Provenance-onBehalfOf",
                                                                                                                                    "name": "Search Provenance by Organization",
                                                                                                                                    "status": "active",
                                                                                                                                    "publisher": "Medtronic LABS",
                                                                                                                                    "description": "Search Provenance by Organization",
                                                                                                                                    "purpose": "Need to search for Provenance by Organization",
                                                                                                                                    "code": "on-behalf-of",
                                                                                                                                    "base": [
                                                                                                                                      "Provenance"
                                                                                                                                    ],
                                                                                                                                    "type": "reference",
                                                                                                                                    "expression": "Provenance.agent.onBehalfOf"
                                                                                                                                  }', 'SearchParameter', 1, NULL);

