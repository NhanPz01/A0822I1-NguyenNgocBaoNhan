package ss13_search_algorithsm.find_string_with_max_length;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sentence : ");

        String sentence = scanner.nextLine();

        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < sentence.length(); ++i) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(sentence.charAt(i));
            for (int j = i + 1; j < sentence.length(); ++j) {
                if (sentence.charAt(j) > list.getLast()) {
                    list.add(sentence.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        System.out.println("Sentence : " + sentence);
        System.out.print("Max string : ");
        for (Character character : max) {
            System.out.print(character);
        }
    }

}
