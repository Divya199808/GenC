SELECT RENTAL_ID,CAR_ID,CUSTOMER_ID,KM_DRIVEN FROM RENTALS
WHERE  MONTH(RETURN_DATE) = 8
AND YEAR(RETURN_DATE) = 2019
ORDER BY RENTAL_ID ASC;
