-- CREATE
CREATE TABLE Products (
    product_id INT,
    product_name VARCHAR(50),
    price INT
);

-- ALTER
ALTER TABLE Products ADD email VARCHAR(50);
ALTER TABLE Products ADD phone VARCHAR(15);
ALTER TABLE Products ADD category VARCHAR(50);
ALTER TABLE Products DROP price;
ALTER TABLE Products RENAME COLUMN product_id TO pid;
ALTER TABLE Products RENAME COLUMN product_name TO pname;
ALTER TABLE Products MODIFY phone BIGINT;
ALTER TABLE Products MODIFY email TEXT;

-- INSERT

-- Method 1
INSERT INTO Products VALUES (1, 'Laptop', 'lap@gmail.com', 8000000001, 'Electronics');
INSERT INTO Products VALUES (2, 'Mobile', 'mob@gmail.com', 8000000002, 'Electronics');
INSERT INTO Products VALUES (3, 'Table', 'tab@gmail.com', 8000000003, 'Furniture');

-- Method 2
INSERT INTO Products (pid, pname, category) VALUES (4, 'Chair', 'Furniture');
INSERT INTO Products (pid, pname, category) VALUES (5, 'Fan', 'Electronics');
INSERT INTO Products (pid, pname, category) VALUES (6, 'Book', 'Stationery');

-- Method 3
INSERT INTO Products (pid, pname, email, phone, category)
VALUES
(7, 'Pen', 'p@gmail.com', 8111111111, 'Stationery'),
(8, 'Notebook', 'n@gmail.com', 8222222222, 'Stationery'),
(9, 'TV', 'tv@gmail.com', 8333333333, 'Electronics');

-- Method 4
INSERT INTO Products (pid, pname)
SELECT pid+10, pname FROM Products WHERE pid<=3;

-- Extra
INSERT INTO Products (pid, pname, category)
VALUES (13, 'Sofa', 'Furniture'),
       (14, 'Headphones', 'Electronics'),
       (15, 'Bottle', 'Stationery');

-- UPDATE
UPDATE Products
SET pname='Smartwatch',
    email='watch@gmail.com',
    phone=9999999999,
    category='Electronics'
WHERE pid=1;

-- DELETE
DELETE FROM Products WHERE pid=2;
DELETE FROM Products WHERE category='Stationery';
DELETE FROM Products;