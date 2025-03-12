import java.util.Scanner;

public class Ex2 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        System.out.println();
        for(int i=0; i<n; i++) {

            for(int j=n; j>0; j--) {
                if(j < n-i) {
                    System.out.print(n-i);
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }


        scanner.close();
    }
}
