import java.util.HashMap;
import java.util.Map;

public class Age {
    
    public static void main(String[] args) {
        
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Marius", 25);
        ages.put("Paul", 30);
        ages.put("andrei", 20);
        ages.put("Alice", 15);
        ages.put("Mark", 15);
        ages.put("Vlad", 12);
        ages.put("David", 10);
        ages.put("Eva", 13);
        ages.put("Niklas", 12);

        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            if (entry.getValue() >= 18) {
                System.out.println(entry);
            }
        }
    }
}
