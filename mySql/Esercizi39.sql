use me;

select concat(first_name, ' ', last_name) as 'Name', salary, 
truncate(salary*1.085, 2) as 'Salary + 8.5%' , 
abs(truncate((salary*1.085 - salary),2)) as 'Delta'
from employees;

select concat(first_name, ' ', last_name) as 'Name',
datediff(curdate(), hire_date) as 'Days since hiring'
from employees;

select concat(first_name, ' ', last_name) as 'Name', ifnull(commission_pct, 'no value')
from employees;
