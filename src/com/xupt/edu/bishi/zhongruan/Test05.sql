select Class.Name,count(Student. Class_id)
from Student,Class
where Student. Class_id = Class. Class_id
group by Student. Class_id;
