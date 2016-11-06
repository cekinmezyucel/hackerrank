select sum(ci.population) from city ci, country co
where ci.CountryCode = co.Code
and co.CONTINENT = 'Asia';