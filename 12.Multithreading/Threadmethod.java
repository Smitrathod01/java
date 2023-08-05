class Th extends Thread
{
    public void run()
    {
        int i=0;
        while(i<20)
        {
            System.out.println("Goood morning"+this.getName());
            try {
                Thread.sleep(500);//will sleep for 455 miliseconds in short will execute for short time
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
            i++;
        }
    }
}

class Thh extends Thread
{
    public void run()
    {
        int i=0;
        while(i<20)
        {
            System.out.println("Hello"+this.getName());
            i++;
        }
    }
}

public class Threadmethod {
    public static void main(String[] args) {
        Th a = new Th();
        Thh b = new Thh();
        a.start();
        // try{//this is try catch block used to handle exceptions
        //     a.join();//only after executing a,b will process 
        // }
        // catch(Exception e)
        // {
        //     System.out.println(e);
        // }
        b.start();
    }
    
}
