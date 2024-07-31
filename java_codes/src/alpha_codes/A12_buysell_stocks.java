package alpha_codes;

public class A12_buysell_stocks {
    public static int buysellstocks(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        // System.out.println(buyprice);
        int maxprofit=0;

        for(int i=0;i<prices.length;i++){
            
            if(buyprice<prices[i]){
                int profit=prices[i]-buyprice;
                maxprofit=Math.max(maxprofit,profit);
            }
            else{
                buyprice=prices[i];
            }
        }
        return maxprofit;

    }

    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};//o(n)
        System.out.println(buysellstocks(prices));
    }
}
