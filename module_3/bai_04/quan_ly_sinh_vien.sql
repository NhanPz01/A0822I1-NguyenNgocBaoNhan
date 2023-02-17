use QuanLySinhVien;

select * from Subject;
-- Cau 1
select * from Subject
having Credit >= all (select Credit from Subject);

select * from Mark;
-- Cau 2
select Subject.SubId, Subject.SubName, Subject.Credit, Subject.`Status`, Mark.Mark 
from Subject, Mark
where Subject.SubId = Mark.SubId
having Mark.Mark >= all (select Mark from Mark);

select * from Student;
select * from Mark;
-- Cau 3
select Student.StudentId, Student.StudentName, Student.Address, Student.Phone, Student.`Status`, Student.ClassId, avg(Mark.Mark) 
from Student  join Mark  on Student.StudentId = Mark.StudentId
group by Student.StudentId, Student.StudentName, Student.Address, Student.Phone, Student.`Status`, Student.ClassId
order by avg(Mark) desc;