import java.util.Scanner;

class Order {
    private String customer;
    private String item;
    private int quantity;
    private double pricePerItem;

    public Order(String customer, String item, int quantity, double pricePerItem) {
        this.customer = customer;
        this.item = item;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public double calculateSubtotal() {
        return quantity * pricePerItem;
    }

    public double calculateDiscount() {
        double subtotal = calculateSubtotal();
        if (subtotal > 1000) {
            return subtotal * 0.05;
        }
        return 0;
    }

    public double calculateDeliveryFee() {
        return 50;
    }

    public double calculateFinalAmount() {
        return calculateSubtotal() - calculateDiscount() + calculateDeliveryFee();
    }

    public void displayBill() {
        System.out.printf("Subtotal ₹%.2f; Discount ₹%.2f; Delivery ₹%.2f; Final ₹%.2f%n",
                calculateSubtotal(), calculateDiscount(), calculateDeliveryFee(), calculateFinalAmount());
    }
}

public class OnlineFoodOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customer = input.nextLine();

        System.out.print("Enter item name: ");
        String item = input.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        System.out.print("Enter price per item: ");
        double pricePerItem = input.nextDouble();

        Order order = new Order(customer, item, quantity, pricePerItem);
        order.displayBill();
        input.close();
    }
}
