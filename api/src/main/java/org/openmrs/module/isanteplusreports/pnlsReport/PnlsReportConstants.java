package org.openmrs.module.isanteplusreports.pnlsReport;

import static org.openmrs.module.isanteplusreports.util.IsantePlusReportsConstants.REPORTS_SQL_PATH;

public class PnlsReportConstants {
	
	public static final String PNLS_REPORTS_RESOURCE_PATH = REPORTS_SQL_PATH + "pnlsIndicatorReport/";
	
	public static final String PNLS_GENERAL_PURPOSE_SUFFIX = "_PNLS";
			
	public final static String NEWLY_ENROLLED_PATIENTS_ON_ART_SQL = "newPatientsEnrolledOnART.sql";
	
	public final static String REFERRED_IN_PATIENTS_ENROLED_ON_ART_SQL = "refferedInPatientsEnrolledOnArt.sql";
	
	public final static String NEW_BREAST_FEEDING_WOMEN_ENROLED_ON_ART_SQL ="newlyEnrolledBreatFeedingWomen.sql";
	
	public final static String NEW_REFERRED_IN_BREAST_FEEDING_WOMEN_ENROLED_ON_ART_SQL ="newlyReferredInBreatFeedingWomen.sql";
	
	public final static String NOT_ENROLED_ON_ART_COHORT_INDICATOR_SQL ="notEnrolledOnArtCorhortIndicator.sql";
	
	//Dimension corhots by Reason of Non Enrollment NOTE THAT THE SQL FILES BELOW ARE STILL DUMMY
	public final static String COHORT_NON_ENROLLMENT_REASON_OTHER_SQL = "notEnrolledReasonOther.sql";
	
	public final static String COHORT_NON_ENROLLMENT_REASON_DIED_SQL = "notEnrolledReasonDied.sql";
	
	public final static String COHORT_NON_ENROLLMENT_REASON_VOLUNTARY_SQL = "notEnrolledReasonVoluntary.sql";
	
	public final static String COHORT_NON_ENROLLMENT_REASON_DENIAL_SQL = "notEnrolledReasonDenial.sql";
	
	public final static String COHORT_NON_ENROLLMENT_REASON_MEDICAL_SQL = "notEnrolledReasonMedical.sql";
	
	public final static String COHORT_NON_ENROLLMENT_REASON_REFERRED_SQL = "notEnrolledReasonReferred.sql";
	
	public final static String COHORT_NEW_PATIENTS_ON_ART_STARTED_WITH_TB_TREATMENT_SQL ="NewlyEnrolledOnArtStartedTbTreatment.sql";
	
	public final static String COHORT_PATIENTS_ALREADY_ON_ART_STARTED_WITH_TB_TREATMENT_SQL ="AlreadyOnArtStartedTbTreatment.sql";
	
	public final static String COHORT_NEW_PATIENTS_ON_ART_COMPLETED_TB_TREATMENT_SQL ="NewlyEnrolledOnArtCompletedTbTreatment.sql";
	
	public final static String COHORT_PATIENTS_ALREADY_ON_ART_COMPLETED_TB_TREATMENT_SQL ="AlreadyOnArtCompletedTbTreatment.sql";
	
	public final static String COHORT_NEWLY_ENROLLED_PATIENTS_ON_ART_SCRENEES_POSTIVE_SQL ="NewlyEnrolledOnArtScreeneesPostive.sql";
	
	public final static String COHORT_PATIENTS_ALREADY_ON_ART_SCRENEES_POSTIVE_SQL ="AlreadyOnArtScreeneesPostive.sql";
	
    public final static String COHORT_NEWLY_ENROLLED_PATIENTS_ON_ART_SCRENEES_NEGATIVE_SQL ="NewlyEnrolledOnArtScreeneesNegative.sql";
	
	public final static String COHORT_PATIENTS_ALREADY_ON_ART_SCRENEES_NEGATIVE_SQL ="AlreadyOnArtScreeneesNegative.sql";
	
	public final static String BREAST_FEEDING_WOMEN_NOT_YET_ENROLED_ON_ART_SQL ="breastFeedingWomenNotYetEnrolledOnArt.sql";
	
	public final static String NEWLYLY_ENROLLED_ARV_PATIENTS_AND_NEWLY_PLACED_ON_TB_TREATMENT_SQL = "patientsNewlyenrolledOnArvsAndTbTreatment.sql";
		
	public final static String PATIENTS_ALREADY_ON_ARVS_AND_ALREADY_PLACED_ON_TB_TREATMENT_SQL = "patientsAlreadyOnArvsAndTbTreatment.sql";
	
	public final static String TB_HIV_PATIENTS_ON_TB_TREATMENT_SQL = "tbHivPatientsOnTbTreatment.sql";
	
	public final static String TB_HIV_PATIENTS_NEWLY_ENROLLED_ON_ART_ON_TB_TREATMENT_SQL = "tbHivPatientsNewlyEntolledOnArtOnTbTreatment.sql";
	
	public final static String TB_HIV_PATIENTS_ALREADY_ON_ART_ON_TB_TREATMENT_SQL = "tbHivPatientsAlreadyOnArtOnTbTreatment.sql";
	
	public final static String ACTIVE_HIV_PATIENTS_SQL = "activeHivPatients.sql";
	
	public final static String ACTIVE_ARV_PATIENTS_LESS_3MONTHS_SQL = "activeHivPatientsLess3Months.sql";
	
	public final static String ACTIVE_ARV_PATIENTS_BTN_3_5MONTHS_SQL = "activeHivPatientsBtn3_5Months.sql";
	
