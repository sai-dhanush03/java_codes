package B9_Heaps.priority_queue;
// connect ropes with min cost
import java.util.PriorityQueue;

public class H4_connect_ropes {
    public static void main(String[] args) {
        int ropes[]={2,3,3,4,6};

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<ropes.length;i++){
            pq.add(ropes[i]);
        }
        int cost=0;
        // int sum=0;

        while(pq.size()>1){
            int min=pq.remove();
            // System.out.println(min+"min");
            int min2=pq.remove();
            cost+=min+min2;
            pq.add(min+min2);
            // int a= pq.peek();
            // pq.remove();
            // int b=pq.peek();
            // pq.remove();
            // sum=a+b;
            // cost=cost+sum;
            // pq.add(sum);
            // System.out.println(sum);
        }
        System.out.println("Cost for cnctng N ropes is :"+ cost);
    }
}
