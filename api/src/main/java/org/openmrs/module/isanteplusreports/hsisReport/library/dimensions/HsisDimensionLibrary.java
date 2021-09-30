package org.openmrs.module.isanteplusreports.hsisReport.library.dimensions;

import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.pregnantWomenCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.pFClientsCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.customersInOralCareCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.microscopicTestCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.fastTestCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.microscopicTestAndPositiveCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.fastTestAndPositiveCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.hemogramCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.vihCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.rPRCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.sicklingTestCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.bloodGroupCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.urinesCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.otherSicklingTestCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.otherBloodGroupCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.positiveVihCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.positiveRPRCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.positiveSicklingTestCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.positiveOtherSicklingTestCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.zeroToThreeMonthsCohort;

import java.util.Date;

import org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary;

import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.fourToSixMonthsCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.sevenToNineMonthsCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.pregnancyRiskCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.pregnancyAnemiaCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.pregnancyFolateIronCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.pregnancyFerritiveCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.deliveryPlanCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.pregnancyChloroquineCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.impregnantedMosquitoNetCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.pregnancyPbCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.pregnancyMamCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.partogramCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.managementCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.ppWomenCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.pcWomenCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.dropperWomenCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.implantWomenCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.iudWomenCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.necklaceWomenCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.mamaWomenCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.condomWomenCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.condomMenCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.vasectomyCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.ligatureWomenCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.firstTimeScreenPdstCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.firstTimeMeasuredPdstCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.firstTImeMeasuredPbCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.totalChildrenSeenCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.firstTimeScreenT_AgeCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.firstTimeMamCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.firstTimeMasCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.firstTimeChildrenCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.firstVisitCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.secondVisitCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.thirdVisitCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.fourthVisitCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.fifthVisitCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.twoPointFIveKgPlusCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.betweenOnePointFiveAndUnderTwoPointFIveKgCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.underOnePointFiveKgCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.undevelopedCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.immediatelyCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.breastFeedingVitaminACohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.nursingWomenMamCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.postnatalConsultationsUnderSixHoursCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.postnatalConsultationsSixDaysCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.postnatalConsultationsBetweenSevenToFourtyTwoDaysCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.homemadeVisitsCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.nursingWomenPbCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.dt1VaccinesCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.dt2VaccinesCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.vaccinesPregantWomenCommCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.vaccinesPregantWomenInstCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.malariaTestCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.malariaTestPosisitveCohort;


import org.openmrs.module.reporting.evaluation.parameter.Parameter;

import org.openmrs.module.isanteplusreports.reporting.utils.ReportUtils;
import org.openmrs.module.reporting.indicator.dimension.CohortDefinitionDimension;


public class HsisDimensionLibrary {

  private static final String DATE_PARAMS = "startDate=${startDate},endDate=${endDate}";

  private final static Parameter START_DATE = new Parameter("startDate", "isanteplusreports.parameters.startdate",
	        Date.class);
	
	private final static Parameter END_DATE = new Parameter("endDate", "isanteplusreports.parameters.enddate", Date.class);

    
    public static CohortDefinitionDimension generalDimension(){		  
        CohortDefinitionDimension dim = new CohortDefinitionDimension();		  		  
        dim.setName("general");
        dim.addCohortDefinition("pregnant", ReportUtils.map(pregnantWomenCohort()));
        dim.addCohortDefinition("pf", ReportUtils.map(pFClientsCohort()));
        dim.addCohortDefinition("customersInOralCare", ReportUtils.map(customersInOralCareCohort()));
      return dim;		
    };

