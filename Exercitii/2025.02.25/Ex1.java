import java.util.Scanner;
import java.util.ArrayList;

public class Ex1 {
    static final int NUM = 5;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[NUM];

        System.out.println("Introdu 5 integeri:");
        for(int i=0; i<NUM; i++) {
            vector[i] = sc.nextInt();
        }

        double medieAritmetica = medieAritmetica(vector);
        ArrayList<Integer> larger = findLarger(vector, medieAritmetica);

        System.out.println("medie arithemtica: " + medieAritmetica);
        System.out.println("elemente mai mari decat media aritmetica: " + larger.toString());

        sc.close();

    }

    public static double medieAritmetica(int[] vec) {
        double medieArithmetica = 0;
        for (int n : vec) {
            medieArithmetica += n;
        }
        medieArithmetica /= NUM;

        return medieArithmetica;
    }

    public static ArrayList<Integer> findLarger(int[] vec, double d) {

        ArrayList<Integer> larger = new ArrayList<>();
        for (int n : vec) {
            if(n > d) {
                larger.add(n);
            }
        }

        return larger;
    }
}
