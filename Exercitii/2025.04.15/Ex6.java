import java.util.ArrayList;
import java.util.ListIterator;

public class Ex6 {
    //Parcurge o listă folosind ListIterator și adaugă după fiecare element cuvântul "Verificat".
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        list.add("Fig");
        list.add("Grape");
        list.add("Honeydew");
        list.add("Kiwi");
        list.add("Lemon");
        list.add("Mango");
        list.add("Nectarine");
        list.add("Orange");

        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()) {
            iterator.next();
            iterator.add("verified");
        }

        System.out.println(list.toString());
    }
}
