# Write your MySQL query statement below
SELECT e.name AS Employee
      
FROM Employee e
JOIN Employee m
ON e.ManagerId = m.ID  WHERE e.salary > m.salary;
