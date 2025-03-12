public class ExA1 {

    public static void main(String[] args) {
        
        System.out.println(calculateFactorial(5));
    }

    public static int calculateFactorial(int n) {

        if (n <= 0) {
            return n;
        }  else if (n == 1){
            return 1;
        }

        int factorial = 1;
        factorial *= n;
        factorial *= calculateFactorial(n - 1);

        return factorial;
    }
}