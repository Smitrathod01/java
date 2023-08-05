import java.util.Scanner;

public class SpecifixException {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0]=10;
        marks[1]=105;
        marks[2]=140;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index");
        int ind=sc.nextInt();
        System.out.println("Enter number");
        int no = sc.nextInt();

        try {
            System.out.println("Value is "+marks[ind]);
            System.out.println("ans is"+marks[ind]/no);
        } 
        catch (ArithmeticException e) {
            System.out.println("aruthmetic prblm");
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("index bound prblm");
        }
        catch (Exception e) {
            System.out.println("Some other prblm");
        }
//IllegalArgumentException is also a type of exception used while illegal argument is passed
    }
    
}
