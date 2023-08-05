class A
{
    public int b;
    
    public void setB(int b) {
        this.b = b;
    }
    public int getB() {
        return b;
    }
    public void set()
    {
        System.out.println("I am class a");
    }
     
}

class B extends A
{
    @Override//notation used to check method is override or not
    public void set()//same method name as class a so overriden method
    {
        System.out.println("I am class b");
    }
}

class Methodoverride
{
    public static void main(String[] args) {
        B c = new B();
        c.setB(10);
        System.out.println(c.getB());
        c.set();//this is overriden method will implement b class method...
    }
}