    public static CohortDefinitionDimension malariaDimension(){
      CohortDefinitionDimension dim = new CohortDefinitionDimension();
        dim.addParameter(START_DATE);
        dim.addParameter(END_DATE);		  		  
        dim.setName("malariaExam");
        dim.addCohortDefinition("microscopicTestPositive", ReportUtils.map(microscopicTestAndPositiveCohort(),DATE_PARAMS));
        dim.addCohortDefinition("fastTestPositive", ReportUtils.map(fastTestAndPositiveCohort(),DATE_PARAMS));
        dim.addCohortDefinition("microscopicTest", ReportUtils.map(microscopicTestCohort(),DATE_PARAMS));
        dim.addCohortDefinition("fastTest", ReportUtils.map(fastTestCohort(),DATE_PARAMS));
        dim.addCohortDefinition("malariaTest", ReportUtils.map(malariaTestCohort(),DATE_PARAMS));
        dim.addCohortDefinition("malariaTestPositive", ReportUtils.map(malariaTestPosisitveCohort(),DATE_PARAMS));

      return dim;				  		  
      }	

    public static CohortDefinitionDimension pregnantDimension(){
        CohortDefinitionDimension dim = new CohortDefinitionDimension();
          dim.setName("pregnantWomen");
          dim.addCohortDefinition("hemogram", ReportUtils.map(hemogramCohort()));
          dim.addCohortDefinition("vih", ReportUtils.map(vihCohort()));
          dim.addCohortDefinition("rPR", ReportUtils.map(rPRCohort()));
          dim.addCohortDefinition("sicklingTest", ReportUtils.map(sicklingTestCohort()));
          dim.addCohortDefinition("bloodGroup", ReportUtils.map(bloodGroupCohort()));
          dim.addCohortDefinition("urines", ReportUtils.map(urinesCohort()));
          dim.addCohortDefinition("otherUrines", ReportUtils.map(otherSicklingTestCohort()));
          dim.addCohortDefinition("otherBloodGroup", ReportUtils.map(otherBloodGroupCohort()));
          dim.addCohortDefinition("vihPositive", ReportUtils.map(positiveVihCohort()));
          dim.addCohortDefinition("rprPositive", ReportUtils.map(positiveRPRCohort()));
          dim.addCohortDefinition("sicklingPositive", ReportUtils.map(positiveSicklingTestCohort()));
          dim.addCohortDefinition("sicklingPositiveOthers", ReportUtils.map(positiveOtherSicklingTestCohort()));
        return dim;				  		  
        }	 
        
    public static CohortDefinitionDimension pregnancyMonthsDimension(){
        CohortDefinitionDimension dim = new CohortDefinitionDimension();
          dim.setName("pregnancyPeriod");
          dim.addCohortDefinition("0-3", ReportUtils.map(zeroToThreeMonthsCohort()));
          dim.addCohortDefinition("4-6", ReportUtils.map(fourToSixMonthsCohort()));
          dim.addCohortDefinition("7-9", ReportUtils.map(sevenToNineMonthsCohort()));
        return dim;				  		  
        }	   

    public static CohortDefinitionDimension ageOfMothersDimension(){
          CohortDefinitionDimension dim = new CohortDefinitionDimension();
            dim.setName("ageOfMothers");
            dim.addCohortDefinition("partogram", ReportUtils.map(partogramCohort()));
            dim.addCohortDefinition("mgt", ReportUtils.map(managementCohort()));
          return dim;				  		  
          }	 
          
    public static CohortDefinitionDimension liveBirthsDimension(){
          CohortDefinitionDimension dim = new CohortDefinitionDimension();
            dim.setName("birth");
            dim.addCohortDefinition("plus", ReportUtils.map(twoPointFIveKgPlusCohort()));
            dim.addCohortDefinition("between", ReportUtils.map(betweenOnePointFiveAndUnderTwoPointFIveKgCohort()));
            dim.addCohortDefinition("under", ReportUtils.map(underOnePointFiveKgCohort()));
            dim.addCohortDefinition("undeveloped", ReportUtils.map(undevelopedCohort()));
            dim.addCohortDefinition("immediately", ReportUtils.map(immediatelyCohort()));
          return dim;				  		  
          }	          
        
