package B5_Queue;
// implementation using linked list
public class Q2_Queue_LL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;

        }
    }

    static class queue{
        static Node head=null;
        static Node tail=null;

        public static boolean isEmpty(){
            return head==null&&tail==null;
        }

        // add
        public static void add(int data){
            Node newnode=new Node(data);
            if(head==null){
                head=tail=newnode;
                return;
            }
            tail.next=newnode;
            tail=newnode;

        }

        // remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
            }
            int front=head.data;
            if(tail==head){
                tail=head=null;
            }else{
                head=head.next;
            }
            return front;

        }

        // peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return head.data;
        }

     }

     public static void main(String[] args) {
        queue q=new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        // 1-2-3
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
     }
}
