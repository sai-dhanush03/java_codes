package B6_Greedy_Algorithms;
import java.util.*;
 

public class G1_Activity_selection {
    public static void main(String[] args) {//O(n)
         int start[]={1,3,0,5,8,5};
         int end[]={2,4,6,7,9,9};
        //  end time based sorted


        // sorting if activities are not sorted in the end time order
        int activities[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=start[i];


        }

        //lambda function-->shortform
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));
        // here o->o[2] refers to how the sorting should be done 
         

        int max=0;
        ArrayList<Integer> ans=new ArrayList<>();

        // 1st act
        max=1;
        ans.add(0);
        int lastend=end[0];//end time of choosen activity

        for(int i=1;i<end.length;i++){
            if(start[i]>=lastend){
                // select activity
                max++;
                ans.add(i);
                lastend=end[i];
            }

        }

        System.out.println("max activities= "+max);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
