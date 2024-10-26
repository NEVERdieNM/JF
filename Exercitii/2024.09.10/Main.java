import Ex4.Calculator;
import Ex5.Matrice;

public class Main {
    
    public static void main(String[] args) {
        
        int[][] matriceA = {{2, 5, 6},
                            {4, 5, 7}};

        int[][] matriceB = {{4, 5},
                            {3, 8},
                            {6, 8}};

        int[][] res = Matrice.calcMatrice(matriceA, matriceB);

        for (int[] arr : res) {
            for (int e : arr) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}
