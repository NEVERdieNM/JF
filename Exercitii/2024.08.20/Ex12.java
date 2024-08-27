import java.util.Scanner;

public class Ex12 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("str: ");
        final String STR = scanner.nextLine();

        String str = "";

        for (int i = 0; i < STR.length(); i++) {
            if (i > 0 && i < STR.length()-1 && (STR.charAt(i - 1) == ' ' || STR.charAt(i + 1) == ' ')) {
                str += Character.toUpperCase(STR.charAt(i));
            }
            else if ( i == 0 || i == STR.length() - 1) {
                str += Character.toUpperCase(STR.charAt(i));
            }
            else {
                str += STR.charAt(i);
            }
        }
        
        System.out.println(str);

        scanner.close();
    }
}
