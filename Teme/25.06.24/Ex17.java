import java.util.Scanner;

public class Ex17 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();
        System.out.println();

        for (int i = 0; i < n; i++) {
            int num;
            if ( (num = n - i) % 2 != 0) {
                System.out.print(num + ", ");
            }
        }

        scanner.close();
    }
}
