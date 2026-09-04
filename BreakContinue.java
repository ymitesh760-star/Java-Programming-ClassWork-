import java.util.Scanner;

public class User {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Phone No: ");
        String Phone = sc.nextLine();

        System.out.print("Enter Department: ");
        String Department = sc.nextLine();

        System.out.print("Enter Division: ");
        char Division = sc.next().charAt(0);

        System.out.print("Enter Percentage: ");
        double percentage = sc.nextDouble();

        System.out.println();
        System.out.println("Your name: " +name);
        System.out.println("Your phone: " +Phone);
        System.out.println("Your department: " +Department);
        System.out.println("Your division: " +Division);
        System.out.println("Your percentage: " +percentage);
    }
}