	public final static String ACTIVE_ARV_PATIENTS_OVER_5MONTHS_SQL = "activeHivPatientsOver5Months.sql";
	
	public final static String ACTIVE_ARV_FIRST_LINE_REGIMEN_SQL = "activeHivPatientsFirstLineRegimen.sql";
	
	public final static String ACTIVE_ARV_SECOND_LINE_REGIMEN_SQL = "activeHivPatientsSecondLineRegimen.sql";
	
	public final static String ACTIVE_ARV_THIRD_LINE_REGIMEN_SQL = "activeHivPatientsThirdLineRegimen.sql";
	
	public final static String INACTIVE_ARV_PATIENTS_DEAD_SQL = "inactivePatientsDead.sql";
	
	public final static String INACTIVE_ARV_PATIENTS_MEDICAL_OR_VOLUNTARY_SQL = "inactivePatientsMedicalOrVoluntary.sql";
	
	public final static String INACTIVE_ARV_PATIENTS_LOST_TO_FOR_A_MONTH_SQL = "inactivePatientsLostToForMonth.sql";
	
	public final static String INACTIVE_ARV_PATIENTS_MIGRATED_SQL = "inactivePatientsMigrated.sql";
	
	public final static String INACTIVE_ARV_PATIENTS_TRANSFERRED_SQL = "inactivePatientsTransferred.sql";
	
	public final static String LOST_ARV_PATIENTS_DIED_SQL = "lostArvPatienstDied.sql";
	
	public final static String LOST_ARV_PATIENTS_AFTER_TREATMENT_LESS_3MONTHS_SQL = "lostArvPatienstForlessThan3monthsTreatment.sql";
	
	public final static String LOST_ARV_PATIENTS_AFTER_TREATMENT_MORE_3MONTHS_SQL = "lostArvPatienstForMoreThan3monthsTreatment.sql";
	
	public final static String LOST_ARV_PATIENTS_TRANSFERRED_SQL = "lostArvPatientsTransferred.sql";
	
	public final static String LOST_ARV_PATIENTS_STOPPED_SQL = "lostArvPatientsStopped.sql";
	
	public final static String DEAD_ARV_PATIENTS_BY_TUBERCLOSIS_SQL = "deadArvPatientsByTuberclosis.sql";
	
	public final static String DEAD_ARV_PATIENTS_BY_OTHER_INFECTIOUS_DISEASES_SQL = "deadArvPatientsByOtherInfectiousDiseases.sql";
	
	public final static String DEAD_ARV_PATIENTS_BY_CANCER_SQL = "deadArvPatientsByCancer.sql";
	
	public final static String DEAD_ARV_PATIENTS_BY_HIV_ILLNESSES_SQL = "deadArvPatientsByHivIllnensses.sql";
	
	public final static String DEAD_ARV_PATIENTS_BY_NATURAL_CAUSES_SQL = "deadArvPatientsByNaturalCauses.sql";
	
	public final static String DEAD_ARV_PATIENTS_BY_UNNATURAL_CAUSES_SQL = "deadArvPatientsByUnNaturalCauses.sql";
	
	public final static String DEAD_ARV_PATIENTS_BY_UNKNOWN_CAUSES_SQL = "deadArvPatientsByUnKnownCauses.sql";
	
	public final static String LOST_ARV_PATIENTS_RESUMED_TREATMENT_SQL = "lostPatientsResumedTreatment.sql";
	
	public final static String ACTIVE_ARV_PATIENTS_WITH_VIRAL_LOAD_RESULT_SQL = "activeArvPatientWithViralLoadResult.sql";
	
	public final static String ACTIVE_PREGNANT_WOMEN_ON_ART_WITH_VIRAL_LOAD_RESULT_SQL = "activePregnantWomenOnArtWithViralLoadResult.sql";
	
	public final static String ACTIVE_BREAST_FEEDING_WOMEN_ON_ART_WITH_VIRAL_LOAD_RESULT_SQL = "activeBreastFeedingWomenOnArtWithViralLoadResult.sql";
	
	public final static String ACTIVE_ARV_PATIENTS_WITH_VIRAL_LOAD_RESULT_LESS_THAN_1000_COPIES_SQL = "activeArvPatientWithViralLoadResultLess1000Copies.sql";
	
	public final static String ACTIVE_PREGNANT_WOMEN_WITH_VIRAL_LOAD_RESULT_LESS_THAN_1000_COPIES_SQL = "activePregnantWomenWithViralLoadResultLess1000Copies.sql";
	
	public final static String ACTIVE_BREAST_FEEDING_WOMEN_WITH_VIRAL_LOAD_RESULT_LESS_THAN_1000_COPIES_SQL = "activeBreastFeedingWomenWithViralLoadResultLess1000Copies.sql";
	
    public final static String ACTIVE_ARV_PATIENTS_WITH_VIRAL_LOAD_RESULT_TARGETED_SQL = "activeArvPatientWithViralLoadResultTargeted.sql";
	
	public final static String ACTIVE_PREGNANT_WOMEN_ON_ART_WITH_VIRAL_LOAD_RESULT_TARGETED_SQL = "activePregnantWomenOnArtWithViralLoadResultTargeted.sql";
	
	public final static String ACTIVE_BREAST_FEEDING_WOMEN_ON_ART_WITH_VIRAL_LOAD_RESULT_TARGETED_SQL = "activeBreastFeedingWomenOnArtWithViralLoadResultTargeted.sql";
	
    public final static String ACTIVE_ARV_PATIENTS_WITH_VIRAL_LOAD_RESULT_TARGETED_LESS_THAN_1000_COPIES_SQL = "activeArvPatientWithViralLoadResultTargetedLessThan1000Copies.sql";
	
