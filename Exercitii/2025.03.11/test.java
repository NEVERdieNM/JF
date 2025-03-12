import java.util.LinkedList;
public class test {
    
    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        for (Integer i : list) {
            if (i == 3) {
                list.remove(i);
            }
        }

        System.out.println(list);
    }
}
