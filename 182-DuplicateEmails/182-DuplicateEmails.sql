-- Last updated: 7/13/2026, 10:12:02 AM
SELECT Email
FROM Person
GROUP BY Email
HAVING COUNT(Email) > 1;