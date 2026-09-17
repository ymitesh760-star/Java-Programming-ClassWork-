import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;

        System.out.println("Enter marks in 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = input.nextInt();

            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks. Marks must be between 0 and 100.");
                return;
            }
            total += marks[i];
        }

        double percentage = (total / 500.0) * 100;
        boolean isPass = true;
        for (int mark : marks) {
            if (mark < 40) {
                isPass = false;
                break;
            }
        }

        char grade;
        if (!isPass) {
            grade = 'F';
        } else if (percentage >= 80) {
            grade = 'A';
        } else if (percentage >= 60) {
            grade = 'B';
        } else if (percentage >= 50) {
            grade = 'C';
        } else if (percentage >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.printf("Total %d/500; Percentage %.2f%%; ", total, percentage);
        if (isPass) {
            System.out.println("PASS; Grade " + grade);
        } else {
            System.out.println("FAIL; Grade " + grade);
        }

        input.close();
    }
}
