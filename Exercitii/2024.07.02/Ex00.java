import java.util.Scanner;

public class Ex00 {
    
    public static void main(String[] args) {
        
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        n = scanner.nextInt();
        System.out.println();

        int suma = 0;
        int i = 0;
        while(i <= n) {
            suma += i;
            i++;
        }

        System.out.println("Suma: " + sum);

        scanner.close();
    }
}
