package util;

public interface ConstantUtil {
    interface filePath {
        String phoneData = "src/data/PhoneNumberData.csv";
    }
    interface infoRegex {
        String email = "\\w\\@gmail.com";
        String phone = "\\0\\d{2,9}";
    }
}
