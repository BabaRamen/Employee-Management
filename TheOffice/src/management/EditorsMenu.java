package management;

import employee.Employee;
import employee.SaveAndReadEmployees;
import pac.Main;

import java.io.IOException;
import java.util.Scanner;

import static ifsomethingisnotright.WrongIntegerInput.wrongInput;
import static management.CreateEmployee.employees;
import static pac.Main.mainMenu;
import static pac.Main.userChoice;


public class EditorsMenu {
    static Scanner sc = new Scanner(System.in);

    public static void editEmployee() throws IOException {
        System.out.println("What do you want to edit?\n" +
                "1. First Name\n" +
                "2. Last Name\n" +
                "3. Salary\n" +
                "0. Return to the main Menu");
        wrongInput(0, 3);
        switch (userChoice) {
            case 1:
                editEmployeeFirstName();
                break;
            case 2:
                editEmployeeLastName();
                break;
            case 3:
                editEmployeeSalary();
                break;
            case 0:
                try {
                    Main.mainMenu();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    private static Employee editEmployeeSalary() throws IOException {
        System.out.print("\nEnter the ID of the employee you want to edit: ");
        int employeeIdThatWeWantToEdit = sc.nextInt();
        sc.nextLine(); // cleans the cache

        for (int i = 0; i < employees.size(); i++) {
            Employee e = employees.get(i);

            if (employeeIdThatWeWantToEdit == e.getEmployeeId()) {
                System.out.println("Enter new first name for " + e.getEmployeeFirstName() + " " + e.getEmployeeLastName());
                int newEmployeeSalary = sc.nextInt();
                e.setEmployeeSalary(newEmployeeSalary);
                SaveAndReadEmployees.saveTofile2();
            }
        }
        return null;
    }

    private static Employee editEmployeeLastName() throws IOException {
        System.out.print("\nEnter the ID of the employee you want to edit: ");
        int employeeIdThatWeWantToEdit = sc.nextInt();
        sc.nextLine(); // cleans the cache

        for (int i = 0; i < employees.size(); i++) {
            Employee e = employees.get(i);

            if (employeeIdThatWeWantToEdit == e.getEmployeeId()) {
                System.out.println("Enter new last name for " + e.getEmployeeFirstName() + " " + e.getEmployeeLastName());
                String newEmployeeLastName = sc.nextLine();
                e.setEmployeeLastName(newEmployeeLastName);
                SaveAndReadEmployees.saveTofile2();
            }
        }
        return null;

    }

    private static Employee editEmployeeFirstName() throws IOException {
        System.out.print("\nEnter the ID of the employee you want to edit: ");
        int employeeIdThatWeWantToEdit = sc.nextInt();
        sc.nextLine(); // cleans the cache

        for (int i = 0; i < employees.size(); i++) {
            Employee e = employees.get(i);

            if (employeeIdThatWeWantToEdit == e.getEmployeeId()) {
                System.out.println("Enter new first name for " + e.getEmployeeFirstName() + " " + e.getEmployeeLastName());
                String newEmployeeFirstName = sc.nextLine();
                e.setEmployeeFirstName(newEmployeeFirstName);
                SaveAndReadEmployees.saveTofile2();
            }
        }
        return null;
    }

}
