import java.util.Scanner;

// Should not use the toString() method.

public class ExtractDigits {

    public static void main(String[] args) {
        /**
         * Test Cases:
         * Number 15423: (Expected Output: "3 2 4 5 1").
         * Number 987654321: (Expected Output: "1 2 3 4 5 6 7 8 9").
         * Number 1000: (Expected Output: "0 0 0 1").
         */

        extractDigits(15423);
        extractDigits(987654321);
        extractDigits(1000);
    }

    public static void extractDigits(int number) {
        int reversedNumber = 0;
        // Loop until the number is greater than 0.
        while (number > 0) {
            // Extract the last digit by taking the remainder of the number divided by 10.
            int digit = number % 10;
            // Append the digit to the reversed number by multiplying the reversed number by
            // 10 and adding the digit.
            reversedNumber = reversedNumber * 10 + digit;
            // Remove the last digit by dividing the number by 10.
            number /= 10;

            System.out.print(digit + " ");

        }

        System.out.println();

    }
}
