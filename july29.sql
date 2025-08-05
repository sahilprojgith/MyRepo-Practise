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

-- sql joins --
SHOW TABLES;
describe teachers;
SHOW CREATE TABLE teachers;


create table results(
result_id INT PRIMARY KEY,
teachers_id INT,
salary INT,

foreign key (teachers_id) references teachers(id)
);

INSERT INTO results (result_id, teachers_id, salary) VALUES
(101, 1, 70000),
(102, 2, 72000),
(103, 3, 50000),
(104, 4, 51000),
(105, 5, 52000),
(106, 6, 90000),
(107, 7, 30000),
(108, 8, 40000),
(109, 9, 75000),
(110, 11, 62000);

select * from results;

-- inner join--

select t.name ,t.subject, r.salary
from teachers t
INNER JOIN results r
on t.id = r.teachers_id
order by r.salary desc;

-- All rows from the left table (even if there's no match),Matching rows from the right table --

select t.name ,t.subject,r.salary
from teachers t
left join results r
on  t.id = r.teachers_id;

-- example = which teachers haven't paid their salary--


INSERT INTO results (result_id, teachers_id, salary)
VALUES (111, 99, 65000);
commit;
SELECT * FROM results WHERE teachers_id = 111;
DELETE FROM results WHERE teachers_id IS NULL;
SHOW CREATE TABLE results;



select t.name ,t.subject,r.salary
from teachers t
right join results r
on t.id = r.teachers_id;

SELECT r.result_id, r.teachers_id, t.name, t.subject, r.salary
FROM teachers t
RIGHT JOIN results r
ON t.id = r.teachers_id;

-- Full join --

SELECT t.id AS teacher_id, t.name, t.subject, r.salary
FROM teachers t
LEFT JOIN results r ON t.id = r.teachers_id
UNION
SELECT t.id AS teacher_id, t.name, t.subject, r.salary
FROM teachers t
RIGHT JOIN results r ON t.id = r.teachers_id
order by teacher_id
;

















 







