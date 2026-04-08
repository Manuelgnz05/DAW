insert into customers (CustomerID, CompanyName, City, Country) 
values ('Jorge', 'Vedruna', 'Seville', 'Spain');

insert into employees (LastName, FirstName) values ('Ocaña', 'Alejandro'), ('Nuñez', 'Marcos'), ('Camargo', 'Samuel');
insert into employees (LastName, FirstName) 
select LastName, FirstName from employees
where EmployeeID>=5 and EmployeeID<=9;
delete from employees where employeeID>9;
delete from customers where CustomerID = 'Jorge';

update customers set contactName = 'Juan', 
city = 'Frankfurt' where customerID = 'ALFKI';