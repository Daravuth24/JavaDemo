//super
class Person {
    void message()
    {
        System.out.println("This is person class\n");
    }
}
// Subclass Student
class Student extends Person {
    void message()
    {
        System.out.println("This is student class");
    }
    void display()
    {
        super.message();
    }
}

public class Keywords_03 {
    public static void main(String args[])
    {
        Student s = new Student();

        s.display();
    }
}
