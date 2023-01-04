package model;

public class XeMay extends PhuongTien {
    private double congSuat;

    public XeMay() {
    }

    public XeMay(double congSuat) {
        this.congSuat = congSuat;
    }

    public XeMay(String bienSo, String maSanXuat, String chuSoHuu, int namSanXuat) {
        super(bienSo, maSanXuat, chuSoHuu, namSanXuat);
    }

    public XeMay(String bienSo, String maSanXuat, String chuSoHuu, int namSanXuat, double congSuat) {
        super(bienSo, maSanXuat, chuSoHuu, namSanXuat);
        this.congSuat = congSuat;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "Biển số : " + this.bienSo + " | " +
               "Mã sản xuất : " + this.maSanXuat + " | " +
               "Chủ sở hữu : " + this.chuSoHuu + " | " +
               "Năm sản xuất : " + this.namSanXuat + " | " +
               "Công suất : " + this.congSuat;
    }

    @Override
    public String getInfoToCSV() {
        String info = this.bienSo + "," +
                this.maSanXuat + "," +
                this.chuSoHuu + "," +
                this.namSanXuat + "," +
                this.congSuat;
        return info;
    }
}
