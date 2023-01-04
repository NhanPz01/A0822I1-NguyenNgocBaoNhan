package service.impl;

import model.Oto;
import service.IService;
import util.ReadAndWriteOto;
import util.ReadAndWriteXeMay;

import java.util.ArrayList;
import java.util.List;

public class OtoService implements IService {
    private final String OTO_DATA = "src/data/otoList.csv";

    public void add(String _bienSo, String _maSanXuat, String _chuSoHuu, int _namSanXuat, int _soCho, Oto.KieuXe _kieuXe) {
        List<Oto> otoList = new ArrayList<>();
        otoList = ReadAndWriteOto.readOtoListFromCSV(OTO_DATA);
        otoList.add(new Oto(_bienSo, _maSanXuat, _chuSoHuu, _namSanXuat, _soCho, _kieuXe));
        ReadAndWriteOto.writeOtoListToCSV(OTO_DATA, otoList, false);
    }

    public void remove(String _bienSo) {
        List<Oto> otoList = new ArrayList<>();
        otoList = ReadAndWriteOto.readOtoListFromCSV(OTO_DATA);
        for (Oto element : otoList) {
            if (element.getBienSo().equals(_bienSo)) {
                otoList.remove(element);
                break;
            }
        }
        ReadAndWriteOto.writeOtoListToCSV(OTO_DATA, otoList, false);
    }
    @Override
    public void display(String _bienSo) {
        List<Oto> otoList = new ArrayList<>();
        otoList = ReadAndWriteOto.readOtoListFromCSV(OTO_DATA);
        for (Oto element : otoList) {
            if (element.getBienSo().equals(_bienSo)) {
                System.out.println(element);
                break;
            }
        }
    }
    @Override
    public void displayAll() {
        List<Oto> otoList = new ArrayList<>();
        otoList = ReadAndWriteOto.readOtoListFromCSV(OTO_DATA);
        for (Oto element : otoList) {
            System.out.println(element);
        }
    }
}
