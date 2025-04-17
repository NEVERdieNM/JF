import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Ex8 {
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8,9}));

        ListIterator<Integer> iterator = list.listIterator(list.size());
        
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

    }
}
