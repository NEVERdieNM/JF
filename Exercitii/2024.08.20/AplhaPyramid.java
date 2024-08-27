import java.util.Scanner;
import java.util.Arrays;

public class AplhaPyramid {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("n: ");
        final int N = scanner.nextInt();

        final char[] ALPHA = new char[26 * 2];
        for (int i = 0, j = 0; j < ALPHA.length; i++, j += 2) {
            ALPHA[j] = (char) (65+i);
            ALPHA[j+1] = (char) (97+i);
        }


        System.out.println(Arrays.toString(ALPHA));

        for (int i = 0; i < N; i++) {
            int index = 0;
            for (int j = 0; j < N*2; j++) {
                if (j >= (N-1) - i && j < (N*2) - (N-i)) {
                    System.out.print(ALPHA[index]);
                    index++;
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // for (int i = 0; i < N; i++) {
        //     int index = 0;
        //     for (int j = 0; j <= N; j++) {
        //         if (j > (N-1) - i) {
        //             System.out.print(ALPHA[index]);
        //             index++;
        //         }
        //         else {
        //             System.out.print(" ");
        //         }
        //     }

        //     for (int j = 0; j < N; j++) {
        //         if (j > (N-1-i)) {
        //             System.out.print(ALPHA[index]);
        //             index++;
        //         }
        //     }

        //     System.out.println();
        // }

        scanner.close();
    }
}