    public static CohortDefinitionDimension supportForPregnantWomenDimension(){
          CohortDefinitionDimension dim = new CohortDefinitionDimension();
            dim.setName("supportWomen");
            dim.addCohortDefinition("risk", ReportUtils.map(pregnancyRiskCohort()));
            dim.addCohortDefinition("anemia", ReportUtils.map(pregnancyAnemiaCohort()));
            dim.addCohortDefinition("folateIron", ReportUtils.map(pregnancyFolateIronCohort()));
            dim.addCohortDefinition("ferritive", ReportUtils.map(pregnancyFerritiveCohort()));
            dim.addCohortDefinition("deliveryPlan", ReportUtils.map(deliveryPlanCohort()));
            dim.addCohortDefinition("chloroquine", ReportUtils.map(pregnancyChloroquineCohort()));
            dim.addCohortDefinition("mosquitoNet", ReportUtils.map(impregnantedMosquitoNetCohort()));
            dim.addCohortDefinition("pregnancyPb", ReportUtils.map(pregnancyPbCohort()));
            dim.addCohortDefinition("pregnancyMam", ReportUtils.map(pregnancyMamCohort()));
          return dim;				  		  
          }	 

    public static CohortDefinitionDimension visitDimension(){
            CohortDefinitionDimension dim = new CohortDefinitionDimension();
              dim.setName("visit");
              dim.addCohortDefinition("first", ReportUtils.map(firstVisitCohort()));
              dim.addCohortDefinition("second", ReportUtils.map(secondVisitCohort()));
              dim.addCohortDefinition("third", ReportUtils.map(thirdVisitCohort()));
              dim.addCohortDefinition("fourth", ReportUtils.map(fourthVisitCohort()));
              dim.addCohortDefinition("fifth", ReportUtils.map(fifthVisitCohort()));  
            return dim;				  		  
            }	       
          
    public static CohortDefinitionDimension servicesProvidedDimension(){
          CohortDefinitionDimension dim = new CohortDefinitionDimension();
            dim.setName("childSupport");
            dim.addCohortDefinition("firstTimeMas", ReportUtils.map(firstTimeMasCohort()));
            dim.addCohortDefinition("firstTimeMam", ReportUtils.map(firstTimeMamCohort()));
            dim.addCohortDefinition("t_age", ReportUtils.map(firstTimeScreenT_AgeCohort()));
            dim.addCohortDefinition("screen", ReportUtils.map(firstTimeScreenPdstCohort()));
            dim.addCohortDefinition("timeMeasuredPdst", ReportUtils.map(firstTimeMeasuredPdstCohort()));
            dim.addCohortDefinition("timeMeasuredPb", ReportUtils.map(firstTImeMeasuredPbCohort()));
            dim.addCohortDefinition("firstTimeChildren", ReportUtils.map(firstTimeChildrenCohort()));
            dim.addCohortDefinition("totalChildrenSeen", ReportUtils.map(totalChildrenSeenCohort()));
          return dim;				  		  
          }	
          
    public static CohortDefinitionDimension clientDimension(){
          CohortDefinitionDimension dim = new CohortDefinitionDimension();
            dim.setName("clientWomen");
            dim.addCohortDefinition("vasectomy", ReportUtils.map(vasectomyCohort()));
            dim.addCohortDefinition("ligature", ReportUtils.map(ligatureWomenCohort()));
            dim.addCohortDefinition("condomMen", ReportUtils.map(condomMenCohort()));
            dim.addCohortDefinition("condomWomen", ReportUtils.map(condomWomenCohort()));
            dim.addCohortDefinition("mama", ReportUtils.map(mamaWomenCohort()));
            dim.addCohortDefinition("necklace", ReportUtils.map(necklaceWomenCohort()));
            dim.addCohortDefinition("iud", ReportUtils.map(iudWomenCohort()));
            dim.addCohortDefinition("implant", ReportUtils.map(implantWomenCohort()));
            dim.addCohortDefinition("dropper", ReportUtils.map(dropperWomenCohort()));
            dim.addCohortDefinition("pp", ReportUtils.map(ppWomenCohort()));
            dim.addCohortDefinition("pc", ReportUtils.map(pcWomenCohort()));
          return dim;				  		  
          }	  
          
