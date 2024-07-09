import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a text: ");
        String text = sc.nextLine();
        sc.close();

        // Remove space and punctuation from the text.
        String cleanText = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
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
