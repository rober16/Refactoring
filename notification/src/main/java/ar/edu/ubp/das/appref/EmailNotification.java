package ar.edu.ubp.das.appref;

public class EmailNotification extends NotificationMethod{
    private String recipient;
    private String content;

    public EmailNotification(String recipient, String content){
        this.recipient = recipient;
        this.content = content;
    }

    @Override
    public void sendNotification(){
        System.out.println("Sending email to " + recipient + " with content: " + content);
    }
}
