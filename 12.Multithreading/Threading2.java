class Thread3 implements Runnable//this is runnable method
{
    public void run()
    {
    int i = 0;
    
        while(i<30)
        {
            System.out.println("Chatting");
            i++;
        }
    }
}

class Thread4 implements Runnable//this is runnable method
{
    public void run()
    {
    int i = 0;
    
        while(i<30)
        {
            System.out.println("Fighting");
            i++;
        }
    }
}

public class Threading2 {
    public static void main(String[] args) {//below writen is syntax for runnable thread
        Thread3 bullet1 = new Thread3();
        Thread gun1 = new Thread(bullet1);
        Thread4 bullet2 = new Thread4();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
    
}
