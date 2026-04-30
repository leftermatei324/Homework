package Homework6.SchoolManagementSystem;

public class Teacher extends Person{
    public Teacher(String name, int age){
        super(name, age);
    }

    @Override
    public void displyInfo() {
        System.out.println("The teacher " + getName() + " is " + getAge() + " years old.");
    }
}
