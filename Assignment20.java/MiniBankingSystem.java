import java.util.ArrayList;
import java.util.Scanner;

class BankAccount20 {
    private String customerName;
    private String accountNumber;
    private double balance;

    public BankAccount20(String customerName, String accountNumber, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }
        balance += amount;
        System.out.printf("Current Balance ₹%.2f%n", balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }
        balance -= amount;
        System.out.printf("Current Balance ₹%.2f%n", balance);
    }

    public void displayAccount() {
        System.out.println("Customer: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.printf("Current Balance ₹%.2f%n", balance);
    }
}

public class MiniBankingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<BankAccount20> accounts = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 Create");
            System.out.println("2 Deposit");
            System.out.println("3 Withdraw");
            System.out.println("4 Balance");
            System.out.println("5 Display");
            System.out.println("6 Exit");
            System.out.print("Choose an option: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = input.nextLine();
                    System.out.print("Enter account number: ");
                    String accNo = input.nextLine();
                    System.out.print("Enter opening balance: ");
                    double openingBalance = input.nextDouble();
                    input.nextLine();
                    accounts.add(new BankAccount20(name, accNo, openingBalance));
                    System.out.println("Account created successfully.");
                    break;

                case 2:
                    if (accounts.isEmpty()) {
                        System.out.println("No account exists.");
                        break;
                    }
                    System.out.print("Enter account number: ");
                    String depositAcc = input.nextLine();
                    BankAccount20 depositAccount = findAccount(accounts, depositAcc);
                    if (depositAccount == null) {
                        System.out.println("Account not found.");
                        break;
                    }
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = input.nextDouble();
                    input.nextLine();
                    depositAccount.deposit(depositAmount);
                    break;

                case 3:
                    if (accounts.isEmpty()) {
                        System.out.println("No account exists.");
                        break;
                    }
                    System.out.print("Enter account number: ");
                    String withdrawAcc = input.nextLine();
                    BankAccount20 withdrawAccount = findAccount(accounts, withdrawAcc);
                    if (withdrawAccount == null) {
                        System.out.println("Account not found.");
                        break;
                    }
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = input.nextDouble();
                    input.nextLine();
                    withdrawAccount.withdraw(withdrawalAmount);
                    break;

                case 4:
                    if (accounts.isEmpty()) {
                        System.out.println("No account exists.");
                        break;
                    }
                    System.out.print("Enter account number: ");
                    String balanceAcc = input.nextLine();
                    BankAccount20 balanceAccount = findAccount(accounts, balanceAcc);
                    if (balanceAccount == null) {
                        System.out.println("Account not found.");
                        break;
                    }
                    System.out.printf("Current Balance ₹%.2f%n", balanceAccount.getBalance());
                    break;

                case 5:
                    if (accounts.isEmpty()) {
                        System.out.println("No account exists.");
                        break;
                    }
                    for (BankAccount20 account : accounts) {
                        account.displayAccount();
                    }
                    break;

                case 6:
                    System.out.println("Exiting system.");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static BankAccount20 findAccount(ArrayList<BankAccount20> accounts, String accountNumber) {
        for (BankAccount20 account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}
