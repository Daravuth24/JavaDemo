import java.io.*;
import java.util.*;

public class TreeSetProgram {
    public static void main(String[] args){

        // Creating TreeSet
        TreeSet<String> ts = new TreeSet<String>();

        // Adding elements
        ts.add("Is");
        ts.add("Kol");
        ts.add("Daravuth");

        // Traversing elements
        Iterator<String> itr = ts.iterator();

        while (itr.hasNext()) {

            // Printing elements while checking if there is next element
            System.out.println(itr.next());

        }
    }
}
