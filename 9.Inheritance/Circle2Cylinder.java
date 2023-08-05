class Circle
{
    int radius;
    Circle(int r)
    {
        this.radius = r;
    }
    public double area()
    {
        return 3.14*radius*radius;//this.radius is also valid
    }
}

class Cylinder extends Circle
{
    int height;
    Cylinder(int r,int h)
    {
        super(r);//will call first circle class to get the value of r and then cyclinder
        this.height=h;
    }
    public double volume()
    {
        return 2*Math.PI*radius*height;
    }
}

public class Circle2Cylinder {
    public static void main(String[] args) {
        Cylinder c = new Cylinder(10, 20);
        System.out.println(c.volume());
    }
    
}
