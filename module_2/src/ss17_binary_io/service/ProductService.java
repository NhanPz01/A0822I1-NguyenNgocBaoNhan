package ss17_binary_io.service;

import ss17_binary_io.model.Product;
import ss17_binary_io.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private final String filePath = "src/ss17_binary_io/data/products.csv";
    public void display(int id) {
        List<Product> productList = ReadAndWrite.readFileToProductListObject(filePath);
        for (Product product : productList) {
            if (product.getId() == id) {
                System.out.println(product);
            }
        }
    }

    public void displayAll() {
        List<Product> productList = ReadAndWrite.readFileToProductListObject(filePath);
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void add(Product product) {
        List<Product> productList = ReadAndWrite.readFileToProductListObject(filePath);
        if (product.getId() != 0) {
            productList.add(product);
        }
        ReadAndWrite.writeProductListObjectToCSV(filePath, productList);
    }

    public Product search(int id) {
        List<Product> productList = ReadAndWrite.readFileToProductListObject(filePath);
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return new Product();
    }
}
