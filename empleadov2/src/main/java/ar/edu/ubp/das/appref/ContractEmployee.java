package ar.edu.ubp.das.appref;

public class ContractEmployee extends Employee {
    public ContractEmployee(String name, int hoursWorked, double hourlyRate) {
        super(name, hoursWorked, hourlyRate);
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked - 100; // descuento para contratistas
    }
}