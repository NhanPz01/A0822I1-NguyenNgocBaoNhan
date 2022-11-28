package ss4_class_and_object.quadratic_equation;

public class QuadraticEquation {
    double a, b, c;

    QuadraticEquation() {
        this.a = 1.0;
        this.b = 0.0;
        this.c = 0.0;
    }

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double value) {
        this.a = value;
    }

    public void setB(double value) {
        this.b = value;
    }

    public void setC(double value) {
        this.c = value;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        if (a == 0) {
            return -1;
        } else {
            return (Math.pow(b, 2) - 4 * a * c);
        }
    }

    public double getRoot1(double delta) {
        if (delta < 0) {
            return 0;
        } else {
            return ((-b + Math.sqrt(delta)) / (2 * a));
        }
    }

    public double getRoot2(double delta) {
        if (delta < 0) {
            return 0;
        } else {
            return ((-b - Math.sqrt(delta)) / (2 * a));
        }
    }
}
