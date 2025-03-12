import java.util.*;

public class Zaruri {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Apasa <ENTER> pentru a arunca zarul 1! ");
        scanner.nextLine();
        int zarJucator1 = arunca(rand);
        System.out.println("Ai aruncat: " + zarJucator1 + "\n");

        System.out.print("Apasa <ENTER> pentru a arunca zarul 2! ");
        scanner.nextLine();
        int zarJucator2 = arunca(rand);
        System.out.println("Ai aruncat: " + zarJucator2 + "\n");

        int totalJucator = zarJucator1 + zarJucator2;
        System.out.println("Total jucator: " + totalJucator + "\n");

        System.out.print("Apasa <ENTER> pentru a vedea aruncarea 1 a calculatorului! ");
        scanner.nextLine();
        int zarCalc1 = arunca(rand);
        System.out.println("A aruncat: " + zarCalc1 + "\n");

        System.out.print("Apasa <ENTER> pentru a vedea aruncarea 2 a calculatorului! ");
        scanner.nextLine();
        int zarCalc2 = arunca(rand);
        System.out.println("A aruncat: " + zarCalc2 + "\n");

        int totalCalculator = zarCalc1 + zarCalc2;
        System.out.println("Total calculator: " + totalCalculator + "\n");

        System.out.print("Apasa <ENTER> pentru a vedea rezultatul! ");
        scanner.nextLine();
        System.out.println();

        if (totalCalculator == totalJucator) {
            System.out.println("Egalitate!\n\nTotal calculator: " + totalCalculator + "\nTotal jucator: " + totalJucator);
        }
        else if (totalCalculator > totalJucator) {
            System.out.println("Calculatorul a castigat cu totalul: " + totalCalculator + "\nTotal jucator: " + totalJucator);
        } else {
            System.out.println("Ai castigat cu totalul: " + totalJucator + "\nTotal calculator: " + totalCalculator);
        }

        scanner.close();
    }

    public static int arunca(Random rand) {
        return rand.nextInt(6-1) + 1;
    }
}
