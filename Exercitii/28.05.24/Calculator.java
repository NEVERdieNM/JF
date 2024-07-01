
public class Calculator {
 

    int add(int a, int b) {

        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int mul(int a, int b) {
        return a * b;
    }

    double divide(int a, int b) {
        double quotient = 0;
        try {
            quotient = a / b;
        }catch(ArithmeticException e) {
            e.printStackTrace();
        }
        return quotient;
    }

    int pow(int a) {
        return a*a;
    }

    double sqrt(int a) {
        return Math.sqrt(a);
    }

    void afiseaza() {
        System.out.println("ceva");
    }
}