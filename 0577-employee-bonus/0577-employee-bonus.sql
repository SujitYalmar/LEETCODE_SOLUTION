# Write your MySQL query statement below
select name,bonus from Bonus 
right join Employee 
on Bonus.empid=Employee.empId
where bonus<1000 or Bonus Is NULL;