package Homework6.NotificationSystem;

public class EmailUser extends User implements Notifiable{
    private String email;

    public EmailUser(String email, String name){
        super(name);
        if (!email.contains("@")) {
            System.out.println("Invalid email");
            this.email = "default@email.com";
        } else {
            this.email = email;
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("User: " + getName() + " Email: " + email);
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Email sent to " + email + ": " + message);
        logNotification(message);
    }
}
