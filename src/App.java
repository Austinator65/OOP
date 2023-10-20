import Encapsulation.Student;

public class App {
    public static void main(String[] args) {
        Student student = new Student("Jon", 20);
        // student.name = "jaha";
        // Accessing and modifying the attributes using getter and setter methods
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());

        student.setName("Alice");
        student.setAge(25);

        System.out.println("Updated Name: " + student.getName());
        System.out.println("Updated Age: " + student.getAge());

        // Attempting to set an invalid age
        student.setAge(150);
    }
}