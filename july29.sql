use mydatabase;
select * from teachers;
SELECT * FROM teachers WHERE subject = 'Geography';
SELECT * FROM teachers WHERE age>21 and subject='Table Tennis';
select * from teachers where age=21 or age=41; 
select * from teachers where not subject="Pooki"; -- excludes subject=pooki--
-- sweet --
select * from teachers where age between 30 and 50; -- see this was tricky -- 
select * from teachers where subject in ('AI/ML','CSGO'); 
select * from teachers where name like 'S%'; -- starts with name S --
select * from teachers where name like '%m';
select * from teachers where name like '%bh%';
select * from teachers where subject is null; -- Finds rows with missing branch values --
select * from teachers order by age ASC;
select * from teachers order by age desc;
select distinct subject from teachers; --  Shows unique branches only (occuring once) --

select count(*) from teachers;
select avg(age) from teachers;
select min(age),max(age) from teachers;
select sum(age) from teachers;

SELECT subject, COUNT(*) AS total_teachers
FROM teachers
GROUP BY subject;

SELECT subject, MAX(age)
FROM teachers
GROUP BY subject;













 







