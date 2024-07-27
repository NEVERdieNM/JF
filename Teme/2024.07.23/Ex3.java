import java.util.Scanner;

public class Ex3 {
    
    public static void main(String[] args) {
        
        int x1 = 100;
        int y1 = -45;

        int x2 = 16;
        int y2 = 7;

        Scanner scanner = new Scanner(System.in);

        System.out.print("X1: ");
        x1 = scanner.nextInt();
        System.out.print("Y1: ");
        y1 = scanner.nextInt();

        System.out.println();

        System.out.print("X2: ");
        x2 = scanner.nextInt();
        System.out.print("Y2: ");
        y2 = scanner.nextInt();        

        System.out.println();

        int lungime = Math.abs(x1 - x2);
        int inaltime = Math.abs(y1 - y2);

        double distanta = Math.sqrt(Math.pow(lungime, 2) + Math.pow(inaltime, 2));

        System.out.println("Distanta: " + distanta);

        scanner.close();
    }
}
