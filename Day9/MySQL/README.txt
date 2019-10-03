We would like to store employee and their address details in a table.


Single Table (Employee)
0.Employee ID (Primary Key)
1.Firstname
2.Lastname
3.Date of joining
4.Designation
5.Department
6.Date of birth

1.Door No
2. Street
3.City
4.Country
5.Zipcode 

Primary Key is a field/attribute that helps retrieving a unique record out of the table
-every employee will have a unique employee id
-primary key is a mandatory field for every employee record
-typically primary key can't be null or empty

Jeganathan Swaminathan 01/01/2019 Software Engineer	Software	10/10/xxxx	100	SomeStreet Limassol 


To avoid duplication of information, we would like to split the single table into two tables.
	1.Employee
	2.Address

Employee Table

0.Employee ID (Primary Key) (int)
1.Firstname VARCHAR(50)
2.Lastname VARCHAR (50)
3.Date of joining DateTime
4.Designation VARCHAR(50)
5.Department VARCHAR (50)
6.Date of birth DateTime

Address Table
0.Employee ID (Foreign Key) int
1.Address ID (Primary Key) int
2.Door No VARCHAR(5)
3.Street  VARCHAR(50)
4.City    VARCHAR(100)
5.Country VARCHAR(100)
6.Zipcode VARCHAR(10)


SQL -Structured Query Language
    - An english like language with which you will be able to manipulate or retrieve data from table


SQL Statements
	1. DDL Data DEfinition Language (CREATE, ALTER, DROP, DELETEi)
	2. DML Data Manipulation Language ( SELECT, INSERT, ETC ...)
