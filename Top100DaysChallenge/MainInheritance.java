public class MainInheritance {
    public static void main(String []args)
    {
        C c = new C();
        c.display2();
        c.display1();
        c.display3();
    }
}

class Isoceles
{
    void display1()
    {
        System.out.println("I am an isosceles triangle");
    }
}
class Equilateral extends Isoceles
{
    void display2()
    {
        System.out.println("I am an equilateral triangle");
    }
}
class C extends Equilateral{
    void display3()
    {
        System.out.println("I am a triangle");
    }
}