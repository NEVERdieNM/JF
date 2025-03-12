import java.util.Arrays;

public class Inversare {
    public static void main(String[] args) {
        
        int[] vec = {2, 4, 5, 9, 23, 6, 234, 11};

        System.out.println(Arrays.toString(vec) + "\n");

        for (int i = 0; i < vec.length / 2; i++) {
            
            int temp = vec[i];
            vec[i] = vec[vec.length - i - 1]; 
            vec[vec.length - i - 1] = temp;
        }

        System.out.println(Arrays.toString(vec));
    }
}
