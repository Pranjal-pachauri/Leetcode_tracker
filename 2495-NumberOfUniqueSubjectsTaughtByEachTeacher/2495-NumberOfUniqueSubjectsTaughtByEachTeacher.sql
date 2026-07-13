-- Last updated: 7/13/2026, 10:02:15 AM
# Write your MySQL query statement below
select teacher_id, count(DISTINCT subject_id) as cnt  from teacher group by teacher_id;