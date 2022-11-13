package ss01_introduction.bai_tap;

import java.util.Scanner;

public class moneyConverter {
    static float converter(float vnd) {
        float usd = vnd * 23000;
        return usd;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float vnd = Float.parseFloat(scanner.nextLine());
        System.out.println(vnd + " VND -> " + converter(vnd) + " USD");
    }
}
