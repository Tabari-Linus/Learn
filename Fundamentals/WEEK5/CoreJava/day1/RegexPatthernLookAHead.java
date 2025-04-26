
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPatthernLookAHead {

    public static void main(String[] args) {
        String text = "I love JavaScript and Java. JavaScript has great frameworks";

        // Positive lookahead
        Pattern pattern = Pattern.compile("Java(?=Script)");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found: " + matcher.group());
        }
    }
}
