-- Last updated: 7/13/2026, 10:08:24 AM
# Write your MySQL query statement below
select * from cinema where id%2!=0 && description !="boring" order by rating desc;