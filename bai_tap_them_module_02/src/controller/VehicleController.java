package controller;

import service.impl.OtoService;

import java.util.Scanner;

public class VehicleController {
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
                "\n--> Chọn:"
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
                            "\n--> Chọn:"
                        );
                        int chooseCase1 = Integer.parseInt(scanner.nextLine());
                        switch (chooseCase1) {
                            case 1 : {

                                break;
                            }
                            case 2 : {
                                OtoService otoService = new OtoService();
                                otoService.add();
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
                    break;
                }
                case 3 : {
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
