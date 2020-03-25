-- check null
select first_name, last_name
from employees
where commission_pct is null;
-- mi ritorna nome e cognome dalla tabella employees dove commision_pct  è un campo null

-- null in operations
select first_name, last_name, 12 * salary * commission_pct
from employees;

-- what if null
select first_name, last_name, 12 * salary * ifnull(commission_pct, 0)
from employees;