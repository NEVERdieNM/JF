import java.util.Scanner;

public class Ex8 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();
        System.out.println();

        System.out.println("10^n = " + (long)Math.pow(10, n));

        scanner.close();
    }
}