	public final static String ACTIVE_PREGNANT_WOMEN_ON_ART_WITH_VIRAL_LOAD_RESULT_TARGETED_LESS_THAN_1000_COPIES_SQL = "activePregnantWomenOnArtWithViralLoadResultTargetedLessThan1000Copies.sql";
	
	public final static String ACTIVE_BREAST_FEEDING_WOMEN_ON_ART_WITH_VIRAL_LOAD_RESULT_TARGETED_LESS_THAN_1000_COPIES_SQL = "activeBreastFeedingWomenOnArtWithViralLoadResultTargetedLessThan1000Copies.sql";
	
	public final static String PATIENTS_ON_ARVS_FOR_12_MONTHS_SQL ="patientsOnArvsFor12Months.sql";
	
	public final static String PATIENTS_ON_ARVS_FOR_12_MONTHS_IN_SIGHT_SQL ="patientsOnArvsFor12MonthsInSight.sql";
	
	public final static String PATIENTS_ON_ARVS_FOR_12_MONTHS_TRANSFERRED_SQL ="patientsOnArvsFor12MonthsTransferred.sql";
	
	public final static String PATIENTS_ON_ARVS_FOR_12_MONTHS_ALIVE_SQL ="patientsOnArvsFor12MonthsAlive.sql";
	
	public final static String WOMEN_ON_ARVS_SCREENED_FOR_CERVICAL_CANCER_SQL ="womenOnArvsScreenedForCervicalCancer.sql";
	
	
	//total
	public final static String TOTAL_HIV_PATIENTS_UNDER_PREVENTION_CTX_SQL = "TotalPatientsUnderPreventionCtx.sql";
	
	public final static String TOTAL_HIV_PATIENTS_UNDER_PREVENTION_TB_TREATMENT_SQL = "TotalPatientsUnderTbTreament.sql";
	
	public final static String TOTAL_HIV_PATIENTS_UNDER_PREVENTION_TB_TREATMENT_FOR_SIX_MONTHS_SQL = "TotalPatientsUnderTbTreatmentForSixMonths.sql";
	
	public final static String TOTAL_HIV_PATIENTS_COMPLETED_PREVENTION_TB_TREATMENT_SQL = "TotalPatientsCompletedTbTreatment.sql";
	
	public final static String TOTAL_HIV_PATIENTS_TB_SCRENEES_SQL = "TotalPatientsForTbScreenes.sql";
	
	public final static String TOTAL_HIV_PATIENTS_WITH_A_BACTERIOLOGY_SPECIMEN_COLLECTION_SQL = "TotalpatientsWithBacterologySpecimenSampleColection.sql";
	
	public final static String GENEEXPERT_MTB_DIAGNOSIS_TEST_SQL = "TbDiagnosisTestsGeneExpertMtb.sql";
	
	public final static String OTHER_DIAGNOSIS_TEST_SQL = "TbDiagnosisTestsOther.sql";
	
	public final static String TOTAL_ARV_PATIENTS_WITH_POSTIVE_RESULT_FROM_TB_DIAGNOSIS_SQL = "TotalPatienstWithPostiveResultsFromTbDiagnosis.sql";
	
	public final static String TOTAL_ARV_PATIENTS_NEWLY_PLACED_ON_TB_TREATMENT_SQL = "TotalArvPatientsNewlyPalcedUnderTbTreatmet.sql";
	
	public final static String TOTAL_ARV_PATIENTS_INACTIVE_AT_THE_END_SQL = "TotalArvPatientsInactiveAtTheEnd.sql";
	
	public final static String TOTAL_ARV_PATIENTS_LOST_TO_FOLLOW_SQL = "TotalArvPatientsLostToFollow.sql";
	
	
	//Dimesion Corhorts By key Populations	
	public final static String MSM_COHORT_SQL ="keyPopulationMsm.sql";

	public final static String SEX_PROFFESIONALS_COHORT_SQL ="keyPopulationSex.sql";

	public final static String TRANSGENDER__COHORT_SQL ="keyPopulationTransgender.sql";

	public final static String CAPTIVES__COHORT_SQL ="keyPopulationCaptive.sql";

	public final static String INJECTION_DRUG_USERS_COHORT_SQL ="keyPopulationDrug.sql";
	
	//corhot indicaotors for Patients on CTX
	
	public final static String NEWLY_POWERED_CTX_COHORT_INDICATOR_SQL ="newlyPoweredCtxCorhotIndicator.sql";
	
	public final static String ACTIVE_CTX_COHORT_INDICATOR_SQL ="activeCtxCorhotIndicator.sql";
	
	
	
	//UUIDS	
	public static final String NEWLY_ENROLLED_PATIENTS_ON_ART_UUID = "952dsw17-3903-vff3-9ws5-22xxcegtab1kk";
	
	public final static String REFERRED_IN_PATIENTS_ENROLED_ON_ART_UUID = "143dga7c-9esf-fsea-bds7-0242axxsdkkk";
	
	public final static String NEW_BREAST_FEEDING_WOMEN_ENROLED_ON_ART_UUID = "1acv4tu6-bhc6wsha-bb37-02axxfx3ahkk";
	
	public final static String NEW_REFERRED_IN_BREAST_FEEDING_WOMEN_ENROLED_ON_ART_UUID = "cchaayo2-32ee-47cfxx9d3-f44bdc6ddjkk";
	
	public final static String NOT_YET_ENROLED_ON_ART_BY_REASON_UUID = "205dh8de-9ec6-adea-bad7-0yoqwxxqwkk";
	
	public final static String DISINTERGRATION_BY_KEY_POPULATION_UUID = "259ftf9a-9ec6-dgza-et37-0bxxbnwxsskk";
	
