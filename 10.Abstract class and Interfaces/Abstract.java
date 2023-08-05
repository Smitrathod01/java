abstract class Parent//if any abstract method is present in class then it must be abtract class
{
    public void say()
    {
        System.out.println("Hello");
    }
    //object cant be created of abstract class it is only for reference for other 
    abstract public void greet();//class and methods
}

class Child extends Parent
//if you are extendidng a abstract class then all abstract methods must be called
{
    public void greet()//overwrite must be in abstract bcoz object cant be created
    {
        System.out.println("good morning");
    }
}

abstract class Child2 extends Parent
{//if you dont want to call all abstract methods then change class name to abstract 
    public void set()
    {
        System.out.println("Hello i am class");
    }
}

public class Abstract
{
    public static void main(String[] args) {
        //object of child only is permitted
        Child c = new Child();
        c.greet();
    }
}