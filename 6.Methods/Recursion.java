public class Recursion {
    static int factorial(int x)
    {
        // if(x==0 || x==1)//this is for factorial
        // {
        //     return 1;
        // }
        // else
        // {
        //     return x*factorial(x-1);
        // }
        
        if(x==1)
        {
            return 1;
        }
        else
        {
            return x + factorial(x-1);
        }
    }
    public static void main(String[] args) {
        int n=6;
        int result =factorial(n);
        System.out.println(result);
    }
    
}
