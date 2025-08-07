# Write your MySQL query statement below
select m.Employee_id,m.name ,count(e.reports_to)as reports_count,round(avg(e.age*1.00),0) as average_age
from Employees e ,Employees m 
where e.reports_to =m.Employee_id 
group by  m.Employee_id ,m.name 
order by  Employee_id asc 