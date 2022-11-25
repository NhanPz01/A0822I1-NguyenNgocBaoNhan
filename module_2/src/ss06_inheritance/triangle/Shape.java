package ss06_inheritance.triangle;

public class Shape {
    protected double side = 1.0;
    protected String color = "black";

    public Shape(double side, String color) {
        this.side = side;
        this.color = color;
    }

    public Shape(String color) {
        this.color = color;
    }

    public Shape() { }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "(" + side + ")" + ", " + "color : " + color;
    }
}
