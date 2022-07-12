package org.openmrs.module.isanteplusreports.derlSurveillanceReport;

import static j2html.TagCreator.a;
import static j2html.TagCreator.body;
import static j2html.TagCreator.div;
import static j2html.TagCreator.h2;
import static j2html.TagCreator.h3;
import static j2html.TagCreator.h5;
import static j2html.TagCreator.head;
import static j2html.TagCreator.html;
import static j2html.TagCreator.style;
import static j2html.TagCreator.table;
import static j2html.TagCreator.td;
import static j2html.TagCreator.th;
import static j2html.TagCreator.tr;
import static org.openmrs.module.isanteplusreports.IsantePlusReportsUtil.getStringFromResource;
import static org.openmrs.module.isanteplusreports.healthqual.util.HealthQualUtils.replaceNonBreakingSpaces;
import static org.openmrs.module.isanteplusreports.derlSurveillanceReport.library.columns.ColumnsDerlLibrary.IMMEDIATE_COLUMNS_ARRAY;
import static org.openmrs.module.isanteplusreports.derlSurveillanceReport.library.columns.ColumnsDerlLibrary.WEEKLY_COLUMNS_ARRAY;
import static org.openmrs.module.isanteplusreports.derlSurveillanceReport.library.columns.ColumnsDerlLibrary.MONTHLY_COLUMNS_ARRAY;
import j2html.tags.ContainerTag;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.DatatypeConverter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.isanteplusreports.exception.HealthQualException;
import org.openmrs.module.reporting.common.MessageUtil;
import org.openmrs.module.reporting.dataset.DataSet;
import org.openmrs.module.reporting.report.ReportData;
import org.openmrs.ui.framework.UiUtils;
import org.w3c.dom.Document;
import org.xhtmlrenderer.pdf.ITextRenderer;
import org.xml.sax.SAXException;

import com.itextpdf.text.DocumentException;

public class DerlSurveillanceReportBuilder extends UiUtils {
	
	private final Log LOGGER = LogFactory.getLog(getClass());

	private static final int ROWS_3 = 3;
	
	private static final int ROWS_2 = 16;

	private static final int ROWS_4 = 20;
	
	private static final int ROWS_5 = 15;

	private static final String PERIOD_DATE_FORMAT_PATTERN = "yyyy/MM/dd";

	private static final String CREATION_DATE_FORMAT_PATTERN = "yyyy/MM/dd HH:mm:ss";

	private static final String STRING_IF_EMPTY = "-";

	private int numberOfIndicatorsInOneTable = 1; // if there are too many indicators the table will be splitted

	private ContainerTag[] rows5;

	private ContainerTag[] rows2;

	private ContainerTag[] rows3;

	private ContainerTag[] rows4;


	private String clinicDepartment;

	private String clinic;

	private Date startDate;

	private Date endDate;

	private Long femalePatients;

	private Long malePatients;

	private String tablesHtml;

	private ContainerTag tables;
	
	/*public String[] getKeyWeeklyColumnNamesArray() {
		return COLUMNS_ARRAY_WEEKLY;
	}*/
	
	public String[] getKeyImmediateColumnNamesArray() {
		return IMMEDIATE_COLUMNS_ARRAY;
	}
	
	public String[] getKeyWeeklyColumnNamesArray() {
		return WEEKLY_COLUMNS_ARRAY;
	}
	
	public List<String> getKeyImmediateColumnNamesList() {
		return Arrays.asList(getKeyImmediateColumnNamesArray());
	}
	
	public List<String> getKeyWeeklyColumnNamesList() {
		return Arrays.asList(getKeyWeeklyColumnNamesArray());
	}
	
	public String[] getKeyMonthlyColumnNamesArray() {
		return MONTHLY_COLUMNS_ARRAY;
	}
	
	public List<String> getKeyMonthlyColumnNamesList() {
		return Arrays.asList(getKeyMonthlyColumnNamesArray());
	}
	
	public String[] getKeyImmediateSingleRowColumnNamesArray() {
		return IMMEDIATE_COLUMNS_ARRAY;
	}
	
