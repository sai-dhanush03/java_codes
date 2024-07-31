package B3_Linked_list;

public class L5_palindrome {
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


    //PALINDROME

    //SLOW FAST APPROACH 
    public Node findMid(Node head){//hlpr
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null) {
            slow=slow.next;//+1
            fast=fast.next.next;//+2


        }
        return slow;//slow is my mid node
    }

    public boolean checkPalindrome(){

        if(head==null||head.next==null){
            return true;
        }
        //s1: find mid
        Node midnode= findMid(head);


        //s2: rev 2nd hlf
        Node prev=null;
        Node curr=midnode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node right=prev;//right half head
        Node left=head;

        //s3: check left half and right half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;

        }
        return true;
    }

    public static void main(String[] args) {
        L5_palindrome ll= new L5_palindrome();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(2);
        ll.addlast(1);

        ll.print();//1-2-2-1
        System.out.println(ll.checkPalindrome());


        
    }
    
}
