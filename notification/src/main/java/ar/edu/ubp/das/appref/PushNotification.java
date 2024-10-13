package ar.edu.ubp.das.appref;

public class PushNotification extends NotificationMethod{
    private String recipient;
    private String content;

    public PushNotification(String recipient, String content){
        this.recipient = recipient;
        this.content = content;
    }

    @Override
    public void sendNotification(){
        System.out.println("Sending Push notification to " + recipient + " with content: " + content);
    }
}
