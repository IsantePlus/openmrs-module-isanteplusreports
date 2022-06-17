SELECT p.patient_id 
FROM isanteplus.patient p, isanteplus.patient_dispensing pd, 
isanteplus.patient_on_art pat, 
(SELECT pd.patient_id,MIN(pd.visit_date) AS min_vist_date 
	FROM isanteplus.patient_dispensing pd WHERE  pd.drug_id = 78280 
	AND pd.rx_or_prophy = 163768 GROUP BY 1) B, openmrs.obs o
      WHERE p.patient_id = pd.patient_id
      AND p.patient_id = pat.patient_id
      AND p.patient_id = B.patient_id
      AND o.person_id = pd.patient_id
      AND pd.visit_date = B.min_vist_date
	  AND (p.transferred_in <> 1 OR p.transferred_in IS NULL)
      AND (p.birthdate <>'' AND p.birthdate is not null)
      AND p.date_started_arv IS NOT NULL
	  AND p.date_started_arv < :startDate 
	  AND pd.drug_id = 78280
	  AND pd.rx_or_prophy = 163768
	  AND TIMESTAMPDIFF(MONTH,pd.visit_date ,:endDate) >= 6
	  AND TIMESTAMPDIFF(MONTH,pd.visit_date ,:endDate) < 7 
	  AND o.concept_id IN(159431,1659)
	  AND (o.value_datetime IS NOT NULL OR o.value_coded = 1663)
	  AND IFNULL(DATE(o.value_datetime),DATE(o.obs_datetime)) BETWEEN :startDate AND :endDate
	  AND o.voided <> 1
	  AND pd.voided <> 1
	  AND p.voided <> 1;