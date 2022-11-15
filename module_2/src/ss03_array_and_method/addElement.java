package ss03_array_and_method;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.Scanner;

public class addElement {
    static boolean isIn(int[] array, int value) {
        for (int check : array) {
            if (check == value) {
                return true;
            }
        }
        return false;
    }
    static int[] add(int[] array, int value, int index) {
        if (isIn(array, value)) {
            return array;
        } else {
            if (index < 0) {
                index = 0;
            } else if (index > array.length) {
                index = array.length;
            }
            int[] newArray = new int[array.length + 1];
            newArray[index] = value;
            if (index < 1) {
                for (int i = 0; i < array.length; ++i) {
                    newArray[i + 1] = array[i];
                }
            } else {
                for (int i = 0; i < index; ++i) {
                    newArray[i] = array[i];
                }
                for (int i = index + 1; i < newArray.length; ++i) {
                    newArray[i] = array[i - 2];
                }
            }
            return newArray;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(nums));
        int value = Integer.parseInt(scanner.nextLine());
        int index = Integer.parseInt(scanner.nextLine());
        int[] result = add(nums, value, index);
        System.out.println(Arrays.toString(result));
    }
}
