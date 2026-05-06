package Homework6.SchoolManagementSystem.NotificationSystem;

public class SMSUser extends User implements Notifiable{
    private String phoneNumber;
    public SMSUser(String phoneNumber, String name){
        super(name);
        if (phoneNumber.length() != 10) {
            System.out.println("Invalid phone number");
            this.phoneNumber = "0000000000";
        } else {
            this.phoneNumber = phoneNumber;
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("SMS User: " + getName() + " Phone: " + phoneNumber);
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("SMS sent to " + phoneNumber + ": " + message);
        logNotification(message);
    }


}
