import java.util.Scanner;

class Scan
{
    public static void main(String[] args) {
        // System.out.println("Enter no : ");
         Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // System.out.println(a);
        // boolean b = sc.hasNextInt();//use to check int or not
        // System.out.println(b);

        String str = sc.next();//if we use nextLine then whole line will be printed but now only word
        System.out.println(str);

        
    }
}