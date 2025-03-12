import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Problema4_5_6 {
 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("n: ");
        int n = scanner.nextInt();

        int[] divisori = gasesteDivisori(n);
        int[] divisoriImpari = gasesteDivisoriImpari(n);

        System.out.println("divisori: ");
        afiseaza(divisori);        
        System.out.println("divisori impari: ");        // problema 4
        afiseaza(divisoriImpari);                         // problema 5

        int minDivisorPatrat = calcMinDivisorPatrat(n);

        System.out.println("patratul celui mai mic divisor: ");
        System.out.println(minDivisorPatrat);           //problema 6

        scanner.close();
    }
    
    public static int[] gasesteDivisori(int n) {
        ArrayList<Integer> divisori = new ArrayList<>();
        
        int divisorMax = (int)Math.sqrt(n);
        for(int i = 1; i <= divisorMax; i++) {
            if(n % i == 0) {
                divisori.add(i);
                if(i != n / i)
                divisori.add(36 / i);
            }
        }

        Collections.sort(divisori);

        // converteste arraylist-ul intr-un array
        int[] resultatDivisori = new int[divisori.size()];
        for(int i = 0; i < divisori.size(); i++) {
            resultatDivisori[i] = divisori.get(i);
        }

        return resultatDivisori;
    }
    
    public static int[] gasesteDivisoriImpari(int n) {
        
        int[] divisori = gasesteDivisori(n);// gaseste divisori
        int lungimeArray = 0; // stoceaza numarul divisorilor impari
        // gaseste divisori impari
        for(int i = 0; i < divisori.length; i++) {
            if(divisori[i] % 2 != 0) {
                lungimeArray++; // incrementeaza numarul divisorilor impari gasiti
            }
            else {
                divisori[i] = 0; // schimba valoarea divisorilor pari in 0 pentru a o elimina mai tarziu
            }
        }

        int[] divisoriImpari = new int[lungimeArray];

        int index = 0;// indexul divisorilor impari
        for(int i = 0; i < divisori.length; i++) {
            if(divisori[i] != 0) {
                divisoriImpari[index] = divisori[i];// daca elementul din divisori la indexul i este impar il adauga in array-ul divizorilor impari
                index++;// incrementeaza indexul divisorilor impari
            }
        }

        return divisoriImpari;
    }

    public static void afiseaza(int [] d) {
        System.out.println(Arrays.toString(d));
    }

    public static int calcMinDivisorPatrat(int n) {

        int minDivisorPatrat;
        int minDivisor = 0;
        int i = 2;
        while(true) {
            if(n % i == 0)
            {
                minDivisor = i;
                break;
            }
            i++;
        }
        minDivisorPatrat = (int)Math.pow(minDivisor, 2);
        
        return minDivisorPatrat;
    }
}
