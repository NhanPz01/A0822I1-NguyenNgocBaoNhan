package model;

public class XeMay extends PhuongTien {
    private double congSuat;

    public XeMay() {
    }

    public XeMay(double congSuat) {
        this.congSuat = congSuat;
    }

    public XeMay(String bienSo, String tenHang, String chuSoHuu, int namSanXuat) {
        super(bienSo, tenHang, chuSoHuu, namSanXuat);
    }

    public XeMay(String bienSo, String tenHang, String chuSoHuu, int namSanXuat, double congSuat) {
        super(bienSo, tenHang, chuSoHuu, namSanXuat);
        this.congSuat = congSuat;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }
}
