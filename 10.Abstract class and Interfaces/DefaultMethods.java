interface Camera
{
    void takeSanp();
    void recordVideo();
    private void greet()
//private method will not be accesible by smartphone but will help in default class if 
//its code is too lenghty...
    {
        System.out.println("Good morning");
    }
    default void record4K()
//default method wont force any class to run its method thats the advantage
//and you can overwrite it in smartphone class
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

public class DefaultMethods {
    public static void main(String[] args) {
        Smartphone s = new Smartphone();
        String[] ar = s.getTheNetwork();
        for(String item:ar){
            System.out.println(item);
        }
        s.record4K();
    }
    
}
