import java.util.Scanner;

public class OnlineShoppingDiscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double amount = input.nextDouble();

        if (amount < 0) {
            System.out.println("Invalid amount. Amount cannot be negative.");
            return;
        }

        System.out.print("Enter membership type (Premium/Regular): ");
        String membershipType = input.next();

        double discountRate = 0;
        if (membershipType.equalsIgnoreCase("Premium")) {
            discountRate = (amount >= 5000) ? 0.10 : 0.05;
        } else if (membershipType.equalsIgnoreCase("Regular")) {
            discountRate = (amount >= 5000) ? 0.02 : 0.00;
        } else {
            System.out.println("Invalid membership type.");
            return;
        }

        double discount = amount * discountRate;
        double finalAmount = amount - discount;

        System.out.printf("Discount ₹%.2f; Final Amount ₹%.2f%n", discount, finalAmount);
        input.close();
    }
}
