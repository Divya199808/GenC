select h.hotel_id, h.hotel_name, count(o.order_id) as no_of_orders from hotel_details h

Join orders o on o.hotel_id = h.hotel_id

Group by h.hotel_id

Having no_of_orders >5

Order by h.hotel_id;
