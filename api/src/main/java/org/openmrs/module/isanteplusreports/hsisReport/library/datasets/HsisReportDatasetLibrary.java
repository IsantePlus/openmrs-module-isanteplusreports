package org.openmrs.module.isanteplusreports.hsisReport.library.datasets;

import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getNewVistsIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getSubsquentVistsIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getMalariaIndicator;
import java.sql.Date;
import org.openmrs.module.isanteplusreports.hsisReport.library.columns.HsisReportColumns;
import static org.openmrs.module.isanteplusreports.hsisReport.library.dimensions.HsisDimensionLibrary.generalDimension;
import static org.openmrs.module.isanteplusreports.hsisReport.library.dimensions.HsisDimensionLibrary.positiveMicroscopicDimension;
import static org.openmrs.module.isanteplusreports.hsisReport.library.dimensions.HsisDimensionLibrary.positiveFastDimension;
import static org.openmrs.module.isanteplusreports.hsisReport.library.dimensions.HsisDimensionLibrary.microscopicTestDimension;
import static org.openmrs.module.isanteplusreports.hsisReport.library.dimensions.HsisDimensionLibrary.fastTestDimension;
import static org.openmrs.module.isanteplusreports.hsisReport.library.dimensions.HsisDimensionLibrary.positiveMicroscopicFastDimension;



import org.openmrs.module.isanteplusreports.library.dimension.CommonDimension;
import org.openmrs.module.isanteplusreports.reporting.utils.ReportUtils;
import org.openmrs.module.reporting.dataset.definition.CohortIndicatorDataSetDefinition;
import org.openmrs.module.reporting.evaluation.parameter.Parameter;;

public class HsisReportDatasetLibrary {

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

  public static CohortIndicatorDataSetDefinition getMalariaDataset() {
    CohortIndicatorDataSetDefinition dsd = new CohortIndicatorDataSetDefinition();
    dsd.setName("malaria");
    dsd.addParameter(START_DATE);
    dsd.addParameter(END_DATE);
    dsd.addDimension("positive microscopic", ReportUtils.map(positiveMicroscopicDimension()));
    dsd.addDimension("positive fast", ReportUtils.map(positiveFastDimension()));
    dsd.addDimension("microscopic test", ReportUtils.map(microscopicTestDimension()));
    dsd.addDimension("fast test", ReportUtils.map(fastTestDimension()));
    dsd.addDimension("positive fastMicroscopicFast", ReportUtils.map(positiveMicroscopicFastDimension()));
    HsisReportColumns.addTypesOfExaminationsColumsForMalaria(dsd, getMalariaIndicator());
    return dsd;
  }
}
