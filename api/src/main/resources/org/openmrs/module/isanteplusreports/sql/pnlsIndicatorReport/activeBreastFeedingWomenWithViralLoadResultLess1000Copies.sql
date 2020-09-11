SELECT CASE 
            WHEN pl.test_id = 856 THEN
				  CASE
				  WHEN CAST(pl.test_result AS UNSIGNED) < 1000 THEN pl.patient_id 							
				  END
		      WHEN pl.test_id = 1305 THEN
		          CASE 
                  WHEN pl.test_result = 1306 THEN pl.patient_id
		          END
		      END
            								            
FROM isanteplus.patient_status_arv ps ,isanteplus.patient_laboratory pl ,isanteplus.patient_on_art pat
    WHERE ps.patient_id = pl.patient_id
    AND pl.patient_id = pat.patient_id
	 AND ps.id_status IN (6,8)
	 AND pat.breast_feeding = 1
    AND ps.date_started_status BETWEEN :startDate AND :endDate 
	 AND pl.test_done =1 
	 AND TIMESTAMPDIFF(MONTH, pl.date_test_done ,:endDate) >= 12
	AND pat.viral_load_targeted IS NULL ;