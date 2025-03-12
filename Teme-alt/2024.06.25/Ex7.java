import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();
        System.out.println();

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                if (x + y == n) {
                    System.out.printf("X: %d\nY: %d\n\n", x, y);
                }
            }
        }

        scanner.close();
    }
}