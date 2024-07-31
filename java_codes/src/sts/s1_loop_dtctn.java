package sts;
// Time O(n)
// space O(1);
import java.util.*;

public class s1_loop_dtctn {
    public static class Node{
        int data;
        Node next;

        Node(int d){
            d=data;
            next=null;
        }
    }
    public static Node head;

    public static void add(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;

    }

    public static boolean detectloop(Node h){
        HashSet<Node> s=new HashSet<>();
        while(h!=null){
            if(s.contains(h)){
                return true;
            }
            s.add(h);
            h=h.next;
        }
        return false;
    }

    public static boolean detectLoop(){
        Node slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                System.out.println("loop found");
                return true;
            }
        }
        System.out.println("loop not found");
        return false;
    }

    public static void main(String[] args) {
        s1_loop_dtctn ll=new s1_loop_dtctn();
        ll.add(20);
        ll.add(41);
        ll.add(5);
        ll.add(10);
        //creating loop
        // ll.head.next.next.next.next=ll.head;
        System.out.println(ll.detectLoop());
        
    }
}
