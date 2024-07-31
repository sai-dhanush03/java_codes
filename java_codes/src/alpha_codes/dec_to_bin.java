package alpha_codes;
import java.util.*;

public class dec_to_bin {
    public static void bin_to_dec(int a){
        // a=1001
        double num=0;
        
        int n=0;
        while(a>0){
            int r=a%10;
            
            num= (num+r*Math.pow(2,n));
            n++;
            a=a/10;
        }
        System.out.println((int)num);

    }

    public static void dec_to_bin(int a){
        // 5
        int bin[]=new int[1000];
        
        int i=0;
        while(a>0){
            int r=a%2;
            bin[i]=r;
            a=a/2;
            i++;
        }

        for(int j=i-1;j>=0;j--){
            System.out.print(bin[j]);
        }


    }

    public static void dectobin(int a){
        int bin=0;
        int n=0;
        while(a>0){
            int r=a%2;
            bin=(int)(bin+r*Math.pow(10,n));
            n++;
            a/=2;
        }
        System.out.println(bin);
        // System.out.println();
        
    }
    public static void main(String[] args) {
        System.out.println("Enter  num:");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        // bin_to_dec(a);
        // dec_to_bin(a);
        dectobin(a);
    }
}
