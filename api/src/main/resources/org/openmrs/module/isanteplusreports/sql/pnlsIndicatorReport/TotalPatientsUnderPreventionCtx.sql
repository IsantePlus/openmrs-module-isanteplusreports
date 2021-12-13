SELECT p.patient_id
      FROM isanteplus.patient_on_arv p, isanteplus.patient_dispensing pd,
      (SELECT pd.patient_id,MIN(pd.visit_date) AS min_visit_date 
      FROM isanteplus.patient_dispensing pd WHERE pd.drug_id = 105281  
      GROUP BY 1) B,
      (SELECT pd.patient_id,MAX(pd.visit_date) AS max_visit_date 
      FROM isanteplus.patient_dispensing pd 
      WHERE pd.drug_id = 105281 GROUP BY 1) C,
      isanteplus.patient_status_arv ps, 
      (select psar.patient_id, MAX(DATE(psar.date_started_status)) AS date_status
	FROM isanteplus.patient_status_arv psar WHERE
	DATE(psar.date_started_status) BETWEEN :startDate AND :endDate GROUP BY 1) D
      WHERE p.patient_id = pd.patient_id
      AND (p.patient_id = B.patient_id OR p.patient_id = C.patient_id)
      AND pd.patient_id = ps.patient_id
      AND ps.patient_id = D.patient_id
      AND DATE(ps.date_started_status) = DATE(D.date_status)
      AND ps.id_status = 6
      AND ps.date_started_status BETWEEN :startDate AND :endDate
	   AND pd.drug_id = 105281 
	   AND (DATE(pd.visit_date) = DATE(B.min_visit_date) 
	   OR DATE(pd.visit_date) = DATE(C.max_visit_date))
      AND pd.visit_date BETWEEN  :startDate AND :endDate 
	   AND p.voided <> 1 
	   AND pd.voided <> 1;