package StheProject;

public class Student {
    String name;
    int age;
    int weight;

    public Student(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String exclusion(int age, int weight) {
        if (this.age < 13 || this.weight < 40) {
            throw new ArithmeticException("Student not eligible to register");
        } else {
            return "registered";
        }
    }
}
