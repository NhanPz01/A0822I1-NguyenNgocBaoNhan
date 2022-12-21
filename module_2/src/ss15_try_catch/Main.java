package ss15_try_catch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        a = b = c = 0;
        boolean flag = false;
        do {
            try {
                flag = false;
                System.out.print("Get a = ");
                a = Integer.parseInt(scanner.nextLine());
                System.out.print("Get b = ");
                b = Integer.parseInt(scanner.nextLine());
                System.out.print("Get c = ");
                c = Integer.parseInt(scanner.nextLine());
                isTriangle(a, b, c);
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
                flag = true;
            }
        } while (flag);
    }

    public static void isTriangle(int a, int b, int c) throws IllegalTriangleException {
        boolean isNegative = a < 0 || b < 0 || c < 0;
        boolean notTriangle = a > (b + c) || b > (a + c) || c > (a + b);
        if (isNegative) {
            throw new IllegalTriangleException("Something is negative !");
        } else if (notTriangle) {
            throw new IllegalTriangleException("Sum of two sides must bigger than the rest !");
        }
    }
}
