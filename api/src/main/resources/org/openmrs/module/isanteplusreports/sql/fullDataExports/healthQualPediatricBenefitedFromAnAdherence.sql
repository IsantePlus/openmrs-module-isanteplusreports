SELECT
    COUNT(DISTINCT CASE WHEN (
                        p.gender = 'F'
                        AND p.patient_id IN (SELECT poa.patient_id FROM isanteplus.patient_on_arv poa)
						AND p.patient_id IN (SELECT vt.patient_id FROM isanteplus.visit_type vt
												WHERE vt.concept_id = 163710)
                    ) THEN p.patient_id else null END) AS 'femaleNumerator',
    COUNT(DISTINCT CASE WHEN (
                        p.gender = 'M'
                        AND p.patient_id IN (SELECT poa.patient_id FROM isanteplus.patient_on_arv poa)
						AND p.patient_id IN (SELECT vt.patient_id FROM isanteplus.visit_type vt
												WHERE vt.concept_id = 163710)
                    ) THEN p.patient_id else null END) AS 'maleNumerator',
    COUNT(DISTINCT CASE WHEN (p.gender = 'F') THEN p.patient_id else null END) AS 'femaleDenominator',
    COUNT(DISTINCT CASE WHEN (p.gender = 'M') THEN p.patient_id else null END) AS 'maleDenominator'
FROM
	isanteplus.patient p
WHERE
    p.patient_id IN (SELECT phv.patient_id
					FROM isanteplus.pediatric_hiv_visit phv
                    LEFT JOIN isanteplus.patient_prescription pp
                    ON phv.patient_id = pp.patient_id
                    WHERE
						DATE(phv.encounter_date) BETWEEN SUBDATE(:currentDate, INTERVAL 3 MONTH) AND :currentDate
                        OR (DATE(pp.visit_date) BETWEEN SUBDATE(:currentDate, INTERVAL 3 MONTH) AND :currentDate
							AND pp.rx_or_prophy = 138405)
					)
	AND p.patient_id NOT IN (SELECT discon.patient_id
	                        FROM isanteplus.discontinuation_reason discon
	                        WHERE discon.reason IN (159,1667,159492))
	AND p.patient_id NOT IN (SELECT plab.patient_id
	                        FROM isanteplus.patient_laboratory plab
	                        WHERE plab.test_done = 1 AND plab.test_id = 844 AND plab.test_result = 1302);


