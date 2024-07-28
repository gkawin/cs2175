
import java.util.ArrayList;

public class RemoveDup {
    public static void main(String[] args) {
        /*
         * Examples:
         * Input: arr[] = {3, 3, 3, 3, 3}
         * Output: arr[] = {3}
         * new size = 1
         * 
         * Input: arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5}
         * Output: arr[] = {1, 2, 3, 4, 5}
         * new length = 5
         * 
         */

        // Use ArrayList to store the unique elements

        // int[] arr = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
        int[] arr = { 3, 3, 3, 3, 3 };
        int newLength = removeDuplicates(arr);
        System.out.println("new length = " + newLength);
    }

    public static int removeDuplicates(int[] arr) {
        // Implement the logic to remove duplicates
        ArrayList<Integer> unique = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (!unique.contains(arr[i])) {
                unique.add(arr[i]);
            }
        }
        for (int i = 0; i < unique.size(); i++) {
            arr[i] = unique.get(i);
        }
        System.out.println(unique);
        return unique.size();
    }

}
