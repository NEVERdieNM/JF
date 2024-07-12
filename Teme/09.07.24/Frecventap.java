import java.util.HashMap;

public class Frecventap {
    public static void main(String[] args) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] arr = {5, 3, 4, 5, 4, 2, 7, 6, 5, 6, 8, 9};

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.get(arr[i]) == null ? 1 : map.get(arr[i]) + 1);
        }

        System.out.println(map);
    }
}
