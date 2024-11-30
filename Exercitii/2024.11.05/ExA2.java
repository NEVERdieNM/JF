public class ExA2 {
    
    public static void main(String[] args) {
        
        System.out.println(calculateSum(5));
    }

    public static int calculateSum(int n) {
        if (n <= 0){
            return n;
        } else if (n == 1) {
            return 1;
        }

        int sum = 0;
        sum += n;
        sum += calculateSum(n - 1);

        return sum;
    }
}
