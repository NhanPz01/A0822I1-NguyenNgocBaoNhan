create database QuanLySinhVien;
use QuanLySinhVien;
create table Class (
    ClassID   int not null auto_increment,
    ClassName varchar(60) not null,
    StartDate datetime not null,
    Status bit,
primary key (ClassID));

create table Student (
	StudentId int not null auto_increment,
    StudentName varchar(30) not null,
    Address varchar(50),
    Phone varchar(20),
    Status bit,
    ClassId int not null,
    foreign key (ClassId) references Class (ClassID),
primary key (StudentId));

create table Subject (
    SubId int not null auto_increment,
    SubName varchar(30) not null,
    Credit tinyint not null default 1 check ( Credit >= 1 ),
    Status bit default 1,
primary key (SubId));

create table Mark (
    MarkId int not null auto_increment,
    SubId int not null,
    StudentId int not null,
    Mark float default 0 check ( Mark between 0 and 100),
    ExamTimes tinyint default 1,
    unique (SubId, StudentId),
    foreign key (SubId) references Subject (SubId),
    foreign key (StudentId) references Student (StudentId),
primary key (MarkId));