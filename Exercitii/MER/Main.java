import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        int[] a = {5,6};

        System.out.println(Arrays.toString(a));

        changeValue(a);

        System.out.println(Arrays.toString(a));

    }

    static void changeValue(int[] a) {
        a[0] = 35;
    }
}