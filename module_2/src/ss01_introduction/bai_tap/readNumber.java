package ss01_introduction.bai_tap;

import java.util.Scanner;

public class readNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String strNumber = scanner.nextLine();
        String[] numToArr = strNumber.split("");
        for (int i = 0; i < strNumber.length(); i++) {
            System.out.println(numToArr[i]);
        }
        int length = strNumber.length();
        switch (length) {
            case 1:
                switch (numToArr[0]) {
                    case "0":
                        System.out.println("zero");
                        break;
                    case "1":
                        System.out.println("one");
                        break;
                    case "2":
                        System.out.println("two");
                        break;
                    case "3":
                        System.out.println("three");
                        break;
                    case "4":
                        System.out.println("four");
                        break;
                    case "5":
                        System.out.println("five");
                        break;
                    case "6":
                        System.out.println("six");
                        break;
                    case "7":
                        System.out.println("seven");
                        break;
                    case "8":
                        System.out.println("eight");
                        break;
                    case "9":
                        System.out.println("nine");
                        break;
                    default:
                        System.out.println("out of ability");
                        break;
                }
                break;
            case 2:
                switch (numToArr[0]) {
                    case "1" -> {
                        switch (numToArr[1]) {
                            case "0" -> {
                                System.out.println("ten");
                            }
                            case "1" -> {
                                System.out.println("eleven");
                            }
                            case "2" -> {
                                System.out.println("twelve");
                            }
                            case "3" -> {
                                System.out.println("thirteen");
                            }
                            case "4" -> {
                                System.out.println("fourteen");
                            }
                            case "5" -> {
                                System.out.println("fifteen");
                            }
                            case "6" -> {
                                System.out.println("sixteen");
                            }
                            case "7" -> {
                                System.out.println("seventeen");
                            }
                            case "8" -> {
                                System.out.println("eighteen");
                            }
                            case "9" -> {
                                System.out.println("nineteen");
                            }
                        }
                    }
                    case "2" -> {
                        System.out.print("twenty");
                        switch (numToArr[1]) {
                            case "0" -> {
                                // nothing
                            }
                            case "1" -> {
                                System.out.println("one");
                            }
                            case "2" -> {
                                System.out.println("two");
                            }
                            case "3" -> {
                                System.out.println("three");
                            }
                            case "4" -> {
                                System.out.println("four");
                            }
                            case "5" -> {
                                System.out.println("five");
                            }
                            case "6" -> {
                                System.out.println("sixe");
                            }
                            case "7" -> {
                                System.out.println("seven");
                            }
                            case "8" -> {
                                System.out.println("eight");
                            }
                            case "9" -> {
                                System.out.println("nine");
                            }
                        }
                    }
                    default -> {
                        System.out.println("out of ability");
                    }
                }
            case 3:

            case 4:
            default:
                System.out.println("out of ability");
        }
    }
}
