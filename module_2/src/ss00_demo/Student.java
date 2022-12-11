package ss00_demo;

import java.util.Comparator;

public class Student {
    String id;
    String name;
    String address;

    public Student(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "ID : " + this.id + " | " +
                "Name : " + this.name + " | " +
                "Address : " + this.address;
    }
}
