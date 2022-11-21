package ss05_access_modifier_static_method_static_property.access_modifier;

public class Circle {

    public static double PI = 3.14;
    double radius;
    String color;

    public Circle() { }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

        public double getArea() {
            return PI * Math.pow(radius, 2);
        }

}