	public final static String HIV_PATIENTS_UNDER_PREVENTION_CTX_UUID = "2bdas500-9ec6-tuda-vh37-vgrxxy1awdkk";
	
	public final static String HIV_PATIENTS_UNDER_PREVENTION_TB_TREATMENT_UUID = "31aawet0-tjc6-11ea-xx37-024qaaergykk";
	
	public final static String HIV_PATIENTS_UNDER_PREVENTION_TB_TREATMENT_6MONTHS_UUID = "ebozvk48-9fxx-11ea-vtj7-0242dvt300xkk";
	
	public final static String PATIENTS_WHO_COMPLETED_TB_TREATMENT_UUID ="xr1zvrr8-w550-h8ea-uqk7-vg8xxhcq34kk";
	
	public final static String PATIENTS_ON_ART_SCRENEES_POSTIVE_UUID ="e7311d58-a0bc-11ea-bb3xx0242aqfhw4kk";
	
	public final static String PATIENTS_ON_ART_SCRENEES_NEGATIVE_UUID ="e7311d58-a0bc-11ea-bb37xx242wsb5g0kk";
	
	public final static String BREAST_FEEDING_WOMEN_NOT_YET_ENROLED_ON_ART_UUID = "30665635-48b2xx07e-b58b-29b4cvt610kk";
	
	public final static String ARV_PATIENTS_WITH_SAMPLES_SENT_TO_DIAGNOSTIC_TEST_UUID = "2c2609f2xx2e1-482b-a937-8a5d48e5d0kk";
	
	public final static String ARV_PATIENTS_NEWLY_PLACED_ON_TB_TREATMENT_UUID = "5b83edbb-69c7-403a-ae08-90706b01fakk";
	
	public final static String TB_HIV_PATIENTS_ON_TB_TREATMENT_UUID = "66da8f4e-4e45-4679-8660-1f92c25cf8kk";
	
	public final static String TB_HIV_PATIENTS_ON_TB_TREATMENT_DISTENGRATED_BY_NEW_AND_ALREADY_ON_ART_UUID = "731737b4-c255-4a39-aba6-f72b31a1b9kk";
	
	public final static String ACTIVE_HIV_PATIENTS_UUID = "1cb3dc56-e685-4268-896b-ec14ddbd53kk";
	
	public final static String ACTIVE_HIV_PATIENTS_BY_KEY_POPN_UUID = "6b473fb7-2f33-4b72-83d0-1444ef2ffdkk";
	
	public final static String ACTIVE_ARV_PATIENTS_OVER_MONTHS_UUID = "1eba6b3c-aa88-4510-9a60-6a5c07e9edkk";
	
	public final static String ACTIVE_ARV_PATIENTS_REGIME_LINES_UUID = "5a75e769-72fa-4b52-af8d-76dbd360b4kk";
	
	public final static String INACTIVE_ARV_PATIENTS_DEAD_UUID = "84257430-efde-429d-a6a6-119d4ba4ddkk";
	
	public final static String INACTIVE_ARV_PATIENTS_MEDICAL_OR_VOLUNTARY_UUID = "b82dd5b8-1b2b-4b08-935b-2451ac825ekk";
	
	public final static String INACTIVE_ARV_PATIENTS_LOST_TO_FOR_A_MONTH_UUID = "28929f29-6359-4b7f-b6e3-a1415d37dckk";
	
	public final static String INACTIVE_ARV_PATIENTS_MIGRATED_UUID = "c503c095-12a8-4862-af92-06fe7474f1kk";
	
	public final static String INACTIVE_ARV_PATIENTS_TRANSFERRED_UUID = "2fd7e408-2ec9-4da5-9a04-ad5cf0f263kk";
			
	public final static String LOST_ARV_PATIENTS_DIED_UUID = "d39aa361-0d28-4d89-b718-c3194f756akk";
	
    public final static String LOST_ARV_PATIENTS_AFTER_TREATMENT_LESS_3MONTHS_UUID = "a8a3f2f0-48dd-4d9c-b55f-5252b1fb54kk";
	
	public final static String LOST_ARV_PATIENTS_AFTER_TREATMENT_MORE_3MONTHS_UUID = "d601cbad-c907-47ca-9ee0-bad90df3a1kk";
	
	public final static String LOST_ARV_PATIENTS_TRANSFERRED_UUID = "00acc3de-79f5-40ea-a3e3-231f8352192b";
	
	public final static String LOST_ARV_PATIENTS_STOPPED_UUID = "d41b0838-750d-4076-a7c2-22ac5dcc33b4";
	
	public final static String DEAD_ARV_PATIENTS_BY_TUBERCLOSIS_UUID = "02522bc0-1bd8-49fe-90a2-981091822685";
	
	public final static String DEAD_ARV_PATIENTS_BY_OTHER_INFECTIOUS_DISEASES_UUID = "a2e6b222-3b5f-4be6-93e8-6976874a129a";
	
	public final static String DEAD_ARV_PATIENTS_BY_CANCER_UUID = "0b09b2ac-2fbb-448f-8060-05cc8e9fd8ad";
	
	public final static String DEAD_ARV_PATIENTS_BY_HIV_ILLNESSES_UUID = "a17da75d-5494-44c0-be3b-85114bf6e30e";
	
	public final static String DEAD_ARV_PATIENTS_BY_NATURAL_CAUSES_UUID = "24e2fc9a-d1af-4bd7-b1ae-152b75700298";
	
	public final static String DEAD_ARV_PATIENTS_BY_UNNATURAL_CAUSES_UUID = "8380dcfe-55a5-4cfd-a873-6d34c5890997";
	
