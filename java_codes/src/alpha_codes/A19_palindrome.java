package alpha_codes;
import java.util.Scanner;

public class A19_palindrome {
    public static boolean ispalindrome(String str){
        int n=str.length();
        for(int i=0;i<=n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                 return false;//not palindrome
            }
        }
        return true;
         
    }

    public static void main(String[] args) {
        // String s="malayalam";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String s=sc.nextLine();

        System.out.println(ispalindrome(s));
    }
}
