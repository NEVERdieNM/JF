import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        String c = scanner.nextLine();
        String x = scanner.nextLine();
        int n = scanner.nextInt();

        System.out.printf("La concursul %s, elevul %s, a obtinut %d", c, x, n);
        scanner.close();
    }
}
