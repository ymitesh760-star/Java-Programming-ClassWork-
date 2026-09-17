import java.util.Scanner;

public class MultiplicationTableGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.print("Enter ending multiplier: ");
        int end = input.nextInt();

        if (end <= 0) {
            System.out.println("Ending multiplier must be positive.");
            return;
        }

        for (int i = 1; i <= end; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        input.close();
    }
}
