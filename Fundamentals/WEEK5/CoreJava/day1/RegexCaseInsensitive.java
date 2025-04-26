
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCaseInsensitive {

    public static void main(String[] args) {
        String text = "I love Java, JAVA, and javaScript!";

        // Compile a pattern with case insensitivity
        Pattern pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Occurrences of 'java':");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
