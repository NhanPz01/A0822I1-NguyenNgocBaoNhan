package ss03_array_and_method;

import java.util.Arrays;
import java.util.Scanner;

public class removeElement {
    static boolean isIn(int[] array, int value) {
        for (int check : array) {
            if (check == value) {
                return true;
            }
        }
        return false;
    }
    static int[] remove(int[] array, int value) {
        if (isIn(array, value)) {
            int[] newArray = new int[array.length - 1];
            int index = 0;
            for (int i = 0; i < array.length; ++i) {
                if (array[i] == value) {
                    index  = i;
                }
            }
            for (int i = 0; i < index; ++i) {
                newArray[i] = array[i];
            }
            for (int i = index; i < newArray.length; ++i) {
                newArray[i] = array[i + 1];
            }
            return newArray;
        } else {
            return array;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(nums));
        System.out.print("Enter the number removed: ");
        int value = Integer.parseInt(scanner.nextLine());
        int[] result = remove(nums, value);
        System.out.println(Arrays.toString(result));
    }
}
