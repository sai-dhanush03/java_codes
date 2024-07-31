package B4_Stacks;
import java.util.*;
// implementing stack using java collection frame work

public class S3_stack_inbuilt {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop(); 
        }

    }

    
}