	public String[] getKeyWeeklySingleRowColumnNamesArray() {
		return WEEKLY_COLUMNS_ARRAY;
	}

	public List<String> getKeyWeeklySingleRowColumnNamesList() {
		return Arrays.asList(getKeyImmediateSingleRowColumnNamesArray());
	}

	private void buildIndicatorKeyImmediate(DataSet data) {
		getRows4()[0]
				.with(th(translate(data.getDefinition().getName())).attr("colspan", "54").withClass("indicatorLabel"));
		getRows4()[1].with(td("1").attr("colspan", "1").withClass("label"),
				td("2").attr("colspan", "1").withClass("label"),
				td("3").attr("colspan", "1").withClass("label"),
				td("4").attr("colspan", "1").withClass("label"),
				td("5").attr("colspan", "1").withClass("label"),
				td("6").attr("colspan", "1").withClass("label"),
				td("7").attr("colspan", "1").withClass("label"),
				td("8").attr("colspan", "1").withClass("label"),
				td("9").attr("colspan", "1").withClass("label"),
				td("10").attr("colspan", "1").withClass("label"),
				td("11").attr("colspan", "1").withClass("label"),
				td("12").attr("colspan", "1").withClass("label"),
				td("13").attr("colspan", "1").withClass("label"),
				td("14").attr("colspan", "1").withClass("label"),
				td("15").attr("colspan", "1").withClass("label"),
				td("16").attr("colspan", "1").withClass("label"),
				td("17").attr("colspan", "1").withClass("label"),
				td("18").attr("colspan", "1").withClass("label"),
				td("19").attr("colspan", "1").withClass("label"),
				td("20").attr("colspan", "1").withClass("label"),
				td("21").attr("colspan", "1").withClass("label"),
				td("22").attr("colspan", "1").withClass("label"),
				td("23").attr("colspan", "1").withClass("label"),
				td("24").attr("colspan", "1").withClass("label"),
				td("25").attr("colspan", "1").withClass("label"),
				td("26").attr("colspan", "1").withClass("label"),
				td("27").attr("colspan", "1").withClass("label"),
				td("28").attr("colspan", "1").withClass("label"),
				td("29").attr("colspan", "1").withClass("label"),
				td("30").attr("colspan", "1").withClass("label"),
				td("31").attr("colspan", "1").withClass("label"),
				
				td("32").attr("colspan", "1").withClass("label"),
				td("33").attr("colspan", "1").withClass("label"),
				td("34").attr("colspan", "1").withClass("label"),
				td("35").attr("colspan", "1").withClass("label"),
				td("36").attr("colspan", "1").withClass("label"),
				td("37").attr("colspan", "1").withClass("label"),
				td("38").attr("colspan", "1").withClass("label"),
				td("39").attr("colspan", "1").withClass("label"),
				td("40").attr("colspan", "1").withClass("label"),
				td("41").attr("colspan", "1").withClass("label"),
				td("42").attr("colspan", "1").withClass("label"),
				td("43").attr("colspan", "1").withClass("label"),
				td("44").attr("colspan", "1").withClass("label"),
				td("45").attr("colspan", "1").withClass("label"),
				td("46").attr("colspan", "1").withClass("label"),
				td("47").attr("colspan", "1").withClass("label"),
				td("48").attr("colspan", "1").withClass("label"),
				td("49").attr("colspan", "1").withClass("label"),
				td("50").attr("colspan", "1").withClass("label"),
				td("51").attr("colspan", "1").withClass("label"),
				td("52").attr("colspan", "1").withClass("label"),
				td("53").attr("colspan", "1").withClass("label"),
				td(translateLabel("Total")).attr("colspan", "1").withClass("label"));
		
		int[] dataSet = createSummaryArray(getKeyImmediateColumnNamesList(), data);
		String reportName = data.getDefinition().getName();
		buildIndicatorSummaryKeyImmediate(dataSet, getKeyImmediateColumnNamesArray(), reportName);
		
	}
	
