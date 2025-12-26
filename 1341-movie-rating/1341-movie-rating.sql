# Write your MySQL query statement below
(SELECT u.name AS results
FROM MovieRating AS mr
LEFT JOIN Users AS u
USING (user_id)
GROUP BY u.user_id, u.name
ORDER BY COUNT(u.user_id) DESC, u.name ASC
LIMIT 1)

UNION ALL

(SELECT m.title AS results
FROM MovieRating AS mr
LEFT JOIN Movies AS m
USING (movie_id)
WHERE mr.created_at BETWEEN '2020-02-01' AND '2020-02-29'
GROUP BY m.movie_id, m.title
ORDER BY AVG(mr.rating) DESC, m.title ASC
LIMIT 1)
