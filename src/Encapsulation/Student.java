package Encapsulation;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for the name attribute
    public String getName() {
        return name;
    }

    // Setter method for the name attribute
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for the age attribute
    public int getAge() {
        return age;
    }

    // Setter method for the age attribute
    public void setAge(int age) {
        if (age >= 0 && age <= 120) { // Age validation
            this.age = age;
        } else {
            System.out.println("Invalid age.");
        }
    }
}
