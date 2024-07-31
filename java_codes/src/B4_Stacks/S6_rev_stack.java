package B4_Stacks;
import java.util.*;

public class S6_rev_stack {
    public static void push_at_bottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return; 
        }
        int top=s.pop();
        push_at_bottom(s, data);
        s.push(top);

    }
    public static void reverse_stack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverse_stack(s);
        push_at_bottom(s,top);

    }

    public static void printstack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());

        }
    }

    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        // 3-2-1
        reverse_stack(s);
        printstack(s);
        

    }
}
