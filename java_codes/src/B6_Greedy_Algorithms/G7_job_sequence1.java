package B6_Greedy_Algorithms;
import java.util.*;
// tring my technique for orig refer next prblm

public class G7_job_sequence1 {
    public static void main(String[] args) {
        int jobInfo[][]={{4,20},{1,10},{1,40},{1,30}};
        int jobs[][]=new int[jobInfo.length][3];

        for(int i=0;i<jobInfo.length;i++){
            jobs[i][0]=i;//id
            jobs[i][1]=jobInfo[i][0];//deadline
            jobs[i][2]=jobInfo[i][1];//profit
        }

        Arrays.sort(jobs,Comparator.comparingInt(o->o[2]));
        int time=0;
        ArrayList<Integer> seq=new ArrayList<>();
        for(int i=jobs.length-1;i>=0;i--){
            int curr=jobs[i][1];
            if(curr>time){
                time++;
                seq.add(jobs[i][0]);
            }

        }
        System.out.println("max jobs that can be done: "+seq.size());
        System.out.println(seq);

    }

    
}
