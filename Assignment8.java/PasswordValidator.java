import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = input.nextLine();

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        if (password.length() < 8) {
            System.out.println("Password is Invalid");
            System.out.println("Missing: at least 8 characters");
            return;
        }

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isLowerCase(ch)) {
                hasLower = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecial = true;
            }
        }

        if (hasUpper && hasLower && hasDigit && hasSpecial) {
            System.out.println("Password is Valid");
        } else {
            System.out.println("Password is Invalid");
            System.out.print("Missing: ");
            if (!hasUpper) System.out.print("uppercase ");
            if (!hasLower) System.out.print("lowercase ");
            if (!hasDigit) System.out.print("digit ");
            if (!hasSpecial) System.out.print("special character ");
            System.out.println();
        }

        input.close();
    }
}
