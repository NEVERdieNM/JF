import java.util.Scanner;

public class TemaSuplimentara4 {
    
    public static void main(String[] args) {
        
        /**Scrie un program care calculează și afișează suma numerelor 
        *  de la 1 la n, unde n este introdus de utilizator.
        */

        Scanner input = new Scanner(System.in);

        int n;
        int suma = 0;

        System.out.print("Introduceti un numar: ");
        n = input.nextInt();

        for(int i = 1; i <= n; i++) {
            suma += i;
        }

        System.out.println("Suma numerelor de la 1 la " + n + "(inclusiv) este: " + suma);

        input.close();
    }
}
