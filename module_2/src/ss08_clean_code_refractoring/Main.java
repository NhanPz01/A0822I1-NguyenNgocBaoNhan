package ss08_clean_code_refractoring;

public class Main {
    public static void main(String[] args) {
        String result = TennisGame.getScore(4, 13);
        System.out.println(result);
        result = TennisGame.getScore(4, 4);
        System.out.println(result);
        result = TennisGame.getScore(4, 2);
        System.out.println(result);
    }
}
