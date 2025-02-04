#database name CUSAT 
#given on january 16 th 2025
#need to create employees and departments table.
#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
create database cusat;

use cusat;

create table Departments(DeptID int auto_increment primary key, DeptName varchar(50), ManagerID int);

create table Employees (EmpID int auto_increment primary key, EmpName varchar(50),Salary decimal(10,2),DeptID int, constraint dep_1224 foreign key (DeptID) references
Departments(DeptID));



insert into Departments(DeptName,ManagerID)values("MCA",1),("AI",2),("DS",3),("CS",4),("DA",5);

create table Employees (EmpID int auto_increment primary key, EmpName varchar(50),Salary decimal(10,2),DeptID int, constraint dep_1224 foreign key (DeptID) referencess
Departments(DeptID));


insert into Employees(EmpName,Salary,DeptID)values("Rakul",45000.45,1),("Kokul",65000.75,2),("Arun",75000.75,3),("Mohit Randi",90000.65,4),("Dilx",98000.65,1);

#second paper
1. select e.name,d.name from employees e join departments d on e.DeptID=d.DeptID;
2. select e.name, p.pName from employees e join project p on e.pID=p.pID;
3. select e.name,d.name from employees e right join department d on e.dID=d.dID;
4.  select * from employees e join department d on e.dID=d.dID union select * from department d join employees e on e.dID=d.dID;
5. SELECT e1.eID AS Employee1_ID,e1.name AS Employee1_Name,e2.eID AS Employee2_ID,e2.name AS Employee2_Name,e1.dID AS DepartmentID FROM employees e1 JOIN employees e2 ON e1.dID = e2.dID AND e1.eID < e2.eID ;
6. select * from employees e cross join projects p ;




8


+------------------+
| Tables_in_class8 |
+------------------+
| Enrolled         |
| Faculty          |
| class            |
| student          |
+------------------+



mysql> describe Enrolled;
+-------+-------------+------+-----+---------+-------+
| Field | Type        | Null | Key | Default | Extra |
+-------+-------------+------+-----+---------+-------+
| snum  | int         | YES  | MUL | NULL    |       |
| cname | varchar(50) | YES  |     | NULL    |       |
+-------+-------------+------+-----+---------+-------+

mysql> describe Faculty;
+--------+-------------+------+-----+---------+-------+
| Field  | Type        | Null | Key | Default | Extra |
+--------+-------------+------+-----+---------+-------+
| fid    | int         | YES  |     | NULL    |       |
| fname  | varchar(50) | YES  |     | NULL    |       |
| deptid | int         | YES  |     | NULL    |       |
+--------+-------------+------+-----+---------+-------+


mysql> describe student;
+-------+-------------+------+-----+---------+----------------+
| Field | Type        | Null | Key | Default | Extra          |
+-------+-------------+------+-----+---------+----------------+
| snum  | int         | NO   | PRI | NULL    | auto_increment |
| sname | varchar(50) | YES  |     | NULL    |                |
| major | varchar(50) | YES  |     | NULL    |                |
| level | varchar(50) | YES  |     | NULL    |                |
| age   | int         | YES  |     | NULL    |                |
+-------+-------------+------+-----+---------+----------------+


mysql> describe class;
+----------+-------------+------+-----+---------+-------+
| Field    | Type        | Null | Key | Default | Extra |
+----------+-------------+------+-----+---------+-------+
| name     | varchar(50) | YES  |     | NULL    |       |
| meets_at | time        | YES  |     | NULL    |       |
| room     | varchar(50) | YES  |     | NULL    |       |
| fid      | int         | YES  |     | NULL    |       |
+----------+-------------+------+-----+---------+-------+






mysql> select * from student;
+------+---------------+------------------------+-----------+------+
| snum | sname         | major                  | level     | age  |
+------+---------------+------------------------+-----------+------+
|    1 | Alice Johnson | Computer Science       | Freshman  |   18 |
|    2 | Bob Smith     | Mechanical Engineering | Sophomore |   19 |
|    3 | Charlie Brown | Physics                | Junior    |   20 |
|    4 | Dana White    | Biology                | Senior    |   21 |
|    5 | Eva Green     | Chemistry              | Junior    |   20 |
+------+---------------+------------------------+-----------+------+

mysql> select * from class;
+-----------------------------+----------+----------+------+
| name                        | meets_at | room     | fid  |
+-----------------------------+----------+----------+------+
| Introduction to Programming | 09:00:00 | Room 101 |    1 |
| Philosophy 101              | 11:00:00 | Room 203 |    2 |
| Biology Basics              | 14:00:00 | Room 305 |    3 |
| Advanced Chemistry          | 16:00:00 | Room 402 |    4 |
| Medical Ethics              | 10:30:00 | Room 150 |    5 |
+-----------------------------+----------+----------+------+

mysql> select * from Faculty;
+------+-------------+--------+
| fid  | fname       | deptid |
+------+-------------+--------+
|    1 | Engineering |    101 |
|    2 | Arts        |    102 |
|    3 | Science     |    103 |
|    4 | Law         |    104 |
|    5 | Medical     |    105 |
+------+-------------+--------+

