package Homework6.SchoolManagementSystem;

public class SchoolManagementSystemMAIN {
    public static void main(String[] args) {
        Student student = new Student("Matei", 23);
        Teacher teacher = new Teacher("Andrei", 34);

        student.displayInfo(true);
        student.displayInfo(false);

        teacher.displyInfo();
    }
}
