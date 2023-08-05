import java.util.Scanner;

public class Area {

    static int setRadius(int r){
        return r;
    }

    static void area(int rad,double pi){
        System.out.println(pi*rad*rad);
    }

    static void circumference(int rad,double pi){
        System.out.println(pi*rad*2);
    }

    public static void main(String[] args) {
        final double PI = 3.14;

        Scanner sc = new Scanner(System.in);
        int radius = setRadius(sc.nextInt());

        circumference(radius, PI);
        area(radius, PI);

    }
}
