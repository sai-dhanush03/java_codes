package B3_Linked_list;


public class L8_merge_sort {
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





    // MERGE SORT

    // getmid fun
    public static Node getmid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;//mid
    }

    // merge fun
    public static Node merge(Node head1, Node head2){
        Node mergell=new Node(-1);
        Node temp=mergell;

        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;

            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }

        while(head1!=null){
             temp.next=head1;
             head1=head1.next;
             temp=temp.next;

        }

        while(head2!=null){
             temp.next=head2;
             head2=head2.next;
             temp=temp.next;

        }
        return mergell.next;
    }







    public static Node mergesort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        // FIND MID
        Node mid=getmid(head);

        // left & ri8 MS
        Node righthead=mid.next;
        mid.next=null;
        Node newleft=mergesort(head);
        Node newright=mergesort(righthead);

        // merge
        return merge(newleft, newright);


    }
    public static void main(String[] args) {
        
        L8_merge_sort ll =new L8_merge_sort();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addfirst(4);
        // ll.addfirst(5);
        // 5-4-3-2-1;
       ll.print();
       ll.head=ll.mergesort(ll.head);
       ll.print();
       
        

        
    }

    
}
