package service.impl;

import model.HangSanXuat;
import service.IService;
import util.ReadAndWriteHangSanXuat;

import java.util.ArrayList;
import java.util.List;

public class HangSanXuatService implements IService {

    private final String HANG_SAN_XUAT_DATA = "src/data/hangSanXuat.csv";
    public void display(String maSanXuat) {
        List<HangSanXuat> hangSanXuatList = new ArrayList<>();
        hangSanXuatList = ReadAndWriteHangSanXuat.readHangSanXuatListFromCSV(HANG_SAN_XUAT_DATA );
        for (HangSanXuat element : hangSanXuatList) {
            if (element.getMaSanXuat().equals(maSanXuat)) {
                System.out.println(element);
                break;
            }
        }
    }
    @Override
    public void displayAll() {
        List<HangSanXuat> hangSanXuatList = new ArrayList<>();
        hangSanXuatList = ReadAndWriteHangSanXuat.readHangSanXuatListFromCSV(HANG_SAN_XUAT_DATA );
        for (HangSanXuat element : hangSanXuatList) {
            System.out.println(element);
        }
    }
}
