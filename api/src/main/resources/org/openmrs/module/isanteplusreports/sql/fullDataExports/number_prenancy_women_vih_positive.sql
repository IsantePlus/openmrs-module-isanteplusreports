SELECT COUNT(DISTINCT ppr.patient_id) as Total 
FROM isanteplus.patient_pregnancy ppr
LEFT OUTER JOIN  isanteplus.patient_laboratory plab
ON ppr.patient_id=plab.patient_id
LEFT OUTER JOIN isanteplus.patient p
ON p.patient_id=ppr.patient_id
WHERE ((p.vih_status=1) OR ((plab.test_id=1042 OR plab.test_id=1040)
AND plab.test_result=703 AND plab.date_test_done BETWEEN :startDate AND :endDate))
AND ppr.start_date BETWEEN :startDate AND :endDate
AND ((ppr.end_date is null) OR (ppr.end_date >= :endDate));