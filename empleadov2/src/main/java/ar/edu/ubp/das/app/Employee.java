package ar.edu.ubp.das.app;

public class Employee {
    private String name;
    private String type; // Puede ser "full-time", "part-time", "contract"
    private int hoursWorked;
    private double hourlyRate;
    
    public Employee(String name, String type, int hoursWorked, double hourlyRate) {
        this.name = name;
        this.type = type;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    
    public double calculateSalary() {
        switch (type) {
            case "full-time":
                return hourlyRate * hoursWorked + 500; // bono de 500 para full-time
            case "part-time":
                return hourlyRate * hoursWorked;
            case "contract":
                return hourlyRate * hoursWorked - 100; // descuento para contratistas
            default:
                return 0;
        }
    }

    public void printSalary() {
        System.out.println("Employee: " + name + " - Salary: " + calculateSalary());
    }
    
    public void notifyManager(String message) {
        Manager manager = new Manager();
        manager.receiveNotification(this, message);
    }

    // Getters y setters
    public String getName() {
        return name;
    }
    
    public String getType() {
        return type;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }
}

class Manager {
    public void receiveNotification(Employee employee, String message) {
        System.out.println("Manager received notification from " + employee.getName() + ": " + message);
    }
}

