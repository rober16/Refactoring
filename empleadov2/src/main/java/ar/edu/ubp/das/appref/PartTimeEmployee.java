package ar.edu.ubp.das.appref;

public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String name, int hoursWorked, double hourlyRate) {
        super(name, hoursWorked, hourlyRate);
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}