    public static CohortDefinitionDimension postnatalDimension(){
          CohortDefinitionDimension dim = new CohortDefinitionDimension();
            dim.setName("postnatal");
            dim.addCohortDefinition("breastFeeding", ReportUtils.map(breastFeedingVitaminACohort()));
            dim.addCohortDefinition("nursingWomenPb", ReportUtils.map(nursingWomenPbCohort()));
            dim.addCohortDefinition("nursingWomenMam", ReportUtils.map(nursingWomenMamCohort()));
            dim.addCohortDefinition("0-6", ReportUtils.map(postnatalConsultationsUnderSixHoursCohort()));
            dim.addCohortDefinition("7am-6days", ReportUtils.map(postnatalConsultationsSixDaysCohort()));
            dim.addCohortDefinition("7-42days", ReportUtils.map(postnatalConsultationsBetweenSevenToFourtyTwoDaysCohort()));
            dim.addCohortDefinition("homemade", ReportUtils.map(homemadeVisitsCohort()));
          return dim;				  		  
          }	  
          
    public static CohortDefinitionDimension diseaseDimension(){
            CohortDefinitionDimension dim = new CohortDefinitionDimension();
              dim.setName("diseaseComplication");
              dim.addCohortDefinition("animalRange", ReportUtils.map(HsisReportCohortLibrary.animalRangeCohort()));
              dim.addCohortDefinition("cutaneousCoal", ReportUtils.map(HsisReportCohortLibrary.cutaneousCoalCohort()));
              dim.addCohortDefinition("chikungunya", ReportUtils.map(HsisReportCohortLibrary.chikungunyaCohort()));
              dim.addCohortDefinition("pertussis", ReportUtils.map(HsisReportCohortLibrary.pertussisCohort()));
              dim.addCohortDefinition("dengue", ReportUtils.map(HsisReportCohortLibrary.dengueCohort()));
              dim.addCohortDefinition("aqueousDiarrhea", ReportUtils.map(HsisReportCohortLibrary.aqueousDiarrheaCohort()));
              dim.addCohortDefinition("bloodyDiarrhea", ReportUtils.map(HsisReportCohortLibrary.bloodyDiarrheaCohort()));
              dim.addCohortDefinition("diphtheria", ReportUtils.map(HsisReportCohortLibrary.diphtheriaCohort()));
              dim.addCohortDefinition("epilepsy", ReportUtils.map(HsisReportCohortLibrary.epilepsyCohort()));
              dim.addCohortDefinition("indeterminateFever", ReportUtils.map(HsisReportCohortLibrary.indeterminateFeverCohort()));
              dim.addCohortDefinition("haemorrhagicFever", ReportUtils.map(HsisReportCohortLibrary.haemorrhagicFeverCohort()));
              dim.addCohortDefinition("lymphaticFilariasis", ReportUtils.map(HsisReportCohortLibrary.lymphaticFilariasisCohort()));
              dim.addCohortDefinition("acuteRespiratoryInfections", ReportUtils.map(HsisReportCohortLibrary.acuteRespiratoryInfectionsCohort()));
              dim.addCohortDefinition("stand", ReportUtils.map(HsisReportCohortLibrary.standCohort()));
              dim.addCohortDefinition("foodInfection", ReportUtils.map(HsisReportCohortLibrary.collectiveFoodInfectionCohort()));
              dim.addCohortDefinition("syphilis", ReportUtils.map(HsisReportCohortLibrary.syphilisCohort()));
              dim.addCohortDefinition("meadow", ReportUtils.map(HsisReportCohortLibrary.meadowCohort()));
              dim.addCohortDefinition("leptospirosis", ReportUtils.map(HsisReportCohortLibrary.leptospirosisCohort()));
              dim.addCohortDefinition("malariaConfirmedTreated", ReportUtils.map(HsisReportCohortLibrary.malariaConfirmedTreatedCohort()));
              dim.addCohortDefinition("malnutrition", ReportUtils.map(HsisReportCohortLibrary.malnutritionCohort()));
              dim.addCohortDefinition("bacterialMeningitis", ReportUtils.map(HsisReportCohortLibrary.bacterialMeningitisCohort()));
              dim.addCohortDefinition("mumps", ReportUtils.map(HsisReportCohortLibrary.mumpsCohort()));
              dim.addCohortDefinition("intestinalParasitosis", ReportUtils.map(HsisReportCohortLibrary.intestinalParasitosisCohort()));
              dim.addCohortDefinition("abnormalPhenomenon", ReportUtils.map(HsisReportCohortLibrary.abnormalPhenomenonCohort()));
              dim.addCohortDefinition("humanRage", ReportUtils.map(HsisReportCohortLibrary.humanRageCohort()));
              dim.addCohortDefinition("measles", ReportUtils.map(HsisReportCohortLibrary.measlesCohort()));
              dim.addCohortDefinition("congenitalRubella", ReportUtils.map(HsisReportCohortLibrary.congenitalRubellaCohort()));
              dim.addCohortDefinition("febrileIctericSyndrome", ReportUtils.map(HsisReportCohortLibrary.febrileIctericSyndromeCohort()));
              dim.addCohortDefinition("sars", ReportUtils.map(HsisReportCohortLibrary.sarsCohort()));
              dim.addCohortDefinition("tetanus", ReportUtils.map(HsisReportCohortLibrary.tetanusCohort()));
              dim.addCohortDefinition("neonatalTetanus", ReportUtils.map(HsisReportCohortLibrary.neonatalTetanusCohort()));
              dim.addCohortDefinition("respiratorySymptoms", ReportUtils.map(HsisReportCohortLibrary.respiratorySymptomsCohort()));
              dim.addCohortDefinition("congenitalSyphilis", ReportUtils.map(HsisReportCohortLibrary.congenitalSyphilisCohort()));
              dim.addCohortDefinition("tuberculosis", ReportUtils.map(HsisReportCohortLibrary.tuberculosisCohort()));
              dim.addCohortDefinition("tuberculosisNo", ReportUtils.map(HsisReportCohortLibrary.tuberculosisNoCohort()));
              dim.addCohortDefinition("totalCasesOfTuberculosis", ReportUtils.map(HsisReportCohortLibrary.totalCasesOfTuberculosisCohort()));
              dim.addCohortDefinition("typhoid", ReportUtils.map(HsisReportCohortLibrary.typhoidCohort()));
              dim.addCohortDefinition("hivPlus", ReportUtils.map(HsisReportCohortLibrary.hivPlusCohort()));
              dim.addCohortDefinition("xerophthalmia", ReportUtils.map(HsisReportCohortLibrary.xerophthalmiaCohort()));
              dim.addCohortDefinition("otherDiseases", ReportUtils.map(HsisReportCohortLibrary.otherDiseasesCohort()));
            return dim;				  		  
            }	 

