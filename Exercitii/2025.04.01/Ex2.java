import java.util.*;

public class Ex2 {
    
    public static void main(String[] args) {
        
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);

        set2.add(2);

        set.retainAll(set2);
        set2.retainAll(set);

        System.err.println(set);
        System.out.println(set2);
    }
}
