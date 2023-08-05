class NegativeRadiusException extends Exception
{
    @Override
    public String toString() {
    return "Radius cant be negative";
    }
    @Override
    public String getMessage() {
    return "Radius cannot be negative";
    }
}

public class Throw_throws {
    public static double area (int r) throws NegativeRadiusException
    {
        if(r<0)
        {
            throw new NegativeRadiusException();
        }
        return Math.PI*r*r;
    }
    public static int add(int x,int y) throws ArithmeticException
    {
        return x/y;
    }
    public static void main(String[] args) {
        try {
            // int c=add(3,0);
            // System.out.println(c);
            double ar = area(-90);
            System.out.println(ar);
        } catch (Exception e) {
            //System.out.println("Exception");this is for add
            System.out.println(e);
        }        
    }
    
}
