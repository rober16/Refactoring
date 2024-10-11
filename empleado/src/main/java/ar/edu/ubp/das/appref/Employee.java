package ar.edu.ubp.das.appref;

public class Employee {
    private String name;
    private double salary;
    private Address address;
    private PhoneNumber phoneNumber;

    public Employee(String name, double salary, Address address, PhoneNumber phoneNumber) {
        this.name = name;
        this.salary = salary;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void printEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address.getCompleteAddress());
        System.out.println("Phone Number: " + phoneNumber.getPhoneNumber());
        System.out.println("Salary: " + salary);
    }

    public void calculateAnnualSalary() {
        double annualSalary = salary * 12;
        System.out.println("Annual Salary: " + annualSalary);
    }

    public void updateAddress(String city, String street, String streetNumber) {
        this.address.updateAddress(city, street, streetNumber);
    }

    public static void main(String[] args) {
        Address address = new Address("Cordoba", "Raymundo Montenegro", "2615");
        PhoneNumber phoneNumber = new PhoneNumber("456789");
        Employee empleado = new Employee("Roberto", 100.0, address, phoneNumber);

        empleado.calculateAnnualSalary();
        empleado.printEmployeeDetails();
    }
}

