SELECT pat.patient_id   
FROM isanteplus.patient_on_art pat, isanteplus.family_planning fp
WHERE pat.patient_id = fp.patient_id
AND fp.family_planning_method_name = "NECKLACE"
AND DATE(fp.encounter_date) BETWEEN :startDate AND :endDate
AND fp.voided = 0
AND fp.accepting_or_using_fp = 1;