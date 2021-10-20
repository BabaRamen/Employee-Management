package management;

import employee.Employee;
import ifsomethingisnotright.WrongIntegerInput;
import pac.Main;

import java.io.IOException;
import java.util.Scanner;

import static management.CreateEmployee.employeeCreationMenu;
import static management.CreateEmployee.employees;
import static pac.Main.userChoice;

public class AdminManagement {


    public static void managementMenu() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("" +
                "1. Create\n" +
                "2. Edit\n" +
                "3. Delete\n" +
                "0. Return to the main menu\n");
        WrongIntegerInput.wrongInput(1, 3);
        switch (userChoice) {
            case 1:
                CreateEmployee.employeeCreationMenu();
                break;
            case 2:
                EditorsMenu.editEmployee();
                break;
            case 3:
                Deletion.deleteOneEmployeeByTheirId();
                break;
            case 0:
                Main.mainMenu();
        }
    }
}
