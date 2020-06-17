SELECT p.patient_id
      FROM isanteplus.patient_on_arv p , isanteplus.patient_dispensing pd
      WHERE p.patient_id = pd.patient_id
	  AND pd.arv_drug = 105281 
      AND pd.visit_date BETWEEN :startDate AND :endDate 
	  AND p.voided = 0 ;