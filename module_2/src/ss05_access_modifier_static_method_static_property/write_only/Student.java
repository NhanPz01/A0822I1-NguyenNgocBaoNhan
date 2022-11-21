package ss05_access_modifier_static_method_static_property.write_only;

public class Student {
    private String name;
    private String classes;

    public Student() {
        this.name = "John";
        this.classes = "CO2"
    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }
}
