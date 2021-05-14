select 
  name,concat(substring(name, 1, 3), substring(phno, 1, 3)) PASSWORD
from users
order by name;
