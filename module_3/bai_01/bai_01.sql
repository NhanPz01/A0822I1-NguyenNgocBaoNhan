create database `student-management`;
use `student-management`;
CREATE TABLE Student (
    `id` INT NOT NULL,
    `name` VARCHAR(45) NULL,
    `age` INT NULL,
    `country` VARCHAR(45) NULL,
    PRIMARY KEY (`id`)
);

select * from Student;

create table Class (
	`id` int not null,
    `name` varchar(45) null,
primary key(`id`));

create table Teacher (
	`id` int not null,
    `name` varchar(45) null,
    `age` int null,
    `country` varchar(45) null,
primary key(`id`));