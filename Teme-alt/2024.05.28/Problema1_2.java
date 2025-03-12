import java.util.Scanner;
import java.util.Arrays;

public class Problema1_2 {
    //Se dă un număr natural n. Să se afişeze în ordine crescătoare, primii n termeni ai şirului lui Fibonacci.

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        int a = 0;
        int b = 0;

        System.out.print("Problema 1 sau 2?(1/2): ");
        int p = scanner.nextInt();

        if(p == 1) {
            System.out.print("Introduce n: ");
            n = scanner.nextInt();
        }
        else if(p == 2) {
            System.out.print("Introduce a: ");
            a = scanner.nextInt();
            System.out.print("Introduce b: ");
            b = scanner.nextInt();
            n = b;
        }

        int[] sirFibanocci = new int[n];

        int prev1 = 0;
        int prev2 = 1;
        int curent = 0;
        for(int i = 0; i < n; i++) {
            if(prev1 == 0)
            {
                sirFibanocci[i] = 1;
            }
            else {
                sirFibanocci[i] = curent;
            }
            curent = prev1 + prev2;
            prev1 = prev2;
            prev2 = curent;
        }

        if(p == 1) {
            System.out.println("\n" + Arrays.toString(sirFibanocci));
        }
        else if(p == 2) {
            for(int i = 0; i < sirFibanocci.length; i++) {
                if(sirFibanocci[i] >= a && sirFibanocci[i] <= n)
                System.out.print(sirFibanocci[i] + " ");
            }
        }
        

        scanner.close();
    }

    public void problema1() {
        
    }
}
