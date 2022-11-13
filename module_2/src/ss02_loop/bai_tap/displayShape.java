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
        // bottom-left
        for (int i = 0; i < heigth; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0) {
                    System.out.print("* ");
                } else {
                    if (j < width - i) {
                        System.out.print("* ");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }

        // bottom-right
        for (int i = 0; i < heigth; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0) {
                    System.out.print("*");
                } else {
                    if (j >= i) {
                        System.out.print("*");
                    } else {
                        System.out.print("_");
                    }
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
//        printSolidRectangle(3, 15);
        printSquareTriangle(8, 6);
    }
}
