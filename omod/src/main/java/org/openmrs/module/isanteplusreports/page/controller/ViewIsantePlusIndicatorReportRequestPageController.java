package org.openmrs.module.isanteplusreports.page.controller;

import javax.servlet.http.HttpServletRequest;

import org.openmrs.module.reporting.ReportingConstants;
import org.openmrs.module.reporting.dataset.DataSet;
import org.openmrs.module.reporting.report.ReportData;
import org.openmrs.module.reporting.report.ReportRequest;
import org.openmrs.module.reporting.report.renderer.RenderingMode;
import org.openmrs.module.reporting.report.service.ReportService;
import org.openmrs.module.reporting.web.renderers.WebReportRenderer;
import org.openmrs.ui.framework.UiUtils;
import org.openmrs.ui.framework.annotation.SpringBean;
import org.openmrs.ui.framework.page.FileDownload;
import org.openmrs.ui.framework.page.PageModel;
import org.springframework.web.bind.annotation.RequestParam;

public class ViewIsantePlusIndicatorReportRequestPageController {

	public Object get(@SpringBean ReportService reportService, @RequestParam("request") String requestUuid, UiUtils ui,
			HttpServletRequest request, PageModel model) {
		ReportRequest req = reportService.getReportRequestByUuid(requestUuid);
		if (req == null) {
			throw new IllegalArgumentException("ReportRequest not found");
		}
		RenderingMode renderingMode = req.getRenderingMode();
		String linkUrl = "/module/reporting/reports/reportHistoryOpen";

		if (renderingMode.getRenderer() instanceof WebReportRenderer) {
			WebReportRenderer webRenderer = (WebReportRenderer) renderingMode.getRenderer();
			linkUrl = webRenderer.getLinkUrl(req.getReportDefinition().getParameterizable());
			linkUrl = request.getContextPath() + (linkUrl.startsWith("/") ? "" : "/") + linkUrl;
			if (req != null) {
				ReportData reportData = reportService.loadReportData(req);
				if (reportData != null) {
					request.getSession().setAttribute(ReportingConstants.OPENMRS_REPORT_DATA, reportData);
					request.getSession().setAttribute(ReportingConstants.OPENMRS_REPORT_ARGUMENT,
							renderingMode.getArgument());
					request.getSession().setAttribute(ReportingConstants.OPENMRS_LAST_REPORT_URL, linkUrl);

					DataSet dataset = null;

					for (String key : reportData.getDataSets().keySet()) {
						dataset = reportData.getDataSets().get(key);
					}
					if (dataset != null) {
						model.addAttribute("reportName", dataset.getDefinition().getName());
						model.addAttribute("parameter", dataset.getDefinition().getParameters());
						model.addAttribute("dataset", dataset);
						model.addAttribute("columns", dataset.getMetaData().getColumns());
						model.addAttribute("columnsvalues", dataset.iterator());
						model.addAttribute("request", requestUuid);
					}
				}
			}

			return null;
		} else {
			String filename = renderingMode.getRenderer().getFilename(req).replace(" ", "_");
			String contentType = renderingMode.getRenderer().getRenderedContentType(req);
			byte[] data = reportService.loadRenderedOutput(req);
			if (data == null) {
				throw new IllegalStateException("Error retrieving the report");
			} else {
				return new FileDownload(filename, contentType, data);
			}
		}
	}

	public void post(@SpringBean ReportService reportService, @RequestParam("request") String requestUuid, UiUtils ui,
			HttpServletRequest request, PageModel model) {
		ReportRequest req = reportService.getReportRequestByUuid(requestUuid);
		if (req == null) {
			throw new IllegalArgumentException("ReportRequest not found");
		}
		RenderingMode renderingMode = req.getRenderingMode();
		String linkUrl = "/module/reporting/reports/reportHistoryOpen";

		if (renderingMode.getRenderer() instanceof WebReportRenderer) {
			WebReportRenderer webRenderer = (WebReportRenderer) renderingMode.getRenderer();
			linkUrl = webRenderer.getLinkUrl(req.getReportDefinition().getParameterizable());
			linkUrl = request.getContextPath() + (linkUrl.startsWith("/") ? "" : "/") + linkUrl;
			if (req != null) {
				ReportData reportData = reportService.loadReportData(req);
				if (reportData != null) {
					request.getSession().setAttribute(ReportingConstants.OPENMRS_REPORT_DATA, reportData);
					request.getSession().setAttribute(ReportingConstants.OPENMRS_REPORT_ARGUMENT,
							renderingMode.getArgument());
					request.getSession().setAttribute(ReportingConstants.OPENMRS_LAST_REPORT_URL, linkUrl);

					DataSet dataset = null;
					for (String key : reportData.getDataSets().keySet()) {
						dataset = reportData.getDataSets().get(key);
					}

					if (dataset != null) {
						model.addAttribute("reportName", dataset.getDefinition().getName());
						model.addAttribute("dataset", dataset);
						model.addAttribute("parameter", dataset.getDefinition().getParameters());
						model.addAttribute("columns", dataset.getMetaData().getColumns());
						model.addAttribute("columnsvalues", dataset.iterator());
						model.addAttribute("request", requestUuid);
						model.addAttribute("i", 0);

					}
				}
			}
		}

	}

}
