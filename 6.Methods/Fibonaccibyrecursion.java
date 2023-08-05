//this is  a program to get the nth element of fibonacci series

public class Fibonaccibyrecursion {
    static int fib(int x)
    {
        if(x==1)
        {
            return 0;
        }
        else if(x==2)
        {
            return 1;
        }
        else
        {
            return fib(x-1) + fib(x-2);
        }
    }

    public static void main(String[] args) {
        int n=6;
        int x=fib(n);
        System.out.println(x);
    }
    
}
