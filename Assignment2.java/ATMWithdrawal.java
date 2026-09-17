import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter account balance: ");
        double balance = input.nextDouble();

        System.out.print("Enter withdrawal amount: ");
        double withdrawal = input.nextDouble();

        if (balance < 0 || withdrawal <= 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
        } else if (withdrawal % 100 != 0) {
            System.out.println("Withdrawal amount must be a multiple of ₹100.");
        } else if (withdrawal > balance) {
            System.out.println("Insufficient balance. Withdrawal not allowed.");
        } else {
            double remainingBalance = balance - withdrawal;
            System.out.printf("Withdrawal Successful; Remaining Balance: ₹%.2f%n", remainingBalance);
        }

        input.close();
    }
}
