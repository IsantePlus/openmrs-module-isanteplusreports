SELECT DISTINCT patd.patient_id FROM isanteplus.patient p, isanteplus.patient_dispensing patd,
(select distinct pdisp.patient_id, DATE(pdisp.next_dispensation_date) AS next_visit
FROM isanteplus.patient_dispensing pdisp
WHERE pdisp.arv_drug = 1065
AND DATE(pdisp.next_dispensation_date) between :startDate AND :endDate
GROUP BY 1) B
WHERE p.patient_id = patd.patient_id
AND patd.patient_id = B.patient_id
AND DATE(patd.visit_date) >= DATE(B.next_visit)
AND DATE(patd.visit_date) BETWEEN :startDate AND :endDate
AND patd.arv_drug = 1065;