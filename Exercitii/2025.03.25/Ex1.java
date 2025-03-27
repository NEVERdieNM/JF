import java.util.Scanner;

public class Ex1 {

    /*
     
    Write a java program to display the following pattern: 

                input: 7
        1 
        2 1 
        3 2 1 
        4 3 2 1 
        5 4 3 2 1 
        6 5 4 3 2 1 
        7 6 5 4 3 2 1 

     */

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("        input: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            for (int j=i; j>0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}