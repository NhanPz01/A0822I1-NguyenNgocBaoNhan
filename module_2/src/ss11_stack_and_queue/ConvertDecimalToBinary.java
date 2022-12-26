package ss11_stack_and_queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalToBinary {
    public static String converDecimalToBinary(int decimalNumber) {
        String binaryNumber = "";
        Stack<Integer> numbers = new Stack<>();
        if (decimalNumber < 1) {
            return "0";
        } else if (decimalNumber < 2) {
            return "1";
        } else {
            int count = 0;
            do {
                numbers.push(decimalNumber % 2);
                decimalNumber /= 2;
                if (decimalNumber == 0) {
                    count++;
                }
            } while (decimalNumber != 0 && count < 1);
        }
        do {
            binaryNumber += String.valueOf(numbers.pop());
        } while (!numbers.isEmpty());
        return binaryNumber;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Decimal = ");
        int decimalNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Binary = ");
        System.out.println(converDecimalToBinary(decimalNumber));
    }
}
