
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Try {

    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);
        System.out.println(treeSet); // Output: [1, 2, 3]
        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(2);
        set.add(4); // Ignored
        System.out.println(set); // Output: [1, 2, 3]
    }
}
