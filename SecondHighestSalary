+----+--------+
| Id | Salary |
+----+--------+
| 1  | 100    |
| 2  | 200    |
| 3  | 300    |
+----+--------+

Output:
+---------------------+
| SecondHighestSalary |
+---------------------+
| 200                 |
+---------------------+

If there is no second highest salary, then the query should return null.


# Write your MySQL query statement below
SELECT 
    case when (SELECT COUNT(DISTINCT Salary) FROM Employee) < 2 then null
    else (SELECT DISTINCT Salary FROM Employee WHERE Salary = (SELECT MAX(Salary) FROM Employee WHERE Salary < (SELECT MAX(Salary) FROM Employee))) end 
                                                 AS SecondHighestSalary 
