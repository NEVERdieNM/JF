import java.util.Scanner;

public class Cifre {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Num: ");
        int n = scanner.nextInt();

        System.out.println("Suma Cifre: " + sumaCifrelor(n));

        scanner.close();
    }

    public static int sumaCifrelor(int n) {

        int suma = 0;
        while (n > 0) {
            suma += n % 10;
            n /= 10;
        }
        return suma;
    }
}
