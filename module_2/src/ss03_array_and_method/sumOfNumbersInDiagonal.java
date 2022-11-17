package ss03_array_and_method;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class sumOfNumbersInDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row, col;
        System.out.print("Row and col = ");
        row = col = Integer.parseInt(scanner.nextLine());
        double[][] nums = new double[row][col];
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                System.out.println("nums[" + i + "][" + j + "] = ");
                nums[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }
        double sum = 0.0d;
        for (int i = 0; i < row; ++i) {
            sum += nums[i][i];
        }
        System.out.println("Sum of numbers in main diagonal = " + sum);
    }
}
