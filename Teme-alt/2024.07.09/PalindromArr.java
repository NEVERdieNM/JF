import java.util.Scanner;

public class PalindromArr {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Num: ");
        final int NUM_ORIGINAL = scanner.nextInt();

        int n = NUM_ORIGINAL;

        int numCifre = 0;
        while (n > 0) {
            n /= 10;
            numCifre++;
        }
        n = NUM_ORIGINAL;

        int[] nums = new int[numCifre];

        int i = 0;
        while (n > 0) {
            nums[i] = n % 10;
            n /= 10;
            i++;
        }

        boolean palindrom = true;
        for (i = 0; i < numCifre; i++) {
            if (nums[i] != nums[numCifre - 1 - i]) {
                palindrom = false;
            }
        }

        if (palindrom) {
            System.out.println(NUM_ORIGINAL + " este un palindrom");
        } else {
            System.out.println(NUM_ORIGINAL + " nu este un palindrom");
        }

        scanner.close();
    }
}
