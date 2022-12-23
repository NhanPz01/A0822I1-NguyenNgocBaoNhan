package service.impl;

import model.Oto;
import model.XeMay;
import model.XeTai;
import service.IService;

import java.util.ArrayList;

public class XeMayService implements IService {
    public ArrayList<XeMay> xeMay = new ArrayList<>();

    public XeMayService() {
        xeMay.add(new XeMay("104001", "M2", "Nhan 1", 2001, 50));
    }

    public void add(String _bienSo, String _maSanXuat, String _chuSoHuu, int _namSanXuat, double _congSuat) {
        xeMay.add(new XeMay(_bienSo, _maSanXuat, _chuSoHuu, _namSanXuat, _congSuat));
    }
    public void remove(String _bienSo) {
        for (XeMay element : xeMay) {
            if (element.getBienSo().equals(_bienSo)) {
                xeMay.remove(element);
            }
        }
    }
    public void display(String _bienSo) {
        for (XeMay element : xeMay) {
            if (element.getBienSo().equals(_bienSo)) {
                System.out.println(element);
            }
        }
    }
    @Override
    public void displayAll() {
        for (XeMay element : xeMay) {
            System.out.println(element);
        }
    }
}
