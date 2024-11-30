public class Ex6 {


    public static void main(String[] args) {
        
        double a = imparte(1,0);

        System.err.println(a);
    }

    public static double imparte(double a, double b) {

        if(a%1 != 0 || b%1 != 0) {
            throw new NumberFormatException();
        } else if(b == 0) {
            throw new ArithmeticException();
        }

        return (double)(a/b);
    }
}
