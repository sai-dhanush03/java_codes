package B6_Greedy_Algorithms;
import java.util.Collections;
import java.util.Arrays;
// We are given a bar of chocolate composed of mxn square pieces.
//  One should break the chocolate into single squares. Each break of a part of the chocolate is charged a cost expressed by a positive integer. 
// This cost does not depend on the size of the part that is being broken but only depends on the line the break goes along.
//  Let us denote the costs of breaking along consecutive vertical lines with x1, x2, ..., xm-1 and 
// along horizontal lines with y1, y2, ..., yn-1. Compute the minimal cost of breaking the whole chocolate into single squares

public class G8_chocolate {
       public static void main(String[] args) {
        int n=4,m=6;
        Integer costver[]={2,1,3,1,4};
        Integer costhor[]={4,1,2};

        Arrays.sort(costver, Collections.reverseOrder());
        Arrays.sort(costhor, Collections.reverseOrder());

        int h=0,v=0;// this denotes kaunsa vertical/horizontal cut lag raha hu or pointers
        int hp=1,vp=1;//no.of pieces of hor / vertical 
        int cost=0;
        int no_of_cuts=0;

        while(h<costhor.length&&v<costver.length){
            //vertical cost<hor cost
            if(costver[v]<=costhor[h]){//horizontal cut
                cost+=(costhor[h]*vp);
                hp++;
                h++;
                no_of_cuts++;

            }else{//vertical cut
                cost+=(costver[v]*hp);
                vp++;
                v++;
                no_of_cuts++;

            }
        }
        while(h<costhor.length){
                cost+=(costhor[h]*vp);
                hp++;
                h++;
                no_of_cuts++;

        }

        while(v<costver.length){
             cost+=(costver[v]*hp);
                vp++;
                v++;
                no_of_cuts++;

        }

        System.out.println("Mic cost of cuts= "+cost);
        System.out.println("No.of cuts= "+no_of_cuts);



       }
}
