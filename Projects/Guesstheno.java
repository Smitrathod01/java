import java.util.Scanner;

import java.util.Random;

class Guesstheno
{
    public static void main(String[] args) {
        int g;
        Random rand = new Random();
        int r = rand.nextInt(100);
        System.out.println("Enter the no");
        
        for(int i=1;i<=20;i++)
        {
            Scanner sc = new Scanner(System.in);
            g=sc.nextInt();
            if(g>r)
            {
                System.out.println("Lower no please!!");
                
            }
            else if(g<r)
            {
                System.out.println("Higher no please!!");
                
            }
            else
            {
                System.out.println("You have guessed it in "+i+  "chances");
                break;
            }
        }
        
    }
}