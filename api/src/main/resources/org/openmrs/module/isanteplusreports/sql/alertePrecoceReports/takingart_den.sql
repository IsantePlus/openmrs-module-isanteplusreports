select distinct pdisp.patient_id FROM isanteplus.patient p, isanteplus.patient_dispensing pdisp
WHERE p.patient_id = pdisp.patient_id
AND pdisp.arv_drug = 1065
AND DATE(pdisp.next_dispensation_date) between :startDate AND :endDate;