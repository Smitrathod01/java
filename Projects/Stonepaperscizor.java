import java.util.Scanner;



import java.util.Random;

public class Stonepaperscizor {
    public static void main(String[] args) {
        System.out.println("welcome to this game");
        Random rand = new Random();
        int r = rand.nextInt(10);
        String comp;
        if(r<=3)
        {
            comp = new String("r");
        }
        else if(r>=4 && r<=6)
        {
            comp = new String("p");
        }
        else
        {
            comp = new String("s");
        }
        
        System.out.println("For rock choose r,for paper p,for scizzor s");
        Scanner sc = new Scanner(System.in);
        String player = sc.next();
        System.out.println("Lets play");

        if(player.equals("r") && comp.equals("s"))
        {
            System.out.println("win");
        }
        else if(player.equals("s") && comp.equals("p"))
        {
            System.out.println("win");
        }
        else if(player.equals("s") && comp.equals("r"))
        {
            System.out.println("lose");
        }
        else if(player.equals("p") && comp.equals("s"))
        {
            System.out.println("lose");
        }
        else if(player.equals("p") && comp.equals("r"))
        {
            System.out.println("win");
        }
        else if(player.equals("r") && comp.equals("p"))
        {
            System.out.println("lose");
        }
        else if(player==comp)
        {
            System.out.println("Draw");
        }
        else
        {
            System.out.println("Invalid press");
        }


    }
    
}
