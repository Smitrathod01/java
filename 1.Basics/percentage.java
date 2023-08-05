import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        System.out.println("Enter marks : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("a");
        int a = sc.nextInt();
        System.out.println("c");
        int c = sc.nextInt();
        System.out.println("b");
        int b = sc.nextInt();
        int per = (a+b+c)/3;
        System.out.println(per);

    }
}
