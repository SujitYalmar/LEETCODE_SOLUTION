# Write your MySQL query statement below
select ifnull(max(salary),null) as SecondHighestSalary 
from employee
where salary < (select max(salary) from employee)