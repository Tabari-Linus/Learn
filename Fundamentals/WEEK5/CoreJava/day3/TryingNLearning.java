
import java.util.ArrayList;
import java.util.stream.Stream;

// Class
public class TryingNLearning {

    // Main driver method
    public static void main(String[] args) {
        // Data Source

        // Creating an arrayList object
        // Declaring object of String type
        ArrayList<String> gfgNames = new ArrayList<>();

        // Custom input elements to above object
        gfgNames.add("Dean");
        gfgNames.add("castee");
        gfgNames.add("robert");

        // Creating object of Stream where Stream is created
        // using arrayList and object as data source
        Stream<String> streamOfNames = gfgNames.stream();

        // Print and display element
        System.out.print(streamOfNames);
    }
}
