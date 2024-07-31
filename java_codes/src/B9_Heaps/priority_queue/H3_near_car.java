package B9_Heaps.priority_queue;

import java.util.PriorityQueue;

public class H3_near_car {
    static class point implements Comparable<point>{
        int x,y,distsq,idx;

        public point(int x,int y, int distsq,int idx){
            this.x=x;
            this.y=y;
            this.distsq=distsq;
            this.idx=idx;
        }

        @Override
        public int compareTo(point p2){
            return this.distsq-p2.distsq;
        }


    }
    public static void main(String[] args) {
        int pts[][]={{3,3},{5,-1},{-2,4}};
        int k=2;

        PriorityQueue<point> pq=new PriorityQueue<>();
        for(int i=0;i<pts.length;i++){
            int distsq=pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
            pq.add(new point(pts[i][0],pts[i][1],distsq,i));
        }

        // nearest k cars
        for(int i=0;i<k;i++){
            System.out.println("C"+pq.remove().idx);
        }
    }

    // public static void main(String[] args) {
    //     int pts[][]={{3,3},{5,-1},{-2,4}};
    //     int k=2;
    //     int[] dist=new int[pts.length];
    //     PriorityQueue<Integer> pq=new PriorityQueue<>();

    //     for(int i=0;i<pts.length;i++){
    //         dist[i]= pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
    //         pq.add(dist[i]);

    //     }
    //     for(int i=0;i<k;i++){
    //         System.out.println(pq.peek());
    //         pq.remove();
    //     }
        
    // }
    
}