mysql> select * from Enrolled;
+------+-----------------------------+
| snum | cname                       |
+------+-----------------------------+
|    1 | Introduction to Programming |
|    2 | Organic Chemistry           |
|    3 | World History               |
|    4 | Medical Ethics              |
|    5 | Data Structures             |
|    1 | Philosophy 101              |
|    2 | Advanced Chemistry          |
|    3 | Biology Basics              |
|    4 | Psychology 101              |
|    5 | Medical Terminology         |
+------+-----------------------------+


#########question number : 10.################

1. #Create the publisher table first

CREATE TABLE publisher (
    pname VARCHAR(50) PRIMARY KEY, 
    address VARCHAR(50), 
    phone VARCHAR(20)
);

2. #Create the library program table

CREATE TABLE lib_prg (
    prg_id INT PRIMARY KEY, 
    prgname VARCHAR(40), 
    address VARCHAR(50)
);

3. #Create the book table

CREATE TABLE book (
    book_id INT AUTO_INCREMENT PRIMARY KEY,
    pname VARCHAR(50),
    pub_year DATE,
    CONSTRAINT adk_1234 FOREIGN KEY(pname) REFERENCES publisher(pname)
);

4. #Create the book_auth table

CREATE TABLE book_auth (
    book_id INT PRIMARY KEY, 
    authname VARCHAR(50),
    CONSTRAINT adk_123 FOREIGN KEY(book_id) REFERENCES book(book_id)
);

5. #Create the book_copies table

CREATE TABLE book_copies (
    book_id INT, 
    prg_id INT, 
    nocopies INT,
    CONSTRAINT adk_098 FOREIGN KEY(book_id) REFERENCES book(book_id),
    CONSTRAINT abc_34 FOREIGN KEY(prg_id) REFERENCES lib_prg(prg_id)
);

6. #Create the book_lending table

CREATE TABLE book_lending (
    book_id INT, 
    prg_id INT, 
    cardno INT,
    date_out DATE, 
    due_date DATE,
    CONSTRAINT adk_08 FOREIGN KEY(book_id) REFERENCES book(book_id),
    CONSTRAINT abc_345 FOREIGN KEY(prg_id) REFERENCES lib_prg(prg_id)
);


INSERT INTO publisher (pname, address, phone) VALUES
('peng', 'New York, NY', '123-456-7890'),
('harp', 'London, UK', '234-567-8901'),
('simon', 'Los Angeles, CA', '345-678-9012'),
('mac', 'San Francisco, CA', '456-789-0123'),
('rand', 'Boston, MA', '567-890-1234');


INSERT INTO lib_prg (prg_id, prgname, address) VALUES
(1, 'Library A', '123 Main St, NY'),
(2, 'Library B', '456 Oak Rd, CA'),
(3, 'Library C', '789 Pine Blvd, TX'),
(4, 'Library D', '101 Maple Ave, FL'),
(5, 'Library E', '202 Birch Ln, IL');


INSERT INTO book (pname, pub_year) VALUES
('peng', '2020-01-01'),
('harp', '2019-05-15'),
('simon', '2021-03-10'),
('mac', '2018-07-22'),
('rand', '2022-09-30'),
('peng', '2023-02-15');


INSERT INTO book_auth (book_id, authname) VALUES
(1, 'John Doe'),
(2, 'Jane Smith'),
(3, 'Robert Brown'),
(4, 'Emily White'),
(5, 'Michael Johnson'),
(6, 'Sarah Lee'),
(1, 'Chris Green');


INSERT INTO book_copies (book_id, prg_id, nocopies) VALUES
(1, 1, 10),
(2, 2, 5),
(3, 3, 8),
(4, 4, 12),
(5, 5, 6),
(6, 1, 15);


INSERT INTO book_lending (book_id, prg_id, cardno, date_out, due_date) VALUES
(1, 1, 101, '2023-01-15', '2023-02-15'),
(2, 2, 102, '2023-02-01', '2023-03-01'),
(3, 3, 103, '2023-01-10', '2023-02-10'),
(4, 4, 104, '2023-01-20', '2023-02-20'),
(5, 5, 105, '2023-02-05', '2023-03-05'),
(6, 1, 106, '2023-02-10', '2023-03-10');




INSERT INTO book_lending (book_id, prg_id, cardno, date_out, due_date) VALUES
(1, 2, 101, '2023-03-01', '2023-04-01'),
(2, 3, 102, '2023-03-05', '2023-04-05'),
(3, 4, 103, '2023-03-10', '2023-04-10'),
(4, 5, 104, '2023-03-15', '2023-04-15'),
(5, 1, 105, '2023-03-20', '2023-04-20'),
(6 , 2, 106, '2023-03-25', '2023-04-25');



describe book;         
describe book_auth;     
describe book_copies; 
describe book_lending;    
describe lib_prg;         
describe publisher; 

SELECT b.title, p.pname, a.authname, c.nocopies
FROM book b
JOIN publisher p ON b.pname = p.pname
JOIN book_auth a ON a.book_id = b.book_id
JOIN book_copies c ON c.book_id = b.book_id;



SELECT cardno, COUNT(*)   
FROM book_lending  
WHERE date_out >= '2023-01-15' and date_out<='2023-03-01' 
GROUP BY cardno  
HAVING COUNT(*) >= 3;


view-source:https://chatgpt.com/



