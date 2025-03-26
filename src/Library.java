import java.util.*;

public class Library {
    private Map<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        if (books.containsKey(book.getBookID())) {
            System.out.println("Book with this ID already exists.");
        } else {
            books.put(book.getBookID(), book);
            System.out.println("Book added successfully!");
        }
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books.values()) {
                System.out.println(book);
            }
        }
    }

    public Book searchBookByID(String bookID) {
        return books.get(bookID);
    }

    public List<Book> searchBookByTitle(String title) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books.values()) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    public void updateBook(String bookID, String newTitle, String newAuthor, String newGenre, Boolean availability) {
        Book book = books.get(bookID);
        if (book != null) {
            if (newTitle != null && !newTitle.isEmpty()) book.setTitle(newTitle);
            if (newAuthor != null && !newAuthor.isEmpty()) book.setAuthor(newAuthor);
            if (newGenre != null && !newGenre.isEmpty()) book.setGenre(newGenre);
            if (availability != null) book.setAvailability(availability);
            System.out.println("Book updated successfully!");
        } else {
            System.out.println("Book not found.");
        }
    }

    public void deleteBook(String bookID) {
        if (books.remove(bookID) != null) {
            System.out.println("Book deleted successfully.");
        } else {
            System.out.println("Book not found.");
        }
    }
}
