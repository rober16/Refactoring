package ar.edu.ubp.das.appref;

public class SmsNotification extends NotificationMethod{
    private String recipient;
    private String content;

    public SmsNotification(String recipient, String content){
        this.recipient = recipient;
        this.content = content;
    }

    @Override
    public void sendNotification(){
        System.out.println("Sending SMS to " + recipient + " with content: " + content);
    }
}
