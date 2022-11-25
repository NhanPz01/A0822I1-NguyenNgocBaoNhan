package ss06_inheritance.circle_and_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() { }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        setRadius(radius);
        setColor(color);
        this.height = height;
    }

    public double getVolume() {
        return this.getArea() * this.height;
    }
}
