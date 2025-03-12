public class Min {

    public static void main(String[] args) {
        
        int[] numere = {4, 8, 9, 2, 6};

        minNum(numere);
    }

    public static void minNum(int[] vec) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < vec.length; i++) {
            if (vec[i] < min)
            min = vec[i];
        }

        System.out.println("Min: " + min);
    }
}