import java.util.Scanner;

public class Print {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("n: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n; j > 0; j--) {
                if (j == i+1) {
                    System.out.print("*");
                }else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }

        s.close();
    }
}