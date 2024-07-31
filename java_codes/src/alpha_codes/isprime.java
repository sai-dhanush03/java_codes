package alpha_codes;
import java.util.*;

public class isprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num:");
        int n=sc.nextInt();

        boolean isprime=true;
        //n-2 times there is also an another way using root n
        //math.sqrt(n )
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isprime=false;
            }
        }

        if(isprime==true){
            System.out.println("n is prime");
        } else{
            System.out.println("n is not prime:");
        }
  
}
}