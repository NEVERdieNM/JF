import java.util.Scanner;

public class Distanta {
    
    public static void main(String[] args) {
        
        double x1,y1;
        double x2,y2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("X1: ");
        x1 = scanner.nextDouble();
        System.out.print("Y1: ");
        y1 = scanner.nextDouble();

        System.out.println();;

        System.out.print("X2: ");
        x2 = scanner.nextDouble();
        System.out.print("Y2: ");
        y2 = scanner.nextDouble();

        System.out.println();

        double distantaX = Math.abs(x1 - x2);
        double distantaY = Math.abs(y1 - y2);

        double distantaDintrePuncte = Math.sqrt(Math.pow(distantaX, 2) + Math.pow(distantaY, 2));

        System.out.println("Distanta: " + distantaDintrePuncte);

        scanner.close();
    }
}
