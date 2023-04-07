package com.example.productmanagement.repository;

import com.example.productmanagement.model.Category;
import com.example.productmanagement.model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.example.productmanagement.uitil.ConnectionUtils.getConnection;

public class ProductRepositoryImpl implements ProductRepository {
    private static final String INSERT_PRODUCT_SQL = "insert into product(name, price, quantity, color, category_id) values (?, ?, ?, ?, ?);";
    private static final String SELECT_BY_NAME = "select * from product where name like ?";
    private static final String DELETE_BY_ID = "delete from product where id = ?";
    private CategoryRepository categoryRepository = new CategoryRepositoryImpl();
    private static final String SELECT_ALL_PRODUCT = "select * from product;";

    @Override
    public List<Product> findAll() {
        // using try-with-resources to avoid closing resources (boiler plate code)
        List<Product> productList = new ArrayList<>();
        // Step 1: Establishing a Connection
        try (Connection connection = getConnection();

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PRODUCT)) {
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                String color = rs.getString("color");
                int categoryId = rs.getInt("category_id");
                Category category = categoryRepository.findById(categoryId);
                productList.add(new Product(id, name, price, quantity, color, category));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return productList;
    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public void add(Product product) {
        System.out.println(INSERT_PRODUCT_SQL);
        // try-with-resource statement will auto close the connection.
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PRODUCT_SQL)) {
            preparedStatement.setString(1, product.getName());
            preparedStatement.setDouble(2, product.getPrice());
            preparedStatement.setInt(3, product.getQuantity());
            preparedStatement.setString(4, product.getColor());
            preparedStatement.setInt(5, product.getCategory().getId());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void deleteById(int id) {
        System.out.println(DELETE_BY_ID);
        // try-with-resource statement will auto close the connection.
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_BY_ID)) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    @Override
    public List<Product> findByName(String name) {
        System.out.println(SELECT_BY_NAME);
        List<Product> listProduct = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_NAME)) {
            preparedStatement.setString(1, "%" + name + "%");
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name1 = rs.getString("name");
                Double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                String color = rs.getString("color");
                int categoryId = rs.getInt("category_id");
                Category category = categoryRepository.findById(categoryId);
                listProduct.add(new Product(id, name1, price, quantity, color, category));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return listProduct;
    }

    @Override
    public List<Product> findByPrice(double price) {
        return null;
    }
    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
