public class Histogram {
    public static void main(String args[]){


        int Count = 0; //total number of marks entered
        int catOne = 0; //counters for each catergory
        int cat2 = 0;   //counters for each catergory
        int cat3 = 0;  //counters for each catergory
        int cat4 = 0; //counters for each catergory
        int mark = 0;
        int totalPassed = 0; //entered by user
        double averageScore = 0;
        int lowMark = 102;
        int highMark = 0;
        int mark1 = 0;
        int value = 0;
        boolean run = false;

        //Vertical
        System.out.println("0-29  30-39  40-69  70-100");
        for (int i = 0; i < catOne; i++) {
            System.out.println("  ");
            System.out.print("");
            System.out.print("*        ");//display the amount of students recieved the mark


        }
        System.out.print("");
        for (int i = 0; i < cat2; i++) {
            System.out.println("  ");
            System.out.print("");
            System.out.print("        *"); //display the amount of students recieved the mark

        }
        System.out.print("");
        for (int i = 0; i < cat3; i++) {
            System.out.println("  ");
            System.out.print("");
            System.out.print("              *");//display the amount of students recieved the mark
        }

        for (int i = 0; i < cat4; i++){
            System.out.println("  ");
            System.out.print("");
            System.out.print("                        *"); //display the amount of students recieved the mark
            System.out.print("");
        }


    }
}
