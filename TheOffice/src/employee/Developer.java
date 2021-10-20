package employee;

public class Developer extends Employee {
    private String employeeProgramingLanguage;
    private String employeeDeveloperRank;
    private String stack;


    public Developer(String employeeFirstName, String employeeLastName,
                     int employeeSalary, String employeeProgramingLanguage,
                     String employeeDeveloperRank, String stack) {
        super(employeeFirstName, employeeLastName, employeeSalary);
        this.employeeProgramingLanguage = employeeProgramingLanguage;
        this.employeeDeveloperRank = employeeDeveloperRank;
        this.stack = stack;
    }

    public String getEmployeeProgramingLanguage() {
        return employeeProgramingLanguage;
    }

    public void setEmployeeProgramingLanguage(String employeeProgramingLanguage) {
        this.employeeProgramingLanguage = employeeProgramingLanguage;
    }

    public String getEmployeeDeveloperRank() {
        return employeeDeveloperRank;
    }

    public void setEmployeeDeveloperRank(String employeeDeveloperRank) {
        this.employeeDeveloperRank = employeeDeveloperRank;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    @Override
    public String toString() {
        return super.toString() + "] | " + employeeProgramingLanguage + " " + employeeDeveloperRank + " " + stack + "|";
    }
}
