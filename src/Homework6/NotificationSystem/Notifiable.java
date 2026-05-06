package Homework6.NotificationSystem;

public interface Notifiable {
    abstract void sendNotification(String message);
    default void logNotification(String message) {
        System.out.println("LOG: Notification sent: " + message);
    }
}
