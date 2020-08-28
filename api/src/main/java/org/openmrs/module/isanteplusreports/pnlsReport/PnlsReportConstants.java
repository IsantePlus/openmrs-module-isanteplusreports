package org.openmrs.module.isanteplusreports.pnlsReport;

import static org.openmrs.module.isanteplusreports.util.IsantePlusReportsConstants.REPORTS_SQL_PATH;

public class PnlsReportConstants {
	
	public static final String PNLS_REPORTS_RESOURCE_PATH = REPORTS_SQL_PATH + "pnlsIndicatorReport/";
	
	public static final String PNLS_GENERAL_PURPOSE_SUFFIX = "_PNLS";
	
	public final static String NEWLY_ENROLLED_PATIENTS_ON_ART_SQL = "newPatientsEnrolledOnART.sql";
	
	public final static String REFERRED_IN_PATIENTS_ENROLED_ON_ART_SQL = "refferedInPatientsEnrolledOnArt.sql";
	
	public final static String NEW_BREAST_FEEDING_WOMEN_ENROLED_ON_ART_SQL_1_1_1 = "newlyEnrolledBreatFeedingWomen.sql";
	
	public final static String NEW_REFERRED_IN_BREAST_FEEDING_WOMEN_ENROLED_ON_ART_SQL_1_2_1 = "newlyReferredInBreatFeedingWomen.sql";
	
	public final static String NOT_ENROLED_ON_ART_COHORT_INDICATOR_SQL_3 = "notEnrolledOnArtCorhortIndicator.sql";
	
	public final static String BREAST_FEEDING_WOMEN_NOT_YET_ENROLED_ON_ART_SQL_3_1 = "breastFeedingWomenNotYetEnrolledOnArt.sql";
	
	public final static String COHORT_NEW_PATIENTS_ON_ART_STARTED_WITH_TB_TREATMENT_SQL_5_1 = "NewlyEnrolledOnArtStartedTbTreatment.sql";
	
	public final static String COHORT_PATIENTS_ALREADY_ON_ART_STARTED_WITH_TB_TREATMENT_SQL_5_2 = "AlreadyOnArtStartedTbTreatment.sql";
	
    public final static String COHORT_NEW_PATIENTS_ON_ART_STARTED_WITH_TB_TREATMENT_FOR_SIX_MONTHS_SQL_6_1 = "NewlyEnrolledOnArtStartedTbTreatmentForSixMonths.sql";
	
	public final static String COHORT_PATIENTS_ALREADY_ON_ART_STARTED_WITH_TB_TREATMENT_FOR_SIX_MONTHS_SQL_6_2 = "AlreadyOnArtStartedTbTreatmentForSixMonths.sql";
	
	public final static String COHORT_NEW_PATIENTS_ON_ART_COMPLETED_TB_TREATMENT_SQL_7_1 = "NewlyEnrolledOnArtCompletedTbTreatment.sql";
	
	public final static String COHORT_PATIENTS_ALREADY_ON_ART_COMPLETED_TB_TREATMENT_SQL_7_2 = "AlreadyOnArtCompletedTbTreatment.sql";
	
	public final static String ACTIVE_PATIENTS_6_MONTHS_INH_SQL_8 = "activePatients6MonthsInh.sql";
	
	public final static String COHORT_NEWLY_ENROLLED_PATIENTS_ON_ART_SCRENEES_POSTIVE_SQL_9_1 = "NewlyEnrolledOnArtScreeneesPostive.sql";
	
	public final static String COHORT_PATIENTS_ALREADY_ON_ART_SCRENEES_POSTIVE_SQL_9_1 = "AlreadyOnArtScreeneesPostive.sql";
	
	public final static String COHORT_NEWLY_ENROLLED_PATIENTS_ON_ART_SCRENEES_NEGATIVE_SQL_9_2 = "NewlyEnrolledOnArtScreeneesNegative.sql";
	
	public final static String COHORT_PATIENTS_ALREADY_ON_ART_SCRENEES_NEGATIVE_SQL_9_2 = "AlreadyOnArtScreeneesNegative.sql";
	
	public final static String NEWLYLY_ENROLLED_ARV_PATIENTS_AND_NEWLY_PLACED_ON_TB_TREATMENT_SQL_10 = "patientsNewlyenrolledOnArvsAndTbTreatment.sql";
	
	public final static String PATIENTS_ALREADY_ON_ARVS_AND_ALREADY_PLACED_ON_TB_TREATMENT_SQL_10 = "patientsAlreadyOnArvsAndTbTreatment.sql";
	
	public final static String TB_HIV_PATIENTS_ON_ANTI_TB_TREATMENT_SQL_11 = "tbHivPatientsOnAntiTbTreatment.sql";
	
	public final static String TB_HIV_PATIENTS_NEWLY_ENROLLED_ON_ART_ON_ANTI_TB_TREATMENT_SQL_12 = "tbHivPatientsNewlyEntolledOnArtOnAntiTbTreatment.sql";
	
	public final static String TB_HIV_PATIENTS_ALREADY_ON_ART_ON_ANTI_TB_TREATMENT_SQL_12 = "tbHivPatientsAlreadyOnArtOnAntiTbTreatment.sql";
	
	public final static String ACTIVE_HIV_PATIENTS_SQL_13 = "activeHivPatients.sql";
	
	public final static String ACTIVE_ARV_PATIENTS_LESS_3MONTHS_SQL_14_1 = "activeHivPatientsLess3Months.sql";
	
	public final static String ACTIVE_ARV_PATIENTS_BTN_3_5MONTHS_SQL_14_2 = "activeHivPatientsBtn3_5Months.sql";
	
