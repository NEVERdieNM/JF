import java.util.Scanner;

public class TemaSuplimentara1 {

    public static void main(String[] args) {
        
        //Să se scrie un program care citește numărul natural n și determină suma 2+4+..+(2n).
        
        Scanner input = new Scanner(System.in);

        System.out.print("Introduceti un numar natural: ");
        int n = input.nextInt();

        int suma = 0;
        for (int i = 1; i <= n; i++) {

            suma += i*2;
            if(i*2 == 2*n)
            break;
        }

        System.out.println("Suma este: " + suma);

        input.close();
    }
}