drop database if exists movies;
create database if not exists movies;
use movies;

create table if not exists Movies(
	Code int primary key,
    Title varchar(255) not null,
    Rating varchar(255)
);

create table if not exists  MovieTheaters(
	Code int primary key,
    Name varchar(255) not null,
    Movie int, 
    foreign key(Movie) references Movies(Code)
);

INSERT INTO Movies (Code, Title, Rating) VALUES
(1, 'Oppenheimer', 'PG-13'),
(2, 'Dune: Part Two', 'PG-13'),
(3, 'Barbie', 'PG-13'),
(4, 'Spider-Man: No Way Home', 'PG-13'),
(5, 'Top Gun: Maverick', 'PG-13');

INSERT INTO MovieTheaters (Code, Name, Movie) VALUES
(101, 'Yelmo Cines Nervión', 1),
(102, 'Kinépolis Sevilla', 2),
(103, 'Yelmo Cines Nervión', 3),
(104, 'Kinépolis Sevilla', 4),
(105, 'Metropolis Cinemas', 5),
(106, 'Yelmo Cines Nervión', 2);
