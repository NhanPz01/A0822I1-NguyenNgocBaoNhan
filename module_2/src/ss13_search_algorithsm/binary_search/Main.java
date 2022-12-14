package ss13_search_algorithsm.binary_search;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int binarySearch(ArrayList<Integer> list, int left, int right, int value) {
        int middle = (right + left) / 2;
        if (list.get(middle) == value) {
            return middle;
        } else if (list.get(middle) < value) {
            return binarySearch(list, middle + 1, right, value);
        } else if (list.get(middle) > value) {
            return binarySearch(list, left, middle - 1, value);
        }
        return -1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Size of list = ");
        int length = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < length; ++i) {
            System.out.print("element " + (i + 1) + " = ");
            list.add(Integer.parseInt(scanner.nextLine()));
        }
        for (int e : list) {
            System.out.print(e + ", ");
        }
        System.out.println();
        for (int i = 0; i < length; ++i) {
            for (int j = i + 1; j < length; ++j) {
                if (list.get(j) < list.get(i)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        for (int e : list) {
            System.out.print(e + ", ");
        }
        System.out.print("\nSearch for? = ");
        int searchNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("This number is at " + binarySearch(list, 0, list.size() - 1, searchNumber));
    }
}
