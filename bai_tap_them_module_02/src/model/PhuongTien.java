package model;

public class PhuongTien {
    protected String bienSo;
    protected String maSanXuat;
    protected String chuSoHuu;
    protected int namSanXuat;

    public PhuongTien() {
    }

    public PhuongTien(String bienSo, String maSanXuat, String chuSoHuu, int namSanXuat) {
        this.bienSo = bienSo;
        this.maSanXuat = maSanXuat;
        this.chuSoHuu = chuSoHuu;
        this.namSanXuat = namSanXuat;
    }

    public String getBienSo() {
        return bienSo;
    }

    public void setBienSo(String bienSo) {
        this.bienSo = bienSo;
    }

    public String getMaSanXuat() {
        return maSanXuat;
    }

    public void setMaSanXuat(String maSanXuat) {
        this.maSanXuat = maSanXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }
}
