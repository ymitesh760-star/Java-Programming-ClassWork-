import java.util.Scanner;

class Book {
    private int id;
    private String title;
    private String author;
    private boolean available;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public void issueBook() {
        if (available) {
            available = false;
            System.out.println("Book '" + title + "' issued successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    public void returnBook() {
        if (!available) {
            available = true;
            System.out.println("Book '" + title + "' returned successfully.");
        } else {
            System.out.println("Book is already available.");
        }
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Book book = new Book(101, "Clean Code", "Robert C. Martin");

        System.out.print("Enter action (Issue/Return): ");
        String action = input.nextLine();

        if (action.equalsIgnoreCase("Issue")) {
            book.issueBook();
            book.issueBook();
        } else if (action.equalsIgnoreCase("Return")) {
            book.returnBook();
        } else {
            System.out.println("Invalid action.");
        }

        input.close();
    }
}
