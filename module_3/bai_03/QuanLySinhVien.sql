use QuanLySinhVien;
select * from Class;
insert into Class
values (1, 'A1', '2008-12-20', 1),
	   (2, 'A2', '2008-12-22', 1),
       (3, 'B3', current_date(), 0);
      
select * from Student;
insert into Student 
values (1, 'Hung', 'Ha noi', 0912113113, 1, 1),
	   (2, 'Hoa', 'Hai phong', '0123123123', 1, 1),
       (3, 'Manh', 'HCM', '0123123123', 0, 2);
       
select * from Subject;
insert into Subject
values (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);
       
select * from Mark;
insert into Mark (SubId, StudentId, Mark, ExamTimes)
values (1, 1, 8, 1),
       (1, 2, 10, 2),
       (2, 1, 12, 1);

select * from Student
where StudentName like 'h%';

select * from Class
where StartDate > '2008-12-01' and StartDate < '2008-12-31';

select * from Subject
where Credit in (3, 5);

update Student
set ClassID = 2
where StudentName = 'Hung';

select StudentName, SubName, Mark from Student, Subject, Mark
order by Mark.Mark desc, Student.StudentName asc;