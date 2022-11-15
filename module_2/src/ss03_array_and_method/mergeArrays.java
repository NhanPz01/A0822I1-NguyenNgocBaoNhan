package ss03_array_and_method;

import java.util.Arrays;
import java.util.Scanner;

public class mergeArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length of first nums: ");
        int length1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Length of second nums: ");
        int length2 = Integer.parseInt(scanner.nextLine());
        int length3 = length1;
        length3 += length2;
        int[] nums1 = new int[length1];
        int[] nums2 = new int[length2];
        int[] nums3 = new int[length3];
        System.out.println("Set value for nums1's elements:");
        for (int i = 0; i < length1; ++i) {
            System.out.print("nums1[" + i + "] = ");
            nums1[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Set value for nums2's elements:");
        for (int i = 0; i < length2; ++i) {
            System.out.print("nums2[" + i + "] = ");
            nums2[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < length1; ++i) {
            nums3[i] = nums1[i];
        }
        for (int i = 0; i < length2; ++i) {
            nums3[length1 + i] = nums2[i];
        }
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums3));
    }
}
