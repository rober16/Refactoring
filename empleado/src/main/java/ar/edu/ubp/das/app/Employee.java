package ar.edu.ubp.das.app;

public class Employee {
    private String name;
    private String address;
    private String phoneNumber;
    private double salary;

    public Employee(String name, String address, String phoneNumber, double salary) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public void printEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Salary: " + salary);
    }

    public void calculateAnnualSalary() {
        double annualSalary = salary * 12;
        System.out.println("Annual Salary: " + annualSalary);
    }

    public void updateAddress(String newAddress) {
        this.address = newAddress;
    }

    public static void main(String[] args) {
        Employee empleado = new Employee("Roberto", "Raymundo Montenegro 2615", "123456", 100.0);
        empleado.printEmployeeDetails();
    }
}

