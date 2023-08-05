class Square
{
    int l;
    public int area(int x)
    {
        return x*x;
    }
    public int perimeter(int x)
    {
        return 4*x;
    }
}


public class Squareclass {
    public static void main(String[] args) {
        Square s =new Square();
        s.l=10;
        System.out.println(s.area(s.l));
        System.out.println(s.perimeter(s.l));
    }
    
}
