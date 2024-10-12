package ar.edu.ubp.das.appref;

public abstract class Employee {
    protected String name;
    protected int hoursWorked;
    protected double hourlyRate;
    
    public Employee(String name, int hoursWorked, double hourlyRate) {
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public abstract double calculateSalary();

    public void printSalary() {
        System.out.println("Employee: " + name + " - Salary: " + calculateSalary());
    }

    public String getName() {
        return name;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public class Main {
        public static void main(String[] args) {
            Employee fullTimeEmployee = new FullTimeEmployee("Roberto", 160, 20);
            Employee partTimeEmployee = new PartTimeEmployee("Laura", 80, 15);
            Employee contractEmployee = new ContractEmployee("Pedro", 120, 18);
    
            fullTimeEmployee.printSalary();
            partTimeEmployee.printSalary();
            contractEmployee.printSalary();
    
            NotificationService notificationService = new NotificationService();
            notificationService.notifyManager(fullTimeEmployee, "Task completed.");
        }
    }
}

