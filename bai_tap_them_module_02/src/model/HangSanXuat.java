package model;

public class HangSanXuat {
    private String maSanXuat;
    private String tenHang;
    private String quocGia;

    public HangSanXuat() {
    }

    public HangSanXuat(String maSanXuat, String tenHang, String quocGia) {
        this.maSanXuat = maSanXuat;
        this.tenHang = tenHang;
        this.quocGia = quocGia;
    }

    public String getMaSanXuat() {
        return maSanXuat;
    }

    public void setMaSanXuat(String maSanXuat) {
        this.maSanXuat = maSanXuat;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }
}
