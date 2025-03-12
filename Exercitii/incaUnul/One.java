import java.util.Scanner;

public class One {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.print("Introduce un numar pentru a verifica daca este par sau impar: ");
        n = scanner.nextInt();
        System.out.println();

        if (n % 2 == 0) {
            System.out.println(n + " este par");
        } else {
            System.out.println(n + " nu este par");
        }

        scanner.close();
    }
}