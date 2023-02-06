package service;

import model.Customer;
import util.ConstantUtil;
import util.FileHelper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class CustomerService {
    private List<Customer> customers;
    private FileHelper<Customer> fileCustomer = new FileHelper<>();

    public CustomerService() {
        customers = toCustomers();
    }
    public boolean isExist(String phoneNumber) {
        for (Customer customer : customers) {
            if (customer.getPhoneNumber().equals(phoneNumber)) {
                return true;
            }
        }
        return false;
    }
    private List<Customer> toCustomers() {
        List<Customer> res = new ArrayList<>();
        List<String> lines = fileCustomer.read(ConstantUtil.filePath.phoneData);
        try {
            for (String line : lines) {
                String[] temp = line.split(",");
                String name = temp[0];
                String phoneNumber = temp[1];
                String address = temp[2];
                String email = temp[3];
                String facebook = temp[4];
                String gender = temp[5];
                String dateOfBirth = temp[6];
                String group = temp[7];
                Customer customer = new Customer(name, phoneNumber, address, email, facebook, gender, dateOfBirth, group);
                res.add(customer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    public List<Customer> getAll() {
        return customers;
    }

    public void display() {
        Scanner scanner = new Scanner(System.in);
        for (Customer customer : customers) {
            System.out.println(customer);
            System.out.print("Bấm Enter để tiếp tục...");
            String stop = scanner.nextLine();
        }
    }

    public void add(Customer customer) {
        customers.add(customer);
        fileCustomer.write(ConstantUtil.filePath.phoneData, customers, false);
    }

    public void edit() {

    }

    public boolean delete(String phoneNumber) {
        if (customers.removeIf(e -> e.getPhoneNumber().equals(phoneNumber))) {
            fileCustomer.write(ConstantUtil.filePath.phoneData, customers, false);
            return true;
        }
        return false;
    }

    public List<Customer> search(String phoneNumber) {
        return Stream.of(customers).flatMap(Collection::stream).filter(e -> e.getPhoneNumber().contains(phoneNumber)).toList();
    }

    public List<Customer> readFromFile() {
        return customers;
    }

    public void saveToFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bạn có chắc chắn? Thao tác không thể hoàn tác\n1. Có\n2. Không\n Chọn: ");
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice == 1) {
            fileCustomer.write(ConstantUtil.filePath.phoneData, customers, false);
            System.out.println("Lưu thành công");
        }
    }
}
