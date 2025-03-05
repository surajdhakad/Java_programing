package feb_18;
import java.util.HashMap;
import java.util.Scanner;

class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

public class AddressBook {
    private HashMap<String, Contact> contacts;
    private Scanner scanner;

    public AddressBook() {
        this.contacts = new HashMap<>();
        this.scanner = new Scanner(System.in);
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Address Book is empty.");
        } else {
            System.out.println("Address Book:");
            for (String name : contacts.keySet()) {
                Contact contact = contacts.get(name);
                System.out.println(contact.getName() + ": " + contact.getPhoneNumber());
            }
        }
    }

    public void addContact() {
        System.out.print("Enter Contact Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();
        Contact newContact = new Contact(name, phoneNumber);
        contacts.put(name, newContact);
        System.out.println("Contact added successfully!");
    }

    public void removeContact() {
        if (contacts.isEmpty()) {
            System.out.println("Address Book is empty.");
        } else {
            System.out.print("Enter Contact Name to remove: ");
            String name = scanner.nextLine();
            if (contacts.containsKey(name)) {
                contacts.remove(name);
                System.out.println("Contact removed successfully!");
            } else {
                System.out.println("Contact not found.");
            }
        }
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        boolean running = true;

        while (running) {
            addressBook.displayContacts();
            System.out.println("\nOptions:");
            System.out.println("1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = addressBook.scanner.nextInt();
                addressBook.scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        addressBook.addContact();
                        break;
                    case 2:
                        addressBook.removeContact();
                        break;
                    case 3:
                        running = false;
                        System.out.println("Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                addressBook.scanner.nextLine(); 
            }
        }
    }
}