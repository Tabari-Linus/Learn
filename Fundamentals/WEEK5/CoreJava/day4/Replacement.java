
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replacement {

    public static void main(String[] args)
            throws Exception {
        // Create a pattern to match cat
        Pattern p = Pattern.compile("cat");
        // Create a matcher with an input string
        Matcher m = p.matcher("one cat,"
                + " two cats in the yard");
        StringBuffer sb = new StringBuffer();
        boolean result = m.find();
        // Loop through and create a new String 
        // with the replacements
        while (result) {
            m.appendReplacement(sb, "dog");
            result = m.find();
        }
        // Add the last segment of input to 
        // the new String
        m.appendTail(sb);
        System.out.println(sb.toString());
    }
}
