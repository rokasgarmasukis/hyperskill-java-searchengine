package search;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of people:");
        int numOfDataPoints = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter all people:");
        ArrayList<String> data = new ArrayList<>(numOfDataPoints);
        for (int i = 0; i < numOfDataPoints; i++) {
            data.add(scanner.nextLine());
        }

        while (true) {
            int option = Console.getMenuOption();

            if (option == 0) {
                System.out.println("Bye!");
                break;
            }

            if (option == 2) {
                System.out.println("=== List of people ===");
                Console.displayData(data);
            }

            if (option == 1) {
                String searchTerm = Console.getSearchTerm();
                ArrayList<String> results = SearchEngine.search(data, searchTerm);
                Console.displayData(results);
            }
        }



    }
}
