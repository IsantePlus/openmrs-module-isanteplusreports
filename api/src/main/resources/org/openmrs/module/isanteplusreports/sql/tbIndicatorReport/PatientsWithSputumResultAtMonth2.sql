SELECT 
	DISTINCT patient_id 
FROM 
	isanteplus.patient_tb_diagnosis p
WHERE 
	visit_date <= :endDate
--	AND location_id = :location	
	AND
	(
		tb_test_result_mon_2 = 1 -- Positive sputum result at Month 2
		OR
		tb_test_result_mon_2 = 2 -- Negative sputum result at Month 2
	)