package service.impl;

import model.Oto;
import model.XeTai;
import service.IService;

import java.util.ArrayList;

public class OtoService implements IService {
    public ArrayList<Oto> oto = new ArrayList<>();

    public OtoService() {
        oto.add(new Oto("103001", "M1", "Nhan 1", 2010, 4, Oto.KieuXe.DuLich));
        oto.add(new Oto("103002", "M2", "Nhan 2", 2018, 16, Oto.KieuXe.XeKhach));
    }
    public void add(String _bienSo, String _maSanXuat, String _chuSoHuu, int _namSanXuat, int _soCho, Oto.KieuXe _kieuXe) {
        oto.add(new Oto(_bienSo, _maSanXuat, _chuSoHuu, _namSanXuat, _soCho, _kieuXe));
    }

    public void remove(String _bienSo) {
        for (Oto element : oto) {
            if (element.getBienSo().equals(_bienSo)) {
                oto.remove(element);
            }
        }
    }
    public void display(String _bienSo) {
        for (Oto element : oto) {
            if (element.getBienSo().equals(_bienSo)) {
                System.out.println(element);
            }
        }
    }
    @Override
    public void displayAll() {
        for (Oto element : oto) {
            System.out.println(element);
        }
    }
}