    public static CohortDefinitionDimension chronicDimension(){
            CohortDefinitionDimension dim = new CohortDefinitionDimension();
                dim.setName("chronicDisease");
                dim.addCohortDefinition("diabetes", ReportUtils.map(HsisReportCohortLibrary.diabetesCohort()));
                dim.addCohortDefinition("hta", ReportUtils.map(HsisReportCohortLibrary.htaCohort()));
                dim.addCohortDefinition("burkitt", ReportUtils.map(HsisReportCohortLibrary.burkittCohort()));
                dim.addCohortDefinition("cervical", ReportUtils.map(HsisReportCohortLibrary.cervicalCancerCohort()));
                dim.addCohortDefinition("breast", ReportUtils.map(HsisReportCohortLibrary.breastCancerCohort()));
                dim.addCohortDefinition("prostate", ReportUtils.map(HsisReportCohortLibrary.prostateCancerCohort()));
                dim.addCohortDefinition("obesity", ReportUtils.map(HsisReportCohortLibrary.obesityCohort()));
                dim.addCohortDefinition("glaucoma", ReportUtils.map(HsisReportCohortLibrary.glaucomaCohort()));
                dim.addCohortDefinition("cataract", ReportUtils.map(HsisReportCohortLibrary.cataractCohort()));
                dim.addCohortDefinition("renal", ReportUtils.map(HsisReportCohortLibrary.renalFailureCohort()));   
            return dim;				  		  
            }	 
            
