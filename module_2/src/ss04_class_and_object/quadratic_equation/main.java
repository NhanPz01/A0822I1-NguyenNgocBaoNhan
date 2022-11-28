package ss4_class_and_object.quadratic_equation;

import ss4_class_and_object.quadratic_equation.QuadraticEquation;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.println("Enter a, b, c: ");
        System.out.print("a = ");
        a = Double.parseDouble(scanner.nextLine());
        System.out.print("b = ");
        b = Double.parseDouble(scanner.nextLine());
        System.out.print("c = ");
        c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation f = new QuadraticEquation(a, b, c);
        if (f.getDiscriminant() > 0) {
            System.out.println("The equation has two roots");
            System.out.print("First root = " + f.getRoot1(f.getDiscriminant()) + "\t");
            System.out.print("Second root = " + f.getRoot2(f.getDiscriminant()) + "\t");
        } else if (f.getDiscriminant() == 0) {
            System.out.println("The equation has duplicate root");
            System.out.println("Root: " + f.getRoot1(f.getDiscriminant()));
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
