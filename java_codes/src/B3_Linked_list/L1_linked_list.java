package B3_Linked_list;

public class L1_linked_list {
    public static class Node{
        int data;
        Node next;

        public  Node(int data){
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
        System.out.println("head= "+head);
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

    public void add(int idx, int data){//add node at specific idx

        if(idx==0){
            addfirst(data);
            return;
        }
        Node newnode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        //i=idx-1 tmp is previous of req index
        newnode.next=temp.next;
        temp.next=newnode;
        

    }

    public int removeFirst(){
        if(size==0){
            System.out.println("Ll is empty");
            return Integer.MAX_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            System.out.println("avl single node is deltd");
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        
        return val;
    }

    public int removelast(){
        if(size==0){
            System.out.println("LL is empt");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=tail.data;
            head=tail=null;
            size=0;
            return val;
        }

        //prev :: i=isze-2;
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;//tail ka data
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }


    public static void main(String[] args) {
        L1_linked_list ll=new L1_linked_list();
        // ll.print();
        // ll.addfirst(2);
        // ll.print();
        // ll.addfirst(1);
        // ll.print();
        // ll.addlast(3);
        // ll.print();
        // ll.addlast(4);
        // ll.print();
        // ll.removeFirst();
        ll.addfirst(2);
        // ll.removeFirst();
        ll.addfirst(1);
        ll.addlast(4);
        ll.addlast(5);
        ll.add(2,3);
        // ll.removeFirst();
        ll.print();//1->2->3->4->5
        System.out.println(ll.size);
        ll.removelast();
        ll.print();
        System.out.println(ll.size);
        System.out.println(ll.head.data);
        
        
    }


}
