import java.util.Scanner;

public class TemaSuplimetara6 {
    
    public static void main(String[] args) {
        
        //Se citește n număr natural. Calculați suma numerelor naturale mai mici sau egale cu n.

        Scanner input = new Scanner(System.in);

        int n;
        int suma = 0;

        System.out.print("Introduceti un numar: ");
        n = input.nextInt();

        int i = 1;
        while(i <= n) {
            suma += i;
            i++;
        }

        System.out.println("Suma numerelor de la 1 la " + n + " este: " + suma);

        input.close();
    }
}
