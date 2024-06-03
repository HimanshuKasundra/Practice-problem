create database Apttitude
use Apttitude

--1. Write a Query to retrieve all the databases in SQL Server.
	select name from sys.databases

--2. Write a Query to Display Text of a Stored Procedure, Trigger, or View in SQL Server.
	sp_helptext PR_Country_SelectAll

--3. Write a Query to find size of Database Table in SQL Server
	exec sp_spaceused LOC_Country

--4. Write a Query to list Primary Key and Foreign Key for a parJcular table in SQL Server.
--doubt
	SELECT COLUMN_NAME, CONSTRAINT_NAME 
	FROM INFORMATION_SCHEMA.KEY_COLUMN_USAGE
    WHERE TABLE_NAME = 'LOC_State'

--5. Write a Query to Get the version name of SQL Server.
	select @@version

--6. Write a Query to Get current Language of SQL Server.
	select @@language

--7. Write a Query to Return Server Name of SQL Server.
	select @@SERVERNAME

--8. Write a Query to disable and enable All Trigger of a table in SQL Server.
	-- Disable Triggers
	DISABLE TRIGGER ALL ON LOC_Country

	-- Enable Triggers
	Enable TRIGGER ALL ON LOC_Country

--9. Write a Query to get all the table that don’t have Primary Key.
--doubt
	SELECT table_name
    FROM INFORMATION_SCHEMA.TABLES
    WHERE TABLE_TYPE = 'BASE TABLE'
    AND TABLE_NAME NOT IN 
	(
         SELECT TABLE_NAME
         FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS
         WHERE CONSTRAINT_TYPE = 'PRIMARY KEY'
    )

--10. Write a Query to get First Date of Current Month.
	 SELECT DATEADD(MONTH, DATEDIFF(MONTH, 0, GETDATE()), 0) AS FirstDateOfCurrentMonth;
	 select DATEDIFF(month, 0, GETDATE())


-- Department ( DepartmentID Int Primary Key, DepartmentName Varchar (100) Not Null Unique )
-- Employee ( EmployeeID Int Primary Key, FirstName Varchar (50) Not Null, LastName Varchar (50) Not 
-- Null, Age Int Not Null, DepartmentID Int Null Foreign Key )

create table Department
(
	DepartmentID Int Primary Key,
	DepartmentName Varchar (100) Not Null Unique
)

create table Employee
(
	EmployeeID Int Primary Key, 
	FirstName Varchar (50) Not Null, 
	LastName Varchar (50) Not Null,
	Age Int Not Null, 
	DepartmentID Int Null Foreign Key References Department(DepartmentID) 
)

--1. Create a simple view BasicEmpInfo that displays informaJon of employees including EmployeeID, 
--   FirstName, LastName and Age.
	create view BasicEmpInfo
	as select EmployeeID, FirstName, LastName, Age from Employee
	 
--2. Create a complex view that shows the department wise employee count.
	create view DepartmentWiseEmployeeCount
	as
	select d.departmentname, count(e.employeeid) as count from department d
	left outer join employee e on d.DepartmentID=e.DepartmentID
	group by d.DepartmentName

--3. Create a stored procedure that retrieves employee informaJon based on the department name.
   create procedure PR_Employee_ByDepartmentName
   @departmentname varchar(100)
   as
   select e.employeeid,e.firstname,e.lastname,e.age,e.departmentid,d.departmentname
   from employee e inner join department d
   on e.DepartmentID=d.DepartmentID
   where departmentname=@departmentname

   exec PR_Employee_ByDepartmentName computer

--4. Create a scalar-valued funcJon that calculates the average age of employees in a specific department.


--5. Create a table-valued funcJon that retrieves all employees from a specific department.


--6. Create a complex view that shows the employees informaJon along with their age whose 
--department is IT and age is more than 25.
	create view employee6
	as
	select e.employeeid,e.firstname,e.lastname,e.age,e.departmentid,d.departmentname
    from employee e inner join department d
    on e.DepartmentID=d.DepartmentID
    where departmentname='IT' and age>25 

	select * from employee6

--7. Create a stored procedure that displays informaJon of top 3 employee with their department name.
	create procedure PR_Top3_Employee
    as
    select  top 3 e.employeeid,e.firstname,e.lastname,e.age,e.departmentid,d.departmentname
    from employee e inner join department d
    on e.DepartmentID=d.DepartmentID
   

--8. Create scalar-valued funcJon that counts total number of employees works in IT department.
--9. Create table-valued funcJon that shows employees whose name start with A to R and department 
--name is HR.

--10. Create a complex view that displays employee count having no department.
 alter view EmployeeNoDepartment
 as
 select count(EmployeeID)  as count from employee where DepartmentId is null
 
 select * from EmployeeNoDepartment