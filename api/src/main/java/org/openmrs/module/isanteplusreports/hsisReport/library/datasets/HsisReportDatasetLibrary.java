package org.openmrs.module.isanteplusreports.hsisReport.library.datasets;

import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getNewVistsIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getSubsquentVistsIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getMalariaIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getPregnantWomenMalariaIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getOtherGroupsMalariaIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getWomenVisitIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getSupportForPregnantWomenIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getNormalDeliveryIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getMidwivesDeliveryIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getInstrumentaisedDeliveryIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getCaesareanDeliveryIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getComplicationsDeliveryIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getNormalBirthIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getMidwivesBirthIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getInstrumentaisedBirthIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getCaesareanBirthIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getComplicationsBirthIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getAcceptingIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getTotalUsersIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getPostnatalFollowUpIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getChildrenUnderSixMonthsIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getChildrenBetweenSixAndTwentyThreeMonthsIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getChildrenBetweenTwentyFourAndFiftyNineMonthsIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getDiseasesDisaggregationIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getChronicDiseasesIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getBoysBetweenTwelveToTwentyThreeMonthsInstCommIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getBoysBetweenTwelveToTwentyThreeMonthsInstInstIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getBoysUnderElevenMonthsCommIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getBoysUnderElevenMonthsInstIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getGirlsBetweenTwelveToTwentyThreeMonthsInstCommIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getGirlsBetweenTwelveToTwentyThreeMonthsInstIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getGirlsUnderElevenMonthsCommIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getGirlsUnderElevenMonthsInstIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.vaccinesPregnantWomenIndicator;


import java.sql.Date;
import org.openmrs.module.isanteplusreports.hsisReport.library.columns.HsisReportColumns;
import static org.openmrs.module.isanteplusreports.hsisReport.library.dimensions.HsisDimensionLibrary.generalDimension;
import static org.openmrs.module.isanteplusreports.hsisReport.library.dimensions.HsisDimensionLibrary.servicesProvidedDimension;
import static org.openmrs.module.isanteplusreports.hsisReport.library.dimensions.HsisDimensionLibrary.clientDimension;
import static org.openmrs.module.isanteplusreports.hsisReport.library.dimensions.HsisDimensionLibrary.ageOfMothersDimension;
import static org.openmrs.module.isanteplusreports.hsisReport.library.dimensions.HsisDimensionLibrary.malariaDimension;
import static org.openmrs.module.isanteplusreports.hsisReport.library.dimensions.HsisDimensionLibrary.pregnantDimension;
import static org.openmrs.module.isanteplusreports.hsisReport.library.dimensions.HsisDimensionLibrary.pregnancyMonthsDimension;
import static org.openmrs.module.isanteplusreports.hsisReport.library.dimensions.HsisDimensionLibrary.supportForPregnantWomenDimension;
import static org.openmrs.module.isanteplusreports.hsisReport.library.dimensions.HsisDimensionLibrary.visitDimension;
import static org.openmrs.module.isanteplusreports.hsisReport.library.dimensions.HsisDimensionLibrary.liveBirthsDimension;
import static org.openmrs.module.isanteplusreports.hsisReport.library.dimensions.HsisDimensionLibrary.postnatalDimension;
import static org.openmrs.module.isanteplusreports.hsisReport.library.dimensions.HsisDimensionLibrary.diseaseDimension;
import static org.openmrs.module.isanteplusreports.hsisReport.library.dimensions.HsisDimensionLibrary.chronicDimension;
import static org.openmrs.module.isanteplusreports.hsisReport.library.dimensions.HsisDimensionLibrary.vaccinationDimension;
import static org.openmrs.module.isanteplusreports.hsisReport.library.dimensions.HsisDimensionLibrary.pregnantWomenVaccineDimension;
import static org.openmrs.module.isanteplusreports.hsisReport.library.dimensions.HsisDimensionLibrary.vaccineDimension;

import org.openmrs.module.isanteplusreports.library.dimension.CommonDimension;
import org.openmrs.module.isanteplusreports.reporting.utils.ReportUtils;
import org.openmrs.module.reporting.dataset.definition.CohortIndicatorDataSetDefinition;
import org.openmrs.module.reporting.evaluation.parameter.Parameter;;

public class HsisReportDatasetLibrary {

  private static final String DATE_PARAMS = "startDate=${startDate},endDate=${endDate}";

  private final static Parameter START_DATE = new Parameter("startDate", "isanteplusreports.parameters.startdate",
      Date.class);

  private final static Parameter END_DATE = new Parameter("endDate", "isanteplusreports.parameters.enddate",
      Date.class);

  public static CohortIndicatorDataSetDefinition getVistsDataset() {
    CohortIndicatorDataSetDefinition dsd = new CohortIndicatorDataSetDefinition();
    dsd.setName("visits");
    dsd.addParameter(START_DATE);
    dsd.addParameter(END_DATE);
    dsd.addDimension("age", ReportUtils.map(new CommonDimension().ageZone(), "effectiveDate=${endDate}"));
    dsd.addDimension("general", ReportUtils.map(generalDimension()));
    HsisReportColumns.addAgeColumnsforVists(dsd,getNewVistsIndicator(), "new");
    HsisReportColumns.addAgeColumnsforVists(dsd, getSubsquentVistsIndicator(), "sub");
    return dsd;
  }

