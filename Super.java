class Person {
    String name = "Abhijeet";

}

class Student extends Person {
    String name = "Fineshyt";

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Name: " + super.name);
    }
}

public class Super {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.displayInfo();
    }
}