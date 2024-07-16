import java.util.Scanner;

public class Ex23 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("raza: ");
        int raza = scanner.nextInt();
        System.out.println();

        double arie = 4*Math.PI * raza*raza;
        double volum = (4*Math.PI * raza*raza*raza) / 3;

        System.out.println("Arie: " + arie);
        System.out.println("Volum: " + volum);

        scanner.close();
    }
}
