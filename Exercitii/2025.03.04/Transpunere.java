import java.util.Arrays;

public class Transpunere {
    
    public static void main(String[] args) {
        
        int[][] matrix = {  
            {2,3,4},
            {2,6,4}
        };

        int[][] transpondedMatrix = transpondMatrix(matrix);

        for (int i=0; i<transpondedMatrix.length; i++) {
            System.out.println(Arrays.toString(transpondedMatrix[i]));
        }
    }

    public static int[][] transpondMatrix(int[][] matrix) {

        int[][] transpondedMatrix = new int[matrix[0].length][matrix.length];

        for (int i=0; i<matrix[0].length; i++) {
            for (int j=0; j<matrix.length; j++) {
                transpondedMatrix[i][j] = matrix[j][i];
            }
        }

        return transpondedMatrix;
    }
}
