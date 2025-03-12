import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        int temp = 0;

        System.out.println();
        for(int i=1; i<=n; i++){
            if(temp == 0)
                temp = 1;

            if(i % 2 == 0) {
                 
                for(int j=temp; j<(temp+i); j++) {
                    System.out.print(j + " ");
                }
                temp = temp+i*2; //(temp+i-1) + (i+1)
            }
            else {

                for(int j=temp; j>(temp-i); j--) {
                    System.out.print(j + " ");
                }
                temp = temp + 1;
            }
            System.out.println();
        }

        scanner.close();
    }
}