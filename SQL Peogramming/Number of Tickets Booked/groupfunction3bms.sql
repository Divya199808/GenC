select users.user_id, count(tickets.user_id) as no_of_tickets

from users, tickets

where users.user_id = tickets.user_id

group by users.user_id

order by no_of_tickets asc;