	public final static String DEAD_ARV_PATIENTS_BY_UNKNOWN_CAUSES_UUID = "2631533d-386f-4d85-958f-1beb824c8b6c";
	
	public final static String LOST_ARV_PATIENTS_RESUMED_TREATMENT_UUID = "1f14a65c-b466-44ac-a1a8-230ef15b6db9";
	
	public final static String LOST_ARV_PATIENTS_RESUMED_TREATMENT_KEY_POPULATION_UUID = "9e1676a2-e753-4f5c-a5fb-cb8f6f0912a4";
	
	public final static String ACTIVE_ARV_PATIENTS_WITH_VIRAL_LOAD_RESULT_UUID = "6ccebba0-8e85-433b-8fcb-0f5217641787";
	
    public final static String ACTIVE_PREGNANT_WOMEN_ON_ART_WITH_VIRAL_LOAD_RESULT_UUID = "7f210d8d-1f77-464e-adb3-6ceea6e5aeba";
	
	public final static String ACTIVE_BREAST_FEEDING_WOMEN_ON_ART_WITH_VIRAL_LOAD_RESULT_UUID = "3d4e8c9f-55d4-4e07-a139-53efaafb4e5c";
	
	public final static String ACTIVE_ARV_PATIENTS_WITH_VIRAL_LOAD_RESULT_KEY_POPULATION_UUID = "888b56a0-fcdb-4112-828f-ecf83a54ade4";
	
    public final static String ACTIVE_ARV_PATIENTS_WITH_VIRAL_LOAD_RESULT_LESS_THAN_1000_COPIES_UUID = "668547f2-6839-4028-a2a6-d3e8e18748bb";
	
	public final static String ACTIVE_PREGNANT_WOMEN_WITH_VIRAL_LOAD_RESULT_LESS_THAN_1000_COPIES_UUID = "ef2f4a22-f589-4876-8801-e8aa7e5d4deb";
	
	public final static String ACTIVE_BREAST_FEEDING_WOMEN_WITH_VIRAL_LOAD_RESULT_LESS_THAN_1000_COPIES_UUID = "f1f96238-ef64-4081-b435-fd63bc00692c";
	
    public final static String ACTIVE_ARV_PATIENTS_WITH_VIRAL_LOAD_RESULT_LESS_THAN_1000_COPIES_BY_KEY_POPULATION_UUID = "e6a5f749-01b0-4e54-86e4-da8a775dc792";
	
    public final static String ACTIVE_ARV_PATIENTS_WITH_VIRAL_LOAD_RESULT_TARGETED_UUID = "29ca709b-fa61-48d4-997f-bc0e18a50f41";
	
   	public final static String ACTIVE_PREGNANT_WOMEN_ON_ART_WITH_VIRAL_LOAD_RESULT_TARGETED_UUID = "68c73e21-69d3-4477-9cd0-1e512c7b3c79";
   	
   	public final static String ACTIVE_BREAST_FEEDING_WOMEN_ON_ART_WITH_VIRAL_LOAD_RESULT_TARGETED_UUID = "72780272-591a-4287-be7d-1c7a2adb7ebc";
   	
   	public final static String ACTIVE_ARV_PATIENTS_WITH_VIRAL_LOAD_RESULT_TARGETED_BY_KEY_POPULATION_UUID = "7443eb07-7fad-4ed7-a02b-e76c50b23247";
   	
    public final static String ACTIVE_ARV_PATIENTS_WITH_VIRAL_LOAD_RESULT_TARGETED_LESS_THAN_1000_COPIES_UUID = "e419b4e6-194d-4484-8cf2-fe699f584b72";
	
   	public final static String ACTIVE_PREGNANT_WOMEN_ON_ART_WITH_VIRAL_LOAD_RESULT_TARGETED_LESS_THAN_1000_COPIES_UUID = "3e2e172a-0547-4373-84d3-b933c535b3b1";
   	
   	public final static String ACTIVE_BREAST_FEEDING_WOMEN_ON_ART_WITH_VIRAL_LOAD_RESULT_TARGETED_LESS_THAN_1000_COPIES_UUID = "2da16fc7-ed2e-453d-a6ed-35674b24dc16";
   	
    public final static String ACTIVE_ARV_PATIENTS_WITH_VIRAL_LOAD_RESULT_TARGETED_LESS_THAN_1000_COPIES_KEY_POPULATION_UUID = "3b7ed00f-7620-464c-89f3-f21428948bc0";
    
    public final static String PATIENTS_ON_ARVS_FOR_12_MONTHS_UUID ="206f3edb-5603-4e36-b34a-ee9cf58406ba";
	
	public final static String PATIENTS_ON_ARVS_FOR_12_MONTHS_IN_SIGHT_UUID ="84137c56-5c5a-46a7-b7fe-383880c9ece3";
	
	public final static String PATIENTS_ON_ARVS_FOR_12_MONTHS_TRANSFERRED_UUID ="4749f768-0d3d-4fc6-9acb-f838a0935fdb";
	
	public final static String PATIENTS_ON_ARVS_FOR_12_MONTHS_ALIVE_UUID ="99d0d341-496a-4305-ab30-83e31310cf74";
	
	public final static String WOMEN_ON_ARVS_SCREENED_FOR_CERVICAL_CANCER_UUID ="c481b716-d2ab-4017-86a5-daed4158f817";
	
   	   	
	//total indicators
	public final static String TOTAL_HIV_PATIENTS_UNDER_PREVENTION_CTX_UUID = "d2db4b7c-a0cf-11eaxxb37-0242ac16htkk";
	
