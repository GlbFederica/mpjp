use me;

-- funzioni aggregate
select max(salary) as 'max',
min(salary) as 'min',
sum(salary) as 'sum',
truncate(avg(salary),2) as 'average'
from employees;

select job_id,
 max(salary) as 'max',
min(salary) as 'min',
sum(salary) as 'sum',
truncate(avg(salary),2) as 'average'
from employees
group by job_id;

select job_id, count(*)
from employees
group by job_id;

select job_id, count(*)
from employees
group by job_id
having job_id = 'IT_PROG';

select count(*) as 'n° managers'
from employees
where employee_id in (select distinct manager_id 
						from employees 
						where manager_id is not null);

select concat(first_name, ' ', last_name) as 'Name'
from employees
where employee_id not in (select distinct manager_id
							from employees
                            where manager_id is not null);
                            
select (max(salary) - min(salary)) as 'Salary Delta'
from employees;

select job_id, (max(salary) - min(salary)) as 'Salary Delta'
from employees
group by job_id
having (max(salary) - min(salary)) != 0;

select manager_id, (salary) as 'Minimum Salary'
from employees
where manager_id is not null
group by manager_id
having min(salary) >= 6000;
