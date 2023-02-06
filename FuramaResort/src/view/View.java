package view;

import model.Customer;
import model.Employee;
import util.ConstantUtil.Level;
import util.ConstantUtil.CustomerType;
import util.ConstantUtil.Gender;

import java.util.List;
import java.util.Scanner;

public class View {
    //region fields
    private static Scanner scanner = new Scanner(System.in);
    //endregion
    public static void main(String[] args) {

        boolean mainFlag = true;
        do {
            System.out.println("----MAIN MENU----");
            System.out.println(
                    "1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management\n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit"
            );
            int mainChoice = getChoice();
            switch (mainChoice) {
                case 1 -> {
                    employeeMenu();
                }
                case 2 -> {
                    customerMenu();
                }
                case 3 -> {
                    facilityMenu();
                }
                case 4 -> {
                    bookingMenu();
                }
                case 5 -> {
                    promotionMenu();
                }
                default -> {
                    mainFlag = false;
                }
            }
        } while (mainFlag);
    }

    private static void employeeMenu() {
        boolean employeeFlag = true;
        do {
            System.out.println("----EMPLOYEE MENU----");
            System.out.println(
                    "1. Display list employees\n" +
                    "2. Add new employees\n" +
                    "3. Edit employee\n" +
                    "4. Return to main menu"
            );
            int employeeChoice = getChoice();
            switch (employeeChoice) {
                case 1 -> {
//                    displayEmployee(employeeService.getAll());
                }
                case 2 -> {
//                    addCustomer();
                }
                case 3 -> {
//                    editCustomer();
                }
                default -> {
                    employeeFlag = false;
                }
            }
        } while (employeeFlag);
    }
    private static void customerMenu() {
        boolean customerFlag = true;
        do {
            System.out.println("----CUSTOMER MENU----");
            System.out.println(
                    "1. Display list customers\n" +
                    "2. Add new customers\n" +
                    "3. Edit customer\n" +
                    "4. Return to main menu"
            );
            int customerChoice = getChoice();
            switch (customerChoice) {
                case 1 -> {
//                    displayCustomer(customerService.getAll());
                }
                case 2 -> {
//                    addEmployee();
                }
                case 3 -> {
//                    editCustomer();
                }
                default -> {
                    customerFlag = false;
                }
            }
        } while (customerFlag);
    }
    private static void facilityMenu() {}
    private static void bookingMenu() {}
    private static void promotionMenu() {}

    //region private function
    private static int getChoice() {
        System.out.printf("Enter your choice: ");
        return Integer.parseInt(scanner.nextLine());
    }

    private static String getInput(String message) {
        System.out.printf(message);
        return scanner.nextLine();
    }
    //region employee methods
//    private static void displayEmployee(List<Employee> employees) {
//        if(employees.size() > 0){
//            System.out.printf("%-20s %-30s %-30s %-10s %20s %20s %20s %20s %30s %30s %n", "ID", "FULL NAME", "DATE OF BIRTH", "GENDER", "PERSON ID", "PHONE NUMBER", "EMAIL", "LEVEL", "ROLE", "SALARY");
//            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
//
//            for(Employee employee : employees){
//                System.out.printf("%-20s %-30s %-30s %-10s %20s %20s %20s %20s %30s %30s %n", employee.getEmployeeId(), employee.getFullName(), employee.getDateOfBirth(), employee.getGender(), employee.getPersonId(), employee.getPhoneNumber(), employee.getEmail(), employee.getLevel(), employee.getRole(), employee.getSalary());
//            }
//        }
//        else {
//            System.out.println("Empty list...");
//        }
//    }
//    private static void addEmployee() {
//        int employeeId = 0;
//        boolean flag = true;
//        do {
//            employeeId = Integer.parseInt(getInput("Enter employee id: "));
//            if (employeeService.isExist(employeeId)) {
//                System.out.println("The employee id is not exist! Please enter again!");
//            } else {
//                flag = false;
//            }
//        } while (flag);
//        String fullName = getInput("Enter employee full name: ");
//        String dateOfBirth = getInput("Enter employee's birthday: ");
//        Gender gender = Gender.valueOf(getInput("Enter employee gender: "));
//        String personId = getInput("Enter employee person ID: ");
//        String phoneNumber = getInput("Enter employee's phone number: ");
//        String email = getInput("Enter employee's email: ");
//        CustomerType customerType = CustomerType.valueOf(getInput("Enter customer type: "));
//        Level level = ConstantUtil.Level.valueOf(getInput("Enter employee level: "));
//        String address = getInput("Enter customer's address: ");
//        Customer customer = new Customer(employeeId, fullName, dateOfBirth, gender, personId, phoneNumber, email, customerType, address);
//        customerService.add(customer);
//        System.out.println("Created successfully!");
//    }

