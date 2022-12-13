package ss12_arraylist_linkedlist_java_collection_framework;

import java.util.ArrayList;

public class ProductManager {
    public static ArrayList<Product> products = new ArrayList<>();

    public static boolean isExistById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public static void displayAll() {
        for (Product e : products) {
            System.out.println(e);
        }
    }

    public static void display(Product product) {
        System.out.println(product);
    }

    public static void add(Product other) throws Exception {
        boolean isExist = false;
        for (Product product : products) {
            isExist = (
                other.getId() == product.getId() ||
                (
                    other.getName().equals(product.getName()) &&
                    other.getPrice() == product.getPrice() &&
                    other.getAmount() == product.getAmount()
                )
            );
            if (isExist) {
                break;
            }
        }
        if (isExist) {
            throw new Exception("The product is existing");
        } else {
            products.add(other);
        }
    }

    public static Product deleteById(int id) {
        Product holder = new Product();
        for (Product product : products) {
            if (product.getId() == id) {
                holder = product;
                products.remove(product);
                break;
            }
        }
        return holder;
    }

    public static void editById(Product other, int choose) {
        Product holder = new Product();
        for (Product product : products) {
            if (product.getId() == other.getId()) {
                holder = product;
                break;
            }
        }
        switch (choose) {
            case 1 -> {
                holder.setName(other.getName());
            }
            case 2 -> {
                holder.setPrice(other.getPrice());
            }
            case 3 -> {
                holder.setAmount(other.getAmount());
            }
            default -> {
            }
        }
        for (Product product : products) {
            if (product.getId() == holder.getId()) {
                product = holder;
                break;
            }
        }
    }

    public static Product searchByName(String name) {
        Product holder = new Product();
        for (Product product : products) {
            if (product.getName().equals(name)) {
                holder = product;
            }
        }
        return holder;
    }

    public static Product searchById(int id) {
        Product holder = new Product();
        if (isExistById(id)) {
            for (Product product : products) {
                if (id == product.getId()) {
                    holder = product;
                    break;
                }
            }
        }
        return holder;
    }
}
