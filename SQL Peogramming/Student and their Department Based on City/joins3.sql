select s.student_name,d.department_name
from student s, department d
where s.city = "Coimbatore" and d.department_id  = s.department_id
order by s.student_name;
