package ss9_mvc.controller;

import ss9_mvc.service.IStudentService;
import ss9_mvc.service.impl.StudentService;

import java.util.Scanner;

public class Controller {
    private static IStudentService studentService = new StudentService();
    public static void displayMenu(){
        boolean flag =true;
        do {
            System.out.println("/-------Menu-------/" +
                    "\n\t 1. Display" +
                    "\n\t 2. Add" +
                    "\n\t 3. Delete" +
                    "\n\t 4. Edit" +
                    "\n\t 5. Search" +
                    "\n\t 6. Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("...Choose");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    // dispay the list
                    System.out.println("chức năng hiện thị");
                    studentService.display();
                    break;
                case 2:
                    // add new element
                    studentService.add();
                    break;
                case 3:
                    // delete a element
                    System.out.println("chức năng xóa");
                    studentService.delete();
                    break;
                case 4:
                    // edit a element
                    System.out.println("chức năng sửa");
                    studentService.update();
                    break;
                case 5:
                    // search a element
                    System.out.println("chức năng tìm kiếm");
                    break;
                default:
                    flag=false;
            }
        }while (flag);
    }
}
