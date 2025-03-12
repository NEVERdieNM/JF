import java.util.Scanner;

public class Ex16 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();
        System.out.println();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (count >= n) {
                break;
            }
            int num;
            if ( (num = n - i) % 2 != 0) {
                System.out.print(num + ", ");
                count++;
            }
        }

        scanner.close();
    }
}
