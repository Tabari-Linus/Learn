
public class SplitingByDelimiter {

    public static void main(String[] args) {
        String csv = "Ben,25,Ayeduase,Kumasi,0541234567";

        // Split by commas
        String[] parts = csv.split(",");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
