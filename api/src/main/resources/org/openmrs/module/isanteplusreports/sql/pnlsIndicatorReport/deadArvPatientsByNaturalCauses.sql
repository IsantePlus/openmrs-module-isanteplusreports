SELECT psa.patient_id
   FROM isanteplus.patient_status_arv psa, openmrs.obs o,
   (SELECT psarv.patient_id,
      MAX(DATE(psarv.date_started_status)) as date_status
      FROM isanteplus.patient_status_arv psarv WHERE DATE(psarv.date_started_status) 
      BETWEEN :startDate AND :endDate GROUP BY 1) B
	    WHERE psa.patient_id = o.person_id
	    AND psa.patient_id = B.patient_id
	    AND DATE(psa.date_started_status) = B.date_status
	    AND o.concept_id = 1748
	    AND o.value_coded = 133481
	    AND psa.patient_id IN (SELECT psar.patient_id 
	    FROM isanteplus.patient_status_arv psar 
	    WHERE TIMESTAMPDIFF(MONTH,DATE(psar.date_started_status),:startDate) <=3 
	    AND psar.id_status IN (6,8)) 
       	AND psa.id_status = 1
        AND DATE(o.obs_datetime) <= :endDate
       	AND DATE(psa.date_started_status)  BETWEEN :startDate AND :endDate;