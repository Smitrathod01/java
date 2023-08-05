class Cylin
{
    private int radius;
    private int height;

    public void setRadius(int n)
    {
        radius = n;
    }
    public int getRadius()
    {
        return radius;
    }
    public void setHeight(int n)
    {
        height = n;
    }
    public int getHeight()
    {
        return height;
    }
    public int area()   
    {
        return 2*(radius+height);
    }
    public int volume()
    {
        return 2*3*radius*height;//here i hacve taken pi = 3 bcoz of int
    }
}

public class Cylinder {
    public static void main(String[] args) {
        Cylin r = new Cylin();
        r.setRadius(20);
        r.setHeight(30);
        System.out.println(r.area());
        System.out.println(r.volume());
        
    
        

    }
    
}
