SELECT distinct CITY FROM STATION
where SUBSTR(lower(CITY),-1,1) not in ('a','e','i','o','u') or SUBSTR(lower(CITY),1,1) not in ('a','e','i','o','u');