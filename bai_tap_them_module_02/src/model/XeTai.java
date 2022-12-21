package model;

public class XeTai extends PhuongTien {
    private double trongTai;

    public XeTai() {
    }

    public XeTai(double trongTai) {
        this.trongTai = trongTai;
    }

    public XeTai(String bienSo, String tenHang, String chuSoHuu, int namSanXuat) {
        super(bienSo, tenHang, chuSoHuu, namSanXuat);
    }

    public XeTai(String bienSo, String tenHang, String chuSoHuu, int namSanXuat, double trongTai) {
        super(bienSo, tenHang, chuSoHuu, namSanXuat);
        this.trongTai = trongTai;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }
}
