SELECT pat.patient_id   
FROM isanteplus.patient_on_art pat
WHERE pat.using_family_planning_method = "NECKLACE"
AND  pat.date_using_family_planning_method  BETWEEN :startDate AND :endDate ; 