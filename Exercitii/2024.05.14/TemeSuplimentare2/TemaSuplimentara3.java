import java.util.Scanner;

public class TemaSuplimentara3 {
    
    public static void main(String[] args) {
        
        //Să se scrie un program care citește numărul natural n și determină valoarea lui n!=123...n.

        Scanner input = new Scanner(System.in);

        System.out.print("Introduceti un numar natural: ");
        int n = input.nextInt();

        int suma = 1;
        for(int i = 1; i <= n; i++) {
            suma *= i;
        }

        System.out.println("Factorialul lui " + n + " este: " + suma);

        input.close();
    }
}
