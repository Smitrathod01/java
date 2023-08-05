class Base
{
    Base()
    {
        System.out.println("i am a constructor");
    }
    Base(int x)
    {
        System.out.println("i am argument constructor of Base");
    }
}

class Derived extends Base
{
    Derived()
    {
        System.out.println("I am derived constructor");
    }
    Derived(int x,int y)
    {
        super(x);//will go first to above constructor of 1 argument
        System.out.println("I am derivd argument constructor");
    }
}

class Child extends Derived
{
    Child()
    {
        System.out.println("I am child constructor");
    }
    Child(int x,int y,int z)
    {
        super(x,y);//will go first to above constructor of 2 argument
        System.out.println("I am child argument constructor");
    }
}

public class Constructinherit
{
    public static void main(String[] args) {
    Child s = new Child(2,3,4);       
    }
}