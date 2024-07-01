public class TemaSuplimentara4 {
    public static void main(String[] args) {
        
        //Scrie un program Java care caută un element într-o matrice bidimensională și returnează poziția acestuia.

        int[][] matrice = {{0, 9, 8, 7, 6 },
                           {1, 2, 4, 3, 5 },
                           {11,14,13,12,16},
                           {15,17,19,18,20},
                           {25,23,21,24,10}};

        int n = 24; // numer de gasit.

        for(int i = 0; i < matrice.length; i++) {
            for(int j = 0; j < matrice[i].length; j++) {

                if (matrice[i][j] == n) {
                    System.out.printf("\nNumarul %d se afla la pozitia [%d][%d]\n", n, i, j);
                    break;
                }
            }
        }
    }
}
