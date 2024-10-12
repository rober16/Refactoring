package ar.edu.ubp.das.appref;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, int hoursWorked, double hourlyRate) {
        super(name, hoursWorked, hourlyRate);
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked + 500; // bono de 500 para full-time
    }
}
