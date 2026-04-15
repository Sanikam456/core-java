-- CREATE
CREATE TABLE Employees (
    emp_id INT,
    emp_name VARCHAR(50),
    salary INT
);

-- ALTER
ALTER TABLE Employees ADD email VARCHAR(50);
ALTER TABLE Employees ADD phone VARCHAR(15);
ALTER TABLE Employees ADD department VARCHAR(50);
ALTER TABLE Employees DROP salary;
ALTER TABLE Employees RENAME COLUMN emp_id TO eid;
ALTER TABLE Employees RENAME COLUMN emp_name TO ename;
ALTER TABLE Employees MODIFY phone BIGINT;
ALTER TABLE Employees MODIFY email TEXT;

-- INSERT (Multiple Methods)

-- Method 1
INSERT INTO Employees VALUES (1, 'Amit', 'amit@gmail.com', 8888888881, 'HR');
INSERT INTO Employees VALUES (2, 'Priya', 'priya@gmail.com', 8888888882, 'IT');
INSERT INTO Employees VALUES (3, 'Suresh', 'suresh@gmail.com', 8888888883, 'Finance');

-- Method 2
INSERT INTO Employees (eid, ename, department) VALUES (4, 'Kavya', 'HR');
INSERT INTO Employees (eid, ename, department) VALUES (5, 'Manoj', 'IT');
INSERT INTO Employees (eid, ename, department) VALUES (6, 'Divya', 'Finance');

-- Method 3
INSERT INTO Employees (eid, ename, email, phone, department)
VALUES
(7, 'Ramesh', 'r@gmail.com', 9111111111, 'HR'),
(8, 'Anita', 'a@gmail.com', 9222222222, 'IT'),
(9, 'Vikas', 'v@gmail.com', 9333333333, 'Finance');

-- Method 4
INSERT INTO Employees (eid, ename)
SELECT eid+10, ename FROM Employees WHERE eid<=3;

-- Extra
INSERT INTO Employees (eid, ename, department)
VALUES (13, 'Lakshmi', 'HR'),
       (14, 'Karthik', 'IT'),
       (15, 'Naveen', 'Finance');

-- UPDATE
UPDATE Employees
SET ename='Arun',
    email='arun@gmail.com',
    phone=9999999999,
    department='Admin'
WHERE eid=1;

-- DELETE
DELETE FROM Employees WHERE eid=2;
DELETE FROM Employees WHERE department='Finance';
DELETE FROM Employees; 