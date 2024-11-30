import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex2 {
    
    public static void main(String[] args) throws FileNotFoundException{
        
        File file = new File("file");

        Scanner scanner = new Scanner(file);

        scanner.close();
    }
}
