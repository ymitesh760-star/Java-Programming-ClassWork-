//write a program to take all datatypes input and add validation to it
import java.util.Scanner;

public class Typecasting {
    char ch;
    int alpha;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);
        int alpha = (int) inputChar;

        System.out.println("The value of alpha is: " + alpha);
    }
}