package service.impl;

import model.Oto;
import model.PhuongTien;
import service.IOtoService;

import java.util.ArrayList;
import java.util.List;

public class OtoService implements IOtoService {
    public static ArrayList<Oto> oto = new ArrayList<>();

    static {
        new Oto("0123", "Yamahaaaa", "Bao Nhan", 2020, 4, Oto.KieuXe.XeKhach);
        new Oto("0456", "Hondaaaaa", "Ngoc Nhan", 2018, 16, Oto.KieuXe.DuLich);
    }

    @Override
    public void add() {
        System.out.println("Added !");
    }
}
