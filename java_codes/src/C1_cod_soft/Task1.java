package C1_cod_soft;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Task1 {
    
    
    
    public static void numgame(int guess_num, int rand_num) {
        
        Scanner sc = new Scanner(System.in);
        int attempts = 0;

        if (guess_num < 1 || guess_num > 100) {
            System.out.println("please enter between 1-100");

        }
        while (guess_num != rand_num && attempts < 10) {
            // int attempts=0;
            attempts++;
            System.out.println("guess is wrong");
            if (guess_num > rand_num) {
                System.out.println("its high please try again");
                guess_num = sc.nextInt();

            } else if (guess_num < rand_num) {
                System.out.println("its low please try again");
                guess_num = sc.nextInt();

            }

        }
        if (guess_num == rand_num) {
            attempts++;
            System.out.println("Your guess is correct" + "no.of attempts are" + " " + attempts);
            System.out.println("Score is " + (10 - (attempts - 1)) * 10);

        } else {
            System.out.println("exceeded the maximum no.of attempts" + "please try again in a new game");

        }

    }
   private static int round=0;

    public static void playgame(){
        round++;
         
        
        int min = 1;
        int max = 100;
    
        int rand_num = ThreadLocalRandom.current().nextInt(min, max + 1);
        System.out.println("welcome to number game ");
        System.out.println("Enter your guess number");
        Scanner sc = new Scanner(System.in);
        int guess_num = sc.nextInt();
        numgame(guess_num, rand_num);
        System.out.println("press 1 to play again 0 to exit");
        // Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(a==1){
            playgame();
        }
        if(a==0){
            System.out.println("Thanks for playing the game");
        }

    }
   

    public static void main(String[] args) {
        
        
        playgame(); 
        System.out.println("No.of rounds played is "+round);
        
        

    }

}
