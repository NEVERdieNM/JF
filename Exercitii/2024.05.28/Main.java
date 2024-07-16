public class Main {
    
    public static void main(String[] args) {
        
        Calculator calc = new Calculator();

        int sum;
        sum = calc.add(30, 6);
        System.out.println(sum);

        int sub;
        sub = calc.subtract(30, 6);
        System.out.println(sub);

        int mul;
        mul = calc.mul(30, 6);
        System.out.println(mul);

        double div;
        div = calc.divide(38, 0);
        System.out.println(div);

        int pow;
        pow = calc.pow(6);
        System.out.println(pow);

        double sqrt;
        sqrt = calc.sqrt(4);
        System.out.println(sqrt);
    }
}
