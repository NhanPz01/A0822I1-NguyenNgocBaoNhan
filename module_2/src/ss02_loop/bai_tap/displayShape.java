package ss02_loop.bai_tap;

public class displayShape {
    static void printSolidRectangle(int heigth, int width) {
        for (int i = 0; i < heigth; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }

    static void printSquareTriangle(int heigth, int width) {
        // top-left
        for (int i = 0; i < heigth; i++) {
            for (int j = 1; j <= width; j++) {
                if (i == 0) {
                    System.out.print("*");
                } else {
                    if (j > width - i) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println("");
        }

        // top-right
        for (int i = 0; i < heigth; i++) {
            for (int j = 1; j <= width; j++) {
                if (i == 0) {
                    System.out.print("*");
                } else {
                    if (j > i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }

        // bottom-left
        for (int i = 0; i < heigth; i++) {
            for (int j = 1; j <= width; j++) {
                if (i == heigth - 1) {
                    System.out.print("*");
                } else {
                    if (j <= i + 1) {
                        System.out.print("*");
                    }
                }
            }
            System.out.println("");
        }

        // bottom-right
        for (int i = 0; i < heigth; i++) {
            for (int j = 1; j <= width; j++) {
                if (i == heigth - 1) {
                    System.out.print("*");
                } else {
                    if (j >= width - i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }

    static void printIsoscelesTriangle(int heigth) {
        for (int i = 1; i <= heigth; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
//        printSolidRectangle(3, 15);
        printSquareTriangle(5, 5);
//        printIsoscelesTriangle(5);
    }
}
