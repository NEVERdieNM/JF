import java.util.Scanner;

public class TemaSuplimentara2 {

    public static void main(String[] args) {

        //Un număr natural nenul n se numește norocos dacă pătratul lui se poate scrie ca sumă de n numere naturale consecutive.
        //Se dă un număr natural n.
        //Dacă numărul este norocos afișați cele n numere consecutive care adunate dau pătratul acestuia.

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int resultat = 0;
        for(int i = 0; i < n*n; i++) {

            int suma = 0;

            for(int j = i; j < i+n; j++) {

                suma += j;
                if(suma > n*n) {
                    break;
                }
                if(suma == n*n && j == i+n-1) {
                    System.out.printf("\n%d este norocos, patratul sau poate fii scris ca suma urmatoarelor %d numere:\n", n, n);
                    for(int k = 0; k < n; k++) {
                        System.out.printf("%d ", (j+k) - n+1);
                    }
                    break;
                }
            }
            resultat = suma;
            if(suma == n*n) {
                break;
            }
        }
        if(resultat != n*n) {
            System.out.printf("\n%d nu este un numar norocos.", n);
        }

        input.close();
    }
}