package management;

import ifsomethingisnotright.WrongIntegerInput;
import employee.Developer;
import employee.Employee;
import employee.Salesperson;
import pac.Main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static employee.SaveAndReadEmployees.saveTofile2;
import static ifsomethingisnotright.WrongIntegerInput.employeeSalary;
import static pac.Main.*;

public class CreateEmployee {  // implement a menu where user can choose between what emp he/she wants to add
    static Scanner sc = new Scanner(System.in);
    public static List<Employee> employees = new ArrayList<>();


    public static int employeeCreationMenu() throws IOException {
        System.out.println("" +
                "1. Developer\n" +
                "2. Salespersons\n" +
                "0. Return to the main menu\n");
        WrongIntegerInput.wrongInput(1, 2);
        switch (userChoice) {
            case 1:
                createDeveloper();
                break;
            case 2:
                createSalesperson();
                break;
            case 0:
                Main.mainMenu();
        }
        return userChoice;
    }

    private static void createDeveloper() throws IOException {

        System.out.print("\nFirst Name: ");
        String employeeFirstName = sc.nextLine();

        System.out.print("\nLast Name: ");
        String employeeLastName = sc.nextLine();


        WrongIntegerInput.wrongInputSalary(1000, 20000); // Program wont crash (asks for salary)

        System.out.print("\n Programing language: ");
        String employeeProgramingLanguage = sc.nextLine();

        System.out.print("\n Rank: ");
        String employeeDeveloperRank = sc.nextLine();
        System.out.print("\nStack: ");
        String stack = sc.nextLine();

        employees.add(new Developer(employeeFirstName, employeeLastName, employeeSalary, employeeProgramingLanguage,
                employeeDeveloperRank, stack));
        saveTofile2(); // saves to file for each empolyee we add
    }


    private static void createSalesperson() throws IOException {

        System.out.print("\nFirst Name: ");
        String employeeFirstName = sc.nextLine();

        System.out.print("\nLast Name: ");
        String employeeLastName = sc.nextLine();

        WrongIntegerInput.wrongInputSalary(1000, 20000); // Program wont crash

        System.out.print("\nAmount of sales: ");
        int amountOfSales = sc.nextInt();
        sc.nextLine();

        System.out.print("\nProduct: ");
        String salesProduct = sc.nextLine();

        employees.add(new Salesperson(employeeFirstName, employeeLastName, employeeSalary, amountOfSales,
                salesProduct));
        saveTofile2(); // saves to file for each employee we add
    }
}