package FileHandling;

import java.io.File;

public class FileRename {

    public static void main(String[] args)
    {
        File file = new File("testfile.txt");

        File rename = new File("HelloWorld.txt");

        boolean flag = file.renameTo(rename);

        if (flag == true) {
            System.out.println("File Successfully Rename");
        }

        else {
            System.out.println("Operation Failed");
        }
    }
}
