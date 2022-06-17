SELECT p.patient_id
FROM isanteplus.patient_status_arv psa, isanteplus.patient p,
(SELECT ps.patient_id, MAX(DATE(ps.date_started_status)) AS date_status, ps.id_status
	FROM isanteplus.patient_status_arv ps 
	WHERE ps.date_started_status <= :endDate GROUP BY 1) B
WHERE p.patient_id = psa.patient_id
AND (p.transferred_in = 0 OR p.transferred_in IS NULL)
AND TIMESTAMPDIFF(MONTH, p.date_started_arv,:endDate) >= 12 
AND psa.patient_id = B.patient_id
AND DATE(psa.date_started_status) = DATE(B.date_status)
AND psa.id_status = B.id_status
AND B.date_status <= :endDate
AND B.id_status <> 2; 
/*
AND p.patient_id NOT IN 
(SELECT psa.patient_id FROM isanteplus.patient_status_arv psa, 
isanteplus.patient p WHERE psa.patient_id = p.patient_id 
AND psa.id_status = 2 AND psa.date_started_status between :startDate AND :endDate);*/