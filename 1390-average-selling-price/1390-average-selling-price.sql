# Write your MySQL query statement below
select Prices.product_id, IFNULL(ROUND(SUM(Prices.price*UnitsSold.units)/SUM(UnitsSold.units),2),0) as average_price from Prices left join UnitsSold on Prices.product_id = UnitsSold.product_id 
and  purchase_date between start_date and end_date group by product_id; 