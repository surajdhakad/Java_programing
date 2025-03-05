package test_25_01_25;
public class Book {
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

    public synchronized int getAvailableCopies() {
        return availableCopies;
    }
}



