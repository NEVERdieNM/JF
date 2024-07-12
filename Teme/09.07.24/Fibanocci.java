import java.util.Arrays;
import java.util.Scanner;

public class Fibanocci {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Num: ");
        int n = scanner.nextInt();

        System.out.println(Arrays.toString(genereazaSecventa(n)));

        scanner.close();
    }

    public static int[] genereazaSecventa(int n) {

        int[] secventa = new int[n];
        secventa[0] = 1;
        secventa[1] = 1;

        for (int i = 0; i < n; i++) {
            try {
                secventa[i] = secventa[i-1] + secventa[i-2];
            } catch(ArrayIndexOutOfBoundsException e) {}

        }

        return secventa;
    }
}
