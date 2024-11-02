import java.util.ArrayList;
class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println(title + " returned.");
    }
}





class Member {
    private String name;
    private int memberId;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    public void borrowBook(Book book) {
        book.borrowBook();
    }

    public void returnBook(Book book) {
        book.returnBook();
    }
}




class Librarian {
    private String name;

    public Librarian(String name) {
        this.name = name;
    }

    public void addBook(Library library, Book book) {
        library.addBook(book);
        System.out.println(book.getTitle() + " added to library.");
    }

    public void removeBook(Library library, Book book) {
        library.removeBook(book);
        System.out.println(book.getTitle() + " removed from library.");
    }
}






class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
            }
        }
    }
}

public class Project_Library_Management {
    public static void main(String[] args) {
        Library library = new Library();
        Librarian librarian = new Librarian("Alice");
        Member member1 = new Member("John", 101);

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("1984", "George Orwell");

        librarian.addBook(library, book1);
        librarian.addBook(library, book2);

        library.displayAvailableBooks();

        member1.borrowBook(book1);
        library.displayAvailableBooks();

        member1.returnBook(book1);
        library.displayAvailableBooks();
    }
}
