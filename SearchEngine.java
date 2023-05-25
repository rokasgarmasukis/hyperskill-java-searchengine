package search;

import java.util.ArrayList;

public class SearchEngine {
    public static ArrayList<String> search(ArrayList<String> data, String searchTerm) {
        ArrayList<String> results = new ArrayList<>();

        String lowerCaseSearchTerm = searchTerm.toLowerCase();

        for (String datapoint : data) {
            if (datapoint.toLowerCase().contains(lowerCaseSearchTerm)) {
                results.add(datapoint);
            }
        }

        return results;
    }
}
