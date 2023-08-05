import java.util.Scanner;

class My extends Exception
{
         @Override
         public String toString() {
            return "thik se kar be";

         }
         @Override
         public String getMessage() {
            return "thik se kr be";
         }
}

public class Practice {
    public static void main(String[] args) {
        int [] marks = {3,6,7};
        int i =0;
        Scanner sc = new Scanner(System.in);
        while(i<5)
        {
            try {
                int a = sc.nextInt();
                System.out.println(marks[a]);
                throw new My();//this is incomplete..
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
                
            }
            finally
            {
                System.out.println("Hello");
            }
            i++;
        }
    }
    
}
