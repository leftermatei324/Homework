package Homework6.SchoolManagementSystem.NotificationSystem;

public class AppUser extends User implements Notifiable{
    private String deviceId;
    public AppUser(String deviceId, String name){
        super(name);
        this.deviceId = deviceId;
    }

    @Override
    public void displayInfo() {
        System.out.println("App User: " + getName() + " Device ID: " + deviceId);
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("App notification to " + deviceId + ": " + message);
        logNotification(message);
    }

}
