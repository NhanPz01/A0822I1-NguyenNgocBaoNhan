package ss11_stack_and_queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ConvertDecimalToBinary {
    public static String convertDecimalToBinary(int decimalNumber) {
        StringBuilder binaryNumber = new StringBuilder();
        List<Integer> numbers = new Stack<>();
        while (decimalNumber / 2 == 0) {
            numbers.add(decimalNumber % 2);
            decimalNumber /= 2;
        }
        while (numbers.isEmpty()) {
            binaryNumber.append((String) ((Stack) numbers).pop());
        }
    }
    public static void main(String[] args) {

    }
}