	public final static String ACTIVE_ARV_PATIENTS_OVER_5MONTHS_SQL_14_3 = "activeHivPatientsOver5Months.sql";
	
    public final static String ACTIVE_PATIENTS_WITH_ATLEST_FOLLOW_UP_VIST_QUATERLY_SQL_15_1 = "activePatientsWithAtleastOneFollowUpVistQuatery.sql";
	
	public final static String ACTIVE_PATIENTS_WITH_ATLEST_FOLLOW_UP_VIST_SEMI_ANNUALLY_SQL_15_2 = "activePatientsWithAtleastOneFollowUpVistSemiAnnualy.sql";
	
	public final static String ACTIVE_PATIENTS_WITH_ATLEST_FOLLOW_UP_VIST_ANNUALLY_SQL_15_3 = "activePatientsWithAtleastOneFollowUpVistAnnualy.sql";
		
	public final static String ACTIVE_ARV_FIRST_LINE_REGIMEN_SQL_16_1 = "activeHivPatientsFirstLineRegimen.sql";
	
	public final static String ACTIVE_ARV_SECOND_LINE_REGIMEN_SQL_16_2 = "activeHivPatientsSecondLineRegimen.sql";
	
	public final static String ACTIVE_ARV_THIRD_LINE_REGIMEN_SQL_16_3 = "activeHivPatientsThirdLineRegimen.sql";
	   	
	public final static String INACTIVE_ARV_PATIENTS_DEAD_SQL_17_1 = "inactivePatientsDead.sql";
	
	public final static String INACTIVE_ARV_PATIENTS_MEDICAL_OR_VOLUNTARY_SQL_17_2 = "inactivePatientsMedicalOrVoluntary.sql";
	
	public final static String INACTIVE_ARV_PATIENTS_LOST_TO_FOR_A_MONTH_SQL_17_3 = "inactivePatientsLostToForMonth.sql";
	
	public final static String INACTIVE_ARV_PATIENTS_MIGRATED_SQL_17_3_1 = "inactivePatientsMigrated.sql";
	
	public final static String INACTIVE_ARV_PATIENTS_TRANSFERRED_SQL_17_4 = "inactivePatientsTransferred.sql";
	
	public final static String LOST_ARV_PATIENTS_DIED_SQL_18_1 = "lostArvPatienstDied.sql";
	
	public final static String LOST_ARV_PATIENTS_AFTER_TREATMENT_LESS_3MONTHS_SQL_18_2 = "lostArvPatienstForlessThan3monthsTreatment.sql";
	
	public final static String LOST_ARV_PATIENTS_AFTER_TREATMENT_MORE_3MONTHS_SQL_18_3 = "lostArvPatienstForMoreThan3monthsTreatment.sql";
	
	public final static String LOST_ARV_PATIENTS_TRANSFERRED_SQL_18_4 = "lostArvPatientsTransferred.sql";
	
	public final static String LOST_ARV_PATIENTS_STOPPED_SQL_18_5 = "lostArvPatientsStopped.sql";
	
	public final static String DEAD_ARV_PATIENTS_BY_TUBERCLOSIS_SQL_18_1_1 = "deadArvPatientsByTuberclosis.sql";
	
	public final static String DEAD_ARV_PATIENTS_BY_OTHER_INFECTIOUS_DISEASES_SQL_18_1_2 = "deadArvPatientsByOtherInfectiousDiseases.sql";
	
	public final static String DEAD_ARV_PATIENTS_BY_CANCER_SQL_18_1_3 = "deadArvPatientsByCancer.sql";
	
	public final static String DEAD_ARV_PATIENTS_BY_HIV_ILLNESSES_SQL_18_1_4 = "deadArvPatientsByHivIllnensses.sql";
	
	public final static String DEAD_ARV_PATIENTS_BY_NATURAL_CAUSES_SQL_18_1_5 = "deadArvPatientsByNaturalCauses.sql";
	
	public final static String DEAD_ARV_PATIENTS_BY_UNNATURAL_CAUSES_SQL_18_1_6 = "deadArvPatientsByUnNaturalCauses.sql";
	
	public final static String DEAD_ARV_PATIENTS_BY_UNKNOWN_CAUSES_SQL_18_1_7 = "deadArvPatientsByUnKnownCauses.sql";
	
	public final static String LOST_ARV_PATIENTS_RESUMED_TREATMENT_SQL_19 = "lostPatientsResumedTreatment.sql";
	
	public final static String ACTIVE_ARV_PATIENTS_WITH_VIRAL_LOAD_RESULT_SQL_20_1 = "activeArvPatientWithViralLoadResult.sql";
	
	public final static String ACTIVE_PREGNANT_WOMEN_ON_ART_WITH_VIRAL_LOAD_RESULT_SQL_20_1_1 = "activePregnantWomenOnArtWithViralLoadResult.sql";
	
	public final static String ACTIVE_BREAST_FEEDING_WOMEN_ON_ART_WITH_VIRAL_LOAD_RESULT_SQL_20_1_2 = "activeBreastFeedingWomenOnArtWithViralLoadResult.sql";
	
	public final static String ACTIVE_ARV_PATIENTS_WITH_VIRAL_LOAD_RESULT_LESS_THAN_1000_COPIES_SQL_20_2 = "activeArvPatientWithViralLoadResultLess1000Copies.sql";
	
	public final static String ACTIVE_PREGNANT_WOMEN_WITH_VIRAL_LOAD_RESULT_LESS_THAN_1000_COPIES_SQL_20_2_1 = "activePregnantWomenWithViralLoadResultLess1000Copies.sql";
	
	public final static String ACTIVE_BREAST_FEEDING_WOMEN_WITH_VIRAL_LOAD_RESULT_LESS_THAN_1000_COPIES_SQL_20_2_2 = "activeBreastFeedingWomenWithViralLoadResultLess1000Copies.sql";
	
