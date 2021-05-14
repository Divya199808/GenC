select 
  concat(owner_name,owner_id) USERNAME,
  concat(substring(owner_name, 1, 3), owner_id) PASSWORD
from owners
order by USERNAME;
