package search;

import java.util.ArrayList;
import java.util.Scanner;

public class Console {
    public static void displayData(ArrayList<String> data) {
        for (String datapoint : data) {
            System.out.println(datapoint);
        }
        System.out.println();
    }

    public static String getSearchTerm() {
        System.out.println("Enter a name or email to search all suitable people.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int getMenuOption() {
        while (true) {
            displayMenu();
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()){
                int choice = scanner.nextInt();
                if (choice == 1 || choice == 2 || choice == 0) {
                    return choice;
                }
                System.out.println("Incorrect option! Try again");
                System.out.println();
            }
        }
    }


    private static void displayMenu() {
        System.out.println("=== Menu ===");
        System.out.println("1. Find a person");
        System.out.println("2. Print all people");
        System.out.println("0. Exit");
    }
}
