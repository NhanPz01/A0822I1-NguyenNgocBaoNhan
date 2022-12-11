package ss00_demo;

import java.util.Comparator;

public class StudentSortByAddress implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.address.compareTo(o2.address);
    }
}