	public final static String TOTAL_HIV_PATIENTS_UNDER_PREVENTION_TB_TREATMENT_UUID = "dc8b221e-a0cfxx1ea-bb37-024by7ucsOkk";
	
	public final static String TOTAL_HIV_PATIENTS_UNDER_PREVENTION_TB_TREATMENT_FOR_SIX_MONTHS_UUID = "30562509-075xx492d-zaa5-74h803frybkk";
	
	public final static String TOTAL_HIV_PATIENTS_COMPLETED_PREVENTION_TB_TREATMENT_UUID = "32ce9238-78a5-4b97-b474xx1e9e26ktikk";
	
	public final static String TOTAL_HIV_PATIENTS_TB_SCRENEES_UUID = "be3823b4-f7ee-4b33-a54fxxf1bqs7j7fkk";
	
	public final static String TOTAL_HIV_PATIENTS_WITH_A_BACTERIOLOGY_SPECIMEN_COLLECTION_UUID = "de3dabb7xx98c-42b5-b4c8-d9czws9k9bkk";
	
	public final static String TOTAL_ARV_PATIENTS_WITH_POSTIVE_RESULT_FROM_TB_DIAGNOSIS_UUID ="b3850a4e-41aa-480e-990e-f28c04b4efkk";
	
	public final static String TOTAL_ARV_PATIENTS_NEWLY_PLACED_ON_TB_TREATMENT_UUID = "06a6c6a1-b8e4-45c7-b046-58985fc90ckk";
	
	public final static String TOTAL_ARV_PATIENTS_INACTIVE_AT_THE_END_UUID = "eb20b1cb-998d-41f8-8b1d-6fb1424e74kk";
	
	public final static String TOTAL_ARV_PATIENTS_LOST_TO_FOLLOW_UUID = "b502c769-5e8f-4431-abcc-4f9a25912ckk";
		
	
	//messages
	public static final String NEWLY_ENROLLED_PATIENTS_ON_ART_MESSAGE = "isanteplusreports.newlyEnrolledPatientsOnArt";
	
	public final static String REFERRED_IN_PATIENTS_ENROLED_ON_ART_MESSAGE = "isanteplusreports.referredInPatientsAnArt";
	
	public final static String NEW_BREAST_FEEDING_WOMEN_ENROLED_ON_ART_MESSAGE = "isanteplusreports.newlyEnrolledBreastFeedingWomenOnArt";
	
	public final static String NEW_REFERRED_IN_BREAST_FEEDING_WOMEN_ENROLED_ON_ART_MESSAGE = "isanteplusreports.newlyReferredInEnrolledBreastFeedingWomenOnArt";
	
	public final static String NOT_YET_ENROLED_ON_ART_BY_REASON_MESSAGE = "isanteplusreports.notYetEnrolledOnArtByReason";
	
	public final static String DISINTERGRATION_BY_KEY_POPULATION_MESSAGE = "isanteplusreports.disintergrationByKeyPopulations";
	
	public final static String HIV_PATIENTS_UNDER_PREVENTION_CTX_MESSAGE = "isanteplusreports.patientsUnderPreventionCtx";
	
	public final static String HIV_PATIENTS_UNDER_PREVENTION_TB_TREATMENT_MESSAGE = "isanteplusreports.patientsUnderTBPreventionTreatment";
	
	public final static String HIV_PATIENTS_UNDER_PREVENTION_TB_TREATMENT_6MONTHS_MESSAGE = "isanteplusreports.patientsUnderTBPreventionTreatment.6months";
	
	public final static String PATIENTS_WHO_COMPLETED_TB_TREATMENT__MESSAGE = "isanteplusreports.patientsCompletedTBTreatment";
	
	public final static String PATIENTS_ON_ART_SCRENEES_POSTIVE_MESSAGE ="isanteplusreports.tbPatientsScreneesPostive";
	
	public final static String PATIENTS_ON_ART_SCRENEES_NEGATIVE_MESSAGE ="isanteplusreports.tbPatientsScreneesNegative";
	
	public final static String BREAST_FEEDING_WOMEN_NOT_YET_ENROLED_ON_ART_MESSAGE = "isanteplusreports.breastFeedingWomenNotYetEnrolled";
	
	public final static String ARV_PATIENTS_NEWLY_PLACED_ON_TB_TREATMENT_MESSAGE = "isanteplusreports.arvPatientsNewlyPacedOnTbTreatmet";
	
	public final static String TB_HIV_PATIENTS_ON_TB_TREATMENT_MESSAGE = "isanteplusreports.tbHivPatientsOnTbTreatment";
	
	public final static String TB_HIV_PATIENTS_ON_TB_TREATMENT_DISTENGRATED_BY_NEW_AND_ALREADY_ON_ART_MESSAGE = "isanteplusreports.tbHivPatientsOnTbTreatment.disintergrated";
	
	public final static String ACTIVE_HIV_PATIENTS_MESSAGE = "isanteplusreports.activeHivPatients";
	
	public final static String ACTIVE_HIV_PATIENTS_BY_KEY_POPN_MESSAGE = "isanteplusreports.activeHivPatientsByKeyPopn";
	
	public final static String ACTIVE_ARV_PATIENTS_OVER_MONTHS_MESSAGE = "isanteplusreports.activeHivPatients.overMonths";
	
	public final static String ACTIVE_ARV_PATIENTS_REGIME_LINES_MESSAGE = "isanteplusreports.activeHivPatients.regimeLines";
	
	public final static String INACTIVE_ARV_PATIENTS_DEAD_MESSAGE = "isanteplusreports.inactive.dead";
	
	public final static String INACTIVE_ARV_PATIENTS_MEDICAL_OR_VOLUNTARY_MESSAGE = "isanteplusreports.inactive.medicalAndvoluntary";
	
