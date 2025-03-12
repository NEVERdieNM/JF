import java.util.Scanner;

public class Armstrong {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("num: ");
        int numOriginal = scanner.nextInt();

        int num = numOriginal;
        int armstrong = 0;

        while (num > 0) {
            armstrong += Math.pow(num % 10, 3);
            num /= 10;
        }

        if (armstrong == numOriginal) {
            System.out.println(numOriginal + " este un numar armstrong!");
        } else {
            System.out.println(numOriginal + " nu este un numar armstrong!");
        }

        scanner.close();
    }
}
