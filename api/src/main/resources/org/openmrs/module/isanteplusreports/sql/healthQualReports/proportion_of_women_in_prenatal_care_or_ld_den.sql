SELECT
	p.patient_id
FROM
    isanteplus.patient p
WHERE
    p.patient_id IN ( -- Pregnant
        SELECT ppreg.patient_id
        FROM isanteplus.patient_pregnancy ppreg
        WHERE (ppreg.end_date IS NULL AND ppreg.start_date <= :endDate) OR (ppreg.end_date BETWEEN :startDate AND :endDate)
    )
    AND p.patient_id IN ( -- An adult in a given period
        SELECT hqpv.patient_id
        FROM isanteplus.health_qual_patient_visit hqpv
        WHERE hqpv.age_in_years > 14
            AND DATE(hqpv.visit_date) BETWEEN :startDate AND :endDate
    );