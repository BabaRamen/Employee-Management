package pac;

import ifsomethingisnotright.WrongIntegerInput;
import management.AdminManagement;

import java.io.IOException;

import static employee.SaveAndReadEmployees.*;

public class Main {
    public static int userChoice = -1;
    public static boolean menuLoop = true;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        readFromFile2();
        while (menuLoop) {
            mainMenu();
            switch (userChoice) {
                case 1:
                    DisplayWorkers.employeeCreationMenu(); // employee creation menu
                    break;
                case 2:
                    AdminManagement.managementMenu();
                    break;
                case 0:
                    saveTofile2();
                    menuLoop = false;
                    break;
            }
        }
    }


    public static int mainMenu() throws IOException {
        System.out.println("\n" +
                "1. View All employees\n" + // display all employees menu
                "2. Employee Management\n" + // Employee management menu
                "0. Exit the program\n");   // exits the program (saves the files)
        WrongIntegerInput.wrongInput(0, 2);
        return userChoice; // returns user choice
    }


}
