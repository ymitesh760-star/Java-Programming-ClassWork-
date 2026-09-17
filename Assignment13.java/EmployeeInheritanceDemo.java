import java.util.Scanner;

class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculateCompensation() {
        return salary;
    }

    public void display() {
        System.out.println("Employee: " + name);
        System.out.println("Salary: ₹" + salary);
    }
}

class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateCompensation() {
        return salary + (salary * 0.20);
    }

    public void displayBonus() {
        double bonus = salary * 0.20;
        System.out.printf("Bonus ₹%.2f; Total Compensation ₹%.2f%n", bonus, calculateCompensation());
    }
}

class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateCompensation() {
        return salary + (salary * 0.10);
    }

    public void displayBonus() {
        double bonus = salary * 0.10;
        System.out.printf("Bonus ₹%.2f; Total Compensation ₹%.2f%n", bonus, calculateCompensation());
    }
}

public class EmployeeInheritanceDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee type (Manager or Developer): ");
        String employeeType = input.nextLine();

        System.out.print("Enter employee name: ");
        String employeeName = input.nextLine();

        System.out.print("Enter basic salary: ");
        double basicSalary = input.nextDouble();

        Employee employee;

        if (employeeType.equalsIgnoreCase("Manager")) {
            employee = new Manager(employeeName, basicSalary);
        } else if (employeeType.equalsIgnoreCase("Developer")) {
            employee = new Developer(employeeName, basicSalary);
        } else {
            System.out.println("Invalid employee type.");
            input.close();
            return;
        }

        if (employee instanceof Manager) {
            ((Manager) employee).displayBonus();
        } else if (employee instanceof Developer) {
            ((Developer) employee).displayBonus();
        }

        input.close();
    }
}

