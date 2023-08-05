import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0]=10;
        marks[1]=105;
        marks[2]=140;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index");
        boolean flag = true;
        while(flag)
        {
            System.out.println("Enter index");
            int ind=sc.nextInt();
            try {
                System.out.println("Hello");
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Bound prblm");
                }
                
            } catch (Exception e) {
                System.out.println("Other exception");
            }
        }
        System.out.println("Bye Bye");
    }
}