	public final static String ACTIVE_ARV_PATIENTS_WITH_VIRAL_LOAD_RESULT_TARGETED_SQL_21_1 = "activeArvPatientWithViralLoadResultTargeted.sql";
	
	public final static String ACTIVE_PREGNANT_WOMEN_ON_ART_WITH_VIRAL_LOAD_RESULT_TARGETED_SQL_21_1_1 = "activePregnantWomenOnArtWithViralLoadResultTargeted.sql";
	
	public final static String ACTIVE_BREAST_FEEDING_WOMEN_ON_ART_WITH_VIRAL_LOAD_RESULT_TARGETED_SQL_21_1_2 = "activeBreastFeedingWomenOnArtWithViralLoadResultTargeted.sql";
	
	public final static String ACTIVE_ARV_PATIENTS_WITH_VIRAL_LOAD_RESULT_TARGETED_LESS_THAN_1000_COPIES_SQL_21_2 = "activeArvPatientWithViralLoadResultTargetedLessThan1000Copies.sql";
	
	public final static String ACTIVE_PREGNANT_WOMEN_ON_ART_WITH_VIRAL_LOAD_RESULT_TARGETED_LESS_THAN_1000_COPIES_SQL_21_2_1 = "activePregnantWomenOnArtWithViralLoadResultTargetedLessThan1000Copies.sql";
	
	public final static String ACTIVE_BREAST_FEEDING_WOMEN_ON_ART_WITH_VIRAL_LOAD_RESULT_TARGETED_LESS_THAN_1000_COPIES_SQL_21_2_2 = "activeBreastFeedingWomenOnArtWithViralLoadResultTargetedLessThan1000Copies.sql";
	
	public final static String PATIENTS_ON_ARVS_FOR_12_MONTHS_SQL_22_1 = "patientsOnArvsFor12Months.sql";
	
	public final static String PATIENTS_ON_ARVS_FOR_12_MONTHS_IN_SIGHT_SQL_22_1_1 = "patientsOnArvsFor12MonthsInSight.sql";
	
	public final static String PATIENTS_ON_ARVS_FOR_12_MONTHS_TRANSFERRED_SQL_22_1_2 = "patientsOnArvsFor12MonthsTransferred.sql";
	
	public final static String PATIENTS_ON_ARVS_FOR_12_MONTHS_ALIVE_SQL_22_2 = "patientsOnArvsFor12MonthsAlive.sql";
	
	public final static String WOMEN_ON_ARVS_SCREENED_FOR_CERVICAL_CANCER_SQL_23 = "womenOnArvsScreenedForCervicalCancer.sql";
	
	public final static String WOMEN_ON_ARVS_SCREENED_FOR_CERVICAL_CANCER_FIRST_TIME_SQL_23_1 = "womenOnArvsScreenedForCervicalCancerFirstTime.sql";
	
	public final static String WOMEN_ON_ARVS_SCREENED_FOR_CERVICAL_CANCER_AFTER_FIRST_NEGATIVE_SQL_23_2 = "womenOnArvsScreenedForCervicalCancerAfterFirstNegative.sql";
	
	public final static String WOMEN_ON_ARVS_SCREENED_FOR_CERVICAL_CANCER_AFTER_TREATMENT_SQL_23_3 = "womenOnArvsScreenedForCervicalCancerAfterTreatment.sql";
	
	public final static String WOMEN_ON_ARVS_SCREENED_FOR_CERVICAL_CANCER_RECIEVED_CRYO_SQL_24 = "womenOnArvsScreenedForCervicalCancerRcievedCryotherapy.sql";
	
	public final static String WOMEN_ON_ARVS_SCREENED_FOR_CERVICAL_CANCER_RECIEVED_THERMO_SQL_24 = "womenOnArvsScreenedForCervicalCancerRcievedThermocoagulation.sql";
	
	public final static String WOMEN_ON_ARVS_SCREENED_FOR_CERVICAL_CANCER_RECIEVED_LEEP_SQL_24 = "womenOnArvsScreenedForCervicalCancerRcievedLeep.sql";
	
	//Family planning sql queries
	public final static String PATIENTS_ACCEPTING_FAMILY_PLANNING_PILLS_SQL = "patientsAcceptingFamilyPlanningPills.sql";
	
	public final static String PATIENTS_ACCEPTING_FAMILY_PLANNING_INJECT_SQL = "patientsAcceptingFamilyPlanningInject.sql";
	
	public final static String PATIENTS_ACCEPTING_FAMILY_PLANNING_IMPLANTS_SQL = "patientsAcceptingFamilyPlanningImplnats.sql";
	
	public final static String PATIENTS_ACCEPTING_FAMILY_PLANNING_VAGTABS_SQL = "patientsAcceptingFamilyPlanningVagTabs.sql";
	
	public final static String PATIENTS_ACCEPTING_FAMILY_PLANNING_LAM_SQL = "patientsAcceptingFamilyPlanningLam.sql";
	
	public final static String PATIENTS_ACCEPTING_FAMILY_PLANNING_NECKLACE_SQL = "patientsAcceptingFamilyPlanningNecklace.sql";
	
	public final static String PATIENTS_ACCEPTING_FAMILY_PLANNING_CONDOM_SQL = "patientsAcceptingFamilyPlanningCondoms.sql";
	
	public final static String PATIENTS_ACCEPTING_FAMILY_PLANNING_CCV_SQL = "patientsAcceptingFamilyPlanningCcv.sql";
	
	public final static String PATIENTS_USING_FAMILY_PLANNING_PILLS_SQL = "patientsUsingFamilyPlanningPills.sql";
	
