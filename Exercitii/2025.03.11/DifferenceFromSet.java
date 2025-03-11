import java.util.HashSet;
import java.util.stream.Stream;

public class DifferenceFromSet {
    
    public static void main(String[] args) {
        
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(1);

        set1.removeAll(set2);

        System.out.println(set1);
    }
}
