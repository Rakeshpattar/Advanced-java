/*Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined
function isNumeric()*/
package string;
import java.util.Scanner;

public class NumericCheck {

    // User-defined function to check if a string contains only numeric characters
    public static boolean isNumeric(String input) {
        return input.matches("\\d+"); // \d means any digit, + means one or more
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a string to check if it's numeric: ");
        String original = scanner.nextLine();

        // Calling the isNumeric() function
        if (isNumeric(original)) {
            System.out.println("The string contains only numeric characters.");
        } else {
            System.out.println("The string does NOT contain only numeric characters.");
        }

        scanner.close();
    }
}
