package Ex5;
public class Matrice {
    
    public static int[][] calcMatrice(int[][] a, int[][] b) {

        int rowsA = a.length;
        int colsA = a[0].length;

        int rowsB = b.length;
        int colsB = b[0].length;

        int[][] product = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {       
            for (int j = 0; j < colsB; j++) {    
                for (int k = 0; k < colsA; k++) {
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return product;
    }
}
