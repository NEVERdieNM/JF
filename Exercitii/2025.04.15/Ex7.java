import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//Creează un program care primește de la tastatură o listă de cuvinte, apoi le parcurge folosind un Iterator și le transformă în majuscule (fără a modifica lista originală).

public class Ex7 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter words: ");
        List<String> wordsArr = new ArrayList<>(Arrays.asList(scanner.nextLine().split(" ")));
        scanner.close();

        Iterator<String> iterator = wordsArr.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        
    }
}
