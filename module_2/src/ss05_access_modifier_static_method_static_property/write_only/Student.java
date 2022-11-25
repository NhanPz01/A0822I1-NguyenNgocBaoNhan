package ss05_access_modifier_static_method_static_property.write_only;

public class Student {
    private String name;
    private String classes;
    public static int numOfStudent;

    public Student() {
        this.name = "John";
        this.classes = "C02";
        ++numOfStudent;
    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
        ++numOfStudent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }


}
