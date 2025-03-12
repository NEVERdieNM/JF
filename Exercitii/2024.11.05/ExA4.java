public class ExA4 {

    public static void main(String[] args) {
        
        System.out.println(baseToPow(5, -3));
    }

    public static double baseToPow(int b, int e) {

        if (e == 0) {
            return 1;
        }

        double product = 1;

        if(e > 0) {
            product = b * baseToPow(b, e-1);
        } else {
            product = 1/baseToPow(b, -e);
        }

        return product;
    }
}