public class Book {
    private String bookID;
    private String title;
    private String author;
    private String genre;
    private boolean isAvailable;

    public Book(String bookID, String title, String author, String genre, boolean isAvailable) {
        if (bookID == null || bookID.isEmpty() || title == null || title.isEmpty() || author == null || author.isEmpty()) {
            throw new IllegalArgumentException("Book ID, Title, and Author cannot be empty");
        }
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
    }

    public String getBookID() { return bookID; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }
    public boolean isAvailable() { return isAvailable; }

    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setGenre(String genre) { this.genre = genre; }
    public void setAvailability(boolean isAvailable) { this.isAvailable = isAvailable; }

    @Override
    public String toString() {
        return "Book ID: " + bookID + ", Title: " + title + ", Author: " + author + ", Genre: " + genre + ", Available: " + (isAvailable ? "Yes" : "No");
    }
}
