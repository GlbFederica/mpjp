-- that one
select *
from regions
where region_id = 1;

-- the other ones
select *
from regions
where region_id != 2;

-- strictly less than
select *
from regions
where region_id < 3;

select *
from regions
where region_name < 'europe';
-- gli operatori valgono anche sulle stringhe, in questo caso li valuta in ordine alfabetico
-- SQL è case insensitive -> non distingue maiuscole e minoscole

-- less or equal to
select *
from regions
where region_id <= 3;
