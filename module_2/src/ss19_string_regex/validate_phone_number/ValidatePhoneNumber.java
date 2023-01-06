package ss19_string_regex.validate_phone_number;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        String regex = "\\(\\d{2}\\)-\\(0\\d{9}\\)";
        String phoneNumber1 = "(84)-(0978489648)";
        String phoneNumber2 = "(a8)-(22222222)";
        System.out.println(phoneNumber1.matches(regex));
        System.out.println(phoneNumber2.matches(regex));
    }
}
