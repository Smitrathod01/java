class Minkey
{
    public void bite()
    {
        System.out.println("biting");
    }
    public void jump()
    {
        System.out.println("Jumping");
    }
}

interface Sample
{
    void eat();
    void sleep();
}

class Human extends Minkey implements Sample
{
    public void eat()
    {
        System.out.println("Eating");
    }
    public void sleep()
    {
        System.out.println("Sleeping");
    }
}

public class HumanMinkey {
    public static void main(String[] args) {
        Minkey m = new Human();//polymorphism will run only minkey methods
        m.bite();
        //m.sleep(); will not work
    }
    
}