  public static CohortIndicatorDataSetDefinition getLaboratoryDataset() {
    CohortIndicatorDataSetDefinition dsd = new CohortIndicatorDataSetDefinition();
    dsd.setName("laboratory");
    dsd.addParameter(START_DATE);
    dsd.addParameter(END_DATE);
    dsd.addDimension("malariaExam", ReportUtils.map(malariaDimension(),DATE_PARAMS));
    dsd.addDimension("pregnantWomen", ReportUtils.map(pregnantDimension()));
    HsisReportColumns.addColumsForPregnantWomen(dsd, getPregnantWomenMalariaIndicator());
    HsisReportColumns.addColumsForPregnantWomen(dsd, getOtherGroupsMalariaIndicator());
    HsisReportColumns.addTypesOfExaminationsColumsForMalaria(dsd, getMalariaIndicator());
    return dsd;
  }

  public static CohortIndicatorDataSetDefinition getWomenMotherDataset() {
    CohortIndicatorDataSetDefinition dsd = new CohortIndicatorDataSetDefinition();
    dsd.setName("women");
    dsd.addParameter(START_DATE);
    dsd.addParameter(END_DATE);
    dsd.addDimension("pregnancyPeriod", ReportUtils.map(pregnancyMonthsDimension()));
    dsd.addDimension("visit", ReportUtils.map(visitDimension()));
    HsisReportColumns.addColumsForWomenMothers(dsd, getWomenVisitIndicator());
    return dsd;
  }

  public static CohortIndicatorDataSetDefinition getSupportDataset() {
    CohortIndicatorDataSetDefinition dsd = new CohortIndicatorDataSetDefinition();
    dsd.setName("support");
    dsd.addParameter(START_DATE);
    dsd.addParameter(END_DATE);
    dsd.addDimension("supportWomen", ReportUtils.map(supportForPregnantWomenDimension()));
    HsisReportColumns.addColumsForSupportForPregnantWomen(dsd, getSupportForPregnantWomenIndicator());
    return dsd;
  }

  public static CohortIndicatorDataSetDefinition getDeliveriesDataset() {
    CohortIndicatorDataSetDefinition dsd = new CohortIndicatorDataSetDefinition();
    dsd.setName("delivery");
    dsd.addParameter(START_DATE);
    dsd.addParameter(END_DATE);
    dsd.addDimension("age", ReportUtils.map(new CommonDimension().ageZone(), "effectiveDate=${endDate}"));
    dsd.addDimension("ageOfMothers", ReportUtils.map(ageOfMothersDimension()));
    dsd.addDimension("birth", ReportUtils.map(liveBirthsDimension()));
    dsd.addDimension("postnatal", ReportUtils.map(postnatalDimension()));
    HsisReportColumns.addColumsForDeliveriesOnAgeOfMothers(dsd, getNormalDeliveryIndicator(),"normal");
    HsisReportColumns.addColumsForDeliveriesOnAgeOfMothers(dsd, getMidwivesDeliveryIndicator(),"cs");
    HsisReportColumns.addColumsForDeliveriesOnAgeOfMothers(dsd, getInstrumentaisedDeliveryIndicator(), "inst");
    HsisReportColumns.addColumsForDeliveriesOnAgeOfMothers(dsd, getComplicationsDeliveryIndicator(), "mid");
    HsisReportColumns.addColumsForDeliveriesOnAgeOfMothers(dsd, getCaesareanDeliveryIndicator(), "comp");
    HsisReportColumns.addColumsForSupportForLiveBirth(dsd, getNormalBirthIndicator(),"normal");
    HsisReportColumns.addColumsForSupportForLiveBirth(dsd, getMidwivesBirthIndicator(),"cs");
    HsisReportColumns.addColumsForSupportForLiveBirth(dsd, getInstrumentaisedBirthIndicator(), "inst");
    HsisReportColumns.addColumsForSupportForLiveBirth(dsd, getComplicationsBirthIndicator(), "mid");
    HsisReportColumns.addColumsForSupportForLiveBirth(dsd, getCaesareanBirthIndicator(), "comp");
    HsisReportColumns.addColumsForPostNatalFollowUp(dsd, getPostnatalFollowUpIndicator());
    return dsd;
  }

