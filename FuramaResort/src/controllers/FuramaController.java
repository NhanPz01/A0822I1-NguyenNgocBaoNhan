package controllers;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        boolean flag = true;
        do {
            System.out.print(
                    "/-----/Main menu/-----/" +
                            "\n1. Employee Management" +
                            "\n2. Customer Management" +
                            "\n3. Facility Management" +
                            "\n4. Booking Management" +
                            "\n5. Promotion Management" +
                            "\n6. Exit" +
                            "\nYour choice : "
            );
            Scanner scanner = new Scanner(System.in);
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    // Employee
                    System.out.print(
                            "/-----/Employee menu/-----/" +
                                    "\n1. Display list employees" +
                                    "\n2. Add new employee" +
                                    "\n3. Edit employee" +
                                    "\n4. Return main menu" +
                                    "\nYour choice : "
                    );
                    int employeeChoose = Integer.parseInt(scanner.nextLine());
                    switch (employeeChoose) {
                        case 1:
                            // Display list employees
                            break;
                        case 2:
                            // Add new employee
                            break;
                        case 3:
                            // Edit employee
                            break;
                        default:
                            // Exit
                            break;
                    }
                    break;
                case 2:
                    // Customer
                    System.out.print(
                            "/-----/Customer menu/-----/" +
                                    "\n1. Display list customers" +
                                    "\n2. Add new customer" +
                                    "\n3. Edit customer" +
                                    "\n4. Return main menu" +
                                    "\nYour choice : "
                    );
                    int customerChoose = Integer.parseInt(scanner.nextLine());
                    switch (customerChoose) {
                        case 1:
                            // Display list customers
                            break;
                        case 2:
                            // Add new customer
                            break;
                        case 3:
                            // Edit customer
                            break;
                        default:
                            // Exit
                            break;
                    }
                    break;
                case 3:
                    // Facility
                    System.out.print(
                            "/-----/Facility menu/-----/" +
                                    "\n1. Display list facility" +
                                    "\n2. Add new facility" +
                                    "\n3. Display list facility maintenance" +
                                    "\n4. Return main menu" +
                                    "\nYour choice : "
                    );
                    int facilityChoose = Integer.parseInt(scanner.nextLine());
                    switch (facilityChoose) {
                        case 1:
                            // Display list facility
                            break;
                        case 2:
                            // Add new facility
                            break;
                        case 3:
                            // Display list facility maintenance
                            break;
                        default:
                            // Exit
                            break;
                    }
                    break;
                case 4:
                    // Booking
                    System.out.print(
                            "/-----/Booking menu/-----/" +
                                    "\n1. Add new booking" +
                                    "\n2. Display list booking" +
                                    "\n3. Create new contracts" +
                                    "\n4. Display list contracts" +
                                    "\n5. Edit contracts" +
                                    "\n6. Return main menu" +
                                    "\nYour choice : "
                    );
                    int contractChoose = Integer.parseInt(scanner.nextLine());
                    switch (contractChoose) {
                        case 1:
                            // Add new booking
                            break;
                        case 2:
                            // Display list booking
                            break;
                        case 3:
                            // Create new contracts
                            break;
                        case 4:
                            // Display list contracts
                            break;
                        case 5:
                            // Edit contracts
                            break;
                        default:
                            // Exit
                            break;
                    }
                    break;
                case 5:
                    // Promotion
                    System.out.print(
                            "/-----/Promotion menu/-----/" +
                                    "\n1. Display list customers use service" +
                                    "\n2. Display list customers get voucher" +
                                    "\n6. Return main menu" +
                                    "\nYour choice : "
                    );
                    int promotionChoose = Integer.parseInt(scanner.nextLine());
                    switch (promotionChoose) {
                        case 1:
                            // Display list customers use service
                            break;
                        case 2:
                            // Display list customers get voucher
                            break;
                        case 3:
                            // Exit
                            break;
                    }
                    break;
                default:
                    // Exit
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
