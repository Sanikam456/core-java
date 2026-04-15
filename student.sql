-- CREATE
CREATE TABLE Students (
    student_id INT,
    student_name VARCHAR(50),
    marks INT
);

-- ALTER
ALTER TABLE Students ADD email VARCHAR(50);
ALTER TABLE Students ADD phone VARCHAR(15);
ALTER TABLE Students ADD course VARCHAR(50);
ALTER TABLE Students DROP marks;
ALTER TABLE Students RENAME COLUMN student_id TO sid;
ALTER TABLE Students RENAME COLUMN student_name TO sname;
ALTER TABLE Students MODIFY phone BIGINT;
ALTER TABLE Students MODIFY email TEXT;

-- INSERT

-- Method 1
INSERT INTO Students VALUES (1, 'Arun', 'arun@gmail.com', 9011111111, 'BCA');
INSERT INTO Students VALUES (2, 'Divya', 'divya@gmail.com', 9022222222, 'BBA');
INSERT INTO Students VALUES (3, 'Kiran', 'kiran@gmail.com', 9033333333, 'BCom');

-- Method 2
INSERT INTO Students (sid, sname, course) VALUES (4, 'Megha', 'BCA');
INSERT INTO Students (sid, sname, course) VALUES (5, 'Rohit', 'BBA');
INSERT INTO Students (sid, sname, course) VALUES (6, 'Sneha', 'BCom');

-- Method 3
INSERT INTO Students (sid, sname, email, phone, course)
VALUES
(7, 'Vijay', 'v@gmail.com', 9111111111, 'BCA'),
(8, 'Anjali', 'a@gmail.com', 9222222222, 'BBA'),
(9, 'Pooja', 'p@gmail.com', 9333333333, 'BCom');

-- Method 4
INSERT INTO Students (sid, sname)
SELECT sid+10, sname FROM Students WHERE sid<=3;

-- Extra
INSERT INTO Students (sid, sname, course)
VALUES (13, 'Naveen', 'BCA'),
       (14, 'Kavya', 'BBA'),
       (15, 'Suresh', 'BCom');

-- UPDATE
UPDATE Students
SET sname='Rahul',
    email='rahul@gmail.com',
    phone=9999999999,
    course='MCA'
WHERE sid=1;

-- DELETE
DELETE FROM Students WHERE sid=2;
DELETE FROM Students WHERE course='BCom';
DELETE FROM Students;