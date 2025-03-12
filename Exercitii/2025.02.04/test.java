import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        System.out.println();
        for (int i = n; i > 0; i--) {
            for (int j = n; j > 0; j--) {
                System.out.print(j >= i ? j : i);
            }
            System.out.println();
        }

        scanner.close();
    }
}