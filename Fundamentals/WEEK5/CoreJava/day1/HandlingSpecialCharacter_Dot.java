
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HandlingSpecialCharacter_Dot {

    public static void main(String[] args) {
        String email = "user.name@example.com";

        // Match the dot in the email
        Pattern pattern = Pattern.compile("\\.");
        Matcher matcher = pattern.matcher(email);

        System.out.println("Positions of dots in the email:");
        while (matcher.find()) {
            System.out.println("Dot found at index: " + matcher.start());
        }
    }
}
