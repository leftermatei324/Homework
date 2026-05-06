package Homework6.SchoolManagementSystem.NotificationSystem;

public class User {
    private String name;

    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
    }

    public void displayInfo(boolean detailed) {
        if (detailed) {
            System.out.println("The user: " + name + " is detailed");
        } else {
            displayInfo();
        }
    }
}
