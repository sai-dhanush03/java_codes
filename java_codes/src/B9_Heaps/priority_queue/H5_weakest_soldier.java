package B9_Heaps.priority_queue;
import java.util.*;
// we can also compare objects of a class without this Comparable and compareTo
// search abr this in sources

public class H5_weakest_soldier {
    static class row implements Comparable<row>{
        int sol;//soliders
        int idx;

        public row(int sol,int idx){
            this.sol=sol;
            this.idx=idx;
        }

        @Override
        public int compareTo(row r2){
            // return 
            if(this.sol==r2.sol){//if soliders are equal then compare based on idx values
                                  //else with no.of soliders
                return this.idx-r2.idx;
            }
            return this.sol-r2.sol; //else with no.of soliders
        }

    }
    public static void main(String[] args) {
        int army[][]={ {1,0,0,0},
                       {1,1,1,1},
                       {1,0,0,0},
                       {1,0,0,0} };
            int k=2;

            PriorityQueue<row> pq=new PriorityQueue<>();
            // PriorityQueue<row> pq=new PriorityQueue<>(Collections.reverseOrder());
            for(int i=0;i<army.length;i++){
                int count=0;
                for(int j=0;j<army[0].length;j++){
                    count+=army[i][j]==1?1:0;//ternary oprtr if army[i][j]==1 then count=count+1;
                }
                pq.add(new row(count,i));
            }

            for(int i=0;i<k;i++){
                System.out.println("R"+ pq.remove().idx);
            }


    }
}
