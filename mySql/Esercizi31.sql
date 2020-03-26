use me;

select d.department_name, e.first_name, e.last_name
from departments d left outer join employees e
on (d.manager_id = e.employee_id);

select department_name
from departments
where manager_id is null;

select concat(e.first_name, ' ', e.last_name) as 'Employee', 
concat(m.first_name, ' ', m.last_name ) as 'Manager'
from employees e join employees m
where e.manager_id = m.employee_id;