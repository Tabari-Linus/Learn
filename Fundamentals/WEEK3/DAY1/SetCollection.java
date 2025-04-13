
import java.util.HashSet;
import java.util.Set;

public class SetCollection {

    public static void main(String[] args) {

        Set<String> studentID = new HashSet<>();
        studentID.add("S001");
        studentID.add("S002");
        studentID.add("S003");
        studentID.add("S004");

        System.out.println("Student ID: " + studentID);
        System.out.println("Number of students: " + studentID.size());
        System.out.println("Is S001 in the set? " + studentID.contains("S001"));

        for (String studID : studentID) {
            System.out.println("Student ID: " + studID);
        }
    }
}
