SELECT vd.patient_id 
FROM isanteplus.vists_distribution vd 
    WHERE vd.vist_date = (SELECT MAX(vd2.vist_date) FROM isanteplus.vists_distribution vd2  WHERE vd2.patient_id = vd.patient_id AND  vd2.vist_type = 'SUBSQUENT' AND  vd2.vist_date  BETWEEN :startDate AND :endDate)
    AND vd.vist_type = 'SUBSQUENT'
    AND vd.vist_date IS NOT NULL
    AND vd.vist_date BETWEEN :startDate AND :endDate; 