    public static CohortDefinitionDimension vaccinationDimension(){
            CohortDefinitionDimension dim = new CohortDefinitionDimension();
                dim.setName("vaccination");
                dim.addCohortDefinition("bcg", ReportUtils.map(HsisReportCohortLibrary.bcgCohort()));
                dim.addCohortDefinition("vpo", ReportUtils.map(HsisReportCohortLibrary.vpoCohort()));
                dim.addCohortDefinition("vpo1", ReportUtils.map(HsisReportCohortLibrary.vpoOneCohort()));
                dim.addCohortDefinition("vpo2", ReportUtils.map(HsisReportCohortLibrary.vpoTwoCohort()));
                dim.addCohortDefinition("vpoReminder", ReportUtils.map(HsisReportCohortLibrary.vpoReminderCohort()));
                dim.addCohortDefinition("vpi", ReportUtils.map(HsisReportCohortLibrary.vpiCohort()));
                dim.addCohortDefinition("penta1", ReportUtils.map(HsisReportCohortLibrary.pentaOneCohort()));
                dim.addCohortDefinition("penta2", ReportUtils.map(HsisReportCohortLibrary.pentaTwoCohort()));
                dim.addCohortDefinition("penta3", ReportUtils.map(HsisReportCohortLibrary.pentaThreeCohort()));
                dim.addCohortDefinition("rota1", ReportUtils.map(HsisReportCohortLibrary.rotaOneCohort())); 
                dim.addCohortDefinition("rota2", ReportUtils.map(HsisReportCohortLibrary.rotaTwoCohort())); 
                dim.addCohortDefinition("rr1", ReportUtils.map(HsisReportCohortLibrary.rrOneCohort())); 
                dim.addCohortDefinition("rr2", ReportUtils.map(HsisReportCohortLibrary.rrTwoCohort()));  
                dim.addCohortDefinition("pneumo1", ReportUtils.map(HsisReportCohortLibrary.pneumoOneCohort())); 
                dim.addCohortDefinition("pneumo2", ReportUtils.map(HsisReportCohortLibrary.pneumoTwoCohort()));   
                dim.addCohortDefinition("pneumo3", ReportUtils.map(HsisReportCohortLibrary.pneumoThreeCohort()));   
                dim.addCohortDefinition("dtpReminder", ReportUtils.map(HsisReportCohortLibrary.dtpReminderCohort()));   
            return dim;				  		  
            }	
            
    public static CohortDefinitionDimension vaccineDimension(){
            CohortDefinitionDimension dim = new CohortDefinitionDimension();
              dim.setName("dtVaccine");
              dim.addCohortDefinition("dt1", ReportUtils.map(dt1VaccinesCohort()));
              dim.addCohortDefinition("dt2", ReportUtils.map(dt2VaccinesCohort()));
            return dim;				  		  
            }	     
            
    public static CohortDefinitionDimension pregnantWomenVaccineDimension(){
            CohortDefinitionDimension dim = new CohortDefinitionDimension();
              dim.setName("pregnantWomenVaccine");
              dim.addCohortDefinition("vaccinesPregantWomenInst", ReportUtils.map(vaccinesPregantWomenInstCohort()));
              dim.addCohortDefinition("vaccinesPregantWomenComm", ReportUtils.map(vaccinesPregantWomenCommCohort()));         
            return dim;				  		  
            }	             
                       
}
