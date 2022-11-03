import java.io.*;
import java.util.*;

public class LinkedListProgram {
    public static void main(String[] args){

        // Initialize linked list
        LinkedList<Integer> linkedlist = new LinkedList<Integer>();


        for (int i = 1; i <= 10; i++)
            // Adds 0 to 10 into the list
            linkedlist.add(i);

        // Prints list
        System.out.println(linkedlist);

        // Remove number on specific index
        linkedlist.remove(1);
        linkedlist.remove(6);

        // Add number on specific index
        linkedlist.add(1, 8);
        linkedlist.add(6, 25);

        // Prints out the modified list
        System.out.println(linkedlist);

        // Loop to specify each index
        for (int i = 0; i < linkedlist.size(); i++)
            // Prints out the list with spaces in between
            System.out.print(linkedlist.get(i) + " ");
    }
}
