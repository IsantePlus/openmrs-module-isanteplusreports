SELECT
	p.patient_id
FROM isanteplus.patient p
    LEFT JOIN isanteplus.patient_dispensing pd ON p.patient_id = pd.patient_id
    INNER JOIN isanteplus.patient_status_arv arv ON p.patient_id = arv.patient_id
    INNER JOIN (SELECT drug_id FROM isanteplus.arv_drugs) B ON pd.drug_id = B.drug_id
WHERE p.vih_status = '1' -- HIV+ patient
    AND p.patient_id NOT IN (   -- Exclude discontinued (1667), transfer (159492)
        SELECT discon.patient_id
        FROM isanteplus.discontinuation_reason discon
        WHERE discon.reason IN (1667, 159492)
    ) AND TIMESTAMPDIFF(YEAR, p.birthdate, :currentDate) > 14 -- adult
	-- drug order form completed on date X. The date of the drug order form should not surpass the reporting period by more than 90 days.
	AND p.patient_id IN ( SELECT pnv.patient_id FROM isanteplus.patient_visit pnv
	WHERE pnv.patient_id = p.patient_id
      AND pnv.encounter_type IN (5, 11) -- Ord. Médicale OR Ord. médicale Pédiatrique
	AND (pnv.visit_date BETWEEN DATE(:currentDate) AND DATE_ADD(DATE(:currentDate), INTERVAL 90 DAY)
	OR pnv.visit_date BETWEEN DATE_SUB(DATE(:currentDate), INTERVAL 90 DAY) AND DATE(:currentDate)))
    AND arv.start_date BETWEEN SUBDATE(:currentDate, INTERVAL :period MONTH) AND :currentDate
