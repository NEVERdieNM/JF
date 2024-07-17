import java.util.Random;
import java.util.Scanner;

public class Rand {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("N: ");
        int n = scanner.nextInt();

        System.out.print("A: ");
        int a = scanner.nextInt();

        System.out.print("B: ");
        int b = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(rand.nextInt(b - a) + a);
        }

        scanner.close();
    }
}
