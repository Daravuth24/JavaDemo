package FileHandling;

import java.io.File;

public class FileRenameII {

    public static void main(String[] args)
    {
        File file = new File("HelloWorld.txt");

        File rename = new File("testfile.txt");


        boolean flag = file.renameTo(rename);

        if (flag == true) {
            System.out.println("File Successfully Rename");
        }

        else {
            System.out.println("Operation Failed");
        }
    }
}
