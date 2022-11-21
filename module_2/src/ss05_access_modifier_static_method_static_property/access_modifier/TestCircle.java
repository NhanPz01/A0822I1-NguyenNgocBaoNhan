package ss05_access_modifier_static_method_static_property.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2.0, "blue");
        Circle circle2 = new Circle(5.0, "yellow");
        System.out.println(circle1.getArea());
        System.out.println(circle1.getRadius());
        System.out.println(circle2.getArea());
        System.out.println(circle2.getRadius());
    }
}
