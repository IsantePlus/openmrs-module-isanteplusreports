/*Nombre de patients VIH(+) sous ARV placées sous PROPHYLAXIE CTX au cours du mois*/
SELECT p.patient_id
      FROM isanteplus.patient_on_arv p, isanteplus.patient_dispensing pd,
      isanteplus.patient_status_arv ps,
      (SELECT pd.patient_id,MAX(pd.visit_date) AS max_visit_date 
      FROM isanteplus.patient_dispensing pd WHERE  pd.drug_id = 105281 
      GROUP BY 1) B, (SELECT psa.patient_id,
      MAX(psa.date_started_status) as date_status
      FROM isanteplus.patient_status_arv psa WHERE psa.date_started_status 
      BETWEEN :startDate AND :endDate GROUP BY 1) C
      WHERE p.patient_id = pd.patient_id
      AND p.patient_id = ps.patient_id
      AND p.patient_id = B.patient_id
      AND ps.patient_id = C.patient_id
      AND DATE(ps.date_started_status) = DATE(C.date_status)
	  AND ps.id_status = 6 
	  AND ps.date_started_status BETWEEN :startDate AND :endDate 
	  AND pd.drug_id = 105281
	  AND (pd.rx_or_prophy IS NULL OR pd.rx_or_prophy = 163768)
	  AND DATE(pd.visit_date) = DATE(B.max_visit_date)
      AND pd.visit_date BETWEEN :startDate AND :endDate 
      AND DATE(pd.next_dispensation_date) >= :endDate
	  AND p.voided <> 1 
	  AND pd.voided <> 1;