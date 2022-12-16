package ss14_sort;

public class InsertionSort {
    public static void insetionSort(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            int position = i;
            int flag = array[position];
            while (position > 0 && flag < array[position - 1]) {
                array[position] = array[position - 1];
                position--;
            }
            array[position] = flag;
        }
    }
    public static void main(String[] args) {
        int[] numbers = {9, 8, 7, 3, 2, 1};
        for (int element : numbers) {
            System.out.print(element + ", ");
        }
        System.out.println();
        System.out.println("After sort...");
        insetionSort(numbers);
        for (int element : numbers) {
            System.out.print(element + ", ");
        }
        System.out.println();
    }
}
