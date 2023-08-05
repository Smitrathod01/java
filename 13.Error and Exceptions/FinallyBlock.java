public class FinallyBlock {
    public static int hello()
    {
        try {
            int a =2;
            int b =0;
            int c = a/b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        }
        finally   //this will execute at any cost
        {
            System.out.println("Hiiiii");
        }
        return 0;
    }
    public static void main(String[] args) {
        int k = hello();
        System.out.println(k);
    }
    
}
