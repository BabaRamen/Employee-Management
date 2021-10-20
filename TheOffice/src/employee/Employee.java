package employee;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable {

    private int employeeId;
    static int employeeIdGenerator = 1;
    private String employeeFirstName;
    private String employeeLastName;
    private int employeeSalary;
    //  public static String employeeEmailAddress;

    //            private int employeeStrikes;

    public Employee(String employeeFirstName, String employeeLastName,
                    int employeeSalary) {
        this.employeeId = employeeIdGenerator++;
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.employeeSalary = employeeSalary;
        // this.employeeEmailAddress = employeeFirstName + "." + employeeLastName+"@myjavaprogram.com"; // automaticly creates an email address
    }


    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }


    public int getEmployeeId() {
        return employeeId;
    }


    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }


    @Override
    public String toString() {
        return "ID:" + getEmployeeId() + ": NAME: " + employeeFirstName +
                " " + employeeLastName + " SALARY: $" + employeeSalary;
    }
}
