# Write your MySQL query statement below
SELECT(SELECT DISTINCT salary FROM Employee 
ORDER BY salary desc 
LIMIT 1 offset 1
)AS SecondHighestSalary ;
