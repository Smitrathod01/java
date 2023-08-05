interface Bicycle
{
    int a = 90;
    void speedUp(int increament);//by defualt is is public
    void speedDown(int deceament);
}

interface Bicycle1
{
    void blowHorn();
}
//in interface all methods of interface must be invoked
class Ranger implements Bicycle,Bicycle1//multiple interfaces
{
    public void speedDown(int decreament)//public is neccesary
    {
        System.out.println("Break");
    }
    public void speedUp(int increament)
    {
        System.out.println("accelerate");
    }
    public void blowHorn()
    {
        System.out.println("Pee Pee Poo Poo");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Ranger r = new Ranger();
        System.out.println(r.a);
        //interface properties are final u cant change a 
        r.speedDown(5);
        r.speedUp(6);
        r.blowHorn();
    }
    
}