	public final static String INACTIVE_ARV_PATIENTS_LOST_TO_FOR_A_MONTH_MESSAGE = "isanteplusreports.inactive.lostTo.month";
	
	public final static String INACTIVE_ARV_PATIENTS_MIGRATED_MESSAGE = "isanteplusreports.inactive.lostTo.migrated";
	
	public final static String INACTIVE_ARV_PATIENTS_TRANSFERRED_MESSAGE = "isanteplusreports.inactive.transferred";
	
	public final static String LOST_ARV_PATIENTS_DIED_MESSAGE = "isanteplusreports.lostToFolow.died";
	
	public final static String LOST_ARV_PATIENTS_AFTER_TREATMENT_LESS_3MONTHS_MESSAGE = "isanteplusreports.lostToFolow.lessThan3monthsTreatment";
	
	public final static String LOST_ARV_PATIENTS_AFTER_TREATMENT_MORE_3MONTHS_MESSAGE = "isanteplusreports.lostToFolow.moreThan3monthsTreatment";
	
	public final static String LOST_ARV_PATIENTS_TRANSFERRED_MESSAGE = "isanteplusreports.lostToFolow.transferred";
	
	public final static String LOST_ARV_PATIENTS_STOPPED_MESSAGE = "isanteplusreports.lostToFolow.stopped";
	
	public final static String DEAD_ARV_PATIENTS_BY_TUBERCLOSIS_MESSAGE = "isanteplusreports.dead.tuberclosis";
	
	public final static String DEAD_ARV_PATIENTS_BY_OTHER_INFECTIOUS_DISEASES_MESSAGE = "isanteplusreports.dead.otherInfectiousDiseases";
	
	public final static String DEAD_ARV_PATIENTS_BY_CANCER_MESSAGE = "isanteplusreports.dead.cancer";
	
	public final static String DEAD_ARV_PATIENTS_BY_HIV_ILLNESSES_MESSAGE = "isanteplusreports.dead.hivIllnesses";
	
	public final static String DEAD_ARV_PATIENTS_BY_NATURAL_CAUSES_MESSAGE = "isanteplusreports.dead.naturalCauses";
	
	public final static String DEAD_ARV_PATIENTS_BY_UNNATURAL_CAUSES_MESSAGE = "isanteplusreports.dead.unNaturalCauses";
	
	public final static String DEAD_ARV_PATIENTS_BY_UNKNOWN_CAUSES_MESSAGE = "isanteplusreports.dead.unKnownCauses";
	
	public final static String LOST_ARV_PATIENTS_RESUMED_TREATMENT_MESSAGE = "isanteplusreports.lost.resumedTreatment";
	
	public final static String LOST_ARV_PATIENTS_RESUMED_TREATMENT_KEY_POPULATION_MESSAGE = "isanteplusreports.lost.resumedTreatment.keyPopn";
	
	public final static String ACTIVE_ARV_PATIENTS_WITH_VIRAL_LOAD_RESULT_MESSAGE = "isanteplusreports.activePatients.viralLoadResult";
	
	public final static String ACTIVE_PREGNANT_WOMEN_ON_ART_WITH_VIRAL_LOAD_RESULT_MESSAGE = "isanteplusreports.activePatients.viralLoadResult.pregnant";
		
	public final static String ACTIVE_BREAST_FEEDING_WOMEN_ON_ART_WITH_VIRAL_LOAD_RESULT_MESSAGE = "isanteplusreports.activePatients.viralLoadResult.breastFeeding";
		
	public final static String ACTIVE_ARV_PATIENTS_WITH_VIRAL_LOAD_RESULT_KEY_POPULATION_MESSAGE = "isanteplusreports.activePatients.viralLoadResult.keyPopn";
	
	public final static String ACTIVE_ARV_PATIENTS_WITH_VIRAL_LOAD_RESULT_LESS_THAN_1000_COPIES_MESSAGE = "isanteplusreports.activePatients.viralLoadResultLessThan1000";
		
	public final static String ACTIVE_PREGNANT_WOMEN_WITH_VIRAL_LOAD_RESULT_LESS_THAN_1000_COPIES_MESSAGE = "isanteplusreports.activePatients.viralLoadResultLessThan1000.pregnantWomen";
		
	public final static String ACTIVE_BREAST_FEEDING_WOMEN_WITH_VIRAL_LOAD_RESULT_LESS_THAN_1000_COPIES_MESSAGE = "isanteplusreports.activePatients.viralLoadResultLessThan1000.breatFeedingWomen";
		
	public final static String ACTIVE_ARV_PATIENTS_WITH_VIRAL_LOAD_RESULT_LESS_THAN_1000_COPIES_BY_KEY_POPULATION_MESSAGE = "isanteplusreports.activePatients.viralLoadResultLessThan1000.keyPopulation";
	
	public final static String ACTIVE_ARV_PATIENTS_WITH_VIRAL_LOAD_RESULT_TARGETED_MESSAGE = "isanteplusreports.activePatients.viralLoadResult.targeted";
		
	public final static String ACTIVE_PREGNANT_WOMEN_ON_ART_WITH_VIRAL_LOAD_RESULT_TARGETED_MESSAGE = "isanteplusreports.activePatients.viralLoadResult.pregnant.targerted";
	   	
	public final static String ACTIVE_BREAST_FEEDING_WOMEN_ON_ART_WITH_VIRAL_LOAD_RESULT_TARGETED_MESSAGE = "isanteplusreports.activePatients.viralLoadResult.breastFeeding.targerted";
	   	
