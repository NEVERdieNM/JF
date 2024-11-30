import java.util.Scanner;

public class Ex9 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();
        System.out.println();

        int[] numere = new int[n];

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ": ");
            numere[i - 1] = scanner.nextInt();
        }
        System.out.println();

        double medieGeometrica = 1;

        for (int element : numere) {
            medieGeometrica *= element;
            System.out.println(medieGeometrica);
        }
        medieGeometrica = Math.pow(medieGeometrica, 1.0/n);

        System.out.println("Medie Geometrica: " + medieGeometrica);

        scanner.close();
    }
}
