//imp you cant change value of variable directly in method only in array it is possible because 
//it array gives the reference in place of copy.
class Method
{
    static int sum(int x ,int y)
    //static means we are using methods without using the objects..
    //genereally we have to make objects to call the methods.
    {
        int z;
        z=x+y;
        return z;
    }
    static int sum(int x,int y,int z)
    {
        int w;//this is method overloading method name is same only reference is different
        w=x+y+z;
        return w;
    }
    public static void main(String[] args) {
        int a =29;
        int b =34;
        int d=45;
        int c=sum(a,b);
        System.out.println(c);
        int f=sum(a,b,d);
        System.out.println(f);
        

        //in case you want to use object mthod then remove the sttic keyword
        //then Method obj = new Method();  object creation
        //obj.sum(values); this is format

    }
}
    