	private void buildIndicatorKeyWeekly(DataSet data) {
		getRows2()[0]
				.with(th(translate(data.getDefinition().getName())).attr("colspan", "54").withClass("indicatorLabel"));
		getRows2()[1].with(td("1").attr("colspan", "1").withClass("label"),
				td("2").attr("colspan", "1").withClass("label"),
				td("3").attr("colspan", "1").withClass("label"),
				td("4").attr("colspan", "1").withClass("label"),
				td("5").attr("colspan", "1").withClass("label"),
				td("6").attr("colspan", "1").withClass("label"),
				td("7").attr("colspan", "1").withClass("label"),
				td("8").attr("colspan", "1").withClass("label"),
				td("9").attr("colspan", "1").withClass("label"),
				td("10").attr("colspan", "1").withClass("label"),
				td("11").attr("colspan", "1").withClass("label"),
				td("12").attr("colspan", "1").withClass("label"),
				td("13").attr("colspan", "1").withClass("label"),
				td("14").attr("colspan", "1").withClass("label"),
				td("15").attr("colspan", "1").withClass("label"),
				td("16").attr("colspan", "1").withClass("label"),
				td("17").attr("colspan", "1").withClass("label"),
				td("18").attr("colspan", "1").withClass("label"),
				td("19").attr("colspan", "1").withClass("label"),
				td("20").attr("colspan", "1").withClass("label"),
				td("21").attr("colspan", "1").withClass("label"),
				td("22").attr("colspan", "1").withClass("label"),
				td("23").attr("colspan", "1").withClass("label"),
				td("24").attr("colspan", "1").withClass("label"),
				td("25").attr("colspan", "1").withClass("label"),
				td("26").attr("colspan", "1").withClass("label"),
				td("27").attr("colspan", "1").withClass("label"),
				td("28").attr("colspan", "1").withClass("label"),
				td("29").attr("colspan", "1").withClass("label"),
				td("30").attr("colspan", "1").withClass("label"),
				td("31").attr("colspan", "1").withClass("label"),
				
				td("32").attr("colspan", "1").withClass("label"),
				td("33").attr("colspan", "1").withClass("label"),
				td("34").attr("colspan", "1").withClass("label"),
				td("35").attr("colspan", "1").withClass("label"),
				td("36").attr("colspan", "1").withClass("label"),
				td("37").attr("colspan", "1").withClass("label"),
				td("38").attr("colspan", "1").withClass("label"),
				td("39").attr("colspan", "1").withClass("label"),
				td("40").attr("colspan", "1").withClass("label"),
				td("41").attr("colspan", "1").withClass("label"),
				td("42").attr("colspan", "1").withClass("label"),
				td("43").attr("colspan", "1").withClass("label"),
				td("44").attr("colspan", "1").withClass("label"),
				td("45").attr("colspan", "1").withClass("label"),
				td("46").attr("colspan", "1").withClass("label"),
				td("47").attr("colspan", "1").withClass("label"),
				td("48").attr("colspan", "1").withClass("label"),
				td("49").attr("colspan", "1").withClass("label"),
				td("50").attr("colspan", "1").withClass("label"),
				td("51").attr("colspan", "1").withClass("label"),
				td("52").attr("colspan", "1").withClass("label"),
				td("53").attr("colspan", "1").withClass("label"),
				td(translateLabel("Total")).attr("colspan", "1").withClass("label"));
		
		int[] dataSet = createSummaryArray(getKeyWeeklyColumnNamesList(), data);
		String reportName = data.getDefinition().getName();
		buildIndicatorSummaryKeyWeekly(dataSet, getKeyWeeklyColumnNamesArray(), reportName);
		
	}
	
