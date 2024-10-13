package ar.edu.ubp.das.app;

public class Notification {
    private String type; // "Email", "SMS", "Push"
    private String recipient;
    private String content;

    public Notification(String type, String recipient, String content) {
        this.type = type;
        this.recipient = recipient;
        this.content = content;
    }

    public void sendNotification() {
        switch (type) {
            case "Email":
                System.out.println("Sending email to " + recipient + " with content: " + content);
                break;
            case "SMS":
                System.out.println("Sending SMS to " + recipient + " with content: " + content);
                break;
            case "Push":
                System.out.println("Sending Push notification to " + recipient + " with content: " + content);
                break;
            default:
                System.out.println("Invalid notification type.");
        }
    }

    public void notifyUser() {
        User user = new User();
        user.receiveNotification(this, "Your notification has been sent.");
    }

    public String getType() {
        return type;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getContent() {
        return content;
    }

    public static void main(String[] args) {
        Notification email = new Notification("Email", "user@example.com", "Welcome to our service!");
        email.sendNotification();

        Notification sms = new Notification("SMS", "1234567890", "Your code is 1234");
        sms.sendNotification();

        Notification push = new Notification("Push", "user's device", "New message received");
        push.sendNotification();
    }
}

class User {
    public void receiveNotification(Notification notification, String message) {
        System.out.println("User notified about " + notification.getType() + ": " + message);
    }
}