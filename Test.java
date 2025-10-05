package btweek5;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
    java.util.Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of books: ");
    int n = scanner.nextInt();
    book [] books = new book[n];
    scanner.nextLine(); // Consume the newline character
    for (int i = 0; i < n; i++) {
        System.out.println("Enter details for book " + (i + 1) + ":");
        System.out.print("Book ID: ");
        String bookID = scanner.nextLine();
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Author: ");
        String author = scanner.nextLine();
        System.out.print("Publication Year: ");
        int publicationYear = scanner.nextInt();
        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        books[i] = new book(bookID, title, author, publicationYear, quantity);
    }
    for (int i = 0; i < n; i++) {
        System.out.println(books[i]);
    }
    scanner.close();
    }
}
