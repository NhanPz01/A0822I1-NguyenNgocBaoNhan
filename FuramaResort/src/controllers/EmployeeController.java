package controllers;

import models.Employee;
import services.impl.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeController extends EmployeeServiceImpl {
    public static void displayEmployeeMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.print(
                    "/-----/Employee menu/-----/" +
                    "\n1. Display list employees" +
                    "\n2. Add new employee" +
                    "\n3. Edit employee" +
                    "\n4. Return main menu" +
                    "\nYour choice : "
            );
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1 -> {
                }
                case 2 -> {

                }
                case 3 -> {

                }
                default -> {
                    flag = false;
                }
            }
        } while (flag);
    }
}
