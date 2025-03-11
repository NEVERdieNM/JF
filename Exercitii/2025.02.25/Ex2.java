import java.util.HashMap;
import java.util.Map;

public class Ex2 {
    
    static HashMap<Integer, String> map1 = new HashMap<>();
    static HashMap<Integer, String> map2 = new HashMap<>();

    public static void main(String[] args) {
        
        map1.put(1, "America de sud");
        map1.put(2, "America de nord");
        map1.put(3, "Europa");
        map1.put(4, "Africa");
        
        map2.put(5, "Asia");
        map2.put(6, "Australia");
        map2.put(7, "Antartica");

        for (Map.Entry<Integer,String> e : map1.entrySet()) {
            map2.put(e.getKey(), e.getValue());
        }

        System.out.println(map2.toString());
    }
}
