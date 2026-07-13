-- Last updated: 7/13/2026, 10:05:47 AM
# Write your MySQL query statement below
select  distinct viewer_id as "id" from Views where author_id=viewer_id order by 1;  