import java.util.Scanner;

public class switcheg {
    public static void main(String[] args) {
        System.out.println("Enter the no : ");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        switch(no)
        {
            case 1 -> System.out.println("Monday");//this is advanced switch
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            default -> System.out.println("Not possible");//no need of break
        }

    }
    
}
