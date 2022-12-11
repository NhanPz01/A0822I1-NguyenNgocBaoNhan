package ss11_stack_and_queue;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static int[] reverseIntegerNumber(int[] numbers) {
        Stack<Integer> numberStack = new Stack<>();
        for (int e : numbers) {
            numberStack.push(e);
        }
        for (int i = 0; i < numbers.length; ++i) {
            numbers[i] = numberStack.pop();
        }
        return numbers;
    }
    public static String[] reverseString(String[] words) {
        Stack<String> wordStack = new Stack<>();
        for (String e : words) {
            wordStack.push(e);
        }
        for (int i = 0; i < words.length; ++i) {
            words[i] = wordStack.pop();
        }
        return words;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a number : ");
        String mNumber = scanner.nextLine();
        String[] tempArray = mNumber.split("");
        int[] numbers = new int[tempArray.length];
        for (int i = 0; i < tempArray.length; ++i) {
            numbers[i] = Integer.parseInt(tempArray[i]);
        }
        numbers = reverseIntegerNumber(numbers);
        for (int e : numbers) {
            System.out.print(e);
        }
        System.out.print("\nEnter a string : ");
        String mWord = scanner.nextLine();
        String[] words = mWord.split("");
        words = reverseString(words);
        for (String e : words) {
            System.out.print(e);
        }
    }
}
