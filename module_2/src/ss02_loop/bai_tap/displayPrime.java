package ss02_loop.bai_tap;

import java.util.Scanner;

public class displayPrime {
    static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return number > 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int number = 0;
        while (count != 20) {
            if (isPrime(number)) {
                System.out.println((count + 1) + " : " + number);
                count++;
            }
            number++;
        }
    }
}
