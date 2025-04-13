
import java.util.Collections;
import java.util.*;

public class CollectionLIst {

    public static void main(String[] args) {

        System.out.println("Hello, Collections!");

        List<String> studentNames = new ArrayList<>();

        studentNames.add("Fortune");
        studentNames.add("Micheal");
        studentNames.add("Ben");
        studentNames.add("Kevin");
        System.out.println("Student Names: " + studentNames);
        studentNames.remove("Micheal");
        System.out.println("Student Names : " + studentNames);

        System.out.println("Unsorted student names: " + studentNames);

        Collections.sort(studentNames);

        System.out.println("Sorted student nsmrd: " + studentNames);

        System.out.println("\n\n");
        List<String> newStudentNames = new ArrayList<>();

        newStudentNames.add("Alice");
        newStudentNames.add("John");
        newStudentNames.add("Sophia");
        newStudentNames.add("Emma");

        System.out.println("New Student Names: " + newStudentNames);

        newStudentNames.sort(Comparator.reverseOrder());
        System.out.println("Newname Sorted in decending order: " + newStudentNames);
    }

}
