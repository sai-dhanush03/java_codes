package alpha_codes;

import java.util.*;
public class sts1{
public static void sieve(int lt){

    boolean[] prime = new boolean[lt+1];
    for(int ii=2; ii<=lt;ii++){
        prime[ii]=true;
    }
    
    for(int i=2; i*i<=lt;i++){
        if(prime[i]==true){
            for(int j=i*i; j<=lt; j=j+i){
                prime[j]=false;
            }
            
        }
    }
    for(int i=0; i<=lt;i++){
        if(prime[i]==true){
            System.out.println(i + " ");
        }
    }
    
//     Scanner obj = new Scanner(System.in);
//     int a ; 
//     a=obj.nextInt();
// System.out.println(a);

}
public static void main(String[] args) {
    sieve(100);
}
}
