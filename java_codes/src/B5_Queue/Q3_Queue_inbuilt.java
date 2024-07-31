package B5_Queue;
import java.util.*;
// using java collection frame work


public class Q3_Queue_inbuilt {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        // Queue<Integer> q=new ArrayDeque<>();
        // we cant create objects of interface so we create obj which implements queue(Linked list, Arraydequeue)
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
