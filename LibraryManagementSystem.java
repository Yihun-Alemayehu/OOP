import java.util.ArrayList;

class Book {
    int bookId;
    String title;
    Author author;
    String genre;
    int availableCopies;
    int totalCopies;

    Book(int bookId, String title, Author author, String genre, int availableCopies, int totalCopies) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.availableCopies = availableCopies;
        this.totalCopies = totalCopies;
    }

    int getBookId() {
        return bookId;
    }

    String getTitle() {
        return title;
    }

    Author getAuthor() {
        return author;
    }

    String getGenre() {
        return genre;
    }

    int getAvailableCopies() {
        return availableCopies;
    }

    int getTotalCopies() {
        return totalCopies;
    }

    void displayBookDetails() {
        System.out.println("Book ID: " + bookId + ", Title: " + title + ", Author: " + author.getAuthorName() +
                ", Genre: " + genre + ", Available Copies: " + availableCopies + ", Total Copies: " + totalCopies);
    }
}

class Author {
    int authorId;
    String authorName;
    String bio;

    Author(int authorId, String authorName, String bio) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.bio = bio;
    }

    int getAuthorId() {
        return authorId;
    }

    String getAuthorName() {
        return authorName;
    }

    String getBio() {
        return bio;
    }

    void displayAuthorDetails() {
        System.out.println("Author ID: " + authorId + ", Author Name: " + authorName + ", Bio: " + bio);
    }
}

class Member {
    int memberId;
    String memberName;
    ArrayList<Book> borrowedBooks;

    Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.borrowedBooks = new ArrayList<>();
    }

    int getMemberId() {
        return memberId;
    }

    String getMemberName() {
        return memberName;
    }

    ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    void borrowBook(Book book) {
        if (book.getAvailableCopies() > 0) {
            book.availableCopies--;
            borrowedBooks.add(book);
            System.out.println(memberName + " borrowed " + book.getTitle());
        } else {
            System.out.println("The book you wanted is not available for borrowing.");
        }
    }

    void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.availableCopies++;
            borrowedBooks.remove(book);
            System.out.println(memberName + " returned " + book.getTitle());
        } else {
            System.out.println("This book was not borrowed by the member.");
        }
    }

    void displayMemberDetails() {
        System.out.println("Member ID: " + memberId + ", Member Name: " + memberName +
                ", Borrowed Books: " + borrowedBooks);
    }
}

class Library {
    ArrayList<Book> books;
    ArrayList<Author> authors;
    ArrayList<Member> members;

    Library() {
        this.books = new ArrayList<>();
        this.authors = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    void removeBook(Book book) {
        if (books.contains(book)) {
            books.remove(book);
            System.out.println("Book " + book.getTitle() + " removed ");
        } else {
            System.out.println("Book not found.");
        }
    }

    void addMember(Member member) {
        members.add(member);
    }

    void removeMember(Member member) {
        if (members.contains(member)) {
            members.remove(member);
            System.out.println("Member " + member.getMemberName() + " removed.");
        } else {
            System.out.println("Member not found.");
        }
    }

    void displayLibraryStatus() {
        System.out.println("\nLibrary Status:");
        System.out.println("Books:");
        for (Book book : books) {
            book.displayBookDetails();
        }
        System.out.println("\nAuthors:");
        for (Author author : authors) {
            author.displayAuthorDetails();
        }
        System.out.println("\nMembers:");
        for (Member member : members) {
            member.displayMemberDetails();
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Example data
        Author author = new Author(007, "Yismake Werku", "Ethiopian novelist");
        Book book = new Book(8001, "Dertogada", author, "Fiction", 15, 20);
        Member member = new Member(101, "Yohannes Mesay");
        Library library = new Library();

        //
        library.addBook(book);
        library.addMember(member);
        member.borrowBook(book);
        member.returnBook(book);

        //
        library.displayLibraryStatus();
    }
}
