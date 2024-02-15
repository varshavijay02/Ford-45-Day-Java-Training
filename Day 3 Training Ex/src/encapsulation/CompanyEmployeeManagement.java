package encapsulation;

class Employee {
    private String name;
    private int employeeId;
    private double salary;

    // Constructor and methods for setting and getting details

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to give a salary raise
    void giveSalaryRaise(double raise){
        System.out.println("Salary After Raise: "+(raise+salary));
    }
}


public class CompanyEmployeeManagement {
    public static void main(String[] args) {
        // Sample Usage
        Employee employee = new Employee("John", 9876, 50000.0);
        employee.giveSalaryRaise(55000.0);

    }
}

//Problem 2: Company Employee Management
//
//Design an Employee class encapsulating employee details like name, employee ID, and salary. Implement a method to give a salary raise, ensuring that the new salary is not less than the current salary.
//
//Requirements:
//
//The Employee class should have private fields for name, employee ID, and salary.
//Implement a method to give a salary raise, making sure the new salary is not less than the current salary.
//
//
//Sample code:
//public class Employee {
//    private String name;
//    private int employeeId;
//    private double salary;
//
//    // Constructor and methods for setting and getting details
//    // Method to give a salary raise
//}
//
//// Sample Usage
//Employee employee = new Employee("John", 9876, 50000.0);
//employee.giveSalaryRaise(55000.0);
