package B3_Linked_list;

public class L6_loop_cycle {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;

        }

    }   
    public static Node head;
    public static Node tail;
    public static int size;

    //the below written examples like addfirst(),addlast(); removefirst();removelast(
        // are the examples of methods in java methods are dependent on objects unlike functions
    

   

    public void print(){//O(n)
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }


    // LOOP CYCLE
    public static boolean isloop(){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;//+1
            fast=fast.next.next;
            if(slow==fast){
                return true;//cycle exists
            }
        }
        return false;//cycle doesnt exist

    }


    // REMOVING LOOP CYCLE
    public static void remove_loop(){
        //detect cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;

        }

        //find meeting point
        slow=head;
        Node prev=null;
        while(slow !=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }

        //remove cycle ->last.next=null
        prev.next=null;

    }
    

    public static void main(String[] args) {
        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=head;
        // 1-2-3-1
        System.out.println(isloop());
        remove_loop();
        System.out.println(isloop());

    }

}
