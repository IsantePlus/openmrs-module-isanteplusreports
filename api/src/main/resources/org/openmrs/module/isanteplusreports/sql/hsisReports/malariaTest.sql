
SELECT le.patient_id 
FROM isanteplus.lab_examination le 
   WHERE le.concept_id IN (32,1643)
   AND le.lab_date = (SELECT MAX(le2.lab_date) FROM isanteplus.lab_examination le2  WHERE le2.patient_id = le.patient_id 
   AND  le2.lab_date  BETWEEN :startDate AND :endDate) 
   AND le.lab_date IS NOT NULL
   AND le.lab_date BETWEEN :startDate AND :endDate; 
--   