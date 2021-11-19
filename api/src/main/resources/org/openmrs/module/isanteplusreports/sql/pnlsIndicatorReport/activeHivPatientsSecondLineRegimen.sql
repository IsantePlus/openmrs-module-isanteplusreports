SELECT ps.patient_id 
FROM isanteplus.patient_status_arv ps,isanteplus.patient_on_art pat,
(SELECT psar.patient_id,
      MAX(psar.date_started_status) as date_status
      FROM isanteplus.patient_status_arv psar WHERE psar.date_started_status 
      BETWEEN :startDate AND :endDate GROUP BY 1)B
    WHERE ps.patient_id = pat.patient_id
    AND ps.patient_id = B.patient_id
    AND DATE(ps.date_started_status) = DATE(B.date_status)
	 AND ps.id_status IN (6,8)
    AND ps.date_started_status BETWEEN :startDate AND :endDate
	 AND pat.treatment_regime_lines = 'SECOND_LINE'
	 AND pat.date_started_regime_treatment BETWEEN :startDate AND :endDate;