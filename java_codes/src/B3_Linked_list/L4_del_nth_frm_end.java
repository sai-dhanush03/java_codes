package B3_Linked_list;

public class L4_del_nth_frm_end {
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



    // REMOVE NTH TERM FROM LAST 
    public void deletenthFromEnd(int n){
        //calc size of linked list
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;

        }
        if(n==sz){
            head=head.next;//removefirst
            return;
        }
        // sz-n
        int i=1;
        int iToFind=sz-n;
        Node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    public static void main(String[] args) {
        L4_del_nth_frm_end ll=new L4_del_nth_frm_end();
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);

        ll.print();
        ll.deletenthFromEnd(3);
        ll.print();
    }

    
}
