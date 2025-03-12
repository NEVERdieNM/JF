import java.util.Scanner;
import java.util.Arrays;

public class Problema3 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti un sir de numere cu pauza dupa fiecare numar: \n> ");
        String str = scanner.nextLine();

        String[] vecString = str.split(" ", 0); // Transforma inputul intr-un array de String-uri
        int[] vecInteger = new int[vecString.length];

        // transforma array-ul de caractere intr-un array de integeri
        for(int i = 0; i < vecInteger.length; i++) {
            try {
                vecInteger[i] = Integer.parseInt(vecString[i]);
            }catch(NumberFormatException e) {
                System.out.println("\nIntroduce doar numere.");
                System.exit(1);
            }
        }

        // trece prin array de la dreapta la stanga sa gaseasca primul numar prim, 
        //care este ultimul numar prim de la stanga la dreapta
        boolean primGasit = false;
        for(int i = vecInteger.length - 1; i >= 0; i--) {
            if(estePrim(vecInteger[i])) {
                vecInteger[i] = 0;
                primGasit = true;
                break;
            }
        }

        System.out.println("\n" + Arrays.toString(vecInteger));
        if(!primGasit) {
            System.out.println("Sirul nu contine niciun numar prim\n");
        }

        scanner.close();
    }

    static public boolean estePrim(int n) {

        if(n <=1) {
            return false;
        }
        else if(n == 2) {
            return true;
        }
        else if(n % 2 == 0) {
            return false;
        }

        int divisorMax = (int)Math.sqrt(n);
        for(int i = 3; i <= divisorMax; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
