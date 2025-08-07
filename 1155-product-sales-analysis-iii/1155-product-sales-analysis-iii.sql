# Write your MySQL query statement below
select product_id, year as first_year, Quantity, price from sales
where(product_id, year) in (select product_id, min(year)from Sales group by product_id)