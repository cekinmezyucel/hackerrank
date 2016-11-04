SELECT name FROM STUDENTS
where marks>75
order by substr(name,-3,3) asc, id asc;