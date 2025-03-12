import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Num: ");
        final int NUM_ORIGINAL = scanner.nextInt();

        int num = NUM_ORIGINAL;
        int palindrom = 0;

        while (num > 0) {
            palindrom *= 10;
            palindrom += num % 10;
            num /= 10;
        }

        System.out.println("Palindrom: " + palindrom);

        if (palindrom == NUM_ORIGINAL) {
            System.out.println(NUM_ORIGINAL + " este un palindrom!");
        } else {
            System.out.println(NUM_ORIGINAL + " nu este un palindrom!");
        }

        scanner.close();
    }
}
