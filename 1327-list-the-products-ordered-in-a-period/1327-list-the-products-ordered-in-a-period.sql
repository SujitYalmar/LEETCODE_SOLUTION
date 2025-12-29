# Write your MySQL query statement below
select product_name, SUM(unit) as unit
from Products as P join Orders as O 
on P.product_id = O.product_id
where (MONTH(order_date), YEAR(order_date)) = (02, 2020)
group by O.product_id
having SUM(unit) >= 100;