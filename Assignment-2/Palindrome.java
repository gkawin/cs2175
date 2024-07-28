
public class Palindrome {

    public static void main(String[] args) {
        /**
         * Test Cases:
         * Phrase "Dot saw I was Tod": (Expected Output: "True").
         * Phrase "Was it a car or a cat I saw?": (Expected Output: "True").
         * Phrase "Madam, I'm Adam": (Expected Output: "True").
         * Phrase "Hello, World!": (Expected Output: "False").
         */

        // Test the first phrase.
        String phrase1 = "Dot saw I was Tod";
        System.out.println(isPalindrome(phrase1));

        // Test the second phrase.
        String phrase2 = "Was it a car or a cat I saw?";
        System.out.println(isPalindrome(phrase2));

        // Test the third phrase.
        String phrase3 = "Madam, I'm Adam";
        System.out.println(isPalindrome(phrase3));

        // Test the fourth phrase.
        String phrase4 = "Hello, World!";
        System.out.println(isPalindrome(phrase4));
    }

    public static boolean isPalindrome(String text) {
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

        return isPalindrome;
    }
}
