package ar.edu.ubp.das.appref;

public class NotificationService {

    public void notifyManager(Employee employee, String message) {
        System.out.println("Manager received notification from " + employee.getName() + ": " + message);
    }
}