	private void buildIndicatorKeyMonthly(DataSet data) {
		getRows5()[0]
				.with(th(translate(data.getDefinition().getName())).attr("colspan", "13").withClass("indicatorLabel"));
		getRows5()[1].with(td("JANVIER").attr("colspan", "1").withClass("label"),
				td("FEVRIER").attr("colspan", "1").withClass("label"),
				td("MARS").attr("colspan", "1").withClass("label"),
				td("AVRIL").attr("colspan", "1").withClass("label"),
				td("MAI").attr("colspan", "1").withClass("label"),
				td("JUIN").attr("colspan", "1").withClass("label"),
				td("JUILLET").attr("colspan", "1").withClass("label"),
				td("AOUT").attr("colspan", "1").withClass("label"),
				td("SEPTEMBRE").attr("colspan", "1").withClass("label"),
				td("OCTOBRE").attr("colspan", "1").withClass("label"),
				td("NOVEMBRE").attr("colspan", "1").withClass("label"),
				td("DECEMBRE").attr("colspan", "1").withClass("label"),
				td(translateLabel("Total")).attr("colspan", "1").withClass("label"));
		
		int[] dataSet = createSummaryArray(getKeyMonthlyColumnNamesList(), data);
		String reportName = data.getDefinition().getName();
		buildIndicatorSummaryMonthly(dataSet, getKeyMonthlyColumnNamesArray(), reportName);
		
	}
	
	private ContainerTag buildOneTableImmediate(Iterator<DataSet> iterator) {
		buildImmediateSurveillanceSummaryTable();
		for (int i = 0; i < numberOfIndicatorsInOneTable && iterator.hasNext(); ++i) {
			buildIndicatorKeyImmediate(iterator.next());
		}
		return table().with(getRows4());
	}
	
	private ContainerTag buildOneTableWeekly(Iterator<DataSet> iterator) {
		buildWeeklySurveillanceSummaryTable();
		for (int i = 0; i < numberOfIndicatorsInOneTable && iterator.hasNext(); ++i) {
			buildIndicatorKeyWeekly(iterator.next());
		}
		return table().with(getRows2());
	}
	
	private ContainerTag buildOneTableMonthly(Iterator<DataSet> iterator) {
		buildMonthlySurveillanceSummaryTable();
		for (int i = 0; i < numberOfIndicatorsInOneTable && iterator.hasNext(); ++i) {
			buildIndicatorKeyMonthly(iterator.next());
		}
		return table().with(getRows5());
	}
	
	
	
	private void buildIndicatorSummaryKeyImmediate(int[] dataArray, String[] columnsArray, String reportName) {
        /*The good one*/
		String reportUrl = pageLink("isanteplusreports", "derlReportPatientList");

		int colCount = 0;
		for (int ROW = 2; ROW <= 19; ROW++) {
			for (int col = 0; col <= 53; col++) {
				if (colCount < dataArray.length) {
					String row = ConstructUrl(reportUrl, reportName, columnsArray[colCount]);
					populateTable4(ROW, dataArray[colCount], row);
					colCount++;
				}
			}
		}
	}
	
	private void buildIndicatorSummaryKeyWeekly(int[] dataArray, String[] columnsArray, String reportName) {
        
		String reportUrl = pageLink("isanteplusreports", "derlReportPatientList");

		int colCount = 0;
		for (int ROW = 2; ROW <= 15; ROW++) {
			for (int col = 0; col <= 53; col++) {
				if (colCount < dataArray.length) {
					String row = ConstructUrl(reportUrl, reportName, columnsArray[colCount]);
					populateTable2(ROW, dataArray[colCount], row);
					colCount++;
				}
			}
		}
	}
	
	private void buildIndicatorSummaryMonthly(int[] dataArray, String[] columnsArray, String reportName) {
        /*The good one*/
		String reportUrl = pageLink("isanteplusreports", "derlReportPatientList");

		int colCount = 0;
		for (int ROW = 2; ROW <= 14; ROW++) {
			for (int col = 0; col <= 12; col++) {
				if (colCount < dataArray.length) {
					String row = ConstructUrl(reportUrl, reportName, columnsArray[colCount]);
					populateTable5(ROW, dataArray[colCount], row);
					colCount++;
				}
			}
		}
	}
	
	private String ConstructUrl(String reportBaseUrl, String reportName, String columnName) {
		return String.format("%s?savedDataSetKey=%s&savedColumnKey=%s&columnKeyType=numerator", reportBaseUrl,
				reportName, columnName);
	}
	
	private void populateTable4(Integer ROW, int data, String rowLink) {
		getRows4()[ROW].with(td(a(Integer.toString(data)).withHref(rowLink).attr("onclick",
				"window.open(this.href, 'windowName', 'width=1000, height=700, left=24, top=24, scrollbars, resizable'); return false;")));
	}
	
