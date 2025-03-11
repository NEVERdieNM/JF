import java.util.ArrayList;

public class RemoveIf {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);   

        int num = 3;    

        list.removeIf(n -> n < num);
        System.out.println(list);
    }
}
