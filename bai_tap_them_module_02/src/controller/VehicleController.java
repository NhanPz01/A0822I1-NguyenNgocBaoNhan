package controller;

import model.HangSanXuat;
import model.Oto;
import service.impl.HangSanXuatService;
import service.impl.OtoService;
import service.impl.XeMayService;
import service.impl.XeTaiService;

import java.util.Scanner;

public class VehicleController {
    private static HangSanXuatService hangSanXuatService = new HangSanXuatService();
    private static XeTaiService xeTaiService = new XeTaiService();
    private static OtoService otoService = new OtoService();
    private static XeMayService xeMayService = new XeMayService();
    public static void displayVehicleMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.print(
                "CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG" +
                "\n\tChọn chức năng:" +
                "\n\t1. Thêm mới phương tiện" +
                "\n\t2. Hiển thị phương tiện" +
                "\n\t3. Xóa phương tiện" +
                "\n\t4. Tìm kiếm theo biển kiểm soát" +
                "\n\t5. Thoát" +
                "\n--> Chọn: "
            );
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1 : {
                    boolean flagCase1 = true;
                    do {
                        System.out.print(
                            "THÊM MỚI PHƯƠNG TIỆN" +
                            "\n\tChọn chức năng" +
                            "\n\t1. Thêm xe tải" +
                            "\n\t2. Thêm ôtô" +
                            "\n\t3. Thêm xe máy" +
                            "\n\t4. Quay lại" +
                            "\n--> Chọn: "
                        );
                        int chooseCase1 = Integer.parseInt(scanner.nextLine());
                        switch (chooseCase1) {
                            case 1 : {
                                System.out.print("THÊM MỚI XE TẢI");
                                System.out.print("\n\tNhập biển số xe: ");
                                String _bienSo = scanner.nextLine();
                                System.out.println("\n\tCHỌN HÃNG THEO MÃ SẢN XUẤT");
                                hangSanXuatService.displayAll();
                                System.out.print("\n\tNhập mã sản xuất: ");
                                String _maSanXuat = scanner.nextLine();
                                System.out.print("\n\tNhập tên chủ sở hữu: ");
                                String _chuSoHuu = scanner.nextLine();
                                System.out.print("\n\tNhập năm sản xuất: ");
                                int _namSanXuat = Integer.parseInt(scanner.nextLine());
                                System.out.print("\n\tNhập trọng tải: ");
                                double _trongTai = Double.parseDouble(scanner.nextLine());
                                xeTaiService.add(_bienSo, _maSanXuat, _chuSoHuu, _namSanXuat, _trongTai);
                                System.out.println("THÊM MỚI THÀNH CÔNG !");
                                xeTaiService.display(_bienSo);
                                break;
                            }
                            case 2 : {
                                System.out.print("THÊM MỚI XE ÔTÔ");
                                System.out.print("\n\tNhập biển số xe: ");
                                String _bienSo = scanner.nextLine();
                                System.out.println("\n\tCHỌN HÃNG THEO MÃ SẢN XUẤT");
                                hangSanXuatService.displayAll();
                                System.out.print("\n\tNhập mã sản xuất: ");
                                String _maSanXuat = scanner.nextLine();
                                System.out.print("\n\tNhập tên chủ sở hữu: ");
                                String _chuSoHuu = scanner.nextLine();
                                System.out.print("\n\tNhập năm sản xuất: ");
                                int _namSanXuat = Integer.parseInt(scanner.nextLine());
                                System.out.println("\n\tChọn kiểu xe: ");
                                System.out.print(
                                    "\nKIỂU XE" +
                                    "\n\t1. Du lịch" +
                                    "\n\t2. Xe khách" +
                                    "\n--> Chọn: "
                                );
                                int subChoose = Integer.parseInt(scanner.nextLine());
                                Oto.KieuXe _kieuXe;
                                if (subChoose == 1) {
                                    _kieuXe = Oto.KieuXe.DuLich;
                                } else {
                                    _kieuXe = Oto.KieuXe.XeKhach;
                                }
                                System.out.print("\n\tNhập số chỗ ngồi: ");
                                int _soCho = Integer.parseInt(scanner.nextLine());
                                otoService.add(_bienSo, _maSanXuat, _chuSoHuu, _namSanXuat, _soCho, _kieuXe);
                                System.out.println("THÊM MỚI THÀNH CÔNG !");
                                break;
                            }
                            case 3 : {
                                System.out.print("THÊM MỚI XE MÁY");
                                System.out.print("\n\tNhập biển số xe: ");
                                String _bienSo = scanner.nextLine();
                                System.out.println("\n\tCHỌN HÃNG THEO MÃ SẢN XUẤT");
                                hangSanXuatService.displayAll();
                                System.out.print("\n\tNhập mã sản xuất: ");
                                String _maSanXuat = scanner.nextLine();
                                System.out.print("\n\tNhập tên chủ sở hữu: ");
                                String _chuSoHuu = scanner.nextLine();
                                System.out.print("\n\tNhập năm sản xuất: ");
                                int _namSanXuat = Integer.parseInt(scanner.nextLine());
                                System.out.print("\n\tNhập công suất xe: ");
                                double _congSuat = Double.parseDouble(scanner.nextLine());
                                xeMayService.add(_bienSo, _maSanXuat, _chuSoHuu, _namSanXuat, _congSuat);
                                System.out.println("THÊM MỚI THÀNH CÔNG !");
                                break;
                            }
                            default : {
                                flagCase1 = false;
                                break;
                            }
                        }
                    } while (flagCase1);
                    break;
                }
                case 2 : {
                    boolean flagCase2 = true;
                    do {
                        System.out.println(
                            "HIỂN THỊ PHƯƠNG TIỆN" +
                            "\n\tChọn chức năng" +
                            "\n\t1. Hiển thị xe tải" +
                            "\n\t2. Hiển thị ôtô" +
                            "\n\t3. Hiển thị xe máy" +
                            "\n\t4. Quay lại" +
                            "\n--> Chọn: "
                        );
                        int chooseCase2 = Integer.parseInt(scanner.nextLine());
                        switch (chooseCase2) {
                            case 1 : {
                                xeTaiService.displayAll();
                                break;
                            }
                            case 2 : {
                                otoService.displayAll();
                                break;
                            }
                            case 3 : {
                                xeMayService.displayAll();
                                break;
                            }
                            default : {
                                flagCase2 = false;
                                break;
                            }
                        }
                    } while (flagCase2);
                    break;
                }
                case 3 : {
                    boolean flagCase3 = true;
                    do {
                        System.out.print(
                            "\nXÓA PHƯƠNG TIỆN" +
                            "\n\t1. Xóa xe tải" +
                            "\n\t2. Xóa ôtô" +
                            "\n\t3. Xóa xe máy" +
                            "\n\t4. Quay lại" +
                            "\n--> Chọn: "
                        );
                        int chooseCase3 = Integer.parseInt(scanner.nextLine());
                        switch (chooseCase3) {
                            case 1 : {
                                System.out.print("\nXÓA THEO BIỂN SỐ XE");
                                System.out.print("\n\tNhập biển số xe: ");
                                String _bienSo = scanner.nextLine();
                                System.out.println("\nSẽ xóa: ");
                                xeTaiService.display(_bienSo);
                                try {
                                    xeTaiService.remove(_bienSo);
                                } catch (Exception e) {
                                    e.getStackTrace();
                                }
                                System.out.println("\nĐÃ XÓA !");
                                break;
                            }
                            case 2 : {
                                System.out.print("\nXÓA THEO BIỂN SỐ XE");
                                System.out.print("\n\tNhập biển số xe: ");
                                String _bienSo = scanner.nextLine();
                                System.out.println("\nSẽ xóa: ");
                                otoService.display(_bienSo);
                                try {
                                    otoService.remove(_bienSo);
                                } catch (Exception e) {
                                    e.getStackTrace();
                                }
                                System.out.println("\nĐÃ XÓA !");
                                break;
                            }
                            case 3 : {
                                System.out.print("\nXÓA THEO BIỂN SỐ XE");
                                System.out.print("\n\tNhập biển số xe: ");
                                String _bienSo = scanner.nextLine();
                                System.out.println("\nSẽ xóa: ");
                                xeMayService.display(_bienSo);
                                try {
                                    xeMayService.remove(_bienSo);
                                } catch (Exception e) {
                                    e.getStackTrace();
                                }
                                System.out.println("\nĐÃ XÓA !");
                                break;
                            }
                            default : {
                                flagCase3 = false;
                                break;
                            }
                        }
                    } while (flagCase3);
                    break;
                }
                case 4 : {
                    break;
                }
                default : {
                    flag = false;
                    break;
                }
            }
        } while (flag);
    }
}
