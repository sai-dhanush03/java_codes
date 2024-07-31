package B5_Queue;

import java.util.*;

public class Q9_Deque {
    public static void main(String[] args) {
        Deque<Integer> d=new LinkedList<>();
        d.addFirst(1);//1
        d.addFirst(2);//2-1
        d.addLast(3);//2 1 3
        d.addLast(4);//2 1 3 4
        System.out.println(d);
        d.removeLast();
        System.out.println(d);

        System.out.println("first el:" + d.getFirst());
        System.out.println("last el:" + d.getLast());


    }
}
