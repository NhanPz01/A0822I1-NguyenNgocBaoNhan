package ss11_stack_and_queue;

import java.util.*;

public class UseMapToCountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> countingMap = new TreeMap<>();
        String input = scanner.nextLine();
        String[] words = input.split("");
        for (int i = 0; i < words.length; ++i) {
            words[i] = words[i].toLowerCase();
        }
        System.out.println("Given string : ");
        for (String e : words) {
            System.out.print(e);
        }
        countingMap.put(words[0], 1);
        for (int i = 1; i < words.length; ++i) {
            for (Map.Entry<String, Integer> entry : countingMap.entrySet()) {
                if (countingMap.containsKey(words[i])) {
                    entry.setValue(entry.getValue() + 1);
                } else {
                    countingMap.put(words[i], 1);
                }
            }
        }
        System.out.println("This is map : ");
        for (Map.Entry<String, Integer> entry : countingMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + countingMap.get(entry.getKey()));
        }
    }
}
