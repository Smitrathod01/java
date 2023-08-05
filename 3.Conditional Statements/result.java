import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter phy marks");
        int phy = sc.nextInt();
        System.out.println("Enter chem marks");
        int chem = sc.nextInt();
        int avg=(phy+chem)/2;

        if(phy>=33 && chem>=33 || avg>=40)
        {
            System.out.println("Pass");
        }

        else{
            System.out.println("Fail");
        }
    }
    
}
