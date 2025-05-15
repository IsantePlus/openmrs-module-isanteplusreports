/*Nombre de patients VIH(+) sous ARV placées sous PROPHYLAXIE CTX au cours du mois*/
SELECT pat.patient_id
      FROM isanteplus.patient pat,isanteplus.patient_on_arv p, isanteplus.patient_dispensing pd,
      isanteplus.patient_status_arv ps,
      (SELECT pd.patient_id,MAX(DATE(pd.visit_date)) AS max_visit_date 
      FROM isanteplus.patient_dispensing pd WHERE  pd.drug_id = 105281 
      GROUP BY 1) B, (SELECT psa.patient_id,
      MAX(DATE(psa.date_started_status)) as date_status
      FROM isanteplus.patient_status_arv psa WHERE DATE(psa.date_started_status) 
      BETWEEN :startDate AND :endDate GROUP BY 1) C
      WHERE pat.patient_id = p.patient_id
      AND p.patient_id = pd.patient_id
      AND p.patient_id = ps.patient_id
      AND p.patient_id = B.patient_id
      AND ps.patient_id = C.patient_id
      AND DATE(ps.date_started_status) = DATE(C.date_status)
	  AND ps.id_status = 6 
	  AND DATE(ps.date_started_status) BETWEEN :startDate AND :endDate 
	  AND pd.drug_id = 105281
      AND DATE(pd.next_dispensation_date) >= :startDate
	  AND pd.voided <> 1
	  AND pat.voided <> 1;