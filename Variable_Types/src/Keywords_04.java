//this
//Java code for using 'this' keyword to
//refer current class instance variables
public class Keywords_04
{
    int a;
    int b;

    // Parameterized constructor
    Keywords_04(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    void display()
    {
        //Displaying value of variables a and b
        System.out.println("a = " + a + " b = " + b);
    }

    public static void main(String[] args)
    {
        Keywords_04 object = new Keywords_04(10, 20);
        object.display();
    }
}
