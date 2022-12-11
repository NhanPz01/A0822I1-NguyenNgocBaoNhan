package ss00_demo;

import java.util.Comparator;

public class StudentSortById implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.id.compareTo(o2.id);
    }
}
