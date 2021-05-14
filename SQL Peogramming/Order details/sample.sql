select o.order_id,c.customer_name,h.hotel_name,o.order_amount
from orders o, hotel_details h, customers c
where o.customer_id = c.customer_id 
and o.hotel_id = h.hotel_id
order by o.order_id;