	public final static String PATIENTS_USING_FAMILY_PLANNING_INJECT_SQL = "patientsUsingFamilyPlanningInject.sql";
	
	public final static String PATIENTS_USING_FAMILY_PLANNING_IMPLANTS_SQL = "patientsUsingFamilyPlanningImplnats.sql";
	
	public final static String PATIENTS_USING_FAMILY_PLANNING_VAGTABS_SQL = "patientsUsingFamilyPlanningVagTabs.sql";
	
	public final static String PATIENTS_USING_FAMILY_PLANNING_LAM_SQL = "patientsUsingFamilyPlanningLam.sql";
	
	public final static String PATIENTS_USING_FAMILY_PLANNING_NECKLACE_SQL = "patientsUsingFamilyPlanningNecklace.sql";
	
	public final static String PATIENTS_USING_FAMILY_PLANNING_CONDOM_SQL = "patientsUsingFamilyPlanningCondoms.sql";
	
	public final static String PATIENTS_USING_FAMILY_PLANNING_CCV_SQL = "patientsUsingFamilyPlanningCcv.sql";
		
	//corhot indicators for Patients on CTX
	
	public final static String NEWLY_POWERED_CTX_COHORT_INDICATOR_SQL_4_1 = "newlyPoweredCtxCorhotIndicator.sql";
	
	public final static String ACTIVE_CTX_COHORT_INDICATOR_SQL_4_2 = "activeCtxCorhotIndicator.sql";
	
	//totals
	public final static String TOTAL_HIV_PATIENTS_UNDER_PREVENTION_CTX_SQL_4 = "TotalPatientsUnderPreventionCtx.sql";
	
	public final static String TOTAL_HIV_PATIENTS_UNDER_PREVENTION_TB_TREATMENT_SQL_5 = "TotalPatientsUnderTbTreament.sql";
	
	public final static String TOTAL_HIV_PATIENTS_UNDER_PREVENTION_TB_TREATMENT_FOR_SIX_MONTHS_SQL_6 = "TotalPatientsUnderTbTreatmentForSixMonths.sql";
	
	public final static String TOTAL_HIV_PATIENTS_COMPLETED_PREVENTION_TB_TREATMENT_SQL_7 = "TotalPatientsCompletedTbTreatment.sql";
	
	public final static String TOTAL_HIV_PATIENTS_TB_SCRENEES_SQL_9 = "TotalPatientsForTbScreenes.sql";
	
	public final static String TOTAL_HIV_PATIENTS_WITH_A_BACTERIOLOGY_SPECIMEN_COLLECTION_SQL_9_1_1 = "TotalpatientsWithBacterologySpecimenSampleColection.sql";
	
	public final static String GENEEXPERT_MTB_DIAGNOSIS_TEST_SQL_9_1_1_1 = "TbDiagnosisTestsGeneExpertMtb.sql";
	
	public final static String OTHER_DIAGNOSIS_TEST_SQL_9_1_1_1 = "TbDiagnosisTestsOther.sql";
	
	public final static String TOTAL_ARV_PATIENTS_WITH_POSTIVE_RESULT_FROM_TB_DIAGNOSIS_SQL_9_1_1_1_1 = "TotalPatienstWithPostiveResultsFromTbDiagnosis.sql";
	
	public final static String TOTAL_ARV_PATIENTS_NEWLY_PLACED_ON_TB_TREATMENT_SQL_10 = "TotalArvPatientsNewlyPalcedUnderTbTreatmet.sql";
	
	public final static String TOTAL_ARV_PATIENTS_INACTIVE_AT_THE_END_SQL_15 = "TotalArvPatientsInactiveAtTheEnd.sql";
	
	public final static String TOTAL_ARV_PATIENTS_LOST_TO_FOLLOW_SQL_16 = "TotalArvPatientsLostToFollow.sql";
	
	public final static String TOTAL_ARV_PATIENTS_RECOMENDED_PF_SQL = "totalArvPatientsRecomendedPf.sql";
	
	//Dimesion Corhorts By key Populations	
	public final static String MSM_COHORT_SQL = "keyPopulationMsm.sql";
	
	public final static String SEX_PROFFESIONALS_COHORT_SQL = "keyPopulationSex.sql";
	
	public final static String TRANSGENDER__COHORT_SQL = "keyPopulationTransgender.sql";
	
	public final static String CAPTIVES__COHORT_SQL = "keyPopulationCaptive.sql";
	
	public final static String INJECTION_DRUG_USERS_COHORT_SQL = "keyPopulationDrug.sql";
	
	//Dimesion Corhorts By Cervical Cancer tatus
	public final static String WOMEN_TESTED_POSTIVE_FOR_CERVICAL_CANCER_COHORT_SQL = "womenTestedPostiveForCervicalCancer.sql";
	
	public final static String WOMEN_TESTED_NEGATIVE_FOR_CERVICAL_CANCER_COHORT_SQL = "womenTestedNegativeForCervicalCancer.sql";
	
	public final static String WOMEN_WITH_SUSPECTED_CERVICAL_CANCER_COHORT_SQL = "womenWithSuspectedCervicalCancer.sql";
	
	//Dimension corhots by Reason of Non Enrollment NOTE THAT THE SQL FILES BELOW ARE STILL DUMMY
	public final static String COHORT_NON_ENROLLMENT_REASON_OTHER_SQL = "notEnrolledReasonOther.sql";
	
	public final static String COHORT_NON_ENROLLMENT_REASON_DIED_SQL = "notEnrolledReasonDied.sql";
	
	public final static String COHORT_NON_ENROLLMENT_REASON_VOLUNTARY_SQL = "notEnrolledReasonVoluntary.sql";
	
	public final static String COHORT_NON_ENROLLMENT_REASON_DENIAL_SQL = "notEnrolledReasonDenial.sql";
	
