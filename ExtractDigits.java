import java.util.Scanner;

public class ExtractDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int number = sc.nextInt();
        sc.close();

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

            System.out.println("Digit: " + digit + " Reversed number: " + reversedNumber + " Number: " + number);
        }

        System.out.println("Reversed number: " + reversedNumber);
    }
}
