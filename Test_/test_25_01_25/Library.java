package test_25_01_25;



public class Library {
    private final Map<String, Book> books;

    public Library() {
        books = new HashMap<>();
    }

    public void addBook(Book book) {
        books.put(book.getId(), book);
    }

    public Book getBook(String id) {
        return books.get(id);
    }
}