    //endregion
    //region customer methods
//    private static void displayCustomer(List<Customer> customers){
//
//        if(customers.size() > 0){
//            System.out.printf("%-20s %-30s %-30s %-10s %20s %20s %20s %20s %30s %n", "ID", "FULL NAME", "DATE OF BIRTH", "GENDER", "PERSON ID", "PHONE NUMBER", "EMAIL", "CUSTOMER TYPE", "ADDRESS");
//            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
//
//            for(Customer customer: customers){
//                System.out.printf("%-20s %-30s %-30s %-10s %20s %20s %20s %20s %30s %n", customer.getCustomerId(), customer.getFullName(), customer.getDateOfBirth(), customer.getGender(), customer.getPersonId(), customer.getPhoneNumber(), customer.getEmail(), customer.getCustomerType(), customer.getAddress());
//            }
//        }
//        else {
//            System.out.println("Empty list...");
//        }
//    }
//
//    private static void addCustomer() {
//        int customerId = 0;
//        boolean flag = true;
//        do {
//            customerId = Integer.parseInt(getInput("Enter customer id: "));
//            if (customerService.isExist(customerId)) {
//                System.out.println("The customer id is not exist! Please enter again!");
//            } else {
//                flag = false;
//            }
//        } while (flag);
//        String fullName = getInput("Enter customer full name: ");
//        String dateOfBirth = getInput("Enter customer's birthday: ");
//        Gender gender = Gender.valueOf(getInput("Enter customer gender: "));
//        String personId = getInput("Enter customer person ID: ");
//        String phoneNumber = getInput("Enter customer's phone number: ");
//        String email = getInput("Enter customer's email: ");
//        CustomerType customerType = CustomerType.valueOf(getInput("Enter customer type: "));
//        String address = getInput("Enter customer's address: ");
//        Customer customer = new Customer(customerId, fullName, dateOfBirth, gender, personId, phoneNumber, email, customerType, address);
//        customerService.add(customer);
//        System.out.println("Created successfully!");
//    }
//
//    private static void editCustomer() {
//        boolean customerEditFlag = true;
//        do {
//            System.out.println("----EDIT CUSTOMER MENU----");
//            System.out.println(
//                    "1. Full Name\n" +
//                    "2. Date of birth\n" +
//                    "3. Gender\n" +
//                    "4. Person ID\n" +
//                    "5. Phone number\n" +
//                    "6. Email\n" +
//                    "7. Customer type\n" +
//                    "8. Address\n" +
//                    "9. Return to Customer menu"
//            );
//            int customerEditChoice = Integer.parseInt(getInput("Enter your edit choice: "));
//            int customerId = 0;
//            if (customerEditChoice != 9) {
//                customerId = Integer.parseInt(getInput("Enter customer id: "));
//            }
//            switch (customerEditChoice) {
//                case 1 -> {
//                    if (customerService.isExist(customerId)) {
//                        System.out.println("Current: " );
//                        String fullName = getInput("Enter new full name: ");
//                        Customer customer = new Customer();
//                        customer.setCustomerId(customerId);
//                        customer.setFullName(fullName);
//                        customerService.edit(customer, customerEditChoice);
//                    } else {
//                        System.out.println("This customer id is not exist!");
//                    }
//                }
//                case 2 -> {
//                    if (customerService.isExist(customerId)) {
//                        System.out.println();
//                        String dateOfBirth = getInput("Enter new date of birth: ");
//                        Customer customer = new Customer();
//                        customer.setCustomerId(customerId);
//                        customer.setDateOfBirth(dateOfBirth);
//                        customerService.edit(customer, customerEditChoice);
//                    } else {
//                        System.out.println("This customer id is not exist!");
//                    }
//                }
//                case 3 -> {
//                    if (customerService.isExist(customerId)) {
//                        System.out.println();
//                        Gender gender = Gender.valueOf(getInput("Enter new gender: "));
//                        Customer customer = new Customer();
//                        customer.setCustomerId(customerId);
//                        customer.setGender(gender);
//                        customerService.edit(customer, customerEditChoice);
//                    } else {
//                        System.out.println("This customer id is not exist!");
//                    }
//                }
//                case 4 -> {
//                    if (customerService.isExist(customerId)) {
//                        System.out.println();
//                        String personId = getInput("Enter new person id: ");
//                        Customer customer = new Customer();
//                        customer.setCustomerId(customerId);
//                        customer.setPersonId(personId);
//                        customerService.edit(customer, customerEditChoice);
//                    } else {
//                        System.out.println("This customer id is not exist!");
//                    }
//                }
//                case 5 -> {
//                    if (customerService.isExist(customerId)) {
//                        System.out.println();
//                        String phoneNumber = getInput("Enter new phone number: ");
//                        Customer customer = new Customer();
//                        customer.setCustomerId(customerId);
//                        customer.setPhoneNumber(phoneNumber);
//                        customerService.edit(customer, customerEditChoice);
//                    } else {
//                        System.out.println("This customer id is not exist!");
//                    }
//                }
//                case 6 -> {
//                    if (customerService.isExist(customerId)) {
//                        System.out.println();
//                        String email = getInput("Enter new email: ");
//                        Customer customer = new Customer();
//                        customer.setCustomerId(customerId);
//                        customer.setEmail(email);
//                        customerService.edit(customer, customerEditChoice);
//                    } else {
//                        System.out.println("This customer id is not exist!");
//                    }
//                }
//                case 7 -> {
//                    if (customerService.isExist(customerId)) {
//                        System.out.println();
//                        CustomerType customerType = CustomerType.valueOf(getInput("Enter new customer type: "));
//                        Customer customer = new Customer();
//                        customer.setCustomerId(customerId);
//                        customer.setCustomerType(customerType);
//                        customerService.edit(customer, customerEditChoice);
//                    } else {
//                        System.out.println("This customer id is not exist!");
//                    }
//                }
//                case 8 -> {
//                    if (customerService.isExist(customerId)) {
//                        System.out.println();
//                        String address = getInput("Enter new address: ");
//                        Customer customer = new Customer();
//                        customer.setCustomerId(customerId);
//                        customer.setAddress(address);
//                        customerService.edit(customer, customerEditChoice);
//                    } else {
//                        System.out.println("This customer id is not exist!");
//                    }
//                }
//                default -> {
//                    customerEditFlag = false;
//                }
//            }
//        } while (customerEditFlag);
//    }
    //endregion
    //endregion
}
