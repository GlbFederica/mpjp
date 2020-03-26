use me;

select first_name, last_name, department_name
from employees join departments
using (department_id);

select first_name, last_name, job_title
from employees join jobs
using (job_id);

select first_name, last_name
from employees join jobs
using (job_id)
where (salary = min_salary or salary = max_salary);

select first_name, last_name
from (employees join departments using(department_id))
join locations using(location_id)
where country_id = 'UK';

select d.department_name, e.first_name, e.last_name
from departments d join employees e
on (d.manager_id = e.employee_id);