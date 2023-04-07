package com.example.demo_quan_ly_nhan_vien.service.impl;

import com.example.demo_quan_ly_nhan_vien.model.NhanVien;
import com.example.demo_quan_ly_nhan_vien.service.INhanVienService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static java.sql.DriverManager.getConnection;

public class NhanVienService implements INhanVienService {
    private String jdbcURL = "jdbc:mysql://localhost:3306/demo_db";
    private String jdbcUsername = "root";
    private String jdbcPassword = "Ba@Nhan240703";
    private static final String SELECT_ALL_NHAN_VIEN = "select *\n" +
            "from nhan_vien \n" +
            "\tjoin cong_viec on nhan_vien.ma_cong_viec = cong_viec.ma_cong_viec;";
    private static final String INSERT_USERS_SQL = "INSERT INTO nhan_vien" + "  (ma_nhan_vien, ho_ten, ngay_sinh, dia_chi, ngay_bat_dau_lam, ngay_ket_thuc_lam, luong, ma_cong_viec) VALUES " + " (?, ?, ?, ?, ?, ?, ?, ?);";

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }

    @Override
    public void add(NhanVien nhanVien) {
        System.out.println(INSERT_USERS_SQL);
        // try-with-resource statement will auto close the connection.
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setString(1, nhanVien.getMaNhanVien());
            preparedStatement.setString(2, nhanVien.getHoTen());
            preparedStatement.setString(3, nhanVien.getNgaySinh());
            preparedStatement.setString(4, nhanVien.getDiaChi());
            preparedStatement.setString(5, nhanVien.getNgayBatDauLam());
            preparedStatement.setString(6, nhanVien.getNgayKetThucLam());
            preparedStatement.setDouble(7, nhanVien.getLuong());
            preparedStatement.setString(8, nhanVien.getMaCongViec());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    @Override
    public void update(NhanVien nhanVien) {

    }

    @Override
    public List<NhanVien> findAll() {
// using try-with-resources to avoid closing resources (boiler plate code)
        List<NhanVien> nhanVienList = new ArrayList<>();
        // Step 1: Establishing a Connection
        try (Connection connection = getConnection();

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_NHAN_VIEN)) {
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                String maNhanVien = rs.getString("ma_nhan_vien");
                String hoTen = rs.getString("ho_ten");
                String ngaySinh = rs.getString("ngay_sinh");
                String diaChi = rs.getString("dia_chi");
                String ngayBatDauLam = rs.getString("ngay_bat_dau_lam");
                String ngayKetThucLam = rs.getString("ngay_ket_thuc_lam");
                double luong = rs.getDouble("luong");
                String maCongViec = rs.getString("ma_cong_viec");
                String tenCongViec = rs.getString("ten_cong_viec");
                nhanVienList.add(new NhanVien(maNhanVien, hoTen, ngaySinh, diaChi, ngayBatDauLam, ngayKetThucLam, luong, maCongViec, tenCongViec));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return nhanVienList;
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

    @Override
    public List<NhanVien> findByTenCongViec(String tenCongViec) {
        return null;
    }

    @Override
    public List<NhanVien> findByNgayLamVaNgayKetThuc(String ngayBatDauLam, String ngayKetThucLam) {
        return null;
    }
}
