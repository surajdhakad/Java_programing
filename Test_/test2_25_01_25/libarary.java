package test2_25_01_25;


public class libarary {
    public static void main(String[] args) throws InterruptedException {
        Library library = new Library();
        library.addBook(new Book("1", "The Alchemist", 2));
        library.addBook(new Book("2", "To Kill a Mockingbird", 1));
        library.addBook(new Book("3", "1984", 1));

        LibraryReservationSystem reservationSystem = new LibraryReservationSystem(library);

        User john = new User("John");
        User alice = new User("Alice");
        User sam = new User("Sam");
        User emma = new User("Emma");
        User kate = new User("Kate");

        Runnable task1 = () -> reservationSystem.reserveBook(john, library.getBook("1"));
        System.out.println("---------------------------");
        Runnable task2 = () -> reservationSystem.reserveBook(alice, library.getBook("2"));
        Runnable task3 = () -> reservationSystem.reserveBook(sam, library.getBook("1"));
        Runnable task4 = () -> reservationSystem.reserveBook(emma, library.getBook("3"));
        Runnable task5 = () -> reservationSystem.reserveBook(kate, library.getBook("2"));

        Thread thread1 = new Thread(task1);
        System.out.println("---------------------------");
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);
        Thread thread4 = new Thread(task4);
        Thread thread5 = new Thread(task5);

        thread1.start();
    thread1.join();
        thread2.start();
        System.out.println("---------------------------");
        thread3.start();
        thread4.start();
        thread5.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}