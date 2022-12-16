package ss14_sort;

public class InsertionSortSimulation {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            display(array, i);
            int position = i;
            int flag = array[i];
            while (position > 0 && flag < array[position - 1]) {
                array[position] = array[position - 1];
                position--;
            }
            array[position] = flag;
            display(array, i);
        }
    }

    public static void display(int[] array, int count) {
        System.out.print("[" + count + "] : ");
        for (int element : array) {
            System.out.print(element + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 35, 19, 92, 21};
        insertionSort(numbers);
    }
}
