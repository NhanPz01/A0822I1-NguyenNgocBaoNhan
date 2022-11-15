package ss03_array_and_method;

import java.util.Scanner;

public class findMaxIn2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("row = ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.print("col = ");
        int col = Integer.parseInt(scanner.nextLine());
        int[][] nums = new int[row][col];
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                System.out.print("nums[" + i + "][" + j + "] = ");
                nums[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        int max = nums[0][0];
        int rowIndex = 0;
        int colIndex = 0;
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                if (max < nums[i][j]) {
                    max = nums[i][j];
                    rowIndex = i;
                    colIndex = j;
                }
            }
        }
        System.out.println("Max = " + max + " at " + rowIndex + " row, " + colIndex + " column");
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
