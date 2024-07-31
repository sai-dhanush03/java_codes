
package alpha_codes;

import java.util.*;

public class half_pyramid2 {
    public static void main(String[] args) {
        System.out.println("enter num:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        char ch='A';

        for(int l=1; l<=n; l++){
            for(int c=1;c<=l;c++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
    
}
