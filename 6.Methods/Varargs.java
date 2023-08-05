public class Varargs {
    static int sum(int ...arr)//will put value of main class in array
    {
        //available as int [] arr;
        int result=0;
        for(int a:arr)
        {
            result +=a;

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("sum is " + sum(4,7,9,8));
        //forget varargs in simple method u can call method directly in print
        //just write methodname(a:2,b:4)no need of assigning the variables.
    }
    
}
