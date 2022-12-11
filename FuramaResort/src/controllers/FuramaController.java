package controllers;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        boolean flag = true;
        do {
            System.out.println(
                    "/-----/Main menu/-----/" +
                            "\n\t1. Employee Management" +
                            "\n\t2. Customer Management" +
                            "\n\t3. Facility Management" +
                            "\n\t4. Booking Management" +
                            "\n\t5. Promotion Management" +
                            "\n\t6. Exit"
            );
            System.out.println("Your choice : ");
            Scanner scanner = new Scanner(System.in);
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    // Employee
                    System.out.println(
                            "/-----/Employee menu/-----/" +
                                    "\n\t1. Display list employees" +
                                    "\n\t2. Add new employee" +
                                    "\n\t3. Edit employee" +
                                    "\n\t4. Return main menu"
                    );
                    System.out.println("Your choice : ");
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
                    System.out.println(
                            "/-----/Customer menu/-----/" +
                                    "\n\t1. Display list customers" +
                                    "\n\t2. Add new customer" +
                                    "\n\t3. Edit customer" +
                                    "\n\t4. Return main menu"
                    );
                    System.out.println("Your choice : ");
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
                    System.out.println(
                            "/-----/Facility menu/-----/" +
                                    "\n\t1. Display list facility" +
                                    "\n\t2. Add new facility" +
                                    "\n\t3. Display list facility maintenance" +
                                    "\n\t4. Return main menu"
                    );
                    System.out.println("Your choice : ");
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
                    System.out.println(
                            "/-----/Booking menu/-----/" +
                                    "\n\t1. Add new booking" +
                                    "\n\t2. Display list booking" +
                                    "\n\t3. Create new contracts" +
                                    "\n\t4. Display list contracts" +
                                    "\n\t5. Edit contracts" +
                                    "\n\t6. Return main menu"
                    );
                    System.out.println("Your choice : ");
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
                    System.out.println(
                            "/-----/Promotion menu/-----/" +
                                    "\n\t1. Display list customers use service" +
                                    "\n\t2. Display list customers get voucher" +
                                    "\n\t6. Return main menu"
                    );
                    System.out.println("Your choice : ");
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
