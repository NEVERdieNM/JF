import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHash {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(4);

        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        System.out.println(set);
    }
}
