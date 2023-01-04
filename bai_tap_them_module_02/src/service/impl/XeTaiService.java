package service.impl;

import model.XeTai;
import service.IService;
import util.ReadAndWriteXeTai;

import java.util.ArrayList;
import java.util.List;

public class XeTaiService implements IService {
    private final String XE_TAI_DATA = "src/data/xeTaiList.csv";
    public void add(String _bienSo, String _maSanXuat, String _chuSoHuu, int _namSanXuat, double _trongTai) {
        List<XeTai> xeTaiList = ReadAndWriteXeTai.readXeTaiListFromCSV(XE_TAI_DATA);
        xeTaiList = ReadAndWriteXeTai.readXeTaiListFromCSV(XE_TAI_DATA);
        xeTaiList.add(new XeTai(_bienSo, _maSanXuat, _chuSoHuu, _namSanXuat, _trongTai));
        ReadAndWriteXeTai.writeXeTaiListToCSV(XE_TAI_DATA, xeTaiList, false);
    }
    public void remove(String _bienSo) {
        List<XeTai> xeTaiList = new ArrayList<>();
        xeTaiList = ReadAndWriteXeTai.readXeTaiListFromCSV(XE_TAI_DATA);
        for (XeTai element : xeTaiList) {
            if (element.getBienSo().equals(_bienSo)) {
                xeTaiList.remove(element);
                break;
            }
        }
        ReadAndWriteXeTai.writeXeTaiListToCSV(XE_TAI_DATA, xeTaiList, true);
    }
    @Override
    public void display(String _bienSo) {
        List<XeTai> xeTaiList = new ArrayList<>();
        xeTaiList = ReadAndWriteXeTai.readXeTaiListFromCSV(XE_TAI_DATA);
        for (XeTai element : xeTaiList) {
            if (element.getBienSo().equals(_bienSo)) {
                System.out.println(element);
                break;
            }
        }
        ReadAndWriteXeTai.writeXeTaiListToCSV(XE_TAI_DATA, xeTaiList, true);
    }
    @Override
    public void displayAll() {
        List<XeTai> xeTaiList = new ArrayList<>();
        xeTaiList = ReadAndWriteXeTai.readXeTaiListFromCSV(XE_TAI_DATA);
        for (XeTai element : xeTaiList) {
            System.out.println(element);
        }
        ReadAndWriteXeTai.writeXeTaiListToCSV(XE_TAI_DATA, xeTaiList, true);
    }
}
