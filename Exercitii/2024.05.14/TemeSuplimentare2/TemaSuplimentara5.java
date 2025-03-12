import java.util.Scanner;

public class TemaSuplimentara5 {
    
    public static void main(String[] args) {
        
        //Scrie un program Java care calculează suma cifrelor unui număr.

        //codul ignora alte caractere introduse in loc de 0-9 si aduna cifrele, chiar daca sunt alte caractere sau spatii introduse.

        Scanner input = new Scanner(System.in);

        System.out.print("Introduceti un numar: ");
        String  n = input.next();
        char[] nArray = n.toCharArray();

        int sum = 0;
        for(int i = 0; i < nArray.length; i++) {

            int num = Character.getNumericValue(nArray[i]);
            if(num >= 0 && num <= 9) {
                sum += num;
            }
        }

        System.out.println("Suma cifrelor din numarul introdus este: " + sum);

        input.close();
    }
}
