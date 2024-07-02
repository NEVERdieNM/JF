import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();
        System.out.print("l: ");
        int l = scanner.nextInt();
        System.out.println();

        double arie = (n * Math.pow(l, 2)) / (4 * Math.tan(Math.PI / n));
        System.out.println("Aria: " + arie);


        scanner.close();
    }
}