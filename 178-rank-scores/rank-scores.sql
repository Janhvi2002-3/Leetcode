# Write your MySQL query statement below
SELECT  score, 
DENSE_RANK()Over (ORDER by score DESC ) as `rank`
FROM Scores 

