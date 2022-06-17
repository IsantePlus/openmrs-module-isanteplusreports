SELECT ps.patient_id 
FROM isanteplus.patient_status_arv ps, isanteplus.patient_on_art pat, 
isanteplus.patient p,isanteplus.patient_dispensing pdisp,
(SELECT psa.patient_id,MAX(psa.date_started_status) as date_status
      FROM isanteplus.patient_status_arv psa WHERE psa.date_started_status 
      BETWEEN :startDate AND :endDate GROUP BY 1)B,
 (SELECT pd.patient_id,MIN(pd.visit_date) AS min_vist_date 
FROM isanteplus.patient_dispensing pd 
WHERE pd.drug_id = 78280 GROUP BY 1)C
    WHERE ps.patient_id = pat.patient_id
    AND p.patient_id = pat.patient_id
    AND ps.patient_id = B.patient_id
    AND ps.patient_id = pdisp.patient_id
    AND pdisp.patient_id = C.patient_id
    AND DATE(pdisp.visit_date) = DATE(C.min_vist_date)
    AND DATE(ps.date_started_status) = DATE(B.date_status)
	AND ps.id_status IN (6,8)
	AND (p.transferred_in <> 1 OR p.transferred_in IS NULL)
	AND p.date_started_arv BETWEEN :startDate AND :endDate
    AND ps.date_started_status BETWEEN :startDate AND :endDate
    AND pdisp.visit_date BETWEEN :startDate AND :endDate
    AND p.voided <> 1
    AND pdisp.voided <> 1;
