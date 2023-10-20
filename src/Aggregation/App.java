package Aggregation;

public class App {
    public static void main(String[] args) {
        University university = new University();
        Student student1 = new Student("Austin", 2001);
        Student student2 = new Student("Atiso", 2002);
        Student student3 = new Student("Aurora", 2003);

        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);

        university.listStudents();

        Student foundStudent = university.findStudentByName("Austin");
        if (foundStudent != null) {
            System.out.println("Student found: " + foundStudent);
        } else {
            System.out.println("Student not found.");
        }
    }
}
