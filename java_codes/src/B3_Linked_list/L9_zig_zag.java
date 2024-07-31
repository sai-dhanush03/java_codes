package B3_Linked_list;

public class L9_zig_zag {

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

    public void addfirst(int data){
        // s1: create new node
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }

        // s2:newnodes next= head
        newnode.next=head;//link

        // s3: head=new node
         head=newnode;
    }


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


    // ZIG-ZAG
    public void zigzag(){
        // find mid;
        Node slow=head;
        Node fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;
        System.out.println(mid.data+" mid");

        // rev 2nd half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next =prev;
            prev=curr;
            curr=next;
        }
        Node leftH=head;
        Node rightH=prev;
        Node nextL,nextR;

        // alternate merge

        while(leftH!=null&&rightH!=null){
            nextL=leftH.next;
            leftH.next=rightH;
            nextR=rightH.next;
            rightH.next=nextL;
             
            // update
            leftH=nextL;
            rightH=nextR;

        }
        // 1 2 3
        // 4 5 6
    }
    public static void main(String[] args) {
        L9_zig_zag ll=new L9_zig_zag();
        ll.addfirst(6);
        ll.addfirst(5);
        ll.addfirst(4);
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        // 1-2-3-4-5
        ll.print();
        ll.zigzag();
        ll.print();


    }

    
}
