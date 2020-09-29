SELECT 
	DISTINCT patient_id 
FROM 
	isanteplus.patient_tb_diagnosis p
WHERE 
	DATE(visit_date) <= :endDate
--	AND location_id = :location	
	AND
	(
		tb_diag_sputum = 1 -- Diagnosis based on Sputum
		AND 
			(
				tb_test_result_mon_0 = 1 -- Positive sputum result at Month 0
				OR tb_test_result_mon_0 = 2 -- Negative sputum result at Month 0
			)
	)