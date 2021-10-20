package ifsomethingisnotright;

import java.util.InputMismatchException;
import java.util.Scanner;

import static pac.Main.userChoice;

public class WrongIntegerInput {
    public static int employeeSalary = userChoice;
    static Scanner sc = new Scanner(System.in);

    public static int wrongInput(int a, int b) {
        boolean exceptionLoop = true;
        while (exceptionLoop) {

            try {
                System.out.print("\nEnter Your Choice: ");
                userChoice = sc.nextInt();

                if (userChoice >= a && userChoice <= b) {
                    System.out.println("");
                    exceptionLoop = false;
                } else {
                    System.out.println("Wrong input");
                }

                //  a value >= min && b value <= max
            } catch (InputMismatchException e) {
                System.out.println("Wrong input!");
                System.out.println("\nEnter Your Choice: ");
            } finally {
                sc.nextLine(); // cleans the cache
            }
        }
        return userChoice;
    }


    public static int wrongInputSalary(int x, int y) {

        boolean exceptionLoop = true;
        while (exceptionLoop) {

            try {
                System.out.print("\nSalary:  (min salary 1000 max salary 20000: ");
                employeeSalary = sc.nextInt();

                if (employeeSalary >= x && employeeSalary <= y) {
                    exceptionLoop = false;
                } else {
                    System.out.println("Wrong input");
                }

                //  a value >= min && b value <= max
            } catch (InputMismatchException e) {
                System.out.println("Wrong input!");
                System.out.println("\nEnter Your Choice: ");
            } finally {
                sc.nextLine(); // cleans the cache
            }
        }
        return employeeSalary;
    }


}
