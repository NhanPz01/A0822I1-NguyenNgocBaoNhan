package ss03_array_and_method;

import java.util.Scanner;

public class sumNumbersInEachRow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Row = ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.print("Col = ");
        int col = Integer.parseInt(scanner.nextLine());
        double[][] nums = new double[row][col];
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                System.out.print("nums[" + i + "][" + j + "] = ");
                nums[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }
        System.out.print("Which row want to sum: ");
        int colToSum = Integer.parseInt(scanner.nextLine());
        double sum = 0.0d;
        for (int i = 0; i < col; ++i) {
            sum += nums[i][colToSum];
        }
        System.out.println("Sum of " + colToSum + " column = " + sum);
    }
}
