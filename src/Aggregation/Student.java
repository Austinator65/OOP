package Aggregation;

public class Student {
    private String name;
    private int stdNo;

    public Student(String name, int stdNo) {
        this.name = name;
        this.stdNo = stdNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStdNo() {
        return stdNo;
    }

    public void setStdNo(int stdNo) {
        this.stdNo = stdNo;
    }

    public String studentDetails() {
        return "Student is " + name + " " + stdNo;
    }

    @Override
    public String toString() {
        return "[" + name + "][ StudentNum: " + stdNo + "]";
    }

}