	public final static String COHORT_NON_ENROLLMENT_REASON_MEDICAL_SQL = "notEnrolledReasonMedical.sql";
	
	public final static String COHORT_NON_ENROLLMENT_REASON_REFERRED_SQL = "notEnrolledReasonReferred.sql";
	
	//UUIDS	
	public static final String NEWLY_ENROLLED_PATIENTS_ON_ART_UUID = "3e1698a5-f77f-45e3-a2b9-b0f7d2ede9qx";
	
	public final static String REFERRED_IN_PATIENTS_ENROLED_ON_ART_UUID = "ba28a703-1d8a-4527-a590-8629e6da89qx";
	
	public final static String NEW_BREAST_FEEDING_WOMEN_ENROLED_ON_ART_UUID = "840abd26-ed9d-4bf0-995b-7c11aa64edqx";
	
	public final static String NEW_REFERRED_IN_BREAST_FEEDING_WOMEN_ENROLED_ON_ART_UUID = "bfb89642-927e-4a9e-9b55-a8dd9004caqx";
	
	public final static String NOT_YET_ENROLED_ON_ART_BY_REASON_UUID = "b83f651f-19e5-4d4d-9915-6b7d67e3e4qx";
	
	public final static String DISINTERGRATION_BY_KEY_POPULATION_UUID = "0412cd0e-8909-4fdf-a088-15fce7c1aeqx";
	
	public final static String HIV_PATIENTS_UNDER_PREVENTION_CTX_UUID = "5a24bfe3-4174-49da-afa7-76c0c18dbcqx";
	
	public final static String HIV_PATIENTS_UNDER_PREVENTION_TB_TREATMENT_UUID = "f85ea4a1-1a67-46a2-846b-e78e31f721qx";
	
	public final static String HIV_PATIENTS_UNDER_PREVENTION_TB_TREATMENT_6MONTHS_UUID = "c76be378-895a-4726-bbfd-5872d98102qx";
	
	public final static String PATIENTS_WHO_COMPLETED_TB_TREATMENT_UUID = "61e4dfa4-6455-4082-93a7-05b30f0ab9qx";
	
	public final static String PATIENTS_ON_ART_SCRENEES_POSTIVE_UUID = "4797cf31-9b72-48e6-95dc-6b58e1290aqx";
	
	public final static String PATIENTS_ON_ART_SCRENEES_NEGATIVE_UUID = "9149d674-20ea-44ef-ab86-fa7192f095qx";
	
	public final static String BREAST_FEEDING_WOMEN_NOT_YET_ENROLED_ON_ART_UUID = "42b85829-6a6b-4476-99e1-0bdea970baqx";
	
	public final static String ARV_PATIENTS_WITH_SAMPLES_SENT_TO_DIAGNOSTIC_TEST_UUID = "6ad18bb5-0840-4ecb-beaf-8fb17513edqx";
	
	public final static String ARV_PATIENTS_NEWLY_PLACED_ON_TB_TREATMENT_UUID = "7efd6d28-7a0f-4ae1-8e10-ea676df1a9qx";
	
	public final static String TB_HIV_PATIENTS_ON_TB_TREATMENT_UUID = "47ee76e0-d108-4fbc-b1f2-4f6fc2d5bfqx";
	
	public final static String TB_HIV_PATIENTS_ON_TB_TREATMENT_DISTENGRATED_BY_NEW_AND_ALREADY_ON_ART_UUID = "55a84970-3e1e-4669-9e25-6efcca1affqx";
	
	public final static String ACTIVE_HIV_PATIENTS_UUID = "34f0233e-cc79-48c6-a3f8-466481b384qx";
	
	public final static String ACTIVE_HIV_PATIENTS_BY_KEY_POPN_UUID = "0936606d-0af0-4e49-ba0c-6af479c756qx";
	
	public final static String ACTIVE_ARV_PATIENTS_OVER_MONTHS_UUID = "9d26b3ea-efe0-495a-8fa6-14217ba3abqx";
	
	public final static String ACTIVE_ARV_PATIENTS_REGIME_LINES_UUID = "b476e304-c915-432c-bab3-e7db697685qx";
	
	public final static String INACTIVE_ARV_PATIENTS_DEAD_UUID = "7fa34341-b72f-4437-a6b5-b2be79f9ecqx";
	
	public final static String INACTIVE_ARV_PATIENTS_MEDICAL_OR_VOLUNTARY_UUID = "3ae7632e-39e6-4dc4-9497-7e306ffba2qx";
	
	public final static String INACTIVE_ARV_PATIENTS_LOST_TO_FOR_A_MONTH_UUID = "53190468-51d5-403b-9bcf-a705a08705qx";
	
	public final static String INACTIVE_ARV_PATIENTS_MIGRATED_UUID = "b3207455-22bc-4e64-8a9c-e071bf66a8qx";
	
	public final static String INACTIVE_ARV_PATIENTS_TRANSFERRED_UUID = "7d544875-3a47-4574-84f3-c7ef76ea88qx";
	
	public final static String LOST_ARV_PATIENTS_DIED_UUID = "79abb548-a875-4000-8f8c-77fad1f1e8qx";
	
	public final static String LOST_ARV_PATIENTS_AFTER_TREATMENT_LESS_3MONTHS_UUID = "857457fa-1990-4d5d-ae70-fdfa517165qx";
	
	public final static String LOST_ARV_PATIENTS_AFTER_TREATMENT_MORE_3MONTHS_UUID = "4bc9c43e-4524-408f-ac36-b538f07ec6qx";
	
	public final static String LOST_ARV_PATIENTS_TRANSFERRED_UUID = "5db0c03b-4945-4527-a522-3b1527898efqx";
	
