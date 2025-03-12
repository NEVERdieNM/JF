import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex18 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();
        System.out.println();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int numarator = n;
        double numitor = 0;

        for (int i = 0; i < n; i++) {
            numitor += 1.0/arr[i];
        }

        DecimalFormat df = new DecimalFormat(".##");

        double medieArmonica = numarator / numitor;
        System.out.println("Medie armonica: " + df.format(medieArmonica));

        scanner.close();
    }
}
