import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int f1 = 1, f2 = 1, fn;
        
        if (n >= 1) {
            System.out.print(f1 + " ");
        }
        if (n >= 2) {
            System.out.print(f2 + " ");
        }
        
        for (int i = 3; i <= n; i++) {
            fn = f1 + f2;
            System.out.print(fn + " ");
            
            f1 = f2;
            f2 = fn;
        }
        
        scanner.close();
    }
}