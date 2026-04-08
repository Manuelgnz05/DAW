select * from employees where city="London";
select * from employees where city!="London";
select * from employees where EmployeeID < 7;
select * from employees where city in ("London", "Tacoma", "Seville");
select * from employees where city not in ("London", "Tacoma", "Seville");
select * from employees where EmployeeID between 1 and 8;
select * from employees where EmployeeID not between 1 and 8;
select * from employees where FirstName like "Margaret";
select * from employees where FirstName like "A%"; -- Devulve los nombres que empiezen por A
select * from employees where FirstName like "%A"; -- Devulve los nombres que acaban por A
select * from employees where FirstName like "A%e"; -- Devulve los nombres que empiezan por A y acaban por e
select * from employees where photo is null; 
select * from employees where photo is not null; 

-- Empleados cuyo nombre empiza por A y tiene un id empleado menor que 6
select * from employees where firstname like "A%";
select * from employees where firstname like "A%" and EmployeeID<6;
select * from employees where firstname like "A%" or EmployeeID<6;


select * from employees where not (firstname like "A%");

-- Mostrar los productos que pertenecen a la categoría 2
select * from products where CategoryID = 2;


select * from products where (CategoryID = 2) or (CategoryID = 3) or (CategoryID = 4);





