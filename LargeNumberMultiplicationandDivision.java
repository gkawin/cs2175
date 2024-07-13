public class LargeNumberMultiplicationandDivision {

    public static void main(String[] args) {
        // Test multiplication
        // Multiplication of two large numbers up-to 100 decimal digits. For example,
        // the
        // product of 12345678901234567890 and 98765432109876543210 is
        // 1219326311370217952237463801111263526900.
        System.out.println(longMultiplication("12345678901234567890", "98765432109876543210"));

        // Test division
        // Division of 12345678901234567890 by 9876543210:
        // Expected Output: 1249999990.1234567890123456789
        System.out.println(longDivision("500", "4"));

    }

    public static String longMultiplication(String a, String b) {
        // The maximum length of the result is the length of the first input string.
        int[] possibliyResultLength = new int[a.length() + b.length()];

        // Reverse the numbers for easier calculation from right to left
        a = new StringBuilder(a).reverse().toString();
        b = new StringBuilder(b).reverse().toString();

        // Multiply each digit
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                // Multiply the digits and add the result to the current index.
                int multiply = (a.charAt(i) - '0') * (b.charAt(j) - '0');
                // Add the result to the current index.
                possibliyResultLength[i + j] += multiply;

                // Handle carry over if the result is greater than 10 and store the carry over
                // in the next index.
                if (possibliyResultLength[i + j] >= 10) {
                    // Add the carry over to the next index and store the remainder in the current
                    // index.
                    possibliyResultLength[i + j + 1] += possibliyResultLength[i + j] / 10;
                    // Store the remainder in the current index. This is equivalent to taking the
                    // modulo of the result.
                    possibliyResultLength[i + j] %= 10;
                }
            }
        }

        // Convert result array to string
        StringBuilder resultStr = new StringBuilder();
        boolean leadingZero = true;
        // In the possibliyResultLength array, the result is stored in reverse order.
        // So, we need to reverse it again. Also, we need to skip leading zeros.
        for (int i = possibliyResultLength.length - 1; i >= 0; i--) {
            if (possibliyResultLength[i] == 0 && leadingZero) {
                continue;
            }
            leadingZero = false;
            resultStr.append(possibliyResultLength[i]);
        }

        // If the result is all zeros
        if (resultStr.length() == 0) {
            return "0";
        }

        return resultStr.toString();
    }

    public static String longDivision(String a, String b) {
        // Variables to store quotient and remainder
        int quotient = 0;
        int remainder = 0;

        // The maximum length of the result is the length of the first input string.
        int[] dividends = new int[a.length()];

        // Get each digit of the dividend
        for (int i = 0; i < a.length(); i++) {
            // Convert the character to an integer and store it in the dividends array.
            dividends[i] = Character.getNumericValue(a.charAt(i));
        }

        // the maximum length of the result is the length of the first input string.
        int[] divisors = new int[b.length()];

        // Get each digit of the divisor
        for (int i = 0; i < b.length(); i++) {
            // Convert the character to an integer and store it in the divisors array.
            divisors[i] = Character.getNumericValue(b.charAt(i));
        }

        int current = 0;
        // Loop through the dividend array and perform long division.
        for (int i = 0; i < dividends.length; i++) {
            // Multiply the current value by 10 and add the next digit of the dividend.
            current = current * 10 + dividends[i];

            for (int j = 0; j < divisors.length; j++) {
                // Calculate the quotient by dividing the current value by the divisor.
                quotient = current / divisors[j];
                // Calculate the remainder by taking the modulo of the current value and the
                // divisor.
                remainder = current % divisors[j];

            }

            // Store the remainder in the current variable for the next iteration.
            current = remainder;
            // Store the quotient in the dividends array for the next iteration.
            dividends[i] = quotient;
        }

        StringBuilder sb = new StringBuilder();
        // Loop through the result and append each digit to the string builder.
        for (int num : dividends) {
            // Skip leading zeros.
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }

        // If the string builder is empty, return "0", otherwise return the String
        // Class.
        return sb.length() == 0 ? "0" : sb.toString();

    }

}
