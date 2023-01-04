package service.impl;

import model.XeMay;
import service.IService;
import util.ReadAndWriteXeMay;

import java.util.ArrayList;
import java.util.List;

public class XeMayService implements IService {
    private final String XE_MAY_DATA = "src/data/xeMayList.csv";

    public void add(String _bienSo, String _maSanXuat, String _chuSoHuu, int _namSanXuat, double _congSuat) {
        List<XeMay> xeMayList = new ArrayList<>();
        xeMayList = ReadAndWriteXeMay.readXeMayListFromCSV(XE_MAY_DATA);
        xeMayList.add(new XeMay(_bienSo, _maSanXuat, _chuSoHuu, _namSanXuat, _congSuat));
        ReadAndWriteXeMay.writeXeMayListToCSV(XE_MAY_DATA, xeMayList, true);
    }

    public void remove(String _bienSo) {
        List<XeMay> xeMayList = new ArrayList<>();
        xeMayList = ReadAndWriteXeMay.readXeMayListFromCSV(XE_MAY_DATA);
        for (XeMay element : xeMayList) {
            if (element.getBienSo().equals(_bienSo)) {
                xeMayList.remove(element);
                break;
            }
        }
        ReadAndWriteXeMay.writeXeMayListToCSV(XE_MAY_DATA, xeMayList, true);
    }

    @Override
    public void display(String _bienSo) {
        List<XeMay> xeMayList = new ArrayList<>();
        xeMayList = ReadAndWriteXeMay.readXeMayListFromCSV(XE_MAY_DATA);
        for (XeMay element : xeMayList) {
            if (element.getBienSo().equals(_bienSo)) {
                System.out.println(element);
                break;
            }
        }
        ReadAndWriteXeMay.writeXeMayListToCSV(XE_MAY_DATA, xeMayList, true);
    }

    @Override
    public void displayAll() {
        List<XeMay> xeMayList = new ArrayList<>();
        xeMayList = ReadAndWriteXeMay.readXeMayListFromCSV(XE_MAY_DATA);
        for (XeMay element : xeMayList) {
            System.out.println(element);
        }
        ReadAndWriteXeMay.writeXeMayListToCSV(XE_MAY_DATA, xeMayList, true);
    }
}
