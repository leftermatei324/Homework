package Homework6.NotificationSystem;

public class NotificationSystemMain {
    public static void main(String[] args) {
        EmailUser emailUser = new EmailUser("mateitesst.ro", "Matei");
        SMSUser smsUser = new SMSUser("076767676", "Florin");
        AppUser appUser = new AppUser("4695", "Samsui");

        emailUser.displayInfo();
        emailUser.displayInfo(true);
        emailUser.sendNotification("hello");
        emailUser.logNotification("Hello");

        System.out.println();

        smsUser.displayInfo();
        smsUser.displayInfo(true);
        smsUser.sendNotification("hello");
        smsUser.logNotification("Hello");

        System.out.println();

        appUser.displayInfo();
        appUser.displayInfo(true);
        appUser.sendNotification("hello");
        appUser.logNotification("Hello");
    }
}
