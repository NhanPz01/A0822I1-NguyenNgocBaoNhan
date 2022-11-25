package ss4_class_and_object.stop_watch;

import java.util.Scanner;

public class main {
    static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; ++j) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[100000];
        for (int i = 0; i < array.length; ++i) {
            array[i] = array.length - i;
        }
        StopWatch watch = new StopWatch();
        watch.start();
        selectionSort(array);
        System.out.println("The time it takes is: " + watch.getElapsedTime());
    }
}
