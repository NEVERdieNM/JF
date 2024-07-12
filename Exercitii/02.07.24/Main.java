 import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        n = scanner.nextInt();
        System.out.println();
        
        int numCifre = (int)Math.log10(n) + 1;
        int[] cifre = new int[numCifre];

        int i = 0;
        int mod = 10;
        while (i < numCifre) {
            int cifra = n % mod;
            cifra -= n % mod/10;
            cifra /= mod/10;

            cifre[i] = cifra;

            mod *= 10;
            i++;
        }

        int suma = 0;
        for (int num : cifre) {
            suma += num;
        }

        System.out.println("Suma: " + suma);

        scanner.close();
    }
}
