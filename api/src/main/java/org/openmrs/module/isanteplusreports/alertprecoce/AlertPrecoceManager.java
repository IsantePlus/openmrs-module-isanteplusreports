package org.openmrs.module.isanteplusreports.alertprecoce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openmrs.module.isanteplusreports.alertprecoce.model.AlertPrecoceIndicator;
import org.openmrs.module.isanteplusreports.alertprecoce.util.AlertPrecoceReportsConstants;
import org.openmrs.module.reporting.report.definition.ReportDefinition;
import org.openmrs.module.reporting.report.definition.service.ReportDefinitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AlertPrecoceManager {
	
	private static final String[] alertPrecoceIndicatorsUuid = {
		AlertPrecoceReportsConstants.ALERT_PRECOCE_INDICATOR_1_UUID,
		AlertPrecoceReportsConstants.ALERT_PRECOCE_INDICATOR_2_UUID,
		AlertPrecoceReportsConstants.ALERT_PRECOCE_INDICATOR_4_UUID,
		AlertPrecoceReportsConstants.ALERT_PRECOCE_INDICATOR_5_UUID,
		AlertPrecoceReportsConstants.ALERT_PRECOCE_INDICATOR_6_UUID,
		AlertPrecoceReportsConstants.ALERT_PRECOCE_INDICATOR_7_UUID
	};
	
	
	private static final String[] artDistributionIndicatorsUuid = {
		AlertPrecoceReportsConstants.APPOINTMENT_PERIOD_INDICATOR_UUID,
		AlertPrecoceReportsConstants.DISPENSINGART_PERIOD_INDICATOR_UUID,
		AlertPrecoceReportsConstants.NOTTAKINGART_PERIOD_INDICATOR_UUID,
		AlertPrecoceReportsConstants.TAKINGART_PERIOD_INDICATOR_UUID
	};
	
	/*PsychoSocial*/
	private static final String[] psychoSocialIndicatorsUuid = {
		AlertPrecoceReportsConstants.ACTIVE_PATIENT_PSYCHO_ASSESS_INDICATOR_UUID,
		AlertPrecoceReportsConstants.ACTIVE_PATIENT_INCOMPLETE_PSYCHO_ASSESS_INDICATOR_UUID,
		AlertPrecoceReportsConstants.ACTIVE_PATIENT_WITH_PSYCHO_DIAGNOSES_INDICATOR_UUID,
		AlertPrecoceReportsConstants.ACTIVE_PATIENT_WITH_PSYCHO_DIAGNOSES_RESOLVE_INDICATOR_UUID,
		AlertPrecoceReportsConstants.ACTIVE_PATIENT_WITH_PSYCHO_FOLLOWUP_INDICATOR_UUID,
		AlertPrecoceReportsConstants.ACTIVE_PATIENT_WITH_PSYCHO_SOCIAL_NEEDS_INDICATOR_UUID,
		AlertPrecoceReportsConstants.ACTIVE_PATIENT_WITH_PSYCHO_AFTER_VIRAL_LOAD_SUP_MILLE_INDICATOR_UUID,
		AlertPrecoceReportsConstants.ACTIVE_PATIENT_WITH_VL_SUP_MILLE_WITH_THREE_PSYCHO_INDICATOR_UUID,
		AlertPrecoceReportsConstants.ACTIVE_PATIENT_WITH_VL_SUP_MILLE_WITH_PSYCHO_AT_TIME_INDICATOR_UUID,
		AlertPrecoceReportsConstants.NEW_ACTIVE_PATIENT_WITH_WITH_PSYCHO_ASSESSMENT_INDICATOR_UUID
	};
	
	private static final String[] fingerPrintIndicatorsUuid = {
		AlertPrecoceReportsConstants.ACTIVE_PATIENT_WITH_FINGER_PRINT_UUID,
		AlertPrecoceReportsConstants.ACTIVE_PATIENT_WITHOUT_FINGER_PRINT_UUID
	};

//private Map<String, AlertPrecoceIndicatorOption> options = new HashMap<>();

@Autowired
private ReportDefinitionService reportDefinitionService;

public List<AlertPrecoceIndicator> getAlertPrecoceIndicators() {
	return uuidToReportDefinition(Arrays.asList(alertPrecoceIndicatorsUuid));
}

public List<AlertPrecoceIndicator> getArtDistributionIndicators() {
	return uuidToReportDefinition(Arrays.asList(artDistributionIndicatorsUuid));
}
public List<AlertPrecoceIndicator> getPsychoSocialIndicators() {
	return uuidToReportDefinition(Arrays.asList(psychoSocialIndicatorsUuid));
}
public List<AlertPrecoceIndicator> getFingerPrintIndicators() {
	return uuidToReportDefinition(Arrays.asList(fingerPrintIndicatorsUuid));
}
private List<AlertPrecoceIndicator> uuidToReportDefinition(List<String> uuids) {
	List<AlertPrecoceIndicator> indicators = new ArrayList<AlertPrecoceIndicator>();
	for (String uuid : uuids) {
		ReportDefinition reportDefinition = reportDefinitionService.getDefinitionByUuid(uuid);
		//AlertPrecoceIndicatorOption option = options.get(uuid);
		if (reportDefinition != null) {
			indicators.add(new AlertPrecoceIndicator(reportDefinition, null));
		}
	}
	return indicators;
}


}
