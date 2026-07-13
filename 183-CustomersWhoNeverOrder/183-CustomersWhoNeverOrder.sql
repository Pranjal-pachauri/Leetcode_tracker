-- Last updated: 7/13/2026, 10:12:01 AM
SELECT name as Customers
from Customers
where id not in (
    select customerId
    from Orders
);