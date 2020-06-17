SELECT p.patient_id
FROM isanteplus.patient p ,isanteplus.patient_dispensing pd
        WHERE p.patient_id = pd.patient_id
        AND (p.birthdate <>'' AND p.birthdate is not null)
		AND pd.arv_drug =78280
		AND pd.rx_or_prophy = 163768
		AND pd.visit_date BETWEEN :startDate AND :endDate
		AND p.voided = 0;