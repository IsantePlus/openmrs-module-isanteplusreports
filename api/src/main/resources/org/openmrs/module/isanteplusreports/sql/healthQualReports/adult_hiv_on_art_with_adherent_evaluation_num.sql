SELECT
	p.patient_id
FROM
isanteplus.patient p
WHERE
    p.vih_status = '1'
    AND p.patient_id IN (
        SELECT pv.patient_id
        FROM isanteplus.health_qual_patient_visit pv
        LEFT JOIN isanteplus.patient_prescription pp
        ON pv.patient_id = pp.patient_id
        WHERE (
            DATE(pv.visit_date) BETWEEN SUBDATE(:currentDate, INTERVAL 6 MONTH) AND :currentDate
            OR DATE(pp.visit_date) BETWEEN SUBDATE(:currentDate, INTERVAL 6 MONTH) AND :currentDate
        )
        AND (
            pv.age_in_years > 14 -- An adult
        )
    )
    AND p.patient_id IN (SELECT poa.patient_id FROM isanteplus.patient_on_arv poa)
    AND p.patient_id NOT IN (
        SELECT discon.patient_id
        FROM isanteplus.discontinuation_reason discon
        WHERE discon.reason IN ('159', '159492')
    )
    AND p.patient_id IN (SELECT pv.patient_id FROM isanteplus.health_qual_patient_visit pv
    WHERE pv.adherence_evaluation IS NOT NULL
    AND pv.visit_date BETWEEN SUBDATE(:currentDate, INTERVAL 6 MONTH) AND :currentDate);