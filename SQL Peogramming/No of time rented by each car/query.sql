select car_id,count(rental_id) as no_of_trips 
from rentals
group by car_id
order by car_id;
