import java.util.Scanner;

public class PermutationString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();

        System.out.println("Permutations of the string are: ");
        int n = str.length();
        int nFact = 1;
        for (int i = 1; i <= n; i++) {
            nFact *= i;
        }

        System.out.println("Number of permutations: " + nFact);
        permute(str, 0, str.length() - 1);

    }

    private static void permute(String text, int left, int right) {
        if (left == right) {
            System.out.println(text);
        } else {
            for (int i = left; i <= right; i++) {
                text = swap(text, left, i);
                permute(text, left + 1, right);
                text = swap(text, left, i);
            }
        }

    }

    private static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
