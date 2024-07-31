package B4_Stacks;
import java.util.*;


public class S10_duplicate_parentheses {
    public static boolean isduplicate(String str){//O(n) TIME COMPLEXITY
       Stack<Character> s=new Stack<>(); 
       for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);

        // closing
        if(ch==')'){
            int count=0;
            while(  s.peek()!='('){
                s.pop();
                count++; 
            }
            if(count<1){
                return true;
            }else{
                s.pop();//opening pair
            }
        }else{//opening or any operand or operator
            s.push(ch);

        }
       }
       return false; 
    }
    public static void main(String[] args) {
        String str="((a+b))";//true
        String str1="( a-b)";//false
        System.out.println(isduplicate(str));
        System.out.println(isduplicate(str1));
    }
} 


