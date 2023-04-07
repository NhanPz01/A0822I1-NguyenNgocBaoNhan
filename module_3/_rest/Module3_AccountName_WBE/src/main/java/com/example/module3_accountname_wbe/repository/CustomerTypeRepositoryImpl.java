package com.example.module3_accountname_wbe.repository;

import com.example.module3_accountname_wbe.model.CustomerType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static com.example.module3_accountname_wbe.util.ConnectionUtils.getConnection;

public class CustomerTypeRepositoryImpl implements CustomerTypeRepository {
    private static final String SELECT_ALL_CUSTOMER_TYPE = "Select * from loai_khach";
    private static final String SELECT_CUSTOMER_TYPE_BY_ID = "Select * from loai_khach where ma_loai_khach = ?";
    private static final String SELECT_CUSTOMER_TYPES_BY_NAME = "select * from loai_khach where ten_loai_khach = ?";
    private static final String INSERT_CUSTOMER_TYPE_SQL = "insert into loai_khach(ten_loai_khach) value (?);";
    private static final String UPDATE_BY_ID = "update loai_khach " +
            "set " +
            "ten_loai_khach" +
            "where ma_loai_khach = ?;";
    private static final String DELETE_CUSTOMER_TYPES_BY_ID = "delete from khach_hang where id = ?";

    @Override
    public CustomerType findById(int id) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMER_TYPE_BY_ID)) {
            System.out.println(preparedStatement);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                String name = rs.getString("ten_loai_khach");
                return new CustomerType(id, name);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return null;
    }

    @Override
    public List<CustomerType> findAll() {
        List<CustomerType> listCustomerType = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER_TYPE)) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("ma_loai_khach");
                String name = rs.getString("ten_loai_khach");
                listCustomerType.add(new CustomerType(id, name));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return listCustomerType;
    }

    @Override
    public List<CustomerType> findByName(String searchName) {
        List<CustomerType> customerTypes = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMER_TYPES_BY_NAME)) {
            preparedStatement.setString(1, "%" + searchName + "%");
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("ma_loai_khach");
                String name = rs.getString("ten_loai_khach");
                customerTypes.add(new CustomerType(id, name));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return customerTypes;
    }

    @Override
    public void add(CustomerType customerType) {
        System.out.println(INSERT_CUSTOMER_TYPE_SQL);
        // try-with-resource statement will auto close the connection.
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CUSTOMER_TYPE_SQL)) {
            preparedStatement.setString(1, customerType.getName());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    @Override
    public void update(CustomerType customerType) {
        System.out.println(UPDATE_BY_ID);
        // try-with-resource statement will auto close the connection.
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_BY_ID)) {
            preparedStatement.setString(1, customerType.getName());
            preparedStatement.setInt(2, customerType.getId());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    @Override
    public void deleteById(int id) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_CUSTOMER_TYPES_BY_ID)) {
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
