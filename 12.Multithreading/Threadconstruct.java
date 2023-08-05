class Thr extends Thread
{
    //public Thr(String name)//this is constructor
    //{
      //  super(name);
    //}
    public void run()
    {
    int i=0;
    
        while(i<30)
        {
        System.out.println("Hello"+this.getName());
        i++;
        }
    }
}

public class Threadconstruct {
    public static void main(String[] args) {
        Thr a = new Thr("smit");
        Thr b = new Thr("ssmit");
        Thr c = new Thr("asmit");
        //System.out.println(a.getId());//will help to get id
        //System.out.println(a.getName());
        c.setPriority(Thread.MAX_PRIORITY);//u can put 1 to 10 in bracket to intialize priority
        b.setPriority(6);
        System.out.println(b.getPriority());//will show the priority
        System.out.println(b.getState());//will give the state of thread
        System.out.println(Thread.currentThread().getState());//reference of current thread
        a.start();
        b.start();
        c.start();
    }
    
}
