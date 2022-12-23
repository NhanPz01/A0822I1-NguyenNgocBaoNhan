package service.impl;

import model.HangSanXuat;
import service.IService;

import java.util.ArrayList;

public class HangSanXuatService implements IService {
    public  ArrayList<HangSanXuat> hangSanXuat = new ArrayList<>();

    public HangSanXuatService() {
       hangSanXuat.add(new HangSanXuat("M1", "Honda", "Viet Nam 1"));
       hangSanXuat.add(new HangSanXuat("M2", "Toyota", "Viet Nam 3"));
       hangSanXuat.add(new HangSanXuat("M3", "Hyundai", "Viet Nam 4"));
    }

    public void display(String maSanXuat) {
        for (HangSanXuat element : hangSanXuat) {
            if (element.getMaSanXuat().equals(maSanXuat)) {
                System.out.println(element);
                break;
            }
        }
    }
    @Override
    public void displayAll() {
        for (HangSanXuat element : hangSanXuat) {
            System.out.println(element);
        }
    }
}