	public final static String LOST_ARV_PATIENTS_STOPPED_UUID = "163c36c3-b3de-477d-83f8-e8afdb8e7eqx";
	
	public final static String DEAD_ARV_PATIENTS_BY_TUBERCLOSIS_UUID = "2d5e486e-736e-4cd3-86fa-00dbe25622qx";
	
	public final static String DEAD_ARV_PATIENTS_BY_OTHER_INFECTIOUS_DISEASES_UUID = "85f50663-615b-400e-bae5-22bd857b94qx";
	
	public final static String DEAD_ARV_PATIENTS_BY_CANCER_UUID = "e907e9f1-c731-4ea4-8d9d-41881f68b9qx";
	
	public final static String DEAD_ARV_PATIENTS_BY_HIV_ILLNESSES_UUID = "7da727ba-a85c-4f2e-bb5b-caece4bf08qx";
	
	public final static String DEAD_ARV_PATIENTS_BY_NATURAL_CAUSES_UUID = "1e98ddc0-a569-4f5a-bcc4-7c6eb3ad33qx";
	
	public final static String DEAD_ARV_PATIENTS_BY_UNNATURAL_CAUSES_UUID = "15e0967d-8610-463b-a42c-26110cc8b5qx";
	
	public final static String DEAD_ARV_PATIENTS_BY_UNKNOWN_CAUSES_UUID = "b022665f-131d-4e02-8671-79a81c49aeqx";
	
	public final static String LOST_ARV_PATIENTS_RESUMED_TREATMENT_UUID = "22245a7f-edf3-4744-9d6c-c0709faf01qx";
	
	public final static String LOST_ARV_PATIENTS_RESUMED_TREATMENT_KEY_POPULATION_UUID = "c77d2dd3-3625-4bd6-ba63-abef54796dqx";
	
	public final static String ACTIVE_ARV_PATIENTS_WITH_VIRAL_LOAD_RESULT_UUID = "db970504-fdfe-4d53-84d1-d2bc3e723eqx";
	
	public final static String ACTIVE_PREGNANT_WOMEN_ON_ART_WITH_VIRAL_LOAD_RESULT_UUID = "c6367ae1-0722-490a-a3b8-fb0d471243qx";
	
	public final static String ACTIVE_BREAST_FEEDING_WOMEN_ON_ART_WITH_VIRAL_LOAD_RESULT_UUID = "4173707a-f016-4e1a-a84c-c9a5499cd0qx";
	
	public final static String ACTIVE_ARV_PATIENTS_WITH_VIRAL_LOAD_RESULT_KEY_POPULATION_UUID = "3fc2b767-34ba-440f-9614-74097934e6qx";
	
	public final static String ACTIVE_ARV_PATIENTS_WITH_VIRAL_LOAD_RESULT_LESS_THAN_1000_COPIES_UUID = "c3d65dbb-9420-4692-9e90-93e1b2cee5qx";
	
	public final static String ACTIVE_PREGNANT_WOMEN_WITH_VIRAL_LOAD_RESULT_LESS_THAN_1000_COPIES_UUID = "6d98fb60-286f-493c-a06e-e2b51ca702qx";
	
	public final static String ACTIVE_BREAST_FEEDING_WOMEN_WITH_VIRAL_LOAD_RESULT_LESS_THAN_1000_COPIES_UUID = "9dc130bb-2656-4bcc-b3db-51215e5b8eqx";
	
	public final static String ACTIVE_ARV_PATIENTS_WITH_VIRAL_LOAD_RESULT_LESS_THAN_1000_COPIES_BY_KEY_POPULATION_UUID = "60d24c67-5519-480f-87d9-c9add291e6qx";
	
	public final static String ACTIVE_ARV_PATIENTS_WITH_VIRAL_LOAD_RESULT_TARGETED_UUID = "ae2e0c70-6d8a-4947-b8dc-14d3324484qx";
	
	public final static String ACTIVE_PREGNANT_WOMEN_ON_ART_WITH_VIRAL_LOAD_RESULT_TARGETED_UUID = "6ea09e80-c892-4091-bc8a-6620a9b0c8qx";
	
	public final static String ACTIVE_BREAST_FEEDING_WOMEN_ON_ART_WITH_VIRAL_LOAD_RESULT_TARGETED_UUID = "f87ca31f-1e2b-4faa-9f4d-51390e342aqx";
	
	public final static String ACTIVE_ARV_PATIENTS_WITH_VIRAL_LOAD_RESULT_TARGETED_BY_KEY_POPULATION_UUID = "a908d5e0-6cdf-4e64-bc0f-5ee7c7bf3dqx";
	
	public final static String ACTIVE_ARV_PATIENTS_WITH_VIRAL_LOAD_RESULT_TARGETED_LESS_THAN_1000_COPIES_UUID = "b350fecb-4221-431c-8ea4-54ff5af7e2qx";
	
	public final static String ACTIVE_PREGNANT_WOMEN_ON_ART_WITH_VIRAL_LOAD_RESULT_TARGETED_LESS_THAN_1000_COPIES_UUID = "758b38b1-9dc7-4d2e-9f9b-d263df7de3qx";
	
	public final static String ACTIVE_BREAST_FEEDING_WOMEN_ON_ART_WITH_VIRAL_LOAD_RESULT_TARGETED_LESS_THAN_1000_COPIES_UUID = "8ebbaf4b-0d30-4023-b932-2f0092bd0fqx";
	
	public final static String ACTIVE_ARV_PATIENTS_WITH_VIRAL_LOAD_RESULT_TARGETED_LESS_THAN_1000_COPIES_KEY_POPULATION_UUID = "0d9cbe47-164e-4d12-8399-abc5c5478aqx";
	
