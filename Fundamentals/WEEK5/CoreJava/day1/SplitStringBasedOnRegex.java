
public class SplitStringBasedOnRegex {

    public static void main(String[] args) {

        String s1 = "All-the-best-people are-here";
        String s2 = "All the best people are here";

        String regex = "-";
        String regex2 = "\\s";

        String split[] = s1.split(regex);
        String split2[] = s2.split(regex2);

        for (String s : split) {
            System.out.print(s + " ");
        }

        System.out.println("\n***************");
        for (String s : split2) {
            System.out.print(s + "_");
        }

        // String regex = "[\\s-]+";
    }
}
