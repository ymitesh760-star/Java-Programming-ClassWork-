import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter electricity units: ");
        double units = input.nextDouble();

        if (units < 0) {
            System.out.println("Invalid input. Units cannot be negative.");
            return;
        }

        double bill = 0.0;

        // According to the PDF slabs: first 100 -> ₹2/unit, next 100 -> ₹3/unit, above 200 -> ₹5/unit.
        if (units <= 100) {
            bill = units * 2;
        } else if (units <= 200) {
            bill = 100 * 2 + (units - 100) * 3;
        } else {
            bill = 100 * 2 + 100 * 3 + (units - 200) * 5;
        }

        System.out.printf("Total Electricity Bill: ₹%.2f%n", bill);
        input.close();
    }
}
