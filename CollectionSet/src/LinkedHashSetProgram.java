import java.io.*;
import java.util.*;

public class LinkedHashSetProgram {
    public static void main(String[] args){

        // Creating LinkedHashSet
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();

        // adding elements
        lhs.add("Is");
        lhs.add("Kol");
        lhs.add("Daravuth");

        // Traversing elements
        Iterator<String> itr = lhs.iterator();

        while (itr.hasNext()) {

            // Printing elements while checking if there is next element
            System.out.println(itr.next());

        }
    }
}