	public final static String ACTIVE_ARV_PATIENTS_WITH_VIRAL_LOAD_RESULT_TARGETED_BY_KEY_POPULATION_MESSAGE = "isanteplusreports.activePatients.viralLoadResult.keyPopn.targerted";
	
	public final static String ACTIVE_ARV_PATIENTS_WITH_VIRAL_LOAD_RESULT_TARGETED_LESS_THAN_1000_COPIES_MESSAGE = "isanteplusreports.activePatients.viralLoadResult.targeted.lessThan1000Copies";
		
	public final static String ACTIVE_PREGNANT_WOMEN_ON_ART_WITH_VIRAL_LOAD_RESULT_TARGETED_LESS_THAN_1000_COPIES_MESSAGE = "isanteplusreports.activePatients.viralLoadResult.pregnant.targerted.lessThan100Copies";
	   	
	public final static String ACTIVE_BREAST_FEEDING_WOMEN_ON_ART_WITH_VIRAL_LOAD_RESULT_TARGETED_LESS_THAN_1000_COPIES_MESSAGE = "isanteplusreports.activePatients.viralLoadResult.breastFeeding.targerted.lessThan100Copies";
	   	
	public final static String ACTIVE_ARV_PATIENTS_WITH_VIRAL_LOAD_RESULT_TARGETED_LESS_THAN_1000_COPIES_KEY_POPULATION_MESSAGE = "isanteplusreports.activePatients.viralLoadResult.keyPopn.targerted.lessThan1000Copies";
	
	public final static String PATIENTS_ON_ARVS_FOR_12_MONTHS_MESSAGE ="isanteplusreports.activePatientsFor12Months";
		
	public final static String PATIENTS_ON_ARVS_FOR_12_MONTHS_IN_SIGHT_MESSAGE ="isanteplusreports.activePatientsInsight";
		
	public final static String PATIENTS_ON_ARVS_FOR_12_MONTHS_TRANSFERRED_MESSAGE ="isanteplusreports.activePatientsTransferred";
		
	public final static String PATIENTS_ON_ARVS_FOR_12_MONTHS_ALIVE_MESSAGE ="isanteplusreports.activePatientsAlive";
			   
	public final static String WOMEN_ON_ARVS_SCREENED_FOR_CERVICAL_CANCER_MESSAGE = "isanteplusreports.womenOnArvScreenedCervicalCancer"; 			
			
		
	
	
	//total indicators
	public final static String TOTAL_HIV_PATIENTS_UNDER_PREVENTION_CTX_MESSAGE = "isanteplusreports.patientsUnderPreventionCtx.total";
		
	public final static String TOTAL_HIV_PATIENTS_UNDER_PREVENTION_TB_TREATMENT_MESSAGE = "isanteplusreports.patientsUnderTBPreventionTreatment.total";
		
	public final static String TOTAL_HIV_PATIENTS_UNDER_PREVENTION_TB_TREATMENT_FOR_SIX_MONTHS_MESSAGE = "isanteplusreports.patientsUnderTBPreventionTreatment.6months.total";
		
	public final static String TOTAL_HIV_PATIENTS_COMPLETED_PREVENTION_TB_TREATMENT_MESSAGE = "isanteplusreports.patientsCompletedTBTreatment.total";
		
	public final static String TOTAL_HIV_PATIENTS_TB_SCRENEES_MESSAGE = "isanteplusreports.tbPatientsScrenees.total";
		
	public final static String TOTAL_HIV_PATIENTS_WITH_A_BACTERIOLOGY_SPECIMEN_COLLECTION_MESSAGE = "isanteplusreports.bacteriologySpecimenCollectioan.total";
	
	public final static String ARV_PATIENTS_WITH_SAMPLES_SENT_TO_DIAGNOSTIC_TEST_MESSAGE= "isanteplusreports.dignosticTests";
	
	public final static String TOTAL_ARV_PATIENTS_WITH_POSTIVE_RESULT_FROM_TB_DIAGNOSIS_MESSAGE= "isanteplusreports.postiveResultFomTbDiagnosis";
	
	public final static String TOTAL_ARV_PATIENTS_NEWLY_PLACED_ON_TB_TREATMENT_MESSAGE = "isanteplusreports.arvPatientsNewlyPacedOnTbTreatmet.total";
	
	public final static String TOTAL_ARV_PATIENTS_INACTIVE_AT_THE_END_MESSAGE = "isanteplusreports.arvPatientsInactiveAtTheEnd.total";
	
	public final static String TOTAL_ARV_PATIENTS_LOST_TO_FOLLOW_MESSAGE = "isanteplusreports.lostToFollow";
	
	//report definiton Desriptions
	public final static String REPORT_DESCRIPTION_14BY3 = "RD_14_by_3";
	
	public final static String REPORT_DESCRIPTION_1BY1 = "RD_1_by_1";
	
	public final static String REPORT_DESCRIPTION_14BY14 = "RD_14_by_14";
	
	public final static String REPORT_DESCRIPTION_6BY3 = "RD_6_by_3";
	
	public final static String REPORT_DESCRIPTION_14BY6 = "RD_14_by_6";
	
	public final static String REPORT_DESCRIPTION_4BY5 = "RD_4_by_5";
	
	public final static String REPORT_DESCRIPTION_4BY7 = "RD_4_by_7";
	
	public final static String REPORT_DESCRIPTION_3BY1 = "RD_3_by_1";
	
	public final static String REPORT_DESCRIPTION_14BY4 = "RD_14_by_4";
	
	public final static String REPORT_DESCRIPTION_6BY2 = "RD_6_by_2";
	
	public final static String REPORT_DESCRIPTION_14BY9 = "RD_14_by_9";
	
	
		
}
