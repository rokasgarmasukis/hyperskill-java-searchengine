package search;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> data = new ArrayList<>();
        if (args.length == 2) {
            String filename = args[1];

            try (Scanner scanner = new Scanner(new File(filename))) {
                while(scanner.hasNextLine()) {
                    data.add(scanner.nextLine());
                }
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }
        } else {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the number of people:");
            int numOfDataPoints = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter all people:");
            data = new ArrayList<>(numOfDataPoints);
            for (int i = 0; i < numOfDataPoints; i++) {
                data.add(scanner.nextLine());
            }
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
