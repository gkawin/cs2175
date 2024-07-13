import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a text: ");
        String text = sc.nextLine();
        sc.close();

        // Remove space and punctuation from the text.
        String cleanText = "";
        // Loop through each character in the text.
        for (int i = 0; i < text.length(); i++) {
            // Check if the character is a letter.
            char c = text.charAt(i);
            // If the character is a letter, add it to the clean text.
            if (Character.isLetter(c)) {
                cleanText += c;
            }
        }

        // Convert the text to lowercase.
        cleanText = cleanText.toLowerCase();

        // Check if the text is a palindrome by dividing the text into two halves and
        // comparing them.
        boolean isPalindrome = true;
        for (int i = 0; i < cleanText.length() / 2; i++) {
            // Compare the first character with the last character, the second character
            // with the second last character, and so on.
            if (cleanText.charAt(i) != cleanText.charAt(cleanText.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The text is a palindrome.");
        } else {
            System.out.println("The text is not a palindrome.");
        }
    }
}
