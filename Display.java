package search;

import java.util.ArrayList;

public class Display {
    public static void displayData(ArrayList<String> data, String dataName){
        System.out.printf("Found %s:\n", dataName);

        for (String datapoint : data) {
            System.out.println(datapoint);
        }
    }
}
