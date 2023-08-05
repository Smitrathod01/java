import java.util.Scanner;

public class Presentornot {
    public static void main(String[] args) {
        int [] marks = {12,56,34,56};
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean inArray = false;
        for(int element:marks)
        {
            if(a==element)
            {
                inArray=true;
                break;
            }
            else
            {
                System.out.println("not present");
            }
        }
        if(inArray ==true)
        {
            System.out.println("yes present");
        }

    }
    
}
