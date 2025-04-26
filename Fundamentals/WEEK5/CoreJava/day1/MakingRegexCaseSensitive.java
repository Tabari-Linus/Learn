
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MakingRegexCaseSensitive {

    public static void main(String[] args) {
        String str = "From GFG class. Welcome to gfg.";

        Pattern pattern = Pattern.compile("gfg", Pattern.CASE_INSENSITIVE);
        Matcher match = pattern.matcher(str);

        while (match.find()) {
            System.out.println("Found: " + match.group());
        }
    }
}
