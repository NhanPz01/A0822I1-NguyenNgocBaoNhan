package controller;

import model.Customer;
import service.CustomerService;
import util.ConstantUtil;
import util.Validation;

import java.util.Scanner;

public class Controller {
    private static CustomerService customerService = new CustomerService();
    private static Scanner scanner = new Scanner(System.in);

    public static void mainMenu() {

        boolean flag = true;
        do {
            System.out.print(
                    "----CHƯƠNG TrìNH QUẢN LÝ DANH BẠ----" +
                            "\n Chọn chức năng theo số (để tiếp tục)" +
                            "\n\t1. Xem danh sách" +
                            "\n\t2. Thêm mới" +
                            "\n\t3. Cập nhật" +
                            "\n\t4. Xóa" +
                            "\n\t5. Tìm kiếm" +
                            "\n\t6. Đọc từ file" +
                            "\n\t7. Ghi vào file" +
                            "\n\t8. Thoát" +
                            "\n Chọn chức năng: "
            );
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> {
                    customerService.display();
                }
                case 2 -> {
                    try {
                        System.out.print("Số điện thoại: ");
                        String phoneNumber = scanner.nextLine();
                        System.out.print("Nhóm: ");
                        String group = scanner.nextLine();
                        System.out.print("Họ và tên: ");
                        String name = scanner.nextLine();
                        System.out.print("Giới tính: ");
                        String gender = scanner.nextLine();
                        System.out.print("Địa chỉ: ");
                        String address = scanner.nextLine();
                        System.out.print("Ngày sinh: ");
                        String dateOfBirth = scanner.nextLine();
                        System.out.print("Email: ");
                        String email = scanner.nextLine();
                        Customer customer = new Customer(name, phoneNumber, address, email, "", gender, dateOfBirth, group);
                        customerService.add(customer);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                case 3 -> {
                    String phoneNumber;
                    do {
                        System.out.print("Số điện thoại: ");
                        phoneNumber = scanner.nextLine();
                    } while (!customerService.isExist(phoneNumber));
                    if (customerService.isExist(phoneNumber)) {
                        System.out.print(
                                "1. Nhóm của danh bạ" +
                                        "\n2. Họ tên" +
                                        "\n3. Giới tính" +
                                        "\n4. Địa chỉ" +
                                        "\n5. Ngày sinh" +
                                        "\n6. Email" +
                                        "\nChọn: "
                        );
                        int editChoice = Integer.parseInt(scanner.nextLine());
                        switch (editChoice) {
                            case 1 -> {
                                System.out.print("Nhóm: ");
                                String group = scanner.nextLine();
                                for (Customer customer : customerService.getAll()) {
                                    if (customer.getPhoneNumber().equals(phoneNumber)) {
                                        customer.setGroupOfPhoneNumber(group);
                                    }
                                }
                            }
                            case 2 -> {
                                System.out.print("Họ tên: ");
                                String name = scanner.nextLine();
                                for (Customer customer : customerService.getAll()) {
                                    if (customer.getPhoneNumber().equals(phoneNumber)) {
                                        customer.setName(name);
                                    }
                                }
                            }
                            case 3 -> {
                                System.out.print("Giới tính: ");
                                String gender = scanner.nextLine();
                                for (Customer customer : customerService.getAll()) {
                                    if (customer.getPhoneNumber().equals(phoneNumber)) {
                                        customer.setGender(gender);
                                    }
                                }
                            }
                            case 4 -> {
                                System.out.print("Địa chỉ: ");
                                String address = scanner.nextLine();
                                for (Customer customer : customerService.getAll()) {
                                    if (customer.getPhoneNumber().equals(phoneNumber)) {
                                        customer.setAddress(address);
                                    }
                                }
                            }
                            case 5 -> {
                                System.out.print("Ngày sinh: ");
                                String dateOfBirth = scanner.nextLine();
                                for (Customer customer : customerService.getAll()) {
                                    if (customer.getPhoneNumber().equals(phoneNumber)) {
                                        customer.setDateOfBirth(dateOfBirth);
                                    }
                                }
                            }
                            case 6 -> {
                                System.out.print("Email: ");
                                String email = scanner.nextLine();
                                for (Customer customer : customerService.getAll()) {
                                    if (customer.getPhoneNumber().equals(phoneNumber)) {
                                        customer.setEmail(email);
                                    }
                                }
                            }
                        }
                    } else {
                        System.out.println("Không tìm được danh bạ với số điện thoại trên.");
                    }
                }
                case 4 -> {
                    System.out.print("Số điện thoại: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Bạn có chắc chắn xóa?\nY. Có\nN. Không\nChọn: ");
                    String deleteChoice = scanner.nextLine();
                    if (deleteChoice.equals("Y") || deleteChoice.equals("y")) {
                        customerService.delete(phoneNumber);
                    }
                }
                case 5 -> {
                    System.out.print("Số điện thoại: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.println(customerService.search(phoneNumber));
                }
                case 6 -> {
                    customerService.readFromFile();
                    System.out.println("Đọc thành công");
                }
                case 7 -> {
                    customerService.saveToFile();
                }
                default -> {
                    flag = false;
                }
            }
        } while (flag);
    }
}
