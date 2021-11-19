SELECT psa.patient_id
   FROM isanteplus.patient_status_arv psa, openmrs.obs o
	    WHERE psa.patient_id = o.person_id
	    AND o.concept_id = 1748
	    AND o.value_coded = 133481
	    AND psa.patient_id IN (SELECT psar.patient_id 
	    FROM isanteplus.patient_status_arv psar 
	    WHERE TIMESTAMPDIFF(MONTH,psar.date_started_status ,:startDate) <=3 
	    AND psar.id_status IN (6,8)) 
       	AND psa.id_status = 1
        AND o.obs_datetime <= :endDate
       	AND psa.date_started_status  BETWEEN :startDate AND :endDate;