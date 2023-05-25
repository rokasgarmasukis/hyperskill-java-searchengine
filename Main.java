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
        String[] data = new String[numOfDataPoints];
        for (int i = 0; i < numOfDataPoints; i++) {
            data[i] = scanner.nextLine();
        }

        System.out.println("Enter the number of search queries:");
        int numOfQueries = scanner.nextInt();
        scanner.nextLine();

        String searchTerm;
        ArrayList<String> results;
        for(int i = 0; i < numOfQueries; i++) {
            System.out.println("Enter data to search people:");
            searchTerm = scanner.nextLine();
            results = SearchEngine.search(data, searchTerm);
            Display.displayData(results, "people");
        }

        scanner.close();
    }
}
