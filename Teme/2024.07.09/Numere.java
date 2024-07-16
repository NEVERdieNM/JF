public class Numere {
    
    public static void main(String[] args) {
        
        int[] vec = {5, 3, 4, 5, 4, 2, 7, 6, 5, 6, 8, 9};
        System.out.println("Suma patrate: " + sumaPatrate(vec));
    }

    public static int sumaPatrate(int[] vec) {

        int suma = 0;
        for (int i = 0; i < vec.length; i++) {
            suma += vec[i]*vec[i];
        }
        return suma;
    }
}
