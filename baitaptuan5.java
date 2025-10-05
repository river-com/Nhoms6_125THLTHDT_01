package btweek5;

public class book {
private String bookID; 
private String title;
private String author;
private int publicationYear;
private int quantity;
public book(String bookID, String title, String author, int publicationYear, int quantity) {
    super();
    this.bookID = bookID;
    this.title = title;
    this.author = author;
    this.publicationYear = publicationYear;
    this.quantity = quantity;
}
public String getBookID() {
    return bookID;
}
public void setBookID(String bookID) {
    this.bookID = bookID;
}

public String getTitle() {
    return title;
}
public void setTitle(String title) {
    this.title = title;
}
public String getAuthor() {
    return author;
}
public void setAuthor(String author) {
    this.author = author;
}
public int getPublicationYear() {
    return publicationYear;
}
public void setPublicationYear(int publicationYear) {
    this.publicationYear = publicationYear;
}
public int getQuantity() {
    return quantity;
}
public void In ( String bookID, String title, String author, int publicationYear, int quantity) {
    System.out.println("Book ID: " + bookID + ", Title: " + title + ", Author: " + author + ", Publication Year: " + publicationYear + ", Quantity: " + quantity);
}
@Override
public String toString() {
    return "book [bookID=" + bookID + ", title=" + title + ", author=" + author + ", publicationYear=" + publicationYear
            + ", quantity=" + quantity + "]";
}

}
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