  public static CohortIndicatorDataSetDefinition getClientDataset() {
    CohortIndicatorDataSetDefinition dsd = new CohortIndicatorDataSetDefinition();
    dsd.setName("client");
    dsd.addParameter(START_DATE);
    dsd.addParameter(END_DATE);
    dsd.addDimension("clientWomen", ReportUtils.map(clientDimension()));
    dsd.addDimension("age25", ReportUtils.map(new CommonDimension().ageZoneBy25(), "effectiveDate=${endDate}"));
    dsd.addDimension("age25+", ReportUtils.map(new CommonDimension().ageZoneBy25Plus(), "effectiveDate=${endDate}"));
    HsisReportColumns.addColumsForPfClient(dsd, getAcceptingIndicator());
    HsisReportColumns.addColumsForPfClient(dsd, getTotalUsersIndicator());
    return dsd;
  }

  public static CohortIndicatorDataSetDefinition getSupportForChildDataset() {
    CohortIndicatorDataSetDefinition dsd = new CohortIndicatorDataSetDefinition();
    dsd.setName("child");
    dsd.addParameter(START_DATE);
    dsd.addParameter(END_DATE);
    dsd.addDimension("childSupport", ReportUtils.map(servicesProvidedDimension()));
    dsd.addDimension("gender", ReportUtils.map(new CommonDimension().gender()));
    HsisReportColumns.addColumsForChildSupport(dsd, getChildrenUnderSixMonthsIndicator());
    HsisReportColumns.addColumsForChildSupport(dsd, getChildrenBetweenSixAndTwentyThreeMonthsIndicator());
    HsisReportColumns.addColumsForChildSupport(dsd, getChildrenBetweenTwentyFourAndFiftyNineMonthsIndicator());
    return dsd;
  }

  public static CohortIndicatorDataSetDefinition getDiseaseDataset() {
    CohortIndicatorDataSetDefinition dsd = new CohortIndicatorDataSetDefinition();
    dsd.setName("disease");
    dsd.addParameter(START_DATE);
    dsd.addParameter(END_DATE);
    dsd.addDimension("gender", ReportUtils.map(new CommonDimension().gender()));
    dsd.addDimension("age", ReportUtils.map(new CommonDimension().ageZone(), "effectiveDate=${endDate}"));
    dsd.addDimension("diseaseComplication", ReportUtils.map(diseaseDimension()));
    HsisReportColumns.addColumsForEpisodesOfDiseases(dsd, getDiseasesDisaggregationIndicator());
    return dsd;
  }

  public static CohortIndicatorDataSetDefinition getChronicDataset() {
    CohortIndicatorDataSetDefinition dsd = new CohortIndicatorDataSetDefinition();
    dsd.setName("chronic");
    dsd.addParameter(START_DATE);
    dsd.addParameter(END_DATE);
    dsd.addDimension("gender", ReportUtils.map(new CommonDimension().gender()));
    dsd.addDimension("age", ReportUtils.map(new CommonDimension().ageZone(), "effectiveDate=${endDate}"));
    dsd.addDimension("chronicDisease", ReportUtils.map(chronicDimension()));
    HsisReportColumns.addColumsForChronicDiseases(dsd, getChronicDiseasesIndicator());
    return dsd;
  }

  public static CohortIndicatorDataSetDefinition getVaccinationDataset() {
    CohortIndicatorDataSetDefinition dsd = new CohortIndicatorDataSetDefinition();
    dsd.setName("vaccine");
    dsd.addParameter(START_DATE);
    dsd.addParameter(END_DATE);
    dsd.addDimension("vaccination", ReportUtils.map(vaccinationDimension()));
    HsisReportColumns.addColumsForVaccines(dsd, getGirlsUnderElevenMonthsInstIndicator());
    HsisReportColumns.addColumsForVaccines(dsd, getGirlsUnderElevenMonthsCommIndicator());
    HsisReportColumns.addColumsForVaccines(dsd, getBoysUnderElevenMonthsInstIndicator());
    HsisReportColumns.addColumsForVaccines(dsd, getBoysUnderElevenMonthsCommIndicator());
    HsisReportColumns.addColumsForVaccines(dsd, getGirlsBetweenTwelveToTwentyThreeMonthsInstIndicator());
    HsisReportColumns.addColumsForVaccines(dsd, getGirlsBetweenTwelveToTwentyThreeMonthsInstCommIndicator());
    HsisReportColumns.addColumsForVaccines(dsd, getBoysBetweenTwelveToTwentyThreeMonthsInstInstIndicator());
    HsisReportColumns.addColumsForVaccines(dsd, getBoysBetweenTwelveToTwentyThreeMonthsInstCommIndicator());
    return dsd;
  }

  public static CohortIndicatorDataSetDefinition vaccinesPregnantWomenDataset() {
    CohortIndicatorDataSetDefinition dsd = new CohortIndicatorDataSetDefinition();
    dsd.setName("vaccinePregnantWomen");
    dsd.addParameter(START_DATE);
    dsd.addParameter(END_DATE);
    dsd.addDimension("pregnantWomenVaccine", ReportUtils.map(pregnantWomenVaccineDimension()));
    dsd.addDimension("dtVaccine", ReportUtils.map(vaccineDimension()));

    HsisReportColumns.addColumsForVaccinePregnantWomen(dsd, vaccinesPregnantWomenIndicator());
    return dsd;
  }

}
