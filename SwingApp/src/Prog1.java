public class Prog1 {

    public static void main(String[] args){
        String name = "kit cambodia 613009";
        name.chars()
                .filter(n -> Character.isAlphabetic(n) || Character.isSpaceChar(n))
                .mapToObj(n ->Character.valueOf((char)n))
                .forEach(System.out::print);

    }
}

