class Base
{
    public int x;//public is used to access in any class private wont inheritd
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
}
class Derived extends Base//inherits base class but private things wont inherits
{
    public int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}



public class Inherit
{
    public static void main(String[] args) {
       Derived s = new Derived();//mistake is present
        s.setX(7);
        System.out.println(s.getX());

        

    }
}