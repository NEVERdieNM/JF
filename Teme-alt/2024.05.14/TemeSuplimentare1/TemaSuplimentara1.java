import java.util.Scanner;

public class TemaSuplimentara1 {

    public static void main(String[] args) {
        
        /**
         * Scrie un program care citește un număr întreg de la utilizator 
         * și determină dacă este par sau impar.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Introduceti un numar: ");
        int num = input.nextInt();

        if(num % 2 == 0) {
            System.out.println(num + " este par");
        }
        else {
            System.out.println(num + " este impar");
        }

        input.close();
    }
}