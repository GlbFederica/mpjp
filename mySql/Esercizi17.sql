use me;

select *
from employees
where hire_date like '2005%';
-- la data è un int, io sto facendo un like che come secondo parametro ha una stringa -> sql fa in automatico un cast
-- in alternativa si può dire che cerchiamo quelli dove la data è compresa tra il 2005-01-01 e il 2005-12-31 ma per farlo dobbiamo fare le conversioni di date che ancora non abbiamo visto

select distinct job_id
from employees
order by 1;

select *
from employees
where commission_pct is not null;
-- where commission_pct > 0;
-- usare is not null è più sicuro perchè mi toglie solo i null, mentre con > 0 potrei non perdere gente a commissione 0 o negativa
-- questo dipende però da quello che sto effettivamente cercando, i commissione 0 li considero con commissione 
-- e quindi li voglio vedere oppure sono da considerare senza commissione?

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