	public final static String PATIENTS_ON_ARVS_FOR_12_MONTHS_UUID = "cf560a70-53e0-4efd-9971-ed733787f6qx";
	
	public final static String PATIENTS_ON_ARVS_FOR_12_MONTHS_IN_SIGHT_UUID = "2dae0c1b-2272-4596-82a0-7bd6c987cfqx";
	
	public final static String PATIENTS_ON_ARVS_FOR_12_MONTHS_TRANSFERRED_UUID = "2a10d10b-f55f-43e9-a012-9368b27215qx";
	
	public final static String PATIENTS_ON_ARVS_FOR_12_MONTHS_ALIVE_UUID = "8867628d-584e-45ae-ad8e-c769593689qx";
	
	public final static String WOMEN_ON_ARVS_SCREENED_FOR_CERVICAL_CANCER_UUID = "c54b39dd-4a5b-4616-b8a9-9bcc681f2xqx";
	
	public final static String WOMEN_ON_ARVS_SCREENED_FOR_CERVICAL_CANCER_FIRST_TIME_UUID = "ed9e7e8c-a720-4ae7-8dbe-be3e737xxcax";
	
	public final static String WOMEN_ON_ARVS_SCREENED_FOR_CERVICAL_CANCER_AFTER_FIRST_NEGATIVE_UUID = "046928ed-8591-469c-a853-ed93xx1a79cx";
	
	public final static String WOMEN_ON_ARVS_SCREENED_FOR_CERVICAL_CANCER_AFTER_TREATMENT_UUID = "217e6dbd-697d-4cf0-add2-dda15xxa36cx";
	
	public final static String WOMEN_ON_ARVS_SCREENED_FOR_CERVICAL_CANCER_TESTED_POSTIVE_UUID = "4c0eafc7-c797-4636-bd03-37c79xx332cx";
	
	public final static String PATIENTS_ACCEPTING_FAMILY_PLANNING_UUID = "769039cb-e9dc-4562-99e9-1bf8f844abcx";
	
	public final static String PATIENTS_USING_FAMILY_PLANNING_UUID = "f9960bd2-da88-41ed-9064-a4f0f10484cx";
	
    public final static String ACTIVE_PATIENTS_WITH_ATLEST_FOLLOW_UP_VIST_UUID = "cc5ff0c0-bd0f-11ea-qqde-0242ac130004";
	
	
	//total indicators
	public final static String TOTAL_HIV_PATIENTS_UNDER_PREVENTION_CTX_UUID = "e5dc31e6-8e69-4fca-a477-96e185e3f4cx";
	
	public final static String TOTAL_HIV_PATIENTS_UNDER_PREVENTION_TB_TREATMENT_UUID = "eef7a04a-638f-4b77-8747-3258d71834cx";
	
	public final static String TOTAL_HIV_PATIENTS_UNDER_PREVENTION_TB_TREATMENT_FOR_SIX_MONTHS_UUID = "29d90842-4484-436c-9ba0-38c0f732c5cx";
	
	public final static String TOTAL_HIV_PATIENTS_COMPLETED_PREVENTION_TB_TREATMENT_UUID = "1957d27f-f80a-4a34-837d-c8aa7391a8cx";
	
	public final static String TOTAL_HIV_PATIENTS_TB_SCRENEES_UUID = "b29ea3e4-9bf7-44a4-b0be-f776488d02cx";
	
	public final static String TOTAL_HIV_PATIENTS_WITH_A_BACTERIOLOGY_SPECIMEN_COLLECTION_UUID = "b3b6719d-a8a1-4f75-acdb-7178054f93cx";
	
	public final static String TOTAL_ARV_PATIENTS_WITH_POSTIVE_RESULT_FROM_TB_DIAGNOSIS_UUID = "3687de55-b001-438e-85a5-7d7244db49cx";
	
	public final static String TOTAL_ARV_PATIENTS_NEWLY_PLACED_ON_TB_TREATMENT_UUID = "fc75d453-3291-4ea5-8995-514ebf26d1cx";
	
	public final static String TOTAL_ARV_PATIENTS_INACTIVE_AT_THE_END_UUID = "d773f191-80be-4da4-b310-8c862c09a5cx";
	
	public final static String TOTAL_ARV_PATIENTS_LOST_TO_FOLLOW_UUID = "805ee42a-69d4-4ff7-9425-51e48ba70ccx";
	
	public final static String TOTAL_ARV_PATIENTS_RECOMENDED_PF_UUID = "e10xx9fa-2589-4781-a97c-bbae4ee50bcx";
	
	public final static String ACTIVE_PATIENTS_6_MONTHS_INH_UUID = "3e2a902c-878d-4da8-af82-c32efxxa8eeb";
	
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
	
	public final static String PATIENTS_ON_ART_SCRENEES_POSTIVE_MESSAGE = "isanteplusreports.tbPatientsScreneesPostive";
	
	public final static String PATIENTS_ON_ART_SCRENEES_NEGATIVE_MESSAGE = "isanteplusreports.tbPatientsScreneesNegative";
	
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
	
	public final static String PATIENTS_ON_ARVS_FOR_12_MONTHS_MESSAGE = "isanteplusreports.activePatientsFor12Months";
	
	public final static String PATIENTS_ON_ARVS_FOR_12_MONTHS_IN_SIGHT_MESSAGE = "isanteplusreports.activePatientsInsight";
	
	public final static String PATIENTS_ON_ARVS_FOR_12_MONTHS_TRANSFERRED_MESSAGE = "isanteplusreports.activePatientsTransferred";
	
	public final static String PATIENTS_ON_ARVS_FOR_12_MONTHS_ALIVE_MESSAGE = "isanteplusreports.activePatientsAlive";
	
