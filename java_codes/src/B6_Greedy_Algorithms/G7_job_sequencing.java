package B6_Greedy_Algorithms;
import java.util.ArrayList;
import java.util.*;

public class G7_job_sequencing {
    static class job{
        int deadline;
        int profit;
        int id;

        public job(int i,int d,int p){
            id=i;
            deadline=d;
            profit=p;
        }
    }
     public static void main(String[] args) {
        int jobInfo[][]={{4,20},{1,10},{1,40},{1,30}};

        ArrayList<job> jobs=new ArrayList<>();
        for(int i=0;i<jobInfo.length;i++){
            jobs.add(new job(i,jobInfo[i][0],jobInfo[i][1]));

        }

        Collections.sort(jobs, (obj1, obj2)->obj2.profit-obj1.profit);//descending sorting is done based on profit
        // syntax to sort objects it is lambda fun
        ArrayList<Integer> seq=new ArrayList<>();
        int time=0;
        for(int i=0;i<jobs.size();i++){
            job curr=jobs.get(i);
            if(curr.deadline>time){
                seq.add(curr.id);
                time++;
            }

             
        }
        System.out.println("Max jobs that can be done :"+seq.size());

        System.out.println(seq);



     }
    
}
