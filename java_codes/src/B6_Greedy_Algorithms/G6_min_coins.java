package B6_Greedy_Algorithms;
import java.util.Arrays;
import java.util.Collections;
// import java.util.Comparator;
import java.util.ArrayList;

public class G6_min_coins {
     public static void main(String[] args) {
       Integer coins[]={1,2,5,10,20,50,100,500,2000};
        // Integer is necessary to call reverseorder

        Arrays.sort(coins,Collections.reverseOrder());   //or
        // Arrays.sort(coins,Comparator.reverseOrder());
        int count=0;
        int amount=113;
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    count++;
                    ans.add(coins[i]);
                    amount-=coins[i];
                }
            }
        }

        System.out.println("Total min no.of coins/notes used= "+count);
        System.out.println(ans);

     }

    
}
