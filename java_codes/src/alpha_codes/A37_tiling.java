package alpha_codes;

public class A37_tiling {

    public static int tiling_prblm(int n){ //2xn (floor size)
        // base case
        if(n==0||n==1){
            return 1;
        }
        // kaam

        // vertical choice
         int fnm1=tiling_prblm(n-1);

        //  horizontal choice
        int fnm2=tiling_prblm(n-2);

        int totways= fnm1+fnm2;
        return totways;

    }

    public static void main(String[] args) {
        System.out.println(tiling_prblm(4) );
    }

    
}
