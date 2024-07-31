package B13_D;

public class D3_rod_cutting {
    public static int rodcut(int[] len,int[] price,int t){
        int dp[][]=new int[len.length+1][t+1];
        for(int i=0;i<len.length+1;i++){
            dp[i][0]=0;

        }
        for(int i=0;i<t+1;i++){
            dp[0][i]=0;

        }

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(len[i-1]<=j){
                    dp[i][j]=Math.max(price[i-1]+dp[i][j-len[i-1]], dp[i-1][j]);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[len.length][t];
    }
    public static void main(String[] args) {
        int[] len={1,2,3,4,5,6,7,8};
        int[] prices={1,5,8,9,10,17,17,20};
        int tot=8;
        System.out.println(rodcut(len, prices, tot));
    }
}
