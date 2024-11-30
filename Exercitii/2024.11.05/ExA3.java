public class ExA3 {
    
    public static void main(String[] args) {
        
        System.out.println(calcFibonacci(5));
    }

    public static int calcFibonacci(int n) {

        if (n <= 1) {
            return n;
        }

        int fib = calcFibonacci(n - 1) + calcFibonacci(n - 2);

        return fib;
    }
}
