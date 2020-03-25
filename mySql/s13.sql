-- simple pattern matching
select last_name
from employees
where last_name like '_ul%';
-- pattern matching -> individuo chi ha la caratteristica che segue il formato specificato dopo like
-- '_ul%' è un modo specifico di SQL per esprimere il pattern matching
-- _ vuol dire un (solo uno) carattere qualunque, % vuol dire tutti i caratteri che vuoi (nessuno, 1, 1000, infiniti)
-- in questo caso cerca tutti i cognomi che iniziano con un carattere qualsiasi, contengono ul e poi hanno o meno altri caratteri
-- posso mettere più underscore per indicare che cerco più underscore
-- esempio con '_ _ _' cerco tutti i nomi composti da 3 caratteri

-- interval check
select *
from regions
where region_id between 2 and 3;
-- between a differenza di java considera compresi entrambi gli estremi (intervallo chiuso sia a sx che a dx)
-- si può ovviamente negare where region_id not between 2 and 3;

select *
from countries
where country_name between 'a' and 'c';
-- in questo caso mi prende tutti i countries il cui nome alfabeticamente è tra a- e c- dove si intendono i singoli caratteri
-- vuol dire che prende a, ab, ac.... fino a bz ed eventualmente se ho qualcosa con scritto c e basta
-- nell'ordinare i char si basa sulla tabella ascii (UTF8)

-- check if (not) in a set
select *
from regions
where region_id not in (2, 3);
-- questo non è un intervallo, ma i singoli valori che vengono valutati

-- beware of null
select *
from regions
where region_id not in (2, 3, null);
-- qui il null distrugge la funzionalità 
-- il null in sql è gestito male, l'unico modo per gestirlo bene è usare l'operatore IS null

-- can't compare a 'good' value with null
select *
from regions
where region_id not in (null) or region_id in (null);

-- this works fine
select *
from employees
where commission_pct in (0.10);

-- this does select anything!
select *
from employees
where commission_pct in (null);

-- "is null" is the only way to check it
select *
from employees
where commission_pct is null;
