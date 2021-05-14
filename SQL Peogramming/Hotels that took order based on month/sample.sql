SELECT distinct h.HOTEL_ID,h.HOTEL_NAME,h.RATING
from HOTEL_DETAILS h
join orders o
on o.HOTEL_ID = h.HOTEL_ID
WHERE MONTH(o.ORDER_DATE) = 7
order by h.HOTEL_ID asc;
