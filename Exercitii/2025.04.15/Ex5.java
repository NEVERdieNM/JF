import java.util.ArrayList;
import java.util.Iterator;

public class Ex5 {
    //Elimină toate elementele mai mici decât 10 dintr-o listă de numere întregi, folosind un Iterator.
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(0);
        list.add(5);
        list.add(10);
        list.add(11);
        list.add(16);
        list.add(76);
        list.add(22);
        list.add(33);
        list.add(25);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            int n = iterator.next();
            if (n < 10) {
                iterator.remove();
                continue;
            }
            System.out.println(n);
        }
    }
}
