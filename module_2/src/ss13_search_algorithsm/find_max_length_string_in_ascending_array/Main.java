package ss13_search_algorithsm.find_max_length_string_in_ascending_array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string = ");
        String sentence = scanner.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < sentence.length(); ++i) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(sentence.charAt(i));
            for (int j = i + 1; j < sentence.length(); ++j) {
                if (sentence.charAt(j) > list.getLast()) {
                    max.add(sentence.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }

        for (Character character : max) {
            System.out.print(character);
        }
        System.out.println();
    }
}
