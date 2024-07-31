package B9_Heaps.priority_queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class P1_priority_queue {
                                    //an interface
    static class student implements Comparable<student>{//it is to prioritse based on the specific constraint
                                //   this helps to compare the objects of the student
        String name;
        int rank;

        public student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }

        @Override
        public int compareTo(student s2){
            return this.rank-s2.rank;//helps to proritze based on rank
        }

    }
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq=new PriorityQueue<>();
        PriorityQueue<student> pq=new PriorityQueue<>();
        // low int value high priority
        // PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        // this is to give high priority to high int value

        pq.add(new student("A",4));//O(logn)
        pq.add(new student("B",5));//O(logn)
        pq.add(new student("C",2));//O(logn)
        pq.add(new student("D",12));//O(logn)
        

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+"->"+pq.peek().rank);
            // System.out.println(pq.remove().rank+"remove ");
            pq.remove();//O(logn);
        }
    }
}