	private void populateTable2(Integer ROW, int data, String rowLink) {
		getRows2()[ROW].with(td(a(Integer.toString(data)).withHref(rowLink).attr("onclick",
				"window.open(this.href, 'windowName', 'width=1000, height=700, left=24, top=24, scrollbars, resizable'); return false;")));
	}
	
	private void populateTable5(Integer ROW, int data, String rowLink) {
		getRows5()[ROW].with(td(a(Integer.toString(data)).withHref(rowLink).attr("onclick",
				"window.open(this.href, 'windowName', 'width=1000, height=700, left=24, top=24, scrollbars, resizable'); return false;")));
	}

	public int getNumberOfIndicatorsInOneTable() {
		return numberOfIndicatorsInOneTable;
	}

	public void setNumberOfIndicatorsInOneTable(int numberOfIndicatorsInOneTable) {
		this.numberOfIndicatorsInOneTable = numberOfIndicatorsInOneTable;
	}

	private Integer getDataSetIntegerValue(DataSet dataSet, String columnName) {
		Object value = dataSet.iterator().next().getColumnValue(columnName);
		if (value == null || StringUtils.isBlank(value.toString())) {
			dataSet.getDefinition().getName();
			throw new HealthQualException("`" + dataSet.getDefinition().getName() + "` report - column `" + columnName
					+ "` doesn't exist in dataSet. Probably there is a bug in report SQL");
		}
		return Integer.valueOf(value.toString());
	}

	private static String translateLabel(String labelName) {
		return translate("isanteplusreports.derl.surveillance.report." + labelName + ".label");
	}
	
	private int[] createSummaryArray(List<String> columNames, DataSet dataSet) {
		List<Integer> columnValues = new ArrayList<Integer>();
		for (String column : columNames) {
			columnValues.add(getDataSetIntegerValue(dataSet, column));
		}
		return columnValues.stream().mapToInt(Integer::intValue).toArray();
	}
	
	public String buildHtmlTables(List<ReportData> allReportData) {
		setTablesHtml(buildTables(allReportData).render());
		LOGGER.debug("built tables html: " + tablesHtml);
		return getTablesHtml();
	}
	
	public String buildPdf() {
		String htmlForPdf = html(head(getStyleForPdf()), body(createPdfHeader(), this.tables)).render();
		LOGGER.debug("built htmlForPdf: " + htmlForPdf);
		try {
			return convertHtmlToPdfInBase64(htmlForPdf);
		} catch (Exception ex) {
			throw new HealthQualException("PDF cannot be created", ex);
		}
	}

	private ContainerTag createPdfHeader() {
		return div().withClass("center").with(h2(translateLabel("pdf.header")), h3(createPeriodString()),
				h5(createDateOfCreationString()));
	}

	private String createPeriodString() {
		SimpleDateFormat df = new SimpleDateFormat(PERIOD_DATE_FORMAT_PATTERN);
		return df.format(startDate) + " - " + df.format(endDate);
	}

	private String createDateOfCreationString() {
		SimpleDateFormat df = new SimpleDateFormat(CREATION_DATE_FORMAT_PATTERN);
		return translateLabel("pdf.creationDate") + " " + df.format(new Date());
	}

	private ContainerTag getStyleForPdf() {
		return style().withType("text/css").withText(getStringFromResource("healthQualPdfStyle.css"));
	}

	private String convertHtmlToPdfInBase64(String html)
			throws IOException, ParserConfigurationException, SAXException, DocumentException {

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		// Document doc = builder.parse(new
		// ByteArrayInputStream(html.replaceAll("&nbsp;", "").getBytes()));
		Document doc = builder.parse(new ByteArrayInputStream(html.replaceAll("&nbsp;", "").getBytes("UTF-8")));
		ITextRenderer renderer = new ITextRenderer();
		renderer.setDocument(doc, null);

		renderer.layout();
		renderer.createPDF(out);
		out.flush();
		out.close();

		return DatatypeConverter.printBase64Binary(out.toByteArray());
	}
	
	

