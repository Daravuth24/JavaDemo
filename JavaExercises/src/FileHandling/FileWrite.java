package FileHandling;

import java.io.FileWriter;

import java.io.IOException;

public class FileWrite {

    public static void main(String[] args) {

        try {
            FileWriter myWriter = new FileWriter("testfile.txt");
            myWriter.write("Hello World!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
