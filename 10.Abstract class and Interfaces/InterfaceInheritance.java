interface Parent
{
    void met1();
    void met2();
    
}

interface Child extends Parent//u cant extend interface with class - class extends interface
{
    void met3();
    void met4();
}

class Test implements Child
{
    public void met1()
    {
        System.out.println("Hello");
    }
    public void  met2()
    {
        System.out.println("Hello");
    }
    public void met3()
    {
        System.out.println("Hello");
    }
    public void met4()
    {
        System.out.println("Hello");
    }
}

public class InterfaceInheritance {
    public static void main(String[] args) {
        Test c = new Test();
        c.met1();
        c.met2();
        c.met3();
        c.met4();

    }
    
}
