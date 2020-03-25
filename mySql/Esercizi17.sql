use me;

select *
from employees
where hire_date like '%2005%';

select distinct job_id
from employees
order by 1;

select *
from employees
-- where commission_pct is not null;
where commission_pct > 0;

select *
from employees
where first_name or last_name like '%a%';
-- analogo a where first_name like '%a%' or last_name like '%a%';

select distinct department_name
from departments
order by 1;

select *
from departments
order by department_name;

select *
from locations
where country_id = 'IT';