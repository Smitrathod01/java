interface Camera
{
    void takeSanp();
    void recordVideo();
    private void greet()
    {
       System.out.println("Good morning");
    }
    default void record4K()

    {
        greet();//using private in default
        System.out.println("Recording");
    }
}

interface Wifi
{
    String [] getTheNetwork();
    void connectToNetwork(String network);
}

class CellPhone
{
    void callNumber(int number)
    {
        System.out.println("calling"+number);
    }
}

class Smartphone extends CellPhone implements Camera,Wifi
{
    public String [] getTheNetwork()
    {
        System.out.println("Displaying network list");
        String [] getTheNetwork = {"smit","hghg"};
        return getTheNetwork;
    }
    public void connectToNetwork(String network)
    {
        System.out.println("Connecting"+network);
    }
    public void takeSanp()
    {
        System.out.println("Taking photos");
    }
    public void recordVideo()
    {
        System.out.println("Recording videos");
    }
}

public class Polymorphism
{
    public static void main(String[] args) {
        Camera c = new Smartphone();
//this is polymorphism will only implemets the camera methods and genereate error in other methods
        c.takeSanp();//it will work
        //c.connectToNetwork(); will generate eroor
    }
}