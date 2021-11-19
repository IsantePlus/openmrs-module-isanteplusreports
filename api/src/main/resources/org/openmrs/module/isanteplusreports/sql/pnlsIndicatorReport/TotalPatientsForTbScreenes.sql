SELECT ps.patient_id 
FROM isanteplus.patient_status_arv ps,isanteplus.patient_on_art pat,
(select psar.patient_id, MAX(DATE(psar.date_started_status)) AS date_status
	FROM isanteplus.patient_status_arv psar WHERE
	DATE(psar.date_started_status) BETWEEN :startDate AND :endDate GROUP BY 1) B
    WHERE ps.patient_id = pat.patient_id
    AND ps.patient_id = B.patient_id
    AND DATE(ps.date_started_status) = DATE(B.date_status)
	AND ps.id_status IN (6,8)
    AND ps.date_started_status BETWEEN :startDate AND :endDate
    AND pat.tb_screened = 1  
	AND TIMESTAMPDIFF(MONTH,pat.date_tb_screened,:endDate) <= 6;