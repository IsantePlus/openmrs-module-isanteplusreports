SELECT 
	DISTINCT p.patient_id 
FROM 
	isanteplus.`patient_ob_gyn` p
WHERE 
	p.pregnant = 1
	AND p.edd BETWEEN :startDate AND :endDate
	AND p.voided = 0