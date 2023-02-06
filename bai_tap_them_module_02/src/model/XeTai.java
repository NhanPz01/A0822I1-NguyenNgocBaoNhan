package model;

public class XeMay extends PhuongTien {
    private double trongTai;

    public XeTai() {
    }

    public XeTai(double trongTai) {
        this.trongTai = trongTai;
    }

    public XeTai(String bienSo, String maSanXuat, String chuSoHuu, int namSanXuat) {
        super(bienSo, maSanXuat, chuSoHuu, namSanXuat);
    }

    public XeTai(String bienSo, String maSanXuat, String chuSoHuu, int namSanXuat, double trongTai) {
        super(bienSo, maSanXuat, chuSoHuu, namSanXuat);
        this.trongTai = trongTai;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    public String getInfoToCSV() {
        String info = this.bienSo + "," +
                this.maSanXuat + "," +
                this.chuSoHuu + "," +
                this.namSanXuat + "," +
                this.trongTai;
        return info;
    }

    @Override
    public String toString() {
        return "Biển số : " + this.bienSo + " | " +
                "Mã sản xuất : " + this.maSanXuat + " | " +
                "Chủ sở hữu : " + this.chuSoHuu + " | " +
                "Năm sản xuất : " + this.namSanXuat + " | " +
                "Trọng tải : " + this.trongTai;
    }
}
