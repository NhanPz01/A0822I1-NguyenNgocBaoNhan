package model;

public class PhuongTien {
    protected String bienSo;
    protected HangSanXuat hangSanXuat;
    protected String chuSoHuu;
    protected int namSanXuat;

    public PhuongTien() {
    }

    public PhuongTien(String bienSo, String tenHang, String chuSoHuu, int namSanXuat) {
        this.bienSo = bienSo;
        this.hangSanXuat.setTenHang(tenHang);
        this.chuSoHuu = chuSoHuu;
        this.namSanXuat = namSanXuat;
    }

    @Override
    public String toString() {
        return "Bien so xe : " + this.bienSo + " | " +
                "Ten hang : " + this.hangSanXuat.getTenHang() + " | " +
                "Nam san xuat : " + this.namSanXuat + " | " +
                "Chu so huu : " + this.chuSoHuu;
    }
}
