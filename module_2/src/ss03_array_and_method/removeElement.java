package ss03_array_and_method;

public class removeElement {
    static void remove(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }

            } else {
                System.out.println("element " + value + " is not exist");
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        for (int value : nums) {
            System.out.print(value + " ");
        }
        System.out.println();
        remove(nums, 5);
        for (int value : nums) {
            System.out.print(value + " ");
        }
    }
}
