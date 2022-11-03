import java.io.*;
import java.util.*;

public class HashSetProgram {
    public static void main(String[] args){

        // Creating HashSet
        HashSet<String> hs = new HashSet<String>();

        // Adding elements
        hs.add("Is");
        hs.add("Kol");
        hs.add("Daravuth");

        // Traversing elements
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {

            // Printing elements while checking if there is next element
            System.out.println(itr.next());
        }
    }
}
