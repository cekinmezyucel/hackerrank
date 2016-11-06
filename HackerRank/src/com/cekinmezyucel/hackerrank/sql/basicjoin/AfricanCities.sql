select ci.name from city ci, country co
where ci.CountryCode = co.Code
and co.CONTINENT = 'Africa';