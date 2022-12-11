package models;

public class Customer extends Person {
    private final int DIAMOND = 1;
    private final int PLATINUM = 2;
    private final int GOLD = 3;
    private final int SILVER = 4;
    private final int MEMBER = 5;
    int customerType;
    String address;
}
