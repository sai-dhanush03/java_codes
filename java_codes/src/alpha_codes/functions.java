
package alpha_codes;
import java.util.*;

public class functions {
    // functions
    // to multiply
    public static int multiply(int a, int b) {
        int p = a * b;
        return p;

    }

    // to find factorial
    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;

    }

    // bin to dec
    public static void binToDec(int binNum) {
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int ld = binNum % 10;// ld=last_digit
            decNum = decNum + (ld * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("decimal of" + binNum + "=" + decNum);
    }

    // decimal to binary
    public static void decToBin(int n) {
        int pow = 0;
        int binNum = 0;
        int num = n;

        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("binary of" + num + "=" + binNum);
    }

    public static void main(String[] args) {
        System.out.println("Enter a and b:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int b=sc.nextInt();
        // //function call
        // int prod=multiply(a,b);
        // System.out.println("enter n:");
        // int n=sc.nextInt();
        // int factorial=fact(n);
        // System.out.println("a*b="+prod);
        // System.out.println("factorial of n:"+factorial);
        // binToDec(a);
        decToBin(n);

    }

}
