package tutorial8;
class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Book Details");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Technical extends Book {
    String subject;

    Technical(String title, String author, String subject) {
        super(title, author);
        this.subject = subject;
    }

    @Override
    void display() {
        System.out.println("Technical Book Details");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Subject: " + subject);
    }
}

class Story extends Technical {
    String genre;

    Story(String title, String author, String subject, String genre) {
        super(title, author, subject);
        this.genre = genre;
    }

    @Override
    void display() {
        System.out.println("Story Book Details");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Subject: " + subject);
        System.out.println("Genre: " + genre);
    }
}

public class BookDemo {
    public static void main(String[] args) {

        Book b;

        b = new Book("Java Basics", "James Gosling");
        b.display();

        System.out.println();

        b = new Technical("Data Structures", "Mark Allen", "Computer Science");
        b.display();

        System.out.println();

        b = new Story("The Alchemist", "Paulo Coelho", "Fiction", "Adventure");
        b.display();
    }
}