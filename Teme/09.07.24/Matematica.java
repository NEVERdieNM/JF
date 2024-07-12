import java.util.Scanner;

public class Matematica {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Num: ");
        int n = scanner.nextInt();

        System.out.println("Factorial: " + factorial(n));

        scanner.close();
    }

    public static long factorial(int n) {

        long factorial = 1L;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }   
}
