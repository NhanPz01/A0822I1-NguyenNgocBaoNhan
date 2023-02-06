package util;

import java.util.Scanner;

public class FunctionUtil {
    Scanner scanner = new Scanner(System.in);

    public int getChoose(int start, int end) {
        int res = 0;
        do {
            res = Integer.parseInt(scanner.nextLine());
            if (res > end || res < start) {
                System.out.print("The choose must between 1 to 5: ");
            } else {

            }
        } while (res != 0);
        return res;
    }
}
