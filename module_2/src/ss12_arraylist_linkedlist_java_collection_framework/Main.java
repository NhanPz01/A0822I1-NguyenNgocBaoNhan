package ss12_arraylist_linkedlist_java_collection_framework;

import java.time.chrono.IsoEra;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ProductManager.add(new Product(3, "Lamp", 10000, 1000));
        ProductManager.add(new Product(2, "Chair", 150000, 50));
        ProductManager.add(new Product(4, "Desk", 20000, 0));
        ProductManager.add(new Product(1, "Table", 75000, 100));
        boolean flag = true;
        do {
            System.out.println(
                "--------MENU--------" +
                "\n(1) Display list of product" +
                "\n(2) Add new product" +
                "\n(3) Edit product by id" +
                "\n(4) Delete product by id" +
                "\n(5) Search product by name" +
                "\n(6) Sort list of product" +
                "\n(7) Exit"
            );
            System.out.print("(-) Choose = ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1 -> {
                    System.out.println("------Products------");
                    Collections.sort(ProductManager.products, new AscendingSortById());
                    ProductManager.displayAll();
                }
                case 2 -> {
                    System.out.println("---Add new product---");
                    Product newProduct = new Product();
                    System.out.print("(-) Product id = ");
                    int id = Integer.parseInt(scanner.nextLine());
                    while (id < 0) {
                        System.out.print("(-) Product id = ");
                        id = Integer.parseInt(scanner.nextLine());
                    }
                    newProduct.setId(id);
                    System.out.print("(-) Product name = ");
                    String name = scanner.nextLine();
                    while (name.equals("")) {
                        System.out.print("(-) Product name = ");
                        name = scanner.nextLine();
                    }
                    newProduct.setName(name);
                    System.out.print("(-) Product price = ");
                    double price = Double.parseDouble(scanner.nextLine());
                    while (price < 0) {
                        System.out.print("(-) Product price = ");
                        price = Double.parseDouble(scanner.nextLine());
                    }
                    newProduct.setPrice(price);
                    System.out.print("(-) Product amount = ");
                    double amount = Double.parseDouble(scanner.nextLine());
                    while (amount < 0) {
                        System.out.print("(-) Product amount = ");
                        amount = Double.parseDouble(scanner.nextLine());
                    }
                    newProduct.setAmount(amount);
                    ProductManager.add(newProduct);
                }
                case 3 -> {
                    Product tempProduct = new Product();
                    Collections.sort(ProductManager.products, new AscendingSortById());
                    System.out.println("-----Edit by id-----");
                    int id;
                    do {
                        System.out.println("The id must be bigger than 0 !!!");
                        System.out.print("(-) Id = ");
                        id = Integer.parseInt(scanner.nextLine());
                    } while (id < 1);
                    do {
                        if (!ProductManager.isExistById(id)) {
                            System.out.println("The product with this id is not existing !!!");
                            System.out.print("(-) Id = ");
                            id = Integer.parseInt(scanner.nextLine());
                        } else {
                            break;
                        }
                    } while (true);
                    tempProduct.setId(id);
                    boolean editFlag = true;
                    do {
                        System.out.println("-----Edit by id-----");
                        ProductManager.display(ProductManager.searchById(id));
                        System.out.println(
                            "-----Edit by id-----" +
                            "\n(1) Edit name" +
                            "\n(2) Edit price" +
                            "\n(3) Edit amount" +
                            "\n(4) To main menu"
                        );
                        System.out.print("(-) Edit choose = ");
                        int editChoose = Integer.parseInt(scanner.nextLine());
                        switch (editChoose) {
                            case 1 -> {
                                System.out.println("---Edit product name---");
                                System.out.print("(-) Name = ");
                                String name = scanner.nextLine();
                                tempProduct.setName(name);
                                ProductManager.editById(tempProduct, editChoose);
                            }
                            case 2 -> {
                                System.out.println("---Edit product price---");
                                System.out.print("(-) Price = ");
                                double price = Double.parseDouble(scanner.nextLine());
                                while (price < 0) {
                                    System.out.print("(-) Price = ");
                                    price = Double.parseDouble(scanner.nextLine());
                                }
                                tempProduct.setPrice(price);
                                ProductManager.editById(tempProduct, editChoose);
                            }
                            case 3 -> {
                                System.out.println("---Edit product amount---");
                                System.out.print("(-) Amount = ");
                                double amount = Double.parseDouble(scanner.nextLine());
                                while (amount < 0) {
                                    System.out.print("(-) Amount = ");
                                    amount = Double.parseDouble(scanner.nextLine());
                                }
                                tempProduct.setAmount(amount);
                                ProductManager.editById(tempProduct, editChoose);
                            }
                            default -> {
                                editFlag = false;
                            }
                        }
                    } while (editFlag);
                }
                case 4 -> {
                    System.out.println("----Delete by id----");
                    System.out.print("(-) Id = ");
                    int id = Integer.parseInt(scanner.nextLine());
                    while (!ProductManager.isExistById(id)) {
                        System.out.println("The product with this id is not existing !!!");
                        System.out.print("(-) Id = ");
                        id = Integer.parseInt(scanner.nextLine());
                    }
                    System.out.println("---Product will be delete---");
                    ProductManager.display(ProductManager.deleteById(id));
                }
                case 5 -> {
                    System.out.println("---Search by name---");
                    System.out.print("(-) Name = ");
                    String name = scanner.nextLine();
                    while (name.equals("")) {
                        System.out.print("(-) Name = ");
                        name = scanner.nextLine();
                    }
                    ProductManager.display(ProductManager.searchByName(name));
                }
                case 6 -> {
                    System.out.println(
                        "---Sort by price---" +
                        "\n(1) Ascending" +
                        "\n(2) Descending"
                    );
                    System.out.print("(-) Sort choose = ");
                    int sortChoose = Integer.parseInt(scanner.nextLine());
                    while (sortChoose < 0 || sortChoose > 3) {
                        System.out.print("(-) Sort choose = ");
                        sortChoose = Integer.parseInt(scanner.nextLine());
                    }
                    System.out.println("(-) Sorting...");
                    if (sortChoose == 1) {
                        Collections.sort(ProductManager.products, new AscendingSortByPrice());
                    } else {
                        Collections.sort(ProductManager.products, new DescendingSortByPrice());
                    }
                    System.out.println("---Sorted list of product---");
                    ProductManager.displayAll();
                }
                default -> {
                    flag = false;
                }
            }
        } while (flag);
    }
}
