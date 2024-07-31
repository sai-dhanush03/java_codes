package B6_Greedy_Algorithms;
import java.util.*;

public class G5_max_chain {
    public static void main(String[] args) {//O(nlogn)
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pairs,Comparator.comparingInt(o->o[1]));

        int len=1;//maximum chain length
        int chainend=pairs[0][1];//last selected pair end //chain end
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>chainend){
                len++;
                chainend=pairs[i][1];
                

            }
        }

        System.out.println("Max len of chain: "+len);
    }
    
}
