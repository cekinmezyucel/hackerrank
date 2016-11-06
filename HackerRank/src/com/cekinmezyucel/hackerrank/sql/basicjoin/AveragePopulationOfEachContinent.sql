select co.CONTINENT, floor(avg(ci.population)) from city ci, country co
where ci.CountryCode = co.Code
group by co.CONTINENT;