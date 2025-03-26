import java.util.Scanner;

public class LibraryManagementApp {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book by ID");
            System.out.println("4. Search Book by Title");
            System.out.println("5. Update Book");
            System.out.println("6. Delete Book");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter Genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Is Available? (true/false): ");
                    boolean available = scanner.nextBoolean();
                    library.addBook(new Book(id, title, author, genre, available));
                    break;

                case 2:
                    library.viewBooks();
                    break;

                case 3:
                    System.out.print("Enter Book ID: ");
                    Book book = library.searchBookByID(scanner.nextLine());
                    System.out.println(book != null ? book : "Book not found.");
                    break;

                case 4:
                    System.out.print("Enter Book Title: ");
                    String searchTitle = scanner.nextLine();
                    var books = library.searchBookByTitle(searchTitle);
                    if (books.isEmpty()) {
                        System.out.println("No books found.");
                    } else {
                        books.forEach(System.out::println);
                    }
                    break;

                case 5:
                    System.out.print("Enter Book ID to Update: ");
                    String updateID = scanner.nextLine();
                    System.out.print("Enter New Title (leave blank to keep same): ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter New Author (leave blank to keep same): ");
                    String newAuthor = scanner.nextLine();
                    System.out.print("Enter New Genre (leave blank to keep same): ");
                    String newGenre = scanner.nextLine();
                    System.out.print("Is Available? (true/false, leave blank to keep same): ");
                    String availabilityInput = scanner.nextLine();
                    Boolean availability = availabilityInput.isEmpty() ? null : Boolean.parseBoolean(availabilityInput);
                    library.updateBook(updateID, newTitle, newAuthor, newGenre, availability);
                    break;

                case 6:
                    System.out.print("Enter Book ID to Delete: ");
                    library.deleteBook(scanner.nextLine());
                    break;

                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}

