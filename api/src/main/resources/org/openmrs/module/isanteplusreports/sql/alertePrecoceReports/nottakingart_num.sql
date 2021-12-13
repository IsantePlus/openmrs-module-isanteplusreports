SELECT DISTINCT B.patient_id FROM 
(select distinct pdisp.patient_id, DATE(pdisp.next_dispensation_date) AS next_visit
FROM isanteplus.patient_dispensing pdisp
WHERE pdisp.arv_drug = 1065
AND DATE(pdisp.next_dispensation_date) between :startDate AND :endDate
GROUP BY 1) B
WHERE B.patient_id NOT IN (select distinct pdisp.patient_id
FROM isanteplus.patient_dispensing pdisp
WHERE pdisp.arv_drug = 1065
AND DATE(pdisp.visit_date) between :startDate AND :endDate
AND DATE(pdisp.next_dispensation_date) >= B.next_visit);