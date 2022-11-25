package ss05_access_modifier_static_method_static_property.write_only;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Nhan", "A0822I1");
        System.out.println(student1.getName() + " : " +student1.getClasses());
        System.out.println(student2.getName() + " : " +student2.getClasses());
        System.out.println(Student.numOfStudent);
    }
}
