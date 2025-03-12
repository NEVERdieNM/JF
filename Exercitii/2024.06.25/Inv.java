import java.util.Arrays;

public class Inv {

    public static void main(String[] args) {
        
        int[] vec = {2, 4, 5, 9, 23, 6, 234, 11};
        int[] vec2 = new int[vec.length];

        System.out.println(Arrays.toString(vec));

        for (int i = 0; i < vec.length; i++) {

            vec2[i] = vec[vec.length - 1 - i];
        }
        
        System.out.println(Arrays.toString(vec2));
    }
}