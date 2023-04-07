package com.example.demo_quan_ly_nhan_vien.model;

public class NhanVien {
    private String maNhanVien;
    private String hoTen;
    private String ngaySinh;
    private String diaChi;
    private String ngayBatDauLam;
    private String ngayKetThucLam;
    private double luong;
    private String maCongViec;

    private String tenCongViec;

    public NhanVien(String maNhanVien, String hoTen, String ngaySinh, String diaChi, String ngayBatDauLam, String ngayKetThucLam, double luong, String maCongViec, String tenCongViec) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.ngayBatDauLam = ngayBatDauLam;
        this.ngayKetThucLam = ngayKetThucLam;
        this.luong = luong;
        this.maCongViec = maCongViec;
        this.tenCongViec = tenCongViec;
    }

    public String getTenCongViec() {
        return tenCongViec;
    }

    public void setTenCongViec(String tenCongViec) {
        this.tenCongViec = tenCongViec;
    }

    public NhanVien() {
    }

    public NhanVien(String maNhanVien, String hoTen, String ngaySinh, String diaChi, String ngayBatDauLam, String ngayKetThucLam, double luong, String maCongViec) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.ngayBatDauLam = ngayBatDauLam;
        this.ngayKetThucLam = ngayKetThucLam;
        this.luong = luong;
        this.maCongViec = maCongViec;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNgayBatDauLam() {
        return ngayBatDauLam;
    }

    public void setNgayBatDauLam(String ngayBatDauLam) {
        this.ngayBatDauLam = ngayBatDauLam;
    }

    public String getNgayKetThucLam() {
        return ngayKetThucLam;
    }

    public void setNgayKetThucLam(String ngayKetThucLam) {
        this.ngayKetThucLam = ngayKetThucLam;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getMaCongViec() {
        return maCongViec;
    }

    public void setMaCongViec(String maCongViec) {
        this.maCongViec = maCongViec;
    }
}
