package org.openmrs.module.isanteplusreports.page.controller;

import static org.openmrs.module.isanteplusreports.alertprecoce.util.AlertPrecoceUtils.getReportData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang.time.DateUtils;
import org.openmrs.Location;
import org.openmrs.api.context.Context;
import org.openmrs.module.isanteplusreports.alertprecoce.AlertPrecoceManager;
import org.openmrs.module.isanteplusreports.alertprecoce.builder.AlertPrecoceReportBuilder;
import org.openmrs.module.isanteplusreports.alertprecoce.model.AlertPrecoceSelectedIndicator;
import org.openmrs.module.isanteplusreports.alertprecoce.util.AlertPrecoceReportsConstants;
import org.openmrs.module.isanteplusreports.exception.HealthQualException;
import org.openmrs.module.reporting.ReportingConstants;
import org.openmrs.module.reporting.common.DateUtil;
import org.openmrs.module.reporting.dataset.DataSetRow;
import org.openmrs.module.reporting.report.ReportData;
import org.openmrs.ui.framework.annotation.SpringBean;
import org.openmrs.ui.framework.page.PageModel;
import org.springframework.web.bind.annotation.RequestParam;

public class AlertPrecoceReportPageController {
	
	public static final String NUMBER_OF_MALES_COLUMN_NAME = "M";

	public static final String NUMBER_OF_FEMALES_COLUMN_NAME = "F";

	public final static String LOCATION_SESSION_ATTRIBUTE = "emrContext.sessionLocationId";

	public void get(@SpringBean AlertPrecoceManager alertPrecoceManager,
	        @RequestParam(required = false, value = "startDate") Date startDate,
	        @RequestParam(required = false, value = "endDate") Date endDate, PageModel model) throws IOException {
		
		if (startDate == null) {
			startDate = DateUtils.addDays(new Date(), -21);
		}
		if (endDate == null) {
			endDate = new Date();
		}
		startDate = DateUtil.getStartOfDay(startDate);
		endDate = DateUtil.getEndOfDay(endDate);
		
		model.addAttribute("manager", alertPrecoceManager);
		model.addAttribute("startDate", startDate);
		model.addAttribute("endDate", endDate);
		model.addAttribute("htmlResult", null);
		model.addAttribute("pdfResult", null);
	}
	
	public void post(@SpringBean AlertPrecoceManager alertPrecoceManager,
	        @RequestParam(value = "indicatorList") List<AlertPrecoceSelectedIndicator> indicators,
	        @RequestParam(required = false, value = "startDate") Date startDate,
	        @RequestParam(required = false, value = "endDate") Date endDate,
			PageModel model, HttpSession session) throws IOException {

		
		if (startDate == null) {
			startDate = DateUtils.addDays(new Date(), -21);
		}
		if (endDate == null) {
			endDate = new Date();
		}
		
		startDate = DateUtil.getStartOfDay(startDate);
		endDate = DateUtil.getEndOfDay(endDate);
		AlertPrecoceReportBuilder builder = new AlertPrecoceReportBuilder();
		Location location = getSessionLocation(session);
		builder.setClinic(location.getDisplayString());
		builder.setClinicDepartment(location.getStateProvince());
		builder.setStartDate(startDate);
		builder.setEndDate(endDate);
		builder.setReportLabel("isanteplusreports.alertprecoce.report.label");
		setNumberOfPatients(startDate, endDate, builder);
		
		List<ReportData> allReportData = new ArrayList<ReportData>();
		for (AlertPrecoceSelectedIndicator indicator : indicators) {
			ReportData reportData = getReportData(indicator.getUuid(), startDate, endDate, null);
			allReportData.add(reportData);
			builder.addReportData(reportData);
		}
				
		session.setAttribute(ReportingConstants.OPENMRS_REPORT_DATA + AlertPrecoceReportsConstants.ALERT_PRECOCE_GENERAL_PURPOSE_SUFFIX, allReportData);
		model.addAttribute("manager", alertPrecoceManager);
		model.addAttribute("startDate", startDate);
		model.addAttribute("endDate", endDate);
		model.addAttribute("htmlResult", builder.buildHtmlTables());
		model.addAttribute("pdfResult", builder.buildPdf());
	}

	private Location getSessionLocation(HttpSession session) {
		Location location = Context.getUserContext().getLocation();
		if (location == null) {
			return Context.getLocationService().getDefaultLocation();
		}
		
		return location; // to get clinic data
	}

	private void setNumberOfPatients(Date startDate, Date endDate, AlertPrecoceReportBuilder builder) {
		ReportData numberOfPatientsReportData = getReportData(AlertPrecoceReportsConstants.NUMBER_PATIENTS_UUID, startDate, endDate, null);
		if (numberOfPatientsReportData.getDataSets().isEmpty()) {
			throw new HealthQualException("Cannot read number of patients - reportData is empty");
		}
		Iterator<DataSetRow> rowIterator = numberOfPatientsReportData.getDataSets().values().iterator().next().iterator();
		if (!rowIterator.hasNext()) {
			throw new HealthQualException("Cannot read number of patients - first dataSetRow is empty");
		}
		DataSetRow row = rowIterator.next();
		builder.setMalePatients((Long) row.getColumnValue(NUMBER_OF_MALES_COLUMN_NAME));
		builder.setFemalePatients((Long) row.getColumnValue(NUMBER_OF_FEMALES_COLUMN_NAME));
	}

}
