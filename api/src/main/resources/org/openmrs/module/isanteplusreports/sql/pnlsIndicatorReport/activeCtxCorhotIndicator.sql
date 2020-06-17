SELECT p.patient_id
      FROM isanteplus.patient_on_arv p , isanteplus.patient_dispensing pd ,isanteplus.patient_status_arv ps
      WHERE p.patient_id = pd.patient_id
      AND p.patient_id = ps.patient_id
	  AND (ps.id_status = 6 OR ps.id_status = 8 )
	  AND ps.date_started_status BETWEEN :startDate AND :endDate 
	  AND pd.arv_drug = 105281 
      AND pd.visit_date BETWEEN :startDate AND :endDate 
      AND TIMESTAMPDIFF(DAY,pd.next_dispensation_date ,:endDate) <= 30
	  AND p.voided = 0 ;