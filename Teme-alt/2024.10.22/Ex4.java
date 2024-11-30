import java.util.Scanner;

public class Ex4 {
    
    public static void main(String[] args) throws DoubleIntegerException{
        
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers");
        for (int i=0; i<10; i++) {
            int n = scanner.nextInt();
            numbers[i] = n;
        }

        for (int i=0; i<numbers.length; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    throw new DoubleIntegerException();
                }
            }
        }
        System.out.println("no double integers");
        scanner.close();
    }

    private static class DoubleIntegerException extends Exception {

    }
}
