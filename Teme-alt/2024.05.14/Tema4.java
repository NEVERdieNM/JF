import java.util.Scanner;

public class Tema4 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("nume: ");
        String userName = scanner.next();
        System.out.println("\nSalut, " + userName + "!");

        scanner.close();
    }
}
