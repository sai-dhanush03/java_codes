package B3_Linked_list;
import java.util.*;

public class L10_doubleLL {
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
 
  

// removelast

public int removefirst(){
    if(head==null){
        System.out.println("DLL is empty");
        // return Integer.MIN_VALUE;
        return Integer.MIN_VALUE;

    }
    if(size==1){
        int val=head.data;
        head=tail=null;
        size--;
        return val;
        // return;
    }
    int val=head.data;
    head=head.next;
    head.prev=null;
    size--;
    return val;
    // return;

     

}

// moving to AL
public static void movetoall(Node head){
  ArrayList<Integer> a=new ArrayList<>();
  Node temp=head;
  while(temp!=null){
    a.add(temp.data);
    temp=temp.next;
  }
  System.out.println(a);
  System.out.println("array List");
  Collections.sort(a);
  System.out.println(a);
  Node temp1=head;
  int i=0;
  while(temp1!=null){
    temp1.data=a.get(i);
    temp1=temp1.next;
    i++;

  }
}

// public static void movedll(Node head){
//   Node temp=head;
//   while(temp!=null){
//     temp.data=a.get
//   }


// }

  public static void main(String[] args) {
    L10_doubleLL dll=new L10_doubleLL();
    dll.addfirst(2);
    dll.addfirst(6);
    dll.addfirst(7);
    dll.addfirst(11);
    dll.addfirst(12);
    dll.addfirst(8);
    dll.addfirst(5);
    dll.addfirst(1);
    dll.print();
    System.out.println(head.data);
    System.out.println(dll.size);
    movetoall(head);
    System.out.println("iam");
    dll.print();
    

    // dll.removefirst();
    // dll.print();
    // System.out.println(dll.size);



  }
}
