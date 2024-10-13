package ar.edu.ubp.das.appref;

public class Notification {
    private NotificationMethod method;
    private User user;

    public Notification(NotificationMethod method, User user) {
        this.method = method;
        this.user = user;
    }

    public void sendNotification() {
        method.sendNotification();
        user.notifyUser("Your notification has been sent.");
    }

    public static void main(String[] args) {
        User user = new User("robi172015@gmail.com.ar");
        NotificationMethod email = new EmailNotification("user@example.com", "Welcome to our service!");
        Notification notification = new Notification(email, user);
        notification.sendNotification();

        NotificationMethod sms = new SmsNotification("1234567890", "Your code is 1234");
        Notification notification2 = new Notification(sms, user);
        notification2.sendNotification();

        NotificationMethod push = new PushNotification("user's device", "New message received");
        Notification notification3 = new Notification(push, user);
        notification3.sendNotification();
    }
}