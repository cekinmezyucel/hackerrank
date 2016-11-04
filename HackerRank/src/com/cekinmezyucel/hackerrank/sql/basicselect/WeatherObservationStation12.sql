SELECT distinct CITY FROM STATION
where SUBSTR(lower(CITY),-1,1) not in ('a','e','i','o','u') 
and SUBSTR(lower(CITY),1,1) not in ('a','e','i','o','u');