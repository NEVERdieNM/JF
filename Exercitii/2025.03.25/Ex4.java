import java.util.Scanner;

public class Ex4 {
    
    // Factorial

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("factorial of: ");
        int n = sc.nextInt();

        int factorial = 1;
        for (int i=n; i>0; i--) {
            factorial *= i;
        }

        System.out.println("result: " + factorial);

        sc.close();
    }
}
