
import java.util.regex.*;

public class RegexLearning {

    public static void main(String[] args) {
        String text = "Order123 was placed on 2025-04-26 with a total of $456.";

        // Compile a pattern to match numbers
        Pattern pattern = Pattern.compile("\\d+"); // \d+ matches one or more digits
        Matcher matcher = pattern.matcher(text);

        System.out.println("Numbers found in the text:");
        while (matcher.find()) {
            System.out.println(matcher.group()); // Prints each number found
        }
    }
}
