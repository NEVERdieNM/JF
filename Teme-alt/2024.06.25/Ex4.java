public class Ex4 {
    
    public static void main(String[] args) {
    
        int[] vec = {2, 4, 5, 9, 23, 6, 234, 11};

        double medie = 0;
        for (int n : vec) {
            medie += n;
        }
        medie /= vec.length;

        System.out.println("Medie: " + medie);
    }
}
