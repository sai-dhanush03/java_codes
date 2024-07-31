package B3_Linked_list;
import java.util.LinkedList;

public class L7_inbuilt_LL {
    public static void main(String[] args) {
        //create
        // we can only use classes
        // objects are only stored so we cant use int,float.......
        // we can use classes like Integer, Float,Character
        LinkedList<Integer> ll=new LinkedList<>();

        //add
        ll.addFirst(1);
        ll.addLast(2);
        ll.addFirst(0);
        ll.add(5);
        // ll.
        ll.add(2,100);
        System.out.println(ll);
        // ll.get(0);
        // System.out.println(ll.head);

        //remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);

    }
    
}
