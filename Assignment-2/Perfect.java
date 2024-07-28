public class Perfect {

    public static void main(String[] args) {
        /*
         * Test Cases:
         * Numbers 1 to 1000: Verified each number to see if it is a perfect number.
         * Expected perfect numbers within this range are 6, 28, 496.
         */

        int sum = 0;
        // Find all perfect numbers between 1 and 1000.
        for (int i = 1; i < 1000; i++) {
            // Find all divisors of i and add them to sum.
            for (int j = 1; j < i; j++) {
                // If j is a divisor of i, add it to sum.
                if (i % j == 0) {
                    sum += j;
                }
            }
            // If the sum of all divisors of i is equal to i, then i is a perfect number.
            if (sum == i) {
                System.out.println(i + " is a perfect number.");
            }
            // Reset sum for the next iteration.
            sum = 0;
        }
    }
}
