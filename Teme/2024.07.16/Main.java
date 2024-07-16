import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the integer
        int number = scanner.nextInt();

        // Reading the string
        String operation = scanner.next();

        // Printing the values to verify
        System.out.println("Number: " + number);
        System.out.println("Operation: " + operation);
        
        scanner.close();
    }
}
