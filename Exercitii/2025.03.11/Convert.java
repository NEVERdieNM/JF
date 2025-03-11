import java.util.ArrayList;
import java.util.Arrays;

public class Convert {
    
    public static void main(String[] args) {
        
        String myStr = "Java, Python, JavaScript";
        String[] arr = myStr.split(", ");
        ArrayList<String> list =  new ArrayList<>(Arrays.asList(arr));
        
        String arrStr = list.toString();
        System.out.println(arrStr);
    }
}
