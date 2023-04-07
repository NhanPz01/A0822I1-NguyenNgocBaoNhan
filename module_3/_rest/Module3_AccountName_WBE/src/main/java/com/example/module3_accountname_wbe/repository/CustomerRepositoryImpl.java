package com.example.module3_accountname_wbe.repository;

import com.example.module3_accountname_wbe.model.Customer;
import com.example.module3_accountname_wbe.model.CustomerType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.example.module3_accountname_wbe.util.ConnectionUtils.getConnection;

public class CustomerRepositoryImpl implements CustomerRepository {
    private CustomerRepository customerRepository = new CustomerRepositoryImpl();
    private CustomerTypeRepository customerTypeRepository = new CustomerTypeRepositoryImpl();
    private static final String SELECT_CUSTOMERS_BY_ID = "select * from khach_hang where id = ?";
    private static final String DELETE_CUSTOMERS_BY_ID = "delete from khach_hang where id = ?";
    private static final String UPDATE_BY_ID = "update khach_hang " +
            "set " +
            "ho_ten = ?," +
            "ngay_sinh = ?," +
            "gioi_tinh = ?," +
            "so_cmnd = ?," +
            "so_dien_thoai = ?," +
            "email = ?," +
            "dia_chi = ?," +
            "ma_loai_khach = ?" +
            "where ma_khach_hang = ?;";
    private static final String INSERT_USERS_SQL = "insert into khach_hang(ho_ten, ngay_sinh, gioi_tinh, so_cmnd, so_dien_thoai, email, dia_chi, ma_loai_khach) values (?, ?, ?, ?, ?, ?, ?, ?);";
    private static final String SELECT_CUSTOMERS_BY_NAME = "select * from khach_hang where name = ?";
    private static final String SELECT_ALL_CUSTOMERS = "select * from khach_hang";

    @Override
    public List<Customer> findAll() {
        List<Customer> listCustomer = null;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMERS)) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("ma_khach_hang");
                String name = rs.getString("ho_ten");
                Date dateOfBirth = new Date(rs.getDate("ngay_sinh").getTime());
                boolean gender = rs.getBoolean("gioi_tinh");
                String privateId = rs.getString("so_cmnd");
                String phoneNumber = rs.getString("so_dien_thoai");
                String email = rs.getString("email");
                String address = rs.getString("dia_chi");
                CustomerType customerType = customerTypeRepository.findById(rs.getInt("ma_loai_khach"));
                listCustomer.add(new Customer(id, name, dateOfBirth, gender, privateId, phoneNumber, email, address, customerType));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return listCustomer;
    }

    @Override
    public Customer findById(int id) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMERS_BY_ID)) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String name = rs.getString("ho_ten");
                Date dateOfBirth = new Date(rs.getDate("ngay_sinh").getTime());
                boolean gender = rs.getBoolean("gioi_tinh");
                String privateId = rs.getString("so_cmnd");
                String phoneNumber = rs.getString("so_dien_thoai");
                String email = rs.getString("email");
                String address = rs.getString("dia_chi");
                CustomerType customerType = customerTypeRepository.findById(rs.getInt("ma_loai_khach"));
                return new Customer(id, name, dateOfBirth, gender, privateId, phoneNumber, email, address, customerType);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return null;
    }

    @Override
    public List<Customer> findByName(String name) {
        List<Customer> customers = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMERS_BY_NAME)) {
            preparedStatement.setString(1, "%" + name + "%");
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("ma_khach_hang");
                Date dateOfBirth = new Date(rs.getDate("ngay_sinh").getTime());
                boolean gender = rs.getBoolean("gioi_tinh");
                String privateId = rs.getString("so_cmnd");
                String phoneNumber = rs.getString("so_dien_thoai");
                String email = rs.getString("email");
                String address = rs.getString("dia_chi");
                CustomerType customerType = customerTypeRepository.findById(rs.getInt("ma_loai_khach"));
                customers.add(new Customer(id, name, dateOfBirth, gender, privateId, phoneNumber, email, address, customerType));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return customers;
    }

    @Override
    public void add(Customer customer) {
        System.out.println(INSERT_USERS_SQL);
        // try-with-resource statement will auto close the connection.
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setString(1, customer.getName());
            preparedStatement.setDate(2, new java.sql.Date(customer.getDateOfBirth().getTime()));
            preparedStatement.setBoolean(3, customer.isGender());
            preparedStatement.setString(4, customer.getPrivateId());
            preparedStatement.setString(5, customer.getPhoneNumber());
            preparedStatement.setString(6, customer.getEmail());
            preparedStatement.setString(7, customer.getAddress());
            preparedStatement.setInt(8, customer.getCustomerType().getId());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    @Override
    public void update(Customer customer) {
        System.out.println(UPDATE_BY_ID);
        // try-with-resource statement will auto close the connection.
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_BY_ID)) {
            preparedStatement.setString(1, customer.getName());
            preparedStatement.setDate(2, new java.sql.Date(customer.getDateOfBirth().getTime()));
            preparedStatement.setBoolean(3, customer.isGender());
            preparedStatement.setString(4, customer.getPrivateId());
            preparedStatement.setString(5, customer.getPhoneNumber());
            preparedStatement.setString(6, customer.getEmail());
            preparedStatement.setInt(8, customer.getCustomerType().getId());
            preparedStatement.setInt(9, customer.getId());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    @Override
    public void deleteById(int id) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_CUSTOMERS_BY_ID)) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
        } catch (SQLException e) {
            printSQLException(e);
        }
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
