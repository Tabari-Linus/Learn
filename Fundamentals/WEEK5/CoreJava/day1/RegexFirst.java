
public class RegexFirst {

    public static void main(String[] args) {

        String inputString = "Hello, World! 12345 world. 123";
        System.out.println("Input String: " + inputString);

        String regexPattern = "\\d+";

        String replacementString = "number";

        String ouString = inputString.replaceFirst(regexPattern, replacementString);
        System.out.println("Output String: " + ouString);

        // Pattern pattern = Pattern.compile(regexPattern);
        // String resultString = pattern.matcher(inputString).replaceFirst(replacementString);
        // System.out.println("Result String: " + resultString);
    }
}
