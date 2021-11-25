SELECT pl.patient_id            								            
FROM isanteplus.patient p, isanteplus.patient_status_arv ps,
isanteplus.patient_laboratory pl , isanteplus.patient_on_art pat,
(SELECT psa.patient_id, MAX(DATE(psa.date_started_status)) as date_status 
	FROM isanteplus.patient_status_arv psa WHERE 
 psa.date_started_status BETWEEN :startDate AND :endDate GROUP BY 1) B
    WHERE p.patient_id = pl.patient_id 
     AND ps.patient_id = pl.patient_id
     AND pat.patient_id = ps.patient_id
     AND ps.patient_id = B.patient_id
     AND DATE(ps.date_started_status) = DATE(B.date_status)
	 AND ps.id_status IN (6,8)
	 AND pl.test_id IN (856,1305)
     AND ps.date_started_status BETWEEN :startDate AND :endDate 
	 AND pl.test_done =1 
	 AND TIMESTAMPDIFF(MONTH, pl.date_test_done,:endDate) >= 12
	 AND pat.viral_load_targeted = 1 
	 AND pl.viral_load_target_or_routine = 2
	 AND pl.voided <> 1
	 AND (p.birthdate IS NOT NULL OR p.birthdate <> "");