import java.util.Scanner;

class Student {
    private int rollNo;
    private String name;
    private String course;
    private int marks;

    public Student(int rollNo, String name, String course, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
        setMarks(marks);
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            throw new IllegalArgumentException("Marks must be between 0 and 100.");
        }
    }

    public void display() {
        System.out.println("Roll No " + rollNo);
        System.out.println("Name " + name);
        System.out.println("Course " + course);
        System.out.println("Marks " + marks);
    }
}

public class StudentEncapsulationDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter roll number: ");
        int rollNo = input.nextInt();
        input.nextLine();

        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("Enter course: ");
        String course = input.nextLine();

        System.out.print("Enter marks: ");
        int marks = input.nextInt();

        Student student = new Student(rollNo, name, course, marks);
        student.display();
        input.close();
    }
}