	private ContainerTag buildTables(List<ReportData> allReportData) {
		this.tables = div();
		this.tables.attr("class", "table table-striped table-hover");
		for (ReportData reportData : allReportData) {
			if (StringUtils.equals(reportData.getDefinition().getDescription(),
					DerlReportConstants.REPORT_DESCRIPTION_1)) {
				List<DataSet> data = new LinkedList<DataSet>();
				data.addAll(reportData.getDataSets().values());
				Iterator<DataSet> iterator = data.iterator();
				while (iterator.hasNext()) {
					this.tables.with(buildOneTableImmediate(iterator));
					clearRows3();
				}
			}
			else if (StringUtils.equals(reportData.getDefinition().getDescription(),
					DerlReportConstants.REPORT_DESCRIPTION_WEEKLY)) {
				List<DataSet> data = new LinkedList<DataSet>();
				data.addAll(reportData.getDataSets().values());
				Iterator<DataSet> iterator = data.iterator();
				while (iterator.hasNext()) {
					this.tables.with(buildOneTableWeekly(iterator));
					clearRows2();
				}
			}
			else if (StringUtils.equals(reportData.getDefinition().getDescription(),
					DerlReportConstants.REPORT_DESCRIPTION_2)) {
				List<DataSet> data = new LinkedList<DataSet>();
				data.addAll(reportData.getDataSets().values());
				Iterator<DataSet> iterator = data.iterator();
				while (iterator.hasNext()) {
					this.tables.with(buildOneTableMonthly(iterator));
					clearRows5();
				}
			}
		}
		
		return this.tables;
	}
	
	private void buildImmediateSurveillanceSummaryTable() {
		fillEmptyRow(getRows4()[0], 1);
		fillEmptyRow(getRows4()[1], 1);
		ContainerTag rageAnimal = getRows4()[2];
		ContainerTag covidSuspect = getRows4()[3];
		ContainerTag covidConfirm = getRows4()[4];
		ContainerTag choleraSuspect = getRows4()[5];
		
		ContainerTag coquelucheSuspect = getRows4()[6];
		ContainerTag diphterieSuspect = getRows4()[7];
		ContainerTag meningiteSuspect = getRows4()[8];
		ContainerTag paludismeConfirme = getRows4()[9];
		ContainerTag paralysieFlasqueAigue = getRows4()[10];
		ContainerTag pesteSuspect = getRows4()[11];
		
		ContainerTag rougeoleRubeoleSuspecte = getRows4()[12];
		ContainerTag syndrFievreHemAigue = getRows4()[13];
		ContainerTag syndrRubeoleCogen = getRows4()[14];
		ContainerTag esaviMageure = getRows4()[15];
		ContainerTag mortaliteNeonatale = getRows4()[16];
		ContainerTag tetanosNeonatal = getRows4()[17];
		ContainerTag tiac = getRows4()[18];
		ContainerTag toutPhenomeneInhab = getRows4()[19];
		
		
		rageAnimal.with(th(translateLabel("assaultByAnimalSuspiciousOfRabies")).withClass("label").withStyle("width:100px"));
		covidSuspect.with(th(translateLabel("covidSuspect")).withClass("label"));
		covidConfirm.with(th(translateLabel("covidConfirm")).withClass("label"));
		choleraSuspect.with(th(translateLabel("choleraSuspect")).withClass("label"));
		
		
		coquelucheSuspect.with(th(translateLabel("coquelucheSuspect")).withClass("label").withStyle("width:100px"));
		diphterieSuspect.with(th(translateLabel("diphterieSuspect")).withClass("label"));
		meningiteSuspect.with(th(translateLabel("meningiteSuspect")).withClass("label"));
		paludismeConfirme.with(th(translateLabel("paludismeConfirme")).withClass("label"));
		paralysieFlasqueAigue.with(th(translateLabel("paralysieFlasqueAigue")).withClass("label").withStyle("width:100px"));
		pesteSuspect.with(th(translateLabel("pesteSuspect")).withClass("label"));
		
		rougeoleRubeoleSuspecte.with(th(translateLabel("rougeoleRubeoleSuspecte")).withClass("label").withStyle("width:100px"));
		syndrFievreHemAigue.with(th(translateLabel("syndrFievreHemAigue")).withClass("label"));
		syndrRubeoleCogen.with(th(translateLabel("syndrRubeoleCogen")).withClass("label"));
		esaviMageure.with(th(translateLabel("esaviMageure")).withClass("label"));
		mortaliteNeonatale.with(th(translateLabel("mortaliteNeonatale")).withClass("label").withStyle("width:100px"));
		tetanosNeonatal.with(th(translateLabel("tetanosNeonatal")).withClass("label"));
		tiac.with(th(translateLabel("tiac")).withClass("label").withStyle("width:100px"));
		toutPhenomeneInhab.with(th(translateLabel("toutPhenomeneInhab")).withClass("label"));
		
		
	}
	
