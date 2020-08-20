SELECT psa.patient_id
   FROM isanteplus.patient_status_arv psa
	   WHERE psa.patient_id IN (SELECT psa.patient_id FROM isanteplus.patient_status_arv psa WHERE TIMESTAMPDIFF(MONTH,psa.date_started_status ,:startDate) =1 AND psa.id_status =9 ) 
       AND psa.id_status IN (6,8)
       AND psa.date_started_status  BETWEEN :startDate AND :endDate;