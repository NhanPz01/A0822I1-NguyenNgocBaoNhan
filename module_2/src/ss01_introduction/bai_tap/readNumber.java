package ss01_introduction.bai_tap;

import java.util.Scanner;

public class readNumber {
    static  void readOnes(String number) {
        switch (number) {
            case "0" -> {
                System.out.println("");
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
                System.out.println("six");
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
    static void readNumber(String number) {
        String[] toArray = number.split("");
        if (toArray.length < 1) {
            System.out.println("out of ability");
        } else if (toArray.length < 2) {
            switch (toArray[0]) {
                case "0" -> {
                    System.out.println("zero");
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
                    System.out.println("six");
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
        } else if (toArray.length < 3) {
            if (toArray[0].equals("1")) {
                switch (toArray[1]) {
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
            } else {
                switch (toArray[0]) {
                    case "2" -> {
                        System.out.print("twenty ");
                    }
                    case "3" -> {
                        System.out.print("thirty ");
                    }
                    case "4" -> {
                        System.out.print("forty ");
                    }
                    case "5" -> {
                        System.out.print("fifty ");
                    }
                    case "6" -> {
                        System.out.print("sixty ");
                    }
                    case "7" -> {
                        System.out.print("seventy ");
                    }
                    case "8" -> {
                        System.out.print("eighty ");
                    }
                    case "9" -> {
                        System.out.print("ninety ");
                    }
                }
                readOnes(toArray[1]);
            }
        } else if (toArray.length < 4) {
            switch (toArray[0]) {
                case "1" -> {
                    System.out.print("one hundred ");
                }
                case "2" -> {
                    System.out.print("two hundreds ");
                }
                case "3" -> {
                    System.out.print("three hundreds ");
                }
                case "4" -> {
                    System.out.print("four hundreds ");
                }
                case "5" -> {
                    System.out.print("five hundreds ");
                }
                case "6" -> {
                    System.out.print("six hundreds ");
                }
                case "7" -> {
                    System.out.print("seven hundreds ");
                }
                case "8" -> {
                    System.out.print("eight hundreds ");
                }
                case "9" -> {
                    System.out.print("nine hundreds ");
                }
            }
            if (toArray[1].equals("1")) {
                switch (toArray[2]) {
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
            } else {
                switch (toArray[1]) {
                    case "2" -> {
                        System.out.print("twenty ");
                    }
                    case "3" -> {
                        System.out.print("thirty ");
                    }
                    case "4" -> {
                        System.out.print("forty ");
                    }
                    case "5" -> {
                        System.out.print("fifty ");
                    }
                    case "6" -> {
                        System.out.print("sixty ");
                    }
                    case "7" -> {
                        System.out.print("seventy ");
                    }
                    case "8" -> {
                        System.out.print("eighty ");
                    }
                    case "9" -> {
                        System.out.print("ninety ");
                    }
                }
                readOnes(toArray[2]);
            }
        } else {
            System.out.println("out of ability");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        readNumber("999");
        readNumber("9999");
    }
}
