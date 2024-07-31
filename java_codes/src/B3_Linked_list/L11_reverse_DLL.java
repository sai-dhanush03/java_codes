package B3_Linked_list;

public class L11_reverse_DLL {
    public class Node{
        int data;
        Node next;
        Node prev;
    
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
      }  
      public static Node head;
      public static Node tail;
      public static int size;
    
    //   addfirst
    public void addfirst(int data){
        Node newnode =new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
    
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }
    
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }


    // REVERSE DLL
    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;

            prev=curr;
            curr=next;

        }
        head=prev;
    }
    public static void main(String[] args) {
        L11_reverse_DLL dll =new L11_reverse_DLL();

        dll.addfirst(3);
        dll.addfirst(2);
        dll.addfirst(1);
        dll.print();
        dll.reverse();
        dll.print();
    }
}
