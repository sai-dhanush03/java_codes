package B3_Linked_list;

public class L3_reverse {
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

    public void addlast(int data){
        size++;
        // s1:create new node
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        // s2:tails next=newnode
        tail.next=newnode;
        // s3:tail is our new node
        tail=newnode;


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

    // TO REVERSE O(n)
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;//in java assignment alsways works right to left 
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;     
        }
        head=prev;
    }

    public static void main(String[] args) {
        L3_reverse ll=new L3_reverse();
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(3);
        ll.addlast(4);
        ll.print();//1->2->3->4

        ll.reverse();
        ll.print();
    }
}
