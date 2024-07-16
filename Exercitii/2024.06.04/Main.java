import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Nume: ");
        // String nume = scanner.next();
        // System.out.printf("\nBuna %s!\n", nume);
        // scanner.close();
        System.out.println(esteEgalCuZece(10));
        System.out.println(esteEgalCuZece(8));
    }

    static boolean esteEgalCuZece(int n) {

        if (n == 10) {
            return true;
        }
        return false;
    }
}
