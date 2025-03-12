import java.util.Scanner;

public class Ex22 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.println("b: ");
        int b = scanner.nextInt();
        System.out.println("c: ");
        int c = scanner.nextInt();
        System.out.println();

        double medianA;
        double medianB;
        double medianC;

        medianA = Math.sqrt((2 * Math.pow(b, 2) + 2 * Math.pow(c, 2) - a*a) / 4.0);
        medianB = Math.sqrt((2 * Math.pow(a, 2) + 2 * Math.pow(c, 2) - b*b) / 4.0);
        medianC = Math.sqrt((2 * Math.pow(a, 2) + 2 * Math.pow(b, 2) - c*c) / 4.0);

        System.out.println("Median dus din a: " + medianA);
        System.out.println("Median dus din b: " + medianB);
        System.out.println("Median dus din c: " + medianC);

        scanner.close();
    }
}
