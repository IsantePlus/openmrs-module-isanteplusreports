SELECT p.patient_id
FROM isanteplus.patient p ,isanteplus.patient_dispensing pd
      WHERE p.patient_id = pd.patient_id
	  AND p.transferred_in = 0
      AND (p.birthdate <>'' AND p.birthdate is not null)
      AND p.date_started_arv IS NOT NULL
	  AND p.date_started_arv BETWEEN :startDate AND :endDate 
	  AND pd.arv_drug =78280
	  AND pd.rx_or_prophy = 163768
	  AND TIMESTAMPDIFF(MONTH,pd.visit_date ,:endDate) >= 6
	  AND TIMESTAMPDIFF(MONTH,pd.visit_date ,:endDate) < 7 
	  AND p.voided = 0;