use me;

select first_name, last_name, email, phone_number, hire_date
from employees
order by 2, 1;

select first_name, last_name, email, phone_number, hire_date
from employees
where first_name = 'David' or first_name = 'Peter';
-- analogo a: first_name in ('David', 'Peter');

select *
from employees
where department_id = 60;

select *
from employees
where department_id in (30, 50);
-- analogo a: department_id = 30 or department_id = 50;

select *
from employees
where salary > 10000;

select *
from employees
where salary not between 4000 and 15000;
-- analogo a: (salary < 4000 or salary > 15000)

select *
from employees
-- where (salary < 4000 or salary > 15000) and department_id in (50, 80);
where salary not between 4000 and 15000 and department_id in (50,80);