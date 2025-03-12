import java.util.Scanner;

public class Cauta {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Num cautat: ");
        int num = scanner.nextInt();
        System.out.println();

        int[] vec = {2, 4, 5, 9, 23, 6, 234, 11};

        for( int n : vec) {
            if (n == num) {
                System.out.println("Gasit");
                return;
                //System.exit(0);
            }
        }
        System.out.println("Nu exista");
    }
}