	public final static String WOMEN_ON_ARVS_SCREENED_FOR_CERVICAL_CANCER_MESSAGE = "isanteplusreports.womenOnArvScreenedCervicalCancer";
	
	public final static String WOMEN_ON_ARVS_SCREENED_FOR_CERVICAL_CANCER_FIRST_TIME_MESSAGE = "isanteplusreports.womenOnArvScreenedCervicalCancer.firstTime";
	
	public final static String WOMEN_ON_ARVS_SCREENED_FOR_CERVICAL_CANCER_AFTER_FIRST_NEGATIVE_MESSAGE = "isanteplusreports.womenOnArvScreenedCervicalCancer.afterNegative";
	
	public final static String WOMEN_ON_ARVS_SCREENED_FOR_CERVICAL_CANCER_AFTER_TREATMENT_MESSAGE = "isanteplusreports.womenOnArvScreenedCervicalCancer.AfterTreament";
	
	public final static String WOMEN_ON_ARVS_SCREENED_FOR_CERVICAL_CANCER_TESTED_POSTIVE_MESSAGE = "isanteplusreports.womenOnArvScreenedCervicalCancer.testedPostive";
	
	public final static String TOTAL_ARV_PATIENTS_RECOMENDED_PF_MESSAGE = "isanteplusreports.recomendedPf";
	
	public final static String PATIENTS_ACCEPTING_FAMILY_PLANNING_MESSAGE = "isanteplusreports.recomendedPf.accepting";
	
	public final static String PATIENTS_USING_FAMILY_PLANNING_MESSAGE = "isanteplusreports.recomendedPf.using";
	
	//total indicators
	public final static String TOTAL_HIV_PATIENTS_UNDER_PREVENTION_CTX_MESSAGE = "isanteplusreports.patientsUnderPreventionCtx.total";
	
	public final static String TOTAL_HIV_PATIENTS_UNDER_PREVENTION_TB_TREATMENT_MESSAGE = "isanteplusreports.patientsUnderTBPreventionTreatment.total";
	
	public final static String TOTAL_HIV_PATIENTS_UNDER_PREVENTION_TB_TREATMENT_FOR_SIX_MONTHS_MESSAGE = "isanteplusreports.patientsUnderTBPreventionTreatment.6months.total";
	
	public final static String TOTAL_HIV_PATIENTS_COMPLETED_PREVENTION_TB_TREATMENT_MESSAGE = "isanteplusreports.patientsCompletedTBTreatment.total";
	
	public final static String TOTAL_HIV_PATIENTS_TB_SCRENEES_MESSAGE = "isanteplusreports.tbPatientsScrenees.total";
	
	public final static String TOTAL_HIV_PATIENTS_WITH_A_BACTERIOLOGY_SPECIMEN_COLLECTION_MESSAGE = "isanteplusreports.bacteriologySpecimenCollectioan.total";
	
	public final static String ARV_PATIENTS_WITH_SAMPLES_SENT_TO_DIAGNOSTIC_TEST_MESSAGE = "isanteplusreports.dignosticTests";
	
	public final static String TOTAL_ARV_PATIENTS_WITH_POSTIVE_RESULT_FROM_TB_DIAGNOSIS_MESSAGE = "isanteplusreports.postiveResultFomTbDiagnosis";
	
	public final static String TOTAL_ARV_PATIENTS_NEWLY_PLACED_ON_TB_TREATMENT_MESSAGE = "isanteplusreports.arvPatientsNewlyPacedOnTbTreatmet.total";
	
	public final static String TOTAL_ARV_PATIENTS_INACTIVE_AT_THE_END_MESSAGE = "isanteplusreports.arvPatientsInactiveAtTheEnd.total";
	
	public final static String TOTAL_ARV_PATIENTS_LOST_TO_FOLLOW_MESSAGE = "isanteplusreports.lostToFollow";
	
	public final static String ACTIVE_PATIENTS_WITH_ATLEST_FOLLOW_UP_VIST_MESSAGE = "isanteplusreports.followUp";
	
	public final static String ACTIVE_PATIENTS_6_MONTHS_INH_MESSAGE = "isanteplusreports.inh.6months";
	
	//report definiton Desriptions
	public final static String REPORT_DESCRIPTION_14BY3 = "RD_14_by_3";
	
	public final static String REPORT_DESCRIPTION_1BY1 = "RD_1_by_1";
	
	public final static String REPORT_DESCRIPTION_14BY14 = "RD_14_by_14";
	
	public final static String REPORT_DESCRIPTION_6BY3 = "RD_6_by_3";
	
	public final static String REPORT_DESCRIPTION_14BY6 = "RD_14_by_6";
	
	public final static String REPORT_DESCRIPTION_4BY5 = "RD_4_by_5";
	
	public final static String REPORT_DESCRIPTION_4BY7 = "RD_4_by_7";
	
	public final static String REPORT_DESCRIPTION_4BY7_II = "RD_4_by_7_II";
	
	public final static String REPORT_DESCRIPTION_3BY1 = "RD_3_by_1";
	
	public final static String REPORT_DESCRIPTION_14BY4 = "RD_14_by_4";
	
	public final static String REPORT_DESCRIPTION_6BY2 = "RD_6_by_2";
	
	public final static String REPORT_DESCRIPTION_14BY9 = "RD_14_by_9";
	
	public final static String REPORT_DESCRIPTION_10BY4 = "RD_10_by_4";
	
	public final static String REPORT_DESCRIPTION_10BY4_II = "RD_10_by_4_II";
	
	public final static String REPORT_DESCRIPTION_10BY11 = "RD_10_by_11";
	
	public final static String REPORT_DESCRIPTION_4BY3 = "RD_4_by_3";
	
}
