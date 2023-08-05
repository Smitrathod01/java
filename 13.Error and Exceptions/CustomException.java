import java.util.Scanner;

class MyException extends Exception
{
    @Override
    public String toString() {
    return super.toString() + "i am tostring";
    }

    @Override
    public String getMessage() {
    return super.getMessage() + "I am getmessage";
    }
}

public class CustomException {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        if(a<5)
        {
            try {//always throw exceptions in try catch
                throw new MyException();//this is syntax
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                //System.out.println(e);//same as tostring
                e.printStackTrace();
            }
        }
    }
    
}
