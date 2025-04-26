
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegexReplacement {

    public static void main(String[] args) {

        String inputString = "apple, banana, apples";
        System.out.println("Original String: " + inputString);

        String regexPattern = "apple";
        String replacementString = "orange";

        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(inputString);
        StringBuilder sb = new StringBuilder();
        while (matcher.find()) {
            matcher.appendReplacement(sb, replacementString);
        }
        matcher.appendTail(sb);
        String resultString = sb.toString();
        System.out.println("Result String: " + resultString);
        // String resultString = inputString.replaceAll(regexPattern, replacementString);
        // System.out.println("Result String: " + resultString);

    }
}
