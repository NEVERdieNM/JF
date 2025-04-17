package poziticonsecutive;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class poziticonsecutive {
    
    public static void main(String[] args) {
        
        File in = new File("pozitiiconsecutive.in");
        File out = new File("pozitiiconsecutive.out");

        int x = 0, y = 0;

        try {
            Scanner fileScanner = new Scanner(in);
            x = fileScanner.nextInt();
            y = fileScanner.nextInt();
            fileScanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {

            FileWriter fileWriter = new FileWriter(out);
            for (int i=y; i>0; i--) {
                fileWriter.write(sir(i) + " ");
            }
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static int sir(int n) {

        if(n == 1) {
            return 0;
        }
        else if (n == 2) {
            return 3;
        }

        return 2*sir(n-1) - sir(n-2) + 2;

    }
}
