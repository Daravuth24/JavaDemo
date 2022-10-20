import java.util.Arrays;

public class ArrayExamples1 {
    public static void main(String[] args) {

        String[] words = new String[5];
        words[0] = "Flex";
        words[1] = "Laptop";
        words[2] = "Money";
        words[3] = "Fruit";
        words[4] = "Economy";
        System.out.print(words[0] + "\n");
        int array[] = {1,2,3,4,5};
        for(int x=0; x<array.length; x++){
            System.out.println(array[x]);
        }
        int a = 10, b = 20;
        if (a > b) {
            int c = a - b;
            System.out.println("The result is:" + c);
        }
        else if(a < b){
            int c = a + b;
            System.out.println("The result is:" + c);
        }
        else{
            System.out.println("Please enter a valid number");
        }
    }
}
