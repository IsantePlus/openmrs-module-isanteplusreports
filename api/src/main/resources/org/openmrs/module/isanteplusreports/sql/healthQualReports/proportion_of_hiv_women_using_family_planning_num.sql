SELECT
	p.patient_id
FROM
  isanteplus.patient p
WHERE
    p.vih_status = 1 -- HIV+
    AND p.gender = 'F'
    AND TIMESTAMPDIFF(YEAR, p.birthdate,:endDate) BETWEEN 10 AND 49
    AND p.patient_id IN (
        SELECT pv.patient_id
        FROM isanteplus.health_qual_patient_visit pv
        WHERE
            pv.visit_date BETWEEN :startDate AND :endDate
    )
    AND p.patient_id NOT IN ( -- Exclude deceased (159), discontinuations (1667), transfer (159492)
        SELECT discon.patient_id
        FROM isanteplus.discontinuation_reason discon
        WHERE discon.reason IN (159,1667,159492)
    )
	AND p.patient_id IN (
		SELECT pv.patient_id FROM isanteplus.health_qual_patient_visit pv
		WHERE pv.family_planning_method_used is true
		AND pv.visit_date BETWEEN :startDate AND :endDate
	);