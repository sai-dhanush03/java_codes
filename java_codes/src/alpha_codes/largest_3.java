package alpha_codes;
import java.util.*;

public class largest_3 {
    public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int bg;
    if(a>=b && a>=c){
        bg=a;
        System.out.println("a is largest "+bg);
    }
    else if(b>=c){
        bg=b;
        System.out.println("b is larges "+bg);

    }
    else{
        bg=c;
        System.out.println("c is largest "+bg);
    }

}
    
}
