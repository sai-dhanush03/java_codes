package B1_Backtracking;
//only right and down allowed

public class B5_Gridways {
    public static int printgridways(int i, int j ,int m, int n){
        // base case
        if(i==m-1&&j==n-1){//cond for last cell
            return 1;
        }
        else if( i==m || j==n){
            return 0;
        }
        int w1=printgridways(i+1,j,m,n);
        int w2=printgridways(i,j+1,m,n);
        return w1+w2;
        

    }
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(printgridways(0,0, n, m));
    }
}
