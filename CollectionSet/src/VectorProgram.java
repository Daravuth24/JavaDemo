import java.io.*;
import java.util.*;

public class VectorProgram {
    public static void main(String[] args){

        // Declaring the Vector
        Vector<Integer> v = new Vector<Integer>();

        // Appending new elements
        for (int i = 1; i <= 10; i++)
            v.add(i);

        // Printing elements
        System.out.println(v);

        // Remove element at index 2
        v.remove(2);

        // Add element at index 5
        v.add(5, 7);
        // Displaying the Vector after modification
        System.out.println(v);

        // Printing elements one by one
        for (int i = 0; i < v.size(); i++)
            System.out.print(v.get(i) + " ");
    }
}
