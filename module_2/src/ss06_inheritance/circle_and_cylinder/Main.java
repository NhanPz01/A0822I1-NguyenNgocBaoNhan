package ss06_inheritance.circle_and_cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2.5, "red");
        Circle circle2 = new Circle(3.5, "yellow");
        Cylinder cylinder1 = new Cylinder(4.5, "yellow", 3);
        Cylinder cylinder2 = new Cylinder(5.5, "pink", 7.5);

        System.out.println("Radius of circle1 is : " + circle1.getRadius());
        System.out.println("Radius of circle2 is : " + circle2.getRadius());
        System.out.println("Area of circle1 is : " + circle1.getArea());
        System.out.println("Area of circle2 is : " + circle2.getArea());
        System.out.println("Volume of cylinder1 is : " + cylinder1.getVolume());
        System.out.println("Volume of cylinder2 is : " + cylinder2.getVolume());
    }
}
