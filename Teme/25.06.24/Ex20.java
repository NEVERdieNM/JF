import java.util.Scanner;

public class Ex20 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();
        System.out.print("c: ");
        char c = scanner.next().charAt(0);
        System.out.println();

        for (int i = 0; i < n*2; i++) {
            for (int j = 0; j < n; j++) {
                if (i < n) {
                    if (j < ((n-1) - i)) {
                        System.out.print(" ");
                    } else {
                        System.out.print(c);
                    }
                } else {
                    if (j < n*2 - i) {
                        System.out.print(c);
                    }
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
