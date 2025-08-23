# Write your MySQL query statement below
# Write your MySQL query statement below
with cte as (select person_name,weight,
sum(weight) over ( order by turn) as cum_sum from Queue
group by  person_name)
select person_name from cte
where cum_sum <=1000
order by cum_sum desc
limit 1;