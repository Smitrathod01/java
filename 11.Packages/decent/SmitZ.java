package decent;

class Sample
{
    public int met()
    {
        return 1;
    }
}
public class SmitZ
{
    public static void main(String[] args) {
        Sample s =new Sample();
        System.out.println(s.met());
    }

    public int met1() {//you can use this method in another packages.
        return 1;
    }
}