package ss19_string_regex.validate_class_name;

public class ValidateClassName {
    public static void main(String[] args) {
        String regex = "^[ACP]\\d{4}[GHIKLM]$";
        String test1 = "C0138G";
        String test2 = "A*0138G";
        String test3 = "P0323A";
        System.out.println(test1.matches(regex));
        System.out.println(test2.matches(regex));
        System.out.println(test3.matches(regex));
    }
}
