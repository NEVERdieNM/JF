/*
 *  1. Write a Java program to create an array list, add some colors (strings) and print out the collection.
    1.2 Write a Java program to iterate through all elements in an array list.
    1.3 Write a Java program to insert an element into the array list at the first position.
    1.4 Write a Java program to retrieve an element (at a specified index) from a given array list.
    1.5 Write a Java program to update an array element by the given element.
    1.6 Write a Java program to sort a given array list.
    1.7 Write a Java program to reverse elements in an array list.
 */

import java.util.ArrayList;
import java.util.Collections;

public class Ex1 {

    public static void main(String[] args) {
        
        ArrayList<String> colors = new ArrayList<>();

        colors.add("red");
        colors.add("green");
        colors.add("blue");

        System.out.println(colors.toString());

        System.out.println();

        for(String e : colors) {
            System.out.println(e);
        }

        System.out.println();

        colors.add(0, "purple");

        System.out.println(colors.toString());

        System.out.println("\n" + colors.get(1));

        colors.set(2, "pink");
        System.out.println("\n" + colors.toString());

        colors.sort(null);
        System.out.println("\n" + colors.toString());

        Collections.reverse(colors);
        System.out.println("\n" + colors.toString());
    }
}