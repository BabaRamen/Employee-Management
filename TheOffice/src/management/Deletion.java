package management;

import employee.SaveAndReadEmployees;

import static management.CreateEmployee.employees;

import java.io.IOException;
import java.util.Scanner;

public class Deletion {

    public static void deleteOneEmployeeByTheirId() throws IOException { // delete using lambda
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID of the employee you want to delete!");
        int employeeIdDeletion = sc.nextInt();
        employees.removeIf(e -> e.getEmployeeId() == employeeIdDeletion);
        SaveAndReadEmployees.saveTofile2(); // saves to file
    }




}
