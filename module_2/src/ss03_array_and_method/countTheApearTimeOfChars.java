package ss03_array_and_method;

import java.util.Arrays;
import java.util.Scanner;

public class countTheApearTimeOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = "I want go home!";
        String[] toArray = sentence.split("");
        int count = 0;
        String word = scanner.nextLine();
        for (int i = 0; i < toArray.length; ++i) {
            if (toArray[i].equals(word)) {
                count++;
            }
        }
        System.out.println(sentence);
        System.out.println("The times of " + word + " is " + count);
    }
}