	private void buildWeeklySurveillanceSummaryTable() {
		fillEmptyRow(getRows2()[0], 1);
		fillEmptyRow(getRows2()[1], 1);
		ContainerTag AutreFievreIndetermine = getRows2()[2];
		ContainerTag CharbonCutane = getRows2()[3];
		ContainerTag DecesMaternel = getRows2()[4];
		ContainerTag DiarrheeAigue = getRows2()[5];
		
		ContainerTag diarrheeAigueS = getRows2()[6];
		ContainerTag esaviMineure = getRows2()[7];
		ContainerTag fievreTyphoideSuspecte = getRows2()[8];
		ContainerTag infectionRespiratoireAigue = getRows2()[9];
		
		ContainerTag tetanos = getRows2()[10];
		ContainerTag dengueSupecte = getRows2()[11];
		ContainerTag filarioseProbable = getRows2()[12];
		ContainerTag rageHumaine = getRows2()[13];
		ContainerTag syndromeIcteriqueFebrile = getRows2()[14];
		ContainerTag violencesSexuelles = getRows2()[15];
		
		AutreFievreIndetermine.with(th(translateLabel("AutreFievreIndetermine")).withClass("label").withStyle("width:100px"));
		CharbonCutane.with(th(translateLabel("CharbonCutane")).withClass("label"));
		DecesMaternel.with(th(translateLabel("DecesMaternel")).withClass("label"));
		DiarrheeAigue.with(th(translateLabel("DiarrheeAigue")).withClass("label"));
		
		diarrheeAigueS.with(th(translateLabel("diarrheeAigueS")).withClass("label").withStyle("width:100px"));
		esaviMineure.with(th(translateLabel("esaviMineure")).withClass("label"));
		fievreTyphoideSuspecte.with(th(translateLabel("fievreTyphoideSuspecte")).withClass("label"));
		infectionRespiratoireAigue.with(th(translateLabel("infectionRespiratoireAigue")).withClass("label"));
		
		tetanos.with(th(translateLabel("tetanos")).withClass("label").withStyle("width:100px"));
		dengueSupecte.with(th(translateLabel("dengueSupecte")).withClass("label"));
		filarioseProbable.with(th(translateLabel("filarioseProbable")).withClass("label"));
		rageHumaine.with(th(translateLabel("rageHumaine")).withClass("label"));
		syndromeIcteriqueFebrile.with(th(translateLabel("syndromeIcteriqueFebrile")).withClass("label"));
		violencesSexuelles.with(th(translateLabel("violencesSexuelles")).withClass("label"));
	}
	
