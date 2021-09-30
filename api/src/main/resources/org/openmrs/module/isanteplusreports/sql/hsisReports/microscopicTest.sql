
SELECT le.patient_id 
FROM isanteplus.lab_examination le 
   WHERE le.lab_date = (SELECT MAX(le2.lab_date) FROM isanteplus.lab_examination le2  WHERE le2.patient_id = le.patient_id 
   AND  le2.lab_date  BETWEEN :startDate AND :endDate)
   AND le.concept_id=32 
   AND le.value_coded=1138 
   AND le.lab_date IS NOT NULL
   AND le.lab_date BETWEEN :startDate AND :endDate; 
