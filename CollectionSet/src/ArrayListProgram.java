import java.io.*;
import java.util.*;

public class ArrayListProgram {
    public static void main(String[] args){

        // Initializing array list
        ArrayList<Integer> arrayList = new ArrayList<Integer>();


        for (int i = 0; i <= 10; i++)
            // Adds 0 to 10 into the list
            arrayList.add(i);

        // Prints list
        System.out.println(arrayList);

        // Remove number on specific index
        arrayList.remove(3);
        arrayList.remove(5);

        // Add number on specific index
        arrayList.add(6, 22);

        // Prints out the modified list
        System.out.println(arrayList);

        // Loop to specify each index
        for (int i = 0; i < arrayList.size(); i++)
            // Prints out the list with spaces in between
            System.out.print(arrayList.get(i) + " ");

    }
}
