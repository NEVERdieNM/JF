import java.util.Scanner;

public class Vocale {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.println(countVowels(str));

        scanner.close();
    }

    public static int countVowels(String str) {

        int vowelCount = 0;
        char[] vowels = {'A', 'E', 'I', 'O', 'U'};

        for (char letter : str.toCharArray()) {
            boolean isVowel = false;

            for (char vowel : vowels) {
                if (Character.toUpperCase(letter) == vowel) {
                    isVowel = true;
                    break;
                }
            }

            if (isVowel) {
                vowelCount++;
            }
        }

        return vowelCount;
    }   

    public static int countVowelsAlt(String str) {
        int vowelCount = 0;
        String vowels = "AEIOUaeiou";

        for (int i = 0; i < str.length(); i++) {

            if (vowels.indexOf(str.charAt(i)) != -1) {
                vowelCount++;
            }
        }

        return vowelCount;
    }
}
