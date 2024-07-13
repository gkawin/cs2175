public class CalculateMultiplication {
    public static void main(String[] args) {
        String a = "1235421415454545454545454544";
        String b = "234234234";

        System.out.println(multiplying(a, b));

    }

    public static String multiplying(String a, String b) {
        // The maximum length of the result is the sum of the lengths of the two input
        // strings.
        int[] result = new int[a.length() + b.length()];

        // Loop through the two input strings in reverse order.
        for (int i = a.length() - 1; i >= 0; i--) {
            // Multiply the two digits and add the result to the current result.
            for (int j = b.length() - 1; j >= 0; j--) {
                // The product of the two digits is the product of the two digits plus the
                // current result.
                int product = (a.charAt(i) - '0') * (b.charAt(j) - '0');
                // The sum is the product plus the current result.
                int sum = product + result[i + j + 1];
                // The current result is the sum modulo 10.
                result[i + j] += sum / 10;
                // The next result is the sum modulo 10.
                result[i + j + 1] = sum % 10;
            }
        }

        // Convert the result to a string.
        StringBuilder sb = new StringBuilder();
        // Loop through the result and append each digit to the string builder.
        for (int num : result) {
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
