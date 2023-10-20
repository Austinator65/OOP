package StheProject;

import java.util.Scanner;

public class app {

    public static void main(String[] args) {

        String name;
        int age;
        int weight;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = scanner.nextLine();

        System.out.println("Enter age: ");
        age = scanner.nextInt();

        System.out.println("Enter weight: ");
        weight = scanner.nextInt();

        Student student = new Student(name, age, weight);

        try {
            String ret = student.exclusion(age, weight);
            System.out.println(ret);
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }
        // System.out.println(student.age);A
        scanner.close();
    }
}