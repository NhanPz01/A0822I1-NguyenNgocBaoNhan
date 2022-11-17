package ss02_loop.thuc_hanh;

import java.util.Scanner;

public class fineGreatestCommonDivisor {
    static int[] findCommonDivisor(int num1, int num2) {
        int checkLength = (num1 < num2) ? num1 : num2;
        int[] result = new int[checkLength];
        int checkNum = 1;
        while (checkNum <= checkLength) {
            if (num1 % checkNum == 0 && num2 % checkNum == 0) {
                for (int i = 0; i < checkLength - 1; ++i) {
                    result[i + 1] = result[i];
                }
                result[0] = checkNum;
            }
            ++checkNum;
        }
        return result;
    }
    static int findMax(int[] array) {
        int max = array[0];
        for (int check : array) {
            max = (max < check) ? check : max;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2;
        do {
            System.out.print("Set the number1: ");
            number1 = Integer.parseInt(scanner.nextLine());
            System.out.print("Set the number2: ");
            number2 = Integer.parseInt(scanner.nextLine());
            System.out.println("----------------------------");
        } while (number1 < 0 || number2 < 0);
        int max = findMax(findCommonDivisor(number1, number2));
        System.out.println("Greatest common divisor of " + number1 + " and " + number2 + " is : " + max);
    }
}
