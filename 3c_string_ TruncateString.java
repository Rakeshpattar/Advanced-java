/*Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate()*/
import java.util.Scanner;

public class TruncateString {

    // User-defined function to truncate the string and add ellipsis
    public static String truncate(String input, int maxLength) {
        if (input == null || maxLength < 3) {
            return "..."; // If maxLength is less than 3, we can't even fit the ellipsis
        }

        if (input.length() <= maxLength) {
            return input; // No need to truncate
        }

        return input.substring(0, maxLength - 3) + "...";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        System.out.print("Enter maximum length: ");
        int maxLength = scanner.nextInt();

        // Calling the truncate() function
        String result = truncate(original, maxLength);

        // Displaying the result
        System.out.println("Truncated string: " + result);

        scanner.close();
    }
}
