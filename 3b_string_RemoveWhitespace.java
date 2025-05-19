/*Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined
function removeWhitespace()*/
package string;
import java.util.Scanner;

public class RemoveWhitespace {

    // User-defined function to remove all whitespace characters
    public static String removeWhitespace(String input) {
        // \s matches any whitespace character (spaces, tabs, newlines)
        return input.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a string with whitespace: ");
        String original = scanner.nextLine();

        // Calling the removeWhitespace() function
        String cleaned = removeWhitespace(original);

        // Displaying the result
        System.out.println("String without whitespace: " + cleaned);

        scanner.close();
    }
}
