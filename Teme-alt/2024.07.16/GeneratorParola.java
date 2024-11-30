import java.util.Random;
import java.util.Scanner;

public class GeneratorParola {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Care va fi lungimea parolei: ");
        int n = scanner.nextInt();

        String parola = "";

        for (int i = 0; i < n; i++) {
            parola += (char) (rand.nextInt(122 - 33) + 33);
        }

        System.out.println(parola);

        scanner.close();
    }
}