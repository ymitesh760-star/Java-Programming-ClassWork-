import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Withdrawal amount exceeds balance.");
            return;
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.printf("Balance: ₹%.2f%n", balance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accountNumber = input.nextLine();

        System.out.print("Enter holder name: ");
        String holderName = input.nextLine();

        System.out.print("Enter opening balance: ");
        double openingBalance = input.nextDouble();

        BankAccount account = new BankAccount(accountNumber, holderName, openingBalance);

        System.out.print("Enter deposit amount: ");
        double depositAmount = input.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = input.nextDouble();
        account.withdraw(withdrawalAmount);

        System.out.printf("Balance ₹%.2f%n", account.getBalance());
        input.close();
    }
}
