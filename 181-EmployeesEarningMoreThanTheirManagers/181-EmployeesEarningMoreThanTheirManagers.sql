-- Last updated: 7/13/2026, 10:12:03 AM
# Write your MySQL query statement below
/* Write your PL/SQL query statement below */
SELECT EMP.name AS Employee FROM Employee EMP,Employee MGR
WHERE EMP.managerId=MGR.id AND EMP.salary>MGR.salary