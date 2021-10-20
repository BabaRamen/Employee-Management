package pac;

import employee.Employee;
import ifsomethingisnotright.WrongIntegerInput;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

import static management.CreateEmployee.employees;
import static pac.Main.mainMenu;
import static pac.Main.userChoice;


public class DisplayWorkers {

    public static int employeeCreationMenu() throws IOException {
        System.out.println("" +
                "1. Display all employees\n" +
                "2. Display employees by salary(highest to lowest)\n" +
                "3. Display employees by salary(lowest to highest)\n" +
                "0. Return to the main menu\n");
        WrongIntegerInput.wrongInput(1, 4);
        switch (userChoice) {
            case 1:
                displayAllEmployees();
                break;
            case 2:
                lowestToHighest();
                break;
            case 3:
                highestToLowest();
                break;
            case 0:
                mainMenu();
                break;
        }
        return userChoice;
    }

    private static void highestToLowest() {
        employees.stream()
                .sorted((emp1, emp2) -> emp1.getEmployeeSalary() - emp2.getEmployeeSalary())
                .forEach(System.out::println);
    }

    private static void displayAllEmployees() {
        // removes duplicates
        employees.stream()
                .filter(employeeName -> !employeeName.equals("@!?$¤£#%&=?+-_,."))
                .sorted((emp1, emp2) -> emp1.getEmployeeFirstName().compareTo(emp2.getEmployeeFirstName()))
                .forEach(System.out::println);
    }


    private static void lowestToHighest() {
        employees.stream()
                .sorted((emp1, emp2) -> emp2.getEmployeeSalary() - emp1.getEmployeeSalary())
                .forEach(System.out::println);
    }




}
