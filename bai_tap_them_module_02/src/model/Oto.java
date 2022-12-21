package model;

public class Oto extends PhuongTien {
    public enum KieuXe {
        DuLich,
        XeKhach
    }
    private int soCho;
    private KieuXe kieuXe;

    public Oto() {
    }

    public Oto(int soCho, KieuXe kieuXe) {
        this.soCho = soCho;
        this.kieuXe = kieuXe;
    }

    public Oto(String bienSo, String tenHang, String chuSoHuu, int namSanXuat, int soCho, KieuXe kieuXe) {
        super(bienSo, tenHang, chuSoHuu, namSanXuat);
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
}
