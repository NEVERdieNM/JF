import java.util.Scanner;

public class TemaSuplimentara5 {

    public static void main(String[] args) {
        
        //Să se scrie un program care determină maximul a două numere întregi citite de la tastatură.

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if(num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }

        System.out.printf("%d este mai mare decat %d", Math.max(num1, num2), Math.min(num1, num2));

        scanner.close();
    }
}