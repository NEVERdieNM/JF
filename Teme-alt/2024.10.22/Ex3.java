import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ex3 {
    
    public static void main(String[] args) throws NoSuchElementException, FileNotFoundException{
        
        File file = new File("file.txt");

        Scanner scanner = new Scanner(file);
        scanner.nextLine();

        scanner.close();
    }
}
