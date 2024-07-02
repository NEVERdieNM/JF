import java.util.Scanner;

public class Ex21 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();
        System.out.print("c: ");
        int c = scanner.nextInt();
        System.out.println();

        double semiPerimatru = (a + b + c) / 2.0;
        double arie = Math.sqrt(Math.abs(semiPerimatru * (semiPerimatru - a) * (semiPerimatru - b) * (semiPerimatru - c)));

        double raza = (a * b * c) / (4 * arie);

        System.out.println("Raza: " + raza);

        scanner.close();
    }
}
