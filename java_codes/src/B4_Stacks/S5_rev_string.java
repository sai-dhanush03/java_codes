package B4_Stacks;
import java.util.*;

public class S5_rev_string {
    public static String revstring(String str){
        Stack<Character> s=new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
            
        }

        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr=s.pop();
            result.append(curr);
        }
        return result.toString();


    }
    public static void main(String[] args) {
        String str="dhanush";
        String result=revstring(str);
        System.out.println(result);
    }
}
