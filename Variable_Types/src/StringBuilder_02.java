public class StringBuilder_02 {
    public static void main(String[] args){
        // New String Builder
        StringBuilder sb = new StringBuilder("Hello ");
        // Append String Builder
        sb.append("World");
        System.out.println(sb);
        // Insert a string into a given index
        sb.insert(1, 'a');
        System.out.println(sb);
        // Replace a string from start to end index given
        sb.replace(1,3 ,"Java");
        System.out.println(sb);
        // Delete string from specified start to end index
        sb.delete(1,3);
        System.out.println(sb);
    }
}
