package ss00_demo;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        Student student1 = new Student("02", "Nhan1", "Da Nang 2");
        Student student2 = new Student("03", "Nhan2", "Da Nang 3");
        Student student3 = new Student("01", "Nhan3", "Da Nang 1");
        students.add(student1);
        students.add(student2);
        students.add(student3);
        for (Student student : students) {
            System.out.println(student);
        }
//        students.sort(new StudentSortById());
        Collections.sort(students, new StudentSortById());
        System.out.println("---------sorted by id-----------");
        for (Student student : students) {
            System.out.println(student);
        }
        students.sort(new StudentSortByName());
        System.out.println("---------sorted by name-----------");
        for (Student student : students) {
            System.out.println(student);
        }
        students.sort(new StudentSortByAddress());
        System.out.println("---------sorted by address-----------");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}