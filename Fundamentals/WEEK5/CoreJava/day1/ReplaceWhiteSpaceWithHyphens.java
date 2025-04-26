
public class ReplaceWhiteSpaceWithHyphens {

    public static void main(String[] args) {

        String title = "Learn Java Regular Expressions Today!";

        String slug = title.replaceAll("\\s+", "-");

        System.out.println(" Title: " + title);
        System.out.println("URL Slug: " + slug);
    }
}
