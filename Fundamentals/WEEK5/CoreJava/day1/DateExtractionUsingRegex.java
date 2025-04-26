
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateExtractionUsingRegex {

    public static void main(String[] args) {
        String text = "The event is scheduled for 2025-04-26 and the deadline is 2025-05-01.";

        // Match dates in the format YYYY-MM-DD
        Pattern pattern = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
        Matcher matcher = pattern.matcher(text);

        System.out.println("Dates found:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
