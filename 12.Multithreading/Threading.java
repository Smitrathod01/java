class Thread1 extends Thread//this is extend method 
{
    public void run()//it is syntax
    {
        int i=0;
        while(i<30)
        {
            System.out.println("I am using whatsapp");
            i++;
        }
    }
}

class Thread2 extends Thread
{
    public void run()
    {
        int i=0;
        while(i<30)
        {
            System.out.println("I am using instagram");
            i++;
        }
    }
}

class Threading
{
    public static void main(String[] args) {
        Thread1 a = new Thread1();
        Thread2 b = new Thread2();
        a.start();
        b.start();
//in output it will give time to both processes this is what we called threading..
    }
}