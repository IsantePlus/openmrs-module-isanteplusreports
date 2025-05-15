SELECT ps.patient_id 
FROM isanteplus.patient p, isanteplus.patient_status_arv ps,isanteplus.patient_on_art pat,
(select psar.patient_id, MAX(DATE(psar.date_started_status)) AS date_status
	FROM isanteplus.patient_status_arv psar WHERE
	DATE(psar.date_started_status) BETWEEN :startDate AND :endDate GROUP BY 1) B,
	openmrs.obs o, (SELECT ob.person_id as patient_id, 
	MAX(DATE(ob.obs_datetime)) AS obs_datetime 
	FROM openmrs.obs ob WHERE ob.concept_id = 1659 
	AND ob.value_coded IN (1660,142177)
	AND TIMESTAMPDIFF(MONTH,DATE(ob.obs_datetime),:endDate) <= 6 GROUP BY 1) C
    WHERE p.patient_id = ps.patient_id
    AND ps.patient_id = pat.patient_id
    AND ps.patient_id = B.patient_id
    AND p.patient_id = o.person_id
    AND o.person_id = C.patient_id
    AND DATE(o.obs_datetime) = DATE(C.obs_datetime)
    AND DATE(ps.date_started_status) = DATE(B.date_status)
	AND ps.id_status IN (6,8)
    AND DATE(ps.date_started_status) BETWEEN :startDate AND :endDate
     AND o.concept_id = 1659 AND o.value_coded IN (1660,142177)
    AND TIMESTAMPDIFF(MONTH,DATE(o.obs_datetime),:endDate) <= 6
    AND p.voided <> 1
    AND o.voided <> 1;