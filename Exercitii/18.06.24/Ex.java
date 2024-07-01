import java.util.Scanner;
import java.util.Vector;

public class Ex {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[] vec = new int[5];

        System.out.print("num: ");
        vec[0] = scanner.nextInt();
        vec[1] = scanner.nextInt();
        vec[2] = scanner.nextInt();
        vec[3] = scanner.nextInt();
        vec[4] = scanner.nextInt();

        System.out.println("Max: " + maxVec(vec));

    }

    public static int maxVec(int[] vec) {

        int max = 0;

        for (int i = 0; i < vec.length; i++) {

            max = Math.max(max, vec[i]);
        }

        return max;
    }
}
