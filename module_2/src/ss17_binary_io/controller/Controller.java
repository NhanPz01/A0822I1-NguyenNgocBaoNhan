package ss17_binary_io.controller;

import ss17_binary_io.model.Product;
import ss17_binary_io.service.ProductService;

import java.util.Scanner;

public class Controller {
    public static void displayMain() {
        Scanner scanner = new Scanner(System.in);
        ProductService productService = new ProductService();
        boolean flag = true;
        do {
            System.out.println(
                    "-----Products-----" +
                            "\n1. Display all" +
                            "\n2. Display by id" +
                            "\n3. Add" +
                            "\n4. Search" +
                            "\n5. Exit" +
                            "\n--Choose : "
            );
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1 -> {
                    productService.displayAll();
                }
                case 2 -> {
                    System.out.println(
                            "--id : "
                    );
                    int id = Integer.parseInt(scanner.nextLine());
                    productService.display(id);
                }
                case 3 -> {
                    System.out.println("--id : ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("--name : ");
                    String name = scanner.nextLine();
                    System.out.println("--brand : ");
                    String brand = scanner.nextLine();
                    System.out.println("--price : ");
                    double price = Double.parseDouble(scanner.nextLine());
                    System.out.println("--description : ");
                    String description = scanner.nextLine();
                    productService.add(new Product(id, name, brand, price, description));
                }
                case 4 -> {
                    System.out.println("--id : ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println(productService.search(id));
                }
                default -> {
                    flag = false;
                }
            }
        } while (flag);
    }
}
