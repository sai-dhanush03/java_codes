package B6_Greedy_Algorithms;
// for not sorted based on end time

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class G2_Activity_selection2 {
    public static void main(String[] args) {//O(n)
         int start[]={1,3,0,5,8,5};
         int end[]={2,4,6,7,9,9};
        //  end time based sorted


        // sorting if activities are not sorted in the end time order
        int activities[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];


        }

        //lambda function-->shortform
        Arrays.sort(activities,Comparator.comparing(o->o[2]));
        // here o->o[2] refers to how the sorting should be done here it
        // is done based on column 2 
         

        int max=0;
        ArrayList<Integer> ans=new ArrayList<>();

        // 1st act
        max=1;
        ans.add(activities[0][0]);
        int lastend=activities[0][2];//end time of choosen activity

        for(int i=1;i<end.length;i++){
            if(activities[i][1]>=lastend){
                // select activity
                max++;
                ans.add(activities[i][0]);
                lastend=activities[i][2];
            }

        }

        System.out.println("max activities= "+max);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
