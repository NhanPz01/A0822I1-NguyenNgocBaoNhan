package model;

public class Oto extends PhuongTien {
    public enum KieuXe {
        DuLich,
        XeKhach
    }
    private int soCho;
    private KieuXe kieuXe;

    public Oto(String s, String s1, String s2, int i, double v) {
    }

    public Oto(int soCho, KieuXe kieuXe) {
        this.soCho = soCho;
        this.kieuXe = kieuXe;
    }

    public Oto(String bienSo, String maSanXuat, String chuSoHuu, int namSanXuat, int soCho, KieuXe kieuXe) {
        super(bienSo, maSanXuat, chuSoHuu, namSanXuat);
        this.soCho = soCho;
        this.kieuXe = kieuXe;
    }

    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }

    public KieuXe getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(KieuXe kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "Biển số : " + this.bienSo + " | " +
                "Mã sản xuất : " + this.maSanXuat + " | " +
                "Chủ sở hữu : " + this.chuSoHuu + " | " +
                "Năm sản xuất : " + this.namSanXuat + " | " +
                "Kiểu xe : " + this.kieuXe + " | " +
                "Số chỗ : " + this.soCho + " | ";
    }

    @Override
    public String getInfoToCSV() {
        String info = this.bienSo + "," +
                this.maSanXuat + "," +
                this.chuSoHuu + "," +
                this.namSanXuat + "," +
                this.kieuXe + "," +
                this.soCho;
        return info;
    }
}
