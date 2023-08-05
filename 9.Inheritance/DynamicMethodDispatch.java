class Phone
{
    public void name(){
        System.out.println("I am phone");
    }
}

class Smartphone extends Phone
{
    public void name()
    {
        System.out.println("i am smartphone");
    }

    public void music()
    {
        System.out.println("Play music");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone a = new Smartphone();//this is dynamic method dispatch
        a.name();
        //a.music(); this wont work bcoz in dmd it is neccesary for a method
        //to be present in both class
        //and it will implement the method of object created class

    }
    
}
