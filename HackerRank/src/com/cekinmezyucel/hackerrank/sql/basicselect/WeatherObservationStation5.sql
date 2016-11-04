SELECT * FROM(select * from(select CITY, length(CITY) from STATION
order by length(CITY) asc, CITY asc) 
where rownum <= 1
union
select * from(select CITY, length(CITY) from STATION
order by length(CITY) desc, CITY asc) 
where rownum <= 1)
order by length(CITY) asc;