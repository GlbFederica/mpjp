use me;

-- a select
select region_name
from regions
where region_id = 1;
-- seleziona il region name in corrispondenza della PrimaryKey 1
-- in sql il singolo uguale è il confronto, non l'assegnamento


-- select all
select * 
from regions;
-- seleziona tutto ciò che c'è in regions


show schemas;

-- select distinct
select distinct manager_id
from employees;
-- con select distinct mi fa vedere quali manager_id ci sono nella tabella employees.
-- prende i manager_id e me li fa vedere, senza considerare eventuali duplicati

-- select with change on results
select job_title, min_salary, min_salary + 2000, min_salary * 3 + 1000
from jobs;

-- alias
select job_title, min_salary as original, min_salary salary from jobs;
-- as può anche essere omesso
select job_title, min_salary + 2000 'increased min salary' from jobs;

-- dual
select current_date from dual;
select 1+2, 3-4, 2*6, 5/2, current_date;

-- concatenation
select concat(country_id, '...', region_id, '!' )
-- concat mi concatena quello che c'è tra le (). in questo caso mi mette country_ id + ... + region_id + !
from countries;

-- limit to get result set with a specified size
select first_name, last_name
from employees limit 1;
-- limit mi permette di stampare un numero di elementi dalla tabella pari al numero che ci metto dopo (limitare il risultato -> quanti me voglio vedere)
