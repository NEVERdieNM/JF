public class Ex1 {
    
    public static void main(String[] args) {
        
        int[] numere = {-1, 5, 10, -5, 3, -20, -3};

        int[] rezultat = calc(numere);

        System.out.println("numere pozitive: " + rezultat[0]);
        System.out.println("numere negative: " + rezultat[1]);

    }

    public static int[] calc(int[] numere) {

        int numerePozitive = 0;
        int numereNegative = 0;

        for (int num : numere) {
            if (num < 0) {
                numereNegative++;
            } else {
                numerePozitive++;
            }
        }

        return new int[]{numerePozitive, numereNegative};
    }
}
