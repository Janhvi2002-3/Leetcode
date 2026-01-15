# Write your MySQL query statement below
select name 
FROM Employee 
WHERE id IN (
    SELECT managerId
    FROM Employee
    GROUP BY managerId
    HAVING COUNT(*)>=5
) 