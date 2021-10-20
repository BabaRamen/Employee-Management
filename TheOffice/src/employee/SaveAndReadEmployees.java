package employee;

import pac.Main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static management.CreateEmployee.employees;

public class SaveAndReadEmployees {



    public static void saveTofile2() throws IOException {


        FileOutputStream output = new FileOutputStream("E:\\TheOffice\\src\\employee\\savemeandreadme.txt");

        ObjectOutputStream destniation = new ObjectOutputStream(output);

        destniation.writeObject(employees);



    }
    public static void readFromFile2() throws IOException, ClassNotFoundException {

        FileInputStream input = null;

        try {
            input = new FileInputStream("E:\\TheOffice\\src\\employee\\savemeandreadme.txt");

        } catch (FileNotFoundException f) {

            new FileWriter("E:\\TheOffice\\src\\employee\\notarealsavefile.txt");
            input = new FileInputStream("E:\\TheOffice\\src\\employee\\savemeandreadme.txt");
        }


        try {
            ObjectInputStream source = new ObjectInputStream(input);

            employees = (ArrayList<Employee>) source.readObject();

        } catch (EOFException eo) {

            System.out.println("File Empty");
        }
    }



}