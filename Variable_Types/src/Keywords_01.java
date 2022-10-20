//super, this, final & static
class StaticKeyword {

    static String x;

    static {
        x = "Hello";
    }

    void displayString() {
        System.out.println(x);
    }

}

public class Keywords_01{

    public static void main(String arr[]) {
        StaticKeyword s1 = new StaticKeyword();
        StaticKeyword s2 = new StaticKeyword();
        s1.displayString();
        s2.displayString();
    }

}