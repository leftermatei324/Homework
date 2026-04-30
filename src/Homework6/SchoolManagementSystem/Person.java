package Homework6.SchoolManagementSystem;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void displyInfo(){
        System.out.println("Person: " + name + " has " + age + " years old.");
    }

    public void displayInfo(boolean graded){
        if (graded){
            System.out.println("The student " + name + " with an age of " + age + " is graded");
        }else {
            displyInfo();
        }
    }
}
