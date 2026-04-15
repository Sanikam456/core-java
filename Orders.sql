-- CREATE
CREATE TABLE Orders (
    order_id INT,
    customer_name VARCHAR(50),
    amount INT
);

-- ALTER
ALTER TABLE Orders ADD email VARCHAR(50);
ALTER TABLE Orders ADD phone VARCHAR(15);
ALTER TABLE Orders ADD status VARCHAR(50);
ALTER TABLE Orders DROP amount;
ALTER TABLE Orders RENAME COLUMN order_id TO oid;
ALTER TABLE Orders RENAME COLUMN customer_name TO cname;
ALTER TABLE Orders MODIFY phone BIGINT;
ALTER TABLE Orders MODIFY email TEXT;

-- INSERT

-- Method 1
INSERT INTO Orders VALUES (1, 'Ravi', 'ravi@gmail.com', 6000000001, 'Pending');
INSERT INTO Orders VALUES (2, 'Neha', 'neha@gmail.com', 6000000002, 'Shipped');
INSERT INTO Orders VALUES (3, 'Amit', 'amit@gmail.com', 6000000003, 'Delivered');

-- Method 2
INSERT INTO Orders (oid, cname, status) VALUES (4, 'Pooja', 'Pending');
INSERT INTO Orders (oid, cname, status) VALUES (5, 'Kiran', 'Shipped');
INSERT INTO Orders (oid, cname, status) VALUES (6, 'Sneha', 'Delivered');

-- Method 3
INSERT INTO Orders (oid, cname, email, phone, status)
VALUES
(7, 'Arjun', 'a@gmail.com', 6111111111, 'Pending'),
(8, 'Meena', 'm@gmail.com', 6222222222, 'Shipped'),
(9, 'Rohit', 'r@gmail.com', 6333333333, 'Delivered');

-- Method 4
INSERT INTO Orders (oid, cname)
SELECT oid+10, cname FROM Orders WHERE oid<=3;

-- Extra
INSERT INTO Orders (oid, cname, status)
VALUES (13, 'Divya', 'Pending'),
       (14, 'Varun', 'Shipped'),
       (15, 'Nikhil', 'Delivered');

-- UPDATE
UPDATE Orders
SET cname='Rahul',
    email='rahul@gmail.com',
    phone=9999999999,
    status='Completed'
WHERE oid=1;

-- DELETE
DELETE FROM Orders WHERE oid=2;
DELETE FROM Orders WHERE status='Delivered';
DELETE FROM Orders;