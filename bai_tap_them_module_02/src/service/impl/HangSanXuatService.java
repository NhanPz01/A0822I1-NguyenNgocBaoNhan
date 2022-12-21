package service.impl;

import model.HangSanXuat;

import java.util.ArrayList;

public class HangSanXuatService {
    public static ArrayList<HangSanXuat> hangSanXuat = new ArrayList<>();
    static {
        new HangSanXuat("01", "Honda", "Viet Nam");
        new HangSanXuat("02", "Yamaha", "Viet Bac");
        new HangSanXuat("03", "Toyota", "Viet Dong");
        new HangSanXuat("04", "Hyundai", "Viet Tay");
    }
    public HangSanXuat choose(int input) {
        switch (input) {
            case 1 : {
                return hangSanXuat.get(0);
            }
            default : {
                return hangSanXuat.get(3);
            }
        }
    }
}