	private void buildMonthlySurveillanceSummaryTable() {
		fillEmptyRow(getRows5()[0], 1);
		fillEmptyRow(getRows5()[1], 1);
		ContainerTag publicAcc = getRows5()[2];
		ContainerTag domesticAcc = getRows5()[3];
		ContainerTag breastCancer = getRows5()[4];
		ContainerTag prostateCancer = getRows5()[5];
		
		ContainerTag cancerCol = getRows5()[6];
		ContainerTag diabete = getRows5()[7];
		ContainerTag epilepsie = getRows5()[8];
		
		ContainerTag hypertensionAt = getRows5()[9];
		ContainerTag lepre = getRows5()[10];
		ContainerTag malnutrition = getRows5()[11];
		
		ContainerTag syphilisCong = getRows5()[12];
		ContainerTag ist = getRows5()[13];
		ContainerTag violencePhys = getRows5()[14];
		
		publicAcc.with(th(translateLabel("accidentOnPublicRoads")).withClass("label").withStyle("width:100px"));
		domesticAcc.with(th(translateLabel("domesticAccident")).withClass("label"));
		breastCancer.with(th(translateLabel("breastCancer")).withClass("label"));
		prostateCancer.with(th(translateLabel("prostateCancer")).withClass("label"));
		
		cancerCol.with(th(translateLabel("cancerCol")).withClass("label"));
		diabete.with(th(translateLabel("diabete")).withClass("label"));
		epilepsie.with(th(translateLabel("epilepsie")).withClass("label"));
		
		hypertensionAt.with(th(translateLabel("hypertensionAt")).withClass("label"));
		lepre.with(th(translateLabel("lepre")).withClass("label"));
		malnutrition.with(th(translateLabel("malnutrition")).withClass("label"));
		
		syphilisCong.with(th(translateLabel("syphilisCong")).withClass("label"));
		ist.with(th(translateLabel("ist")).withClass("label"));
		violencePhys.with(th(translateLabel("violencePhys")).withClass("label"));
	}
	
	
	public ContainerTag[] getRows3() {
		if (rows3 == null) {
			rows3 = new ContainerTag[ROWS_3];
			for (int i = 0; i < ROWS_3; ++i) {
				rows3[i] = tr();
			}
		}
		return rows3;
	}
	
	private void fillEmptyRow(ContainerTag row, Integer length) {
		row.with(td().attr("colspan", length.toString()));
	}
	
	private void clearRows3() {
		setRows3(null);
	}
	public void setRows3(ContainerTag[] rows) {
		this.rows3 = rows;
	}
	
	private void clearRows5() {
		setRows5(null);
	}
	public void setRows5(ContainerTag[] rows) {
		this.rows5 = rows;
	}
	
	
	private void clearRows2() {
		setRows2(null);
	}
	public void setRows2(ContainerTag[] rows) {
		this.rows5 = rows;
	}
	
	public void setRows(ContainerTag[] rows) {
		this.rows5 = rows;
	}

	public String getClinic() {
		return StringUtils.isNotBlank(clinic) ? clinic : STRING_IF_EMPTY;
	}

	public void setClinic(String clinic) {
		this.clinic = clinic;
	}

	public String getClinicDepartment() {
		return StringUtils.isNotBlank(clinicDepartment) ? clinicDepartment : STRING_IF_EMPTY;
	}

	public void setClinicDepartment(String clinicDepartment) {
		this.clinicDepartment = clinicDepartment;
	}
	
	public ContainerTag[] getRows4() {
		if (rows4 == null) {
			rows4 = new ContainerTag[ROWS_4];
			for (int i = 0; i < ROWS_4; ++i) {
				rows4[i] = tr();
			}
		}
		return rows4;
	}
	
	public ContainerTag[] getRows2() {
		if (rows2 == null) {
			rows2 = new ContainerTag[ROWS_2];
			for (int i = 0; i < ROWS_2; ++i) {
				rows2[i] = tr();
			}
		}
		return rows2;
	}
	
	public ContainerTag[] getRows5() {
		if (rows5 == null) {
			rows5 = new ContainerTag[ROWS_5];
			for (int i = 0; i < ROWS_5; ++i) {
				rows5[i] = tr();
			}
		}
		return rows5;
	}

	private static String translate(String code) {
		return replaceNonBreakingSpaces(MessageUtil.translate(code));
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Long getFemalePatients() {
		return femalePatients;
	}

	public void setFemalePatients(Long femalePatients) {
		this.femalePatients = femalePatients;
	}

	public Long getMalePatients() {
		return malePatients;
	}

	public void setMalePatients(Long malePatients) {
		this.malePatients = malePatients;
	}

	public String getTablesHtml() {
		return tablesHtml;
	}

	public void setTablesHtml(String tablesHtml) {
		this.tablesHtml = tablesHtml;
	}
}
