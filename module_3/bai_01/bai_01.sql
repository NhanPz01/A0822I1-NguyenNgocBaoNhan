create database `student-management`;
use `student-management`;
create table Student (
	`id` int not null,
    `name` varchar(45) null,
    `age` int null,
    `country` varchar(45) null,
primary key(`id`));

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