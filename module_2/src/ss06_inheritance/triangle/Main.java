package ss06_inheritance.triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape1 = new Triangle(3, 4, 5);
        Shape shape2 = new Triangle(6, 8, 10);
        System.out.println("triangle1 -> " + shape1.toString());
        System.out.println("triangle2 -> " + shape2.toString());
        ((Triangle) shape1).setColor("blue");
        ((Triangle) shape2).setColor("yellow");
        System.out.println("triangle1 -> " + ((Triangle)shape1).toString());
        System.out.println("triangle2 -> " + ((Triangle)shape2).toString());
    }
}
