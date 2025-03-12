import java.util.Scanner;

public class Ex1 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();
        System.out.println();

        int suma = 0;

        while (n != 0) {
            int cifra = n % 10;
            suma += cifra;
            n /= 10;
        }
//1234
//4, 123
//3, 12
//2, 1
//1
        System.out.println("Suma: " + suma);

        scanner.close();
    }
}
