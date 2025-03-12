import java.util.HashSet;

public class SetEquals {
    
    public static void main(String[] args) {
        
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);    
        set1.add(6);
        set1.add(7);
        set1.add(8);
        set1.add(9);
        set1.add(10);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);                   
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);
        set2.add(9);
        set2.add(10);

        HashSet<Integer> set3 = new HashSet<>();
        set3.add(1);
        set3.add(2);
        set3.add(3);
        set3.add(4);
        set3.add(5);
        set3.add(6);

        System.out.println(set1.equals(set2));
        System.out.println(set1.equals(set3));
    }
}
