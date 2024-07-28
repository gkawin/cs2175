import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SalespersonSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Salesperson[] salespersons = new Salesperson[3];

        for (int i = 0; i < salespersons.length; i++) {
            System.out.println("Enter ID for salesperson " + (i + 1) + ": ");
            int id = scanner.nextInt();
            System.out.println("Enter sales for salesperson " + (i + 1) + ": ");
            double sales = scanner.nextDouble();
            salespersons[i] = new Salesperson(id, sales);
        }

        System.out.println("Choose sorting method: 1 for ID, 2 for Sales");
        int choice = scanner.nextInt();
        scanner.close();

        if (choice == 1) {
            Arrays.sort(salespersons, Comparator.comparingInt(Salesperson::getSalespersonID));
        } else if (choice == 2) {
            Arrays.sort(salespersons, Comparator.comparingDouble(Salesperson::getSalesAmount));
        } else {
            System.out.println("Invalid choice");
            return;
        }

        System.out.println("Sorted Salespersons:");
        for (Salesperson sp : salespersons) {
            System.out.println(sp.toString());
        }

    }
}
