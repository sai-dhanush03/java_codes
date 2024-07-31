package alpha_codes;

import java.util.*;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
                // System.out.println("x");

            // int x=1;

            // for(int a=1;a<=i;a++){
            int x = i;
            int count=1;
            int a=0;
            // int a=x-2;
            for (int b = 1; b <= 2*i-1; b++) {
                
                if(count<=i){
                    
                    System.out.print(x);
                    x++;
                    count++;
                    a=x-2;
                }
                else {
                    // x--;
                    
                    System.out.print(a);
                    a--;
                    // count++;
                //       x++;
                }
                

            }
            // }
            // x++;
            // System.out.print(k);
            // System.out.print(i);
            System.out.println();
        }
    }
}
