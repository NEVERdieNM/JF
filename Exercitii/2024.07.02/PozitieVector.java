import java.util.Scanner;

public class PozitieVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul:");
        int n = scanner.nextInt();
        int[] g = new int[n];
        
        for (int i = 0; i < n; i++) {
            g[i] = scanner.nextInt();
        }

        int i = 0;  // Reset i to 0 before the while loop
        while (i < n) {
            System.out.println(g[i]);
            i++;
        }

        scanner.close();
    }
}