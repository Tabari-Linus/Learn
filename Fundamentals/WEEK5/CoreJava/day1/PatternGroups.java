
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternGroups {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("Hello (world) ([0-9]+)");
        Matcher matcher = pattern.matcher("Hello world 1");

        // if (matcher.matches()) {
        //     System.out.println("Group 1: " + matcher.group(1));
        //     System.out.println("Group 2: " + matcher.group(2));
        //     System.out.println("Group 0: " + matcher.group(0));
        // }
        if (matcher.matches()) {
            System.out.println((String) matcher.replaceAll("Hi $1 $2"));
        }
    }
}
