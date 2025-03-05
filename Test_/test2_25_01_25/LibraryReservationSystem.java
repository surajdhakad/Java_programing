package test2_25_01_25;



import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Book {
    private final String id;
    private final String title;
    private int availableCopies;

    public Book(String id, String title, int availableCopies) {
        this.id = id;
        this.title = title;
        this.availableCopies = availableCopies;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public synchronized boolean reserve() {
        if (availableCopies > 0) {
            availableCopies--;
            return true;
        }
        return false;
    }

    public synchronized void release() {
        availableCopies++;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }
}

class Library {
    private final Map<String, Book> books = new HashMap<>();
    private final Lock lock = new ReentrantLock();

    public void addBook(Book book) {
        books.put(book.getId(), book);
    }

    public Book getBook(String id) {
        return books.get(id);
    }

    public boolean reserveBook(String bookId) {
        lock.lock();
        try {
            Book book = books.get(bookId);
            if (book != null && book.reserve()) {
                return true;
            }
            return false;
        } finally {
            lock.unlock();
        }
    }
}

class User {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class LibraryReservationSystem {
    private final Library library;

    public LibraryReservationSystem(Library library) {
        this.library = library;
    }

    public void reserveBook(User user, Book book) {
        System.out.println(user.getName() + " is trying to reserve \"" + book.getTitle() + "\".");
        if (library.reserveBook(book.getId())) {
            System.out.println("[INFO] " + user.getName() + " successfully reserved \"" + book.getTitle() + "\".");
        } else {
            System.out.println("[INFO] Sorry, " + user.getName() + "! \"" + book.getTitle() + "\" is already reserved.");
        }
    }
}
