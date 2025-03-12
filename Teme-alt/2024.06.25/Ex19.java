import java.util.Scanner;

public class Ex19 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.println();

        System.out.println("n * 10^a = " + n * (long)Math.pow(10, a));

        scanner.close();
    }
}
