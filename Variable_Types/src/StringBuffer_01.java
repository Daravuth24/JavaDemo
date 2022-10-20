public class StringBuffer_01 {
    public static void main(String[] args){
        // New string
        StringBuffer sb1 = new StringBuffer("Java");
        StringBuffer sb2 = new StringBuffer("Hello");
        // Append string
        StringBuffer sb3 = sb1.append(" Programming");
        StringBuffer sb4 = sb2.append(" World");
        // Print the string
        System.out.println(sb3);
        System.out.println(sb4);
        // Find the length and capacity of the string
        int lengthsb3 = sb3.length();
        int lengthsb4 = sb4.length();
        int capacitysb3 = sb3.capacity();
        int capacitysb4 = sb4.capacity();
        // Print the length and capacity of the string
        System.out.println("Length of sb3: " + lengthsb3 + "\n" + "Capacity of sb3: " + capacitysb3);
        System.out.println("Length of sb4: " + lengthsb4 + "\n" + "Capacity of sb4: " + capacitysb4);
        // Select character index and modify
        sb3.setCharAt(7, 'e');
        System.out.println(sb3);
    }
}
