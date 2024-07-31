package B13_D;

import java.util.*;

public class D2_unbounded_knapsack {
    
    public static int unboundedknapsack(int[] wt, int[] v, int w) {
        int n=v.length;
        int[][] dp=new int[n+1][w+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<w+1;i++){
            dp[0][i]=0;
        }
        

        for(int i=1;i<n+1;i++){
            for(int j=1;j<w+1;j++){
                if(wt[i-1]<=j){//valid
                    // ********kry diff is here**********
                    int ans1=v[i-1]+dp[i][j-wt[i-1]];
                    int ans2=dp[i-1][j];
                    dp[i][j]=Math.max(ans1,ans2);

                }else{//not valid
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][w];

    }
    public static void main(String[] args){
        int[] wt={2,5,1,3,4};
        int[] val={15,14,10,45,30};
        int w=7;

        System.out.println(unboundedknapsack(wt,val,w));
    }
}
