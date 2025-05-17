/*Q10. Write a Java Program for Counting the number of words in a string using user defined function
countWords()*/
package string;
import java.util.Scanner;

public class WordCounter {

    // User-defined function to count the number of words in a string
    public static int countWords(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0; // Return 0 for empty or null strings
        }

        // Split the string using whitespace as delimiter
        String[] words = input.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Calling the countWords() function
        int wordCount = countWords(sentence);

        // Displaying the word count
        System.out.println("Number of words: " + wordCount);

        scanner.close();
    }
}
