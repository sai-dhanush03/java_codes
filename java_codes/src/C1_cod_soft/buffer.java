package C1_cod_soft;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class buffer {
     public static void numgame(int guess_num){
        
    }
    public static void main(String[] args) {
        int min=1;
        int max=100;
        int attempts=0;
        int rand_num= ThreadLocalRandom.current().nextInt(min,max+1);
        System.out.println(rand_num);
        // System.out.println(rand_num);
        System.out.println("welcome to number game ");
        System.out.println("Enter your guess number");
        Scanner sc = new Scanner(System.in);
        int guess_num=sc.nextInt();
        if(guess_num<1||guess_num>100){
            System.out.println("please enter between 1-100");

        }
        while(guess_num!=rand_num && attempts<10){
            attempts++;
            System.out.println("guess is wrong");
            if(guess_num>rand_num){
                System.out.println("its high please try again");
                guess_num=sc.nextInt();


            }
            else if(guess_num<rand_num){
                System.out.println("its low please try again");
                guess_num=sc.nextInt();

            }

        }
        if(guess_num==rand_num){
            attempts++;
            System.out.println("Your guess is correct"+"no.of attempts are"+" "+attempts);
            System.out.println("Score is "+(10-(attempts-1))*10);
            
        }
        else{
            System.out.println("exceeded the maximum no.of attempts"+"please try again in a new game");

        }

       
    }
    
}
