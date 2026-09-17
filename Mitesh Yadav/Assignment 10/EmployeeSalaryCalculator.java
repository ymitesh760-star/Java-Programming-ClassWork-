import java.util.Scanner;

public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basicSalary = input.nextDouble();

        if (basicSalary < 0) {
            System.out.println("Invalid basic salary.");
            return;
        }

        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        double allowance = (basicSalary > 50000) ? basicSalary * 0.05 : basicSalary * 0.02;
        double grossSalary = basicSalary + hra + da + allowance;

        System.out.printf("HRA ₹%.2f; DA ₹%.2f; Allowance ₹%.2f; Gross ₹%.2f%n",
                hra, da, allowance, grossSalary);

        input.close();
    }
}
