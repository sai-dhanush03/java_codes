package B13_D;

import java.util.*;

public class D1_Zero_1_knapsack {
    public static int knapsack(int[] wt, int[] v, int w, int n,int[][] dp) {
        if (w == 0 || n == 0) {
            return 0;
        }
        if(dp[n][w]!=-1){
            return dp[n][w];
        }
        if (wt[n-1] <= w) {
            // take
            int ans1 = v[n-1] + knapsack(wt, v, w - wt[n-1], n - 1,dp);
            // not take
            int ans2 = knapsack(wt, v, w, n - 1,dp);
            // return Math.max(ans1, ans2);
            dp[n][w]=Math.max(ans1,ans2);
            return dp[n][w];

        } else {
            dp[n][w]= knapsack(wt, v, w, n - 1,dp);
            return dp[n][w];
            // dp[n][w]=
        }

    }


    // create table
    // meaning(i,j)
    // fill bottom up small to large
    // dp[i][j] : max profit at 
    // i=no.of items ; j=weight; 
    public static int knapsacktab(int[] wt, int[] val,int w){
        int[][] dp=new int[val.length+1][w+1];
        // Arrays.fill(dp,-1);
        for(int i=0;i<dp[0].length;i++){//items 0
            dp[0][i]=0;
        }
        for(int i=0;i<dp.length;i++){//wt 0
            dp[i][0]=0;
        }

        // valid
        for(int i=1;i<val.length+1;i++){
            for(int j=1;j<w+1;j++){
                int value=val[i-1];
                int weight=wt[i-1];
                if(weight<=j){
                    // take
                    int incpro=value+dp[i-1][j-weight];//include profit
                    // not take
                    int excpro=dp[i-1][j];
                    dp[i][j]=Math.max(incpro,excpro);

                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        print(dp);

        return dp[val.length][w];
    }

    public static void print(int[][] dp){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[] wt={2,5,1,3,4};
        int[] val={15,14,10,45,30};
        int w=7;
        int[][] dp=new int[val.length+1][w+1];
        // Arrays.fill(dp,-1);
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;

            }
        }
        System.out.println(knapsack(wt,val,w,wt.length,dp));
        System.out.println(knapsacktab(wt,val,w));
        // print(dp);
        

    }
}
