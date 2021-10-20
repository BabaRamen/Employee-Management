package employee;

import employee.Employee;

public class Salesperson extends Employee {
    private int amountOfSales;
    private String salesProduct;


    public Salesperson(String employeeFirstName, String employeeLastName,
                       int employeeSalary,
                       int amountOfSales, String salesProduct) {
        super(employeeFirstName, employeeLastName, employeeSalary);
        this.amountOfSales = amountOfSales;
        this.salesProduct = salesProduct;
    }




    public int getAmountOfSales() {
        return amountOfSales;
    }

    public void setAmountOfSales(int amountOfSales) {
        this.amountOfSales = amountOfSales;
    }

    public String getSalesProduct() {
        return salesProduct;
    }

    public void setSalesProduct(String salesProduct) {
        this.salesProduct = salesProduct;
    }


    @Override
    public String toString() {
        return super.toString()+"] | Sales total: "+amountOfSales+" & Product:  "+salesProduct;
    }
}
