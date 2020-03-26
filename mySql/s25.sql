-- self join
select e.last_name as employee, m.last_name as manager
-- as mi permette di inserire un nuovo nome per la colonna che creo
from employees e join employees m
-- per fare questa cosa devo per forza usare alias per crearmi due tabelle fittizie uguali fra loro
on (e.manager_id = m.employee_id);

-- "classic" self join
select e.last_name as employee, m.last_name as manager
from employees e, employees m
where e.manager_id = m.employee_id;
