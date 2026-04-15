-- CREATE
CREATE TABLE Courses (
    course_id INT,
    course_name VARCHAR(50),
    duration INT
);

-- ALTER
ALTER TABLE Courses ADD email VARCHAR(50);
ALTER TABLE Courses ADD phone VARCHAR(15);
ALTER TABLE Courses ADD instructor VARCHAR(50);
ALTER TABLE Courses DROP duration;
ALTER TABLE Courses RENAME COLUMN course_id TO cid;
ALTER TABLE Courses RENAME COLUMN course_name TO cname;
ALTER TABLE Courses MODIFY phone BIGINT;
ALTER TABLE Courses MODIFY email TEXT;

-- INSERT

-- Method 1
INSERT INTO Courses VALUES (1, 'Python', 'py@gmail.com', 7000000001, 'Ramesh');
INSERT INTO Courses VALUES (2, 'Java', 'java@gmail.com', 7000000002, 'Suresh');
INSERT INTO Courses VALUES (3, 'SQL', 'sql@gmail.com', 7000000003, 'Anita');

-- Method 2
INSERT INTO Courses (cid, cname, instructor) VALUES (4, 'C++', 'Kiran');
INSERT INTO Courses (cid, cname, instructor) VALUES (5, 'HTML', 'Meena');
INSERT INTO Courses (cid, cname, instructor) VALUES (6, 'CSS', 'Arun');

-- Method 3
INSERT INTO Courses (cid, cname, email, phone, instructor)
VALUES
(7, 'JavaScript', 'js@gmail.com', 7111111111, 'Rahul'),
(8, 'React', 'react@gmail.com', 7222222222, 'Priya'),
(9, 'NodeJS', 'node@gmail.com', 7333333333, 'Vikas');

-- Method 4
INSERT INTO Courses (cid, cname)
SELECT cid+10, cname FROM Courses WHERE cid<=3;

-- Extra
INSERT INTO Courses (cid, cname, instructor)
VALUES (13, 'Django', 'Kavya'),
       (14, 'Spring', 'Manoj'),
       (15, 'Bootstrap', 'Divya');

-- UPDATE
UPDATE Courses
SET cname='Full Stack',
    email='fullstack@gmail.com',
    phone=9999999999,
    instructor='Arjun'
WHERE cid=1;

-- DELETE
DELETE FROM Courses WHERE cid=2;
DELETE FROM Courses WHERE instructor='Vikas';
DELETE FROM Courses;