SELECT ps.patient_id 
FROM isanteplus.patient_status_arv ps,isanteplus.patient_on_art pat,
(SELECT psar.patient_id,
      MAX(psar.date_started_status) as date_status
      FROM isanteplus.patient_status_arv psar WHERE psar.date_started_status 
      BETWEEN :startDate AND :endDate GROUP BY 1)B,
    isanteplus.patient_dispensing pd,(SELECT pdis.patient_id, 
    MAX(pdis.visit_date) AS visit_date 
    FROM isanteplus.patient_dispensing pdis WHERE  pdis.visit_date 
      BETWEEN :startDate AND :endDate GROUP BY 1) C
    WHERE ps.patient_id = pat.patient_id
    AND ps.patient_id = B.patient_id
    AND B.patient_id = pd.patient_id
    AND pd.patient_id = C.patient_id
    AND DATE(pd.visit_date) = DATE(C.visit_date)
    AND DATE(ps.date_started_status) = DATE(B.date_status)
	AND ps.id_status IN (6,8)
    AND ps.date_started_status BETWEEN :startDate AND :endDate
	AND pd.treatment_regime_lines = 'THIRD_LINE'
	AND pd.visit_date BETWEEN :startDate AND :endDate;