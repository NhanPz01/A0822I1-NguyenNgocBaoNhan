package service.impl;

import model.XeTai;
import service.IService;

import java.util.ArrayList;

public class XeTaiService implements IService {
    public ArrayList<XeTai> xeTai = new ArrayList<>();

    public XeTaiService() {
        xeTai.add(new XeTai("10201", "M1", "Nhan 1", 2021, 50));
    }

    public void add(String _bienSo, String _maSanXuat, String _chuSoHuu, int _namSanXuat, double _trongTai) {

        xeTai.add(new XeTai(_bienSo, _maSanXuat, _chuSoHuu, _namSanXuat, _trongTai));
    }
    public void remove(String _bienSo) {
        for (XeTai element : xeTai) {
            if (element.getBienSo().equals(_bienSo)) {
                xeTai.remove(element);
            }
        }
    }
    public void display(String _bienSo) {
        for (XeTai element : xeTai) {
            if (element.getBienSo().equals(_bienSo)) {
                System.out.println(element);
            }
        }
    }
    @Override
    public void displayAll() {
        for (XeTai element : xeTai) {
            System.out.println(element);
        }
    }
}
