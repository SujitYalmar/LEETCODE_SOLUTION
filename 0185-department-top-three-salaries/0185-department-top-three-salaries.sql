# Write your MySQL query statement below
select d.name AS Department, e.name AS Employee, e.salary
from Employee e 
join Department d on e.departmentId = d.id
where(
        select COUNT(distinct salary)
        from Employee e2
        where e2.departmentId = e.departmentId and e2.salary >= e.salary
    ) <= 3
order by Department, Salary desc;
