package Exception26_12_24;

import java.util.Scanner;

public class HandlingNumberFormatException {

    public static void handleExceptions(String input) {
        try {
            // Print the length of the input string
            System.out.println("Length of the input string: " + input.length());

            // Attempt to convert the string input to an integer
            int number = Integer.parseInt(input);
            System.out.println("Converted number: " + number);

            // Deliberately cause a NullPointerException if the string is null
            String nullCheck = null;
            System.out.println("Attempting to call length on a null string: " + nullCheck.length());

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid input, not a number.");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Attempted to operate on a null object.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to convert to an integer: ");
        String userInput = scanner.nextLine();

        handleExceptions(userInput);

        scanner.close();
    }
}