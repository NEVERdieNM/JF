import java.util.Scanner;

public class Ex15 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();

        System.out.printf("%d^%d = " + (long)Math.pow(a, b), a, b);

        scanner.close();
    }
}
