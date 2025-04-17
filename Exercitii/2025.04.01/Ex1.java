import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        
        //Write a Java program to reverse the content of a sentence (assume a single space between two words) without reverse every word.

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] inputArr = input.split(" ");
        String output = "";

        for (int i=inputArr.length-1; i>=0; i--) {
            output += inputArr[i] + (i!=0 ? " " : "");
        }

        System.out.println(output);

        sc.close();
    }
}