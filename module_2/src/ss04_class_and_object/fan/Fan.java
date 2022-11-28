package ss4_class_and_object.fan;

public class Fan {

    public final int SLOW = 1;
    public final int MEDIUM = 2;
    public final int FAST = 3;

    int speed;
    boolean on;
    double radius;
    String color;

    Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5.0;
        this.color = "blue";
    }

    Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (this.on) {
            return "Fan is on, speed : " + this.speed + ", color : " + this.color + ", radius : " + this.radius;
        } else {
            return "Fan is off,  color : " + this.color + ", radius : " + this.radius;
        }
    }

}
