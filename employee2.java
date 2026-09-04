class Employee{
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void displayInfo(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
}
interface Workable{
    void work();
}

class Developer extends Employee implements Workable{
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void writeCode(){
        System.out.println("Developer is writing code in " + programmingLanguage);
    }

    public void work(){
        System.out.println("Developer is working");
    }
}
 
public class employee2{
    public static void main(String[] args){
        Developer developer = new Developer("Parth", 1, 100000, "Java");
        developer.displayInfo();
        developer.writeCode();
        developer.work();
    }
}