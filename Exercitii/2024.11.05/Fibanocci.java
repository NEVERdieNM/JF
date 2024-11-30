public class Fibanocci {
    
    public static void main(String[] args) {
        
        System.out.println(calcFibanocci(6));
    }

    public static int calcFibanocci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return calcFibanocci(n-1) + calcFibanocci(n-2);
    }
}
