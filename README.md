Library Management System (Java Core)
A simple Library Management System built using Java Core without Spring Boot. This application allows librarians to add, update, search, and remove books while maintaining their availability status.

Features
1. Add a Book (ID, Title, Author, Genre, Availability Status)
2. View All Books
3. Search Book by ID or Title
4. Update Book Details (Title, Author, Genre, Availability)
5. Delete a Book
6. Exit System

Requirements
Java JDK 21 or later

IntelliJ IDEA (or any Java IDE)

Git (optional, for version control)

Project Structure
cpp
Copy
Edit
LibraryManagementSystem/
│── src/
│   ├── Library.java
│   ├── Book.java
│   ├── LibraryManagementApp.java
│── README.md
│── .gitignore
│── pom.xml (optional, if using Maven)
Setup & Run Instructions
1. Clone the Repository
Copy
git clone <your-git-repo-url>
cd LibraryManagementSystem
2. Compile the Project
javac -d bin src/*.java
3. Run the Application
java -cp bin LibraryManagementApp
Usage Instructions
Menu Options
   1. Add a Book → Enter Book ID, Title, Author, Genre, and Availability
   2. View All Books → Displays the list of all books
   3. Search Book by ID → Finds a book by ID
   4. Search Book by Title → Finds books by title
   5. Update Book → Modify book details
   6. Delete Book → Remove a book from the catalog
   7. Exit → Close the program

Example Usage

Library Management System
1. Add Book
2. View All Books
3. Search Book by ID
4. Search Book by Title
5. Update Book
6. Delete Book
7. Exit
Enter your choice: 1
Enter Book ID: 101
Enter Title: Java Basics
Enter Author: John Doe
Enter Genre: Programming
Is Available? (true/false): true
Book added successfully!
Known Issues & Improvements
Challenges Faced
Handling invalid user inputs gracefully

Ensuring unique Book IDs

Avoiding data loss when the program is restarted (since it's in-memory)

Future Enhancements
1. Store books persistently using a database or file storage
2. Implement a GUI using Swing or JavaFX
3. Add user authentication for librarians
