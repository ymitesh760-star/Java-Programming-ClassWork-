import java.util.Scanner;

interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    @Override
    public void pay(double amount) {
        System.out.printf("₹%.2f paid successfully using UPI.%n", amount);
    }
}

class CreditCard implements Payment {
    @Override
    public void pay(double amount) {
        System.out.printf("₹%.2f paid successfully using Credit Card.%n", amount);
    }
}

class CashOnDelivery implements Payment {
    @Override
    public void pay(double amount) {
        System.out.printf("₹%.2f paid successfully using Cash on Delivery.%n", amount);
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter payment type (UPI/CreditCard/CashOnDelivery): ");
        String paymentType = input.nextLine();

        System.out.print("Enter amount: ");
        double amount = input.nextDouble();

        Payment payment;

        if (paymentType.equalsIgnoreCase("UPI")) {
            payment = new UPI();
        } else if (paymentType.equalsIgnoreCase("CreditCard")) {
            payment = new CreditCard();
        } else if (paymentType.equalsIgnoreCase("CashOnDelivery")) {
            payment = new CashOnDelivery();
        } else {
            System.out.println("Invalid payment type.");
            return;
        }

        payment.pay(amount);
        input.close();
    }
}
