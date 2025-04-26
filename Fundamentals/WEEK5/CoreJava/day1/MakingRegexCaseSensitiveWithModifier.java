
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MakingRegexCaseSensitiveWithModifier {

    public static void main(String[] args) {
        String str = "From GFG class. Welcome to gfg.";

        Pattern pattern = Pattern.compile("(?i)gfg");

        Matcher match = pattern.matcher(str);

        while (match.find()) {
            System.out.println("Found: " + match.group());
        }

    }

}
