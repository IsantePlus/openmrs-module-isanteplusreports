package org.openmrs.module.isanteplusreports.hsisReport.library.cohorts;

import static org.openmrs.module.isanteplusreports.hsisReport.utils.HsisReportUtils.cohortDefinitionFromSqlResource;

import org.openmrs.module.reporting.cohort.definition.CohortDefinition;
import org.openmrs.module.reporting.cohort.definition.SqlCohortDefinition;

public class HsisReportCohortLibrary {

  private static final String DATE_PARAMS_MAPPINGS = "startDate=${startDate},endDate=${endDate}";

  public static CohortDefinition newVistCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("newVists.sql", "new Vists");
    return cohortDefinition;
  }

  public static CohortDefinition subsquentVistCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("subsquentVists.sql", "subsquent Vists");
    return cohortDefinition;
  }

  public static CohortDefinition pregnantWomenCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("pregnantWomen.sql", "Pregnant Women");
    return cohortDefinition;
  }

  public static CohortDefinition pFClientsCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("pfClients.sql", "PF Clients");
    return cohortDefinition;
  }

  public static CohortDefinition customersInOralCareCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("customersInOralCare.sql", "Customers in oral care");
    return cohortDefinition;
  }

  public static CohortDefinition microscopicTestCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("microscopicTest.sql", "Malaria microscopic test");
    return cohortDefinition;
  }

  public static CohortDefinition  fastTestCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("fastTest.sql", "Malaria fast test");
    return cohortDefinition;
  }

  public static CohortDefinition  testedForMalariaCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("testedForMalaria.sql", "Number of people tested for Malaria");
    return cohortDefinition;
  }

  public static CohortDefinition  microscopicTestAndPositiveCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("microscopicTestAndPositive.sql", "Number of people tested for Malaria");
    return cohortDefinition;
  }

  public static CohortDefinition  fastTestAndPositiveCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("fastTestAndPositive.sql", "Number of people tested for Malaria");
    return cohortDefinition;
  }

  public static CohortDefinition  malariaTestPosisitveCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("malariaTestPosisitve.sql", "Number of people tested positive for Malaria");
    return cohortDefinition;
  }

  public static CohortDefinition  malariaTestCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("malariaTest.sql", "Number of people tested for Malaria");
    return cohortDefinition;
  }

  public static CohortDefinition  vihCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("vih.sql", "Pregnant women with VIH");
    return cohortDefinition;
  }

  public static CohortDefinition  positiveVihCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("positveVih.sql", "Pregnant women with VIH");
    return cohortDefinition;
  }

  public static CohortDefinition  hemogramCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("hemogram.sql", "Pregnant women with Hemogram");
    return cohortDefinition;
  }

  public static CohortDefinition  rPRCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("rPR.sql", "Pregnant women with RPr");
    return cohortDefinition;
  }

  public static CohortDefinition  positiveRPRCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("positiveRPR.sql", "Positive pregnant women with RPr");
    return cohortDefinition;
  }

  public static CohortDefinition  sicklingTestCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("sicklingTest.sql", "Pregnant women with sickling test");
    return cohortDefinition;
  }

  public static CohortDefinition  positiveSicklingTestCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("positiveSicklingTest.sql", "Positive pregnant women with sickling test");
    return cohortDefinition;
  }

  public static CohortDefinition  bloodGroupCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("bloodGroup.sql", "Pregnant women with blood group");
    return cohortDefinition;
  }

  public static CohortDefinition  urinesCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("urines.sql", "Pregnant women urines");
    return cohortDefinition;
  }

  public static CohortDefinition  otherSicklingTestCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("otherSicklingTest.sql", "Other pregnant women urines");
    return cohortDefinition;
  }

  public static CohortDefinition  positiveOtherSicklingTestCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("positiveOtherSicklingTest.sql", "Positive other pregnant women urines");
    return cohortDefinition;
  }

  public static CohortDefinition  otherBloodGroupCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("otherBloodGroup.sql", "Other pregnant women blood group");
    return cohortDefinition;
  }

  public static CohortDefinition  zeroToThreeMonthsCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("zeroToThreeMonths.sql", "0 -3 months pregnancy period");
    return cohortDefinition;
  }

  public static CohortDefinition  fourToSixMonthsCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("fourToSixMonths.sql", "4 - 6 months pregnancy period");
    return cohortDefinition;
  }

  public static CohortDefinition  sevenToNineMonthsCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("sevenToNineMonths.sql", "7 -9 months pregnancy period");
    return cohortDefinition;
  }

  public static CohortDefinition  pregnancyRiskCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("pregnancyRisk.sql", "Number of pregnancies at risk");
    return cohortDefinition;
  }

  public static CohortDefinition  pregnancyAnemiaCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("pregnancyAnemia.sql", "Case of anemia in pregnant women");
    return cohortDefinition;
  }

  public static CohortDefinition  pregnancyFolateIronCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("pregnancyFolateIron.sql", "Pregnant women receiving folate iron");
    return cohortDefinition;
  }

  public static CohortDefinition  pregnancyFerritiveCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("pregnancyFerritive.sql", "Pregnant women treated for ferrifive Anemia");
    return cohortDefinition;
  }

  public static CohortDefinition  deliveryPlanCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("deliveryPlan.sql", "Pregnant women with a delivery plan");
    return cohortDefinition;
  }

  public static CohortDefinition  pregnancyChloroquineCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("pregnancyChloroquine.sql", "Pregnant women with malaria confirmed treated with chloroquine");
    return cohortDefinition;
  }

  public static CohortDefinition  impregnantedMosquitoNetCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("impregnantedMosquitoNet.sql", "Pregnant women who received an impregnated mosquito net");
    return cohortDefinition;
  }

  public static CohortDefinition  pregnancyPbCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("pregnancyPb.sql", "Pregnant Women Pb <210mm (Mam / Mas)");
    return cohortDefinition;
  }

  public static CohortDefinition  pregnancyMamCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("pregnancyMam.sql", "Pregnant women MAM / Mas supported");
    return cohortDefinition;
  }

  public static CohortDefinition  partogramCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("partogram.sql", "Age of mothers");
    return cohortDefinition;
  }

  public static CohortDefinition  managementCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("management.sql", "Age of mothers");
    return cohortDefinition;
  }

  public static CohortDefinition  undevelopedCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("undeveloped.sql", "Live births undeveloped");
    return cohortDefinition;
  }

  public static CohortDefinition  underOnePointFiveKgCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("lessThanOnePointFiveKg.sql", "Live births Weight <1.5 kg");
    return cohortDefinition;
  }

  public static CohortDefinition  betweenOnePointFiveAndUnderTwoPointFIveKgCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("betweenOnePointFiveAndUnderTwoPointFIveKg.sql", "Live births 1.5 Weight <2.5 kg");
    return cohortDefinition;
  }

  public static CohortDefinition  twoPointFIveKgPlusCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("twoPointFIveKgPlusKg.sql", "Live births 2.5 kg and more");
    return cohortDefinition;
  }

  public static CohortDefinition  immediatelyCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("immediately.sql", "Live births put within immediately");
    return cohortDefinition;
  }

  public static CohortDefinition  breastFeedingVitaminACohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("breastFeedingVitaminA.sql", "Breastfeeding women receiving vitamin A");
    return cohortDefinition;
  }

  public static CohortDefinition  nursingWomenPbCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("nursingWomenPb.sql", "Nursing women with pb <210 mm");
    return cohortDefinition;
  }

  public static CohortDefinition  nursingWomenMamCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("nursingWomenMam.sql", "Nursing women with MAM / Mas supported");
    return cohortDefinition;
  }

  public static CohortDefinition  homemadeVisitsCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("homemadeVisits.sql", "Homemade visits from 0-3 days");
    return cohortDefinition;
  }

  public static CohortDefinition  postnatalConsultationsBetweenSevenToFourtyTwoDaysCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("sevenToFourtyTwoDays.sql", "Postnatal Consultations 7 - 42 days");
    return cohortDefinition;
  }

  public static CohortDefinition  postnatalConsultationsSixDaysCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("postnatalConsultationsSixDays.sql", "Postnatal Consultations 7am - 6 days");
    return cohortDefinition;
  }

  public static CohortDefinition  postnatalConsultationsUnderSixHoursCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("underSixHours.sql", "Postnatal Consultations 0 - 6 hours");
    return cohortDefinition;
  }


  public static CohortDefinition  pcWomenCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("pcMethod.sql", "Methods Pc");
    return cohortDefinition;
  }
  
  public static CohortDefinition  ppWomenCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("ppMethod.sql", "Methods Pp");
    return cohortDefinition;
  }

  public static CohortDefinition  dropperWomenCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("dropperMethod.sql", "Methods dropper");
    return cohortDefinition;
  }

  public static CohortDefinition  implantWomenCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("implantMethod.sql", "Methods implant");
    return cohortDefinition;
  }

  public static CohortDefinition  iudWomenCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("iudMethod.sql", "Methods iud");
    return cohortDefinition;
  }

  public static CohortDefinition  necklaceWomenCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("necklaceMethod.sql", "Methods necklace");
    return cohortDefinition;
  }

  public static CohortDefinition  mamaWomenCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("mamaMethod.sql", "Methods mama");
    return cohortDefinition;
  }

  public static CohortDefinition  condomWomenCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("condomMethod.sql", "Methods condom");
    return cohortDefinition;
  }

  public static CohortDefinition  condomMenCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("condomMenMethod.sql", "Methods condom men");
    return cohortDefinition;
  }

  public static CohortDefinition  vasectomyCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("vasectomyMethod.sql", "Methods vasectomy");
    return cohortDefinition;
  }

  public static CohortDefinition  ligatureWomenCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("ligatureMethod.sql", "Methods ligature");
    return cohortDefinition;
  }

  public static CohortDefinition  totalChildrenSeenCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("totalChildrenSeen.sql", "Support for the child services");
    return cohortDefinition;
  }

  public static CohortDefinition  firstTimeChildrenCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("firstTimeChildren.sql", "Support for the child services");
    return cohortDefinition;
  }

  public static CohortDefinition  firstTImeMeasuredPbCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("firstTImeMeasuredPb.sql", "Support for the child services");
    return cohortDefinition;
  }

  public static CohortDefinition  firstTimeMeasuredPdstCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("firstTimeMeasuredPdst.sql", "Support for the child services");
    return cohortDefinition;
  }

  public static CohortDefinition  firstTimeScreenPdstCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("firstTimeScreenPdst.sql", "Support for the child services");
    return cohortDefinition;
  }

  public static CohortDefinition  firstTimeScreenT_AgeCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("firstTimeScreenT_Age.sql", "Support for the child services");
    return cohortDefinition;
  }

  public static CohortDefinition  firstTimeMamCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("firstTimeMam.sql", "Support for the child services");
    return cohortDefinition;
  }

  public static CohortDefinition  firstTimeMasCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("firstTimeMas.sql", "Support for the child services");
    return cohortDefinition;
  }

  public static CohortDefinition  firstVisitCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("firstVisit.sql", "First visit pregnancy period");
    return cohortDefinition;
  }

  public static CohortDefinition  secondVisitCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("secondVisit.sql", "Second visit pregnancy period");
    return cohortDefinition;
  }

  public static CohortDefinition  thirdVisitCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("thirdVisit.sql", "Third visit pregnancy period");
    return cohortDefinition;
  }

  public static CohortDefinition  fourthVisitCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("fourthVisit.sql", "Fourth visit pregnancy period");
    return cohortDefinition;
  }

  public static CohortDefinition  fifthVisitCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("fifthVisit.sql", "Fifht visit pregnancy period");
    return cohortDefinition;
  }


  public static CohortDefinition  animalRangeCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("animalRange.sql", "Diseases / Symptoms (disaggregation by age and sex), Aggression by suspected animal rage");
    return cohortDefinition;
  }

  public static CohortDefinition  cutaneousCoalCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("cutaneousCoal.sql", "Diseases / Symptoms (disaggregation by age and sex),Cutaneous coal");
    return cohortDefinition;
  }

  public static CohortDefinition  chikungunyaCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("chikungunya.sql", "Diseases / Symptoms (disaggregation by age and sex),Chikungunya");
    return cohortDefinition;
  }

  public static CohortDefinition  pertussisCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("pertussis.sql", "Diseases / Symptoms (disaggregation by age and sex), Pertussis");
    return cohortDefinition;
  }

  public static CohortDefinition  dengueCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("dengue.sql", "Diseases / Symptoms (disaggregation by age and sex), Dengue");
    return cohortDefinition;
  }

  public static CohortDefinition  aqueousDiarrheaCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("aqueousDiarrhea.sql", "Diseases / Symptoms (disaggregation by age and sex), AqueousDiarrhea");
    return cohortDefinition;
  }

  public static CohortDefinition  bloodyDiarrheaCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("bloodyDiarrhea.sql", "Diseases / Symptoms (disaggregation by age and sex), BloodyDiarrhea");
    return cohortDefinition;
  }

  public static CohortDefinition  diphtheriaCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("diphtheria.sql", "Diseases / Symptoms (disaggregation by age and sex),Diphtheria");
    return cohortDefinition;
  }

  public static CohortDefinition  epilepsyCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("epilepsy.sql", "Diseases / Symptoms (disaggregation by age and sex), Epilepsy");
    return cohortDefinition;
  }

  public static CohortDefinition  indeterminateFeverCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("indeterminateFever.sql", "Diseases / Symptoms (disaggregation by age and sex), Indeterminate fever");
    return cohortDefinition;
  }

  public static CohortDefinition  haemorrhagicFeverCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("haemorrhagicFever.sql", "Diseases / Symptoms (disaggregation by age and sex), Haemorrhagic fever");
    return cohortDefinition;
  }

  public static CohortDefinition  lymphaticFilariasisCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("lymphaticFilariasis.sql", "Diseases / Symptoms (disaggregation by age and sex), lymphatic Filariasis");
    return cohortDefinition;
  }

  public static CohortDefinition  acuteRespiratoryInfectionsCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("acuteRespiratoryInfections.sql", "Diseases / Symptoms (disaggregation by age and sex), Acute Respiratory Infections (IRA)");
    return cohortDefinition;
  }

  public static CohortDefinition  standCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("stand.sql", "Diseases / Symptoms (disaggregation by age and sex), Stand");
    return cohortDefinition;
  }

  public static CohortDefinition  collectiveFoodInfectionCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("collectiveFoodInfection.sql", "Diseases / Symptoms (disaggregation by age and sex), Collective food infection (TIAC)");
    return cohortDefinition;
  }

  public static CohortDefinition  meadowCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("meadow.sql", "Diseases / Symptoms (disaggregation by age and sex), Meadow");
    return cohortDefinition;
  }

  public static CohortDefinition  leptospirosisCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("leptospirosis.sql", "Diseases / Symptoms (disaggregation by age and sex), Leptospirosis");
    return cohortDefinition;
  }

  public static CohortDefinition  malariaConfirmedTreatedCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("malariaConfirmedTreated.sql", "Diseases / Symptoms (disaggregation by age and sex), Malaria confirmed treated");
    return cohortDefinition;
  }

  public static CohortDefinition  malnutritionCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("malnutrition.sql", "Diseases / Symptoms (disaggregation by age and sex), Malnutrition");
    return cohortDefinition;
  }

  public static CohortDefinition  bacterialMeningitisCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("bacterialMeningitis.sql", "Diseases / Symptoms (disaggregation by age and sex), bacterial Meningitis");
    return cohortDefinition;
  }

  public static CohortDefinition  mumpsCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("mumps.sql", "Diseases / Symptoms (disaggregation by age and sex), Mumps ");
    return cohortDefinition;
  }

  public static CohortDefinition  intestinalParasitosisCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("intestinalParasitosis.sql", "Diseases / Symptoms (disaggregation by age and sex), Intestinal parasitosis");
    return cohortDefinition;
  }

  public static CohortDefinition  abnormalPhenomenonCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("abnormalPhenomenon.sql", "Diseases / Symptoms (disaggregation by age and sex), Abnormal phenomenon");
    return cohortDefinition;
  }

  public static CohortDefinition  humanRageCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("humanRage.sql", "Diseases / Symptoms (disaggregation by age and sex), Human rage");
    return cohortDefinition;
  }

  public static CohortDefinition  measlesCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("measles.sql", "Diseases / Symptoms (disaggregation by age and sex), Measles");
    return cohortDefinition;
  }

  public static CohortDefinition  congenitalRubellaCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("congenitalRubella.sql", "Diseases / Symptoms (disaggregation by age and sex), Congenital rubella");
    return cohortDefinition;
  }

  public static CohortDefinition  febrileIctericSyndromeCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("febrileIctericSyndrome.sql", "Diseases / Symptoms (disaggregation by age and sex), Febrile icteric syndrome");
    return cohortDefinition;
  }

  public static CohortDefinition  sarsCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("sars.sql", "Diseases / Symptoms (disaggregation by age and sex), Severe Acute Respiratory Syndrome(SARS)");
    return cohortDefinition;
  }

  public static CohortDefinition  syphilisCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("syphilis.sql", "Diseases / Symptoms (disaggregation by age and sex), Syphilis");
    return cohortDefinition;
  }

  public static CohortDefinition  tetanusCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("tetanus.sql", "Diseases / Symptoms (disaggregation by age and sex), Tetanus");
    return cohortDefinition;
  }

  public static CohortDefinition  neonatalTetanusCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("neonatalTetanus.sql", "Diseases / Symptoms (disaggregation by age and sex), Neonatal Tetanus");
    return cohortDefinition;
  }

  public static CohortDefinition  respiratorySymptomsCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("respiratorySymptoms.sql", "Diseases / Symptoms (disaggregation by age and sex), Respiratory symptoms");
    return cohortDefinition;
  }

  public static CohortDefinition  congenitalSyphilisCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("congenitalSyphilis.sql", "Diseases / Symptoms (disaggregation by age and sex), Congenital syphilis");
    return cohortDefinition;
  }

  public static CohortDefinition  tuberculosisCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("tuberculosis.sql", "Diseases / Symptoms (disaggregation by age and sex), Bacteriological pulmonary tuberculosis");
    return cohortDefinition;
  }

  public static CohortDefinition  tuberculosisNoCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("tuberculosisNo.sql", "Diseases / Symptoms (disaggregation by age and sex), Bacteriological pulmonary tuberculosis no");
    return cohortDefinition;
  }

  public static CohortDefinition  totalCasesOfTuberculosisCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("totalCasesOfTuberculosis.sql", "Diseases / Symptoms (disaggregation by age and sex), Total cases of tuberculosis");
    return cohortDefinition;
  }

  public static CohortDefinition  typhoidCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("typhoid.sql", "Diseases / Symptoms (disaggregation by age and sex), Typhoid ");
    return cohortDefinition;
  }

  public static CohortDefinition  hivPlusCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("hivPlus.sql", "Diseases / Symptoms (disaggregation by age and sex), HIV +");
    return cohortDefinition;
  }

  public static CohortDefinition  xerophthalmiaCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("xerophthalmia.sql", "Diseases / Symptoms (disaggregation by age and sex), Xerophthalmia");
    return cohortDefinition;
  }

  public static CohortDefinition  otherDiseasesCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("otherDiseases.sql", "Diseases / Symptoms (disaggregation by age and sex), other Diseases");
    return cohortDefinition;
  }      
  
  public static CohortDefinition  diabetesCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("diabetes.sql", "Chronic Diseases / Symptoms (disaggregation by age and sex), other Diseases");
    return cohortDefinition;
  } 

  public static CohortDefinition  htaCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("hta.sql", "Chronic Diseases / Symptoms (disaggregation by age and sex), other Diseases");
    return cohortDefinition;
  } 
  
  public static CohortDefinition  burkittCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("burkitt.sql", "Chronic Diseases / Symptoms (disaggregation by age and sex), other Diseases");
    return cohortDefinition;
  }  
  
  public static CohortDefinition  cervicalCancerCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("cervicalCancer.sql", "Chronic Diseases / Symptoms (disaggregation by age and sex), other Diseases");
    return cohortDefinition;
  }  

  public static CohortDefinition  breastCancerCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("breastCancer.sql", "Chronic Diseases / Symptoms (disaggregation by age and sex), other Diseases");
    return cohortDefinition;
  }  

  public static CohortDefinition  prostateCancerCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("prostateCancer.sql", "Chronic Diseases / Symptoms (disaggregation by age and sex), other Diseases");
    return cohortDefinition;
  }  

  public static CohortDefinition  obesityCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("obesity.sql", "Chronic Diseases / Symptoms (disaggregation by age and sex), other Diseases");
    return cohortDefinition;
  }  

  public static CohortDefinition  glaucomaCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("glaucoma.sql", "Chronic Diseases / Symptoms (disaggregation by age and sex), other Diseases");
    return cohortDefinition;
  }  

  public static CohortDefinition  cataractCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("cataract.sql", "Chronic Diseases / Symptoms (disaggregation by age and sex), other Diseases");
    return cohortDefinition;
  }  

  public static CohortDefinition  renalFailureCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("renalFailure.sql", "Chronic Diseases / Symptoms (disaggregation by age and sex), other Diseases");
    return cohortDefinition;
  }  



  public static CohortDefinition  bcgCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("bcg.sql", "Vaccines, Bcg");
    return cohortDefinition;
  }  

  public static CohortDefinition  vpoCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("vpo.sql", "Vaccines, VPO");
    return cohortDefinition;
  }  

  public static CohortDefinition  vpoOneCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("vpoOne.sql", "Vaccines, VPO1");
    return cohortDefinition;
  }  

  public static CohortDefinition  vpoTwoCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("vpoTwo.sql", "Vaccines, VPO2");
    return cohortDefinition;
  }  

  public static CohortDefinition  vpoReminderCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("vpoReminder.sql", "Vaccines, VPO reminder");
    return cohortDefinition;
  }  

  public static CohortDefinition  vpiCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("vpi.sql", "Vaccines, VPI");
    return cohortDefinition;
  }  

  public static CohortDefinition  pentaOneCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("pentaOne.sql", "Vaccines, Penta 1");
    return cohortDefinition;
  }  

  public static CohortDefinition  pentaTwoCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("pentaTwo.sql", "Vaccines, Penta 2");
    return cohortDefinition;
  }  

  public static CohortDefinition  pentaThreeCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("pentaThree.sql", "Vaccines, Penta 3");
    return cohortDefinition;
  }  

  public static CohortDefinition  rotaOneCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("rotaOne.sql", "Vaccines, Rota 1");
    return cohortDefinition;
  }  

  public static CohortDefinition  rotaTwoCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("rotaTwo.sql", "Vaccines, Rota 2");
    return cohortDefinition;
  }  

  public static CohortDefinition  rrOneCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("rrOne.sql", "Vaccines, RR 1");
    return cohortDefinition;
  }  

  public static CohortDefinition  rrTwoCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("rrTwo.sql", "Vaccines, RR 2");
    return cohortDefinition;
  }  

  public static CohortDefinition  pneumoOneCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("pneumoOne.sql", "Vaccines, Pneumo 1");
    return cohortDefinition;
  }  

  public static CohortDefinition  pneumoTwoCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("pneumoTwo.sql", "Vaccines, Pneumo 2");
    return cohortDefinition;
  }  

  public static CohortDefinition  pneumoThreeCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("pneumoThree.sql", "Vaccines, Pneumo 3");
    return cohortDefinition;
  }  

  public static CohortDefinition  dtpReminderCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("dtpReminder.sql", "Vaccines, DTP Reminder");
    return cohortDefinition;
  } 
  
  public static CohortDefinition  vaccinesPregantWomenInstCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("vaccinePregnantWomenInst.sql", "Vaccines, Pregnant women");
    return cohortDefinition;
  } 

  public static CohortDefinition  vaccinesPregantWomenCommCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("vaccinePregnantWomenComm.sql", "Vaccines, Pregnant women");
    return cohortDefinition;
  } 

  public static CohortDefinition  dt1VaccinesCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("dt1Vaccines.sql", "Vaccines, dt1");
    return cohortDefinition;
  } 

  public static CohortDefinition  dt2VaccinesCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("dt2Vaccines.sql", "Vaccines, dt2+");
    return cohortDefinition;
  } 

}
