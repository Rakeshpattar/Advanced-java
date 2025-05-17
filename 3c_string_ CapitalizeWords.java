/*Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function
capitalizeWords()*/
package string;
import java.util.Scanner;

public class CapitalizeWords {

    // User-defined function to capitalize the first letter of each word
    public static String capitalizeWords(String input) {
        String[] words = input.trim().split("\\s+");
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                // Capitalize first letter and append rest of the word in lowercase
                capitalized.append(Character.toUpperCase(word.charAt(0)))
                           .append(word.substring(1).toLowerCase())
                           .append(" ");
            }
        }

        return capitalized.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a sentence: ");
        String original = scanner.nextLine();

        // Calling the capitalizeWords() function
        String result = capitalizeWords(original);

        // Displaying the result
        System.out.println("Capitalized sentence: " + result);

        scanner.close();
    }
}
