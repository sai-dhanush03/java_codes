package alpha_codes;

public class A26_bitmanipulation {
    public static void odd_even(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }

    public static int get_ith_bit(int n,int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }

    }

    public static int set_ith_bit(int n,int i){
        int bitmask=1<<i;
      return n|bitmask;

    }

    public static int clear_ith_bit(int n, int i){
        int bitmask=~(1<<i);
        return n & bitmask;
    }

    public static int update_ith_bit(int n, int i, int newbit){
        // if(newbit==0){
        //     return clear_ith_bit(n,i);
        // }
        // else{
        //     return set_ith_bit(n,i);
        // }

       n=clear_ith_bit(n,i);
       int bitmask = newbit<<i;
       return n | bitmask;

    }

    public static int clearIbits_range(int n, int i, int j){
        int a=((~0<<(j+1)));
        int b=(i<<i)-1;
        int bitmask=a|b;
        return n & bitmask;
    }

    // power of 2 or not 
    public static boolean ispowerof2(int n){
        return (n&(n-1))==0; 


    }

    // count set bits
    public static int count_set_bits(int n){
        int count=0;
        while(n>0){
            if((n&1)!=0){ //check our LSB
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        // System.out.println(5&6);
        // System.out.println(5^6);
        // System.out.println(~0);
        // System.out.println(5<<2);
        // odd_even(3);
        // odd_even(4);
        // odd_even(1);
        // odd_even(2);

        // System.out.println(get_ith_bit(100,3));

        // System.out.println(set_ith_bit(10,2));

        // System.out.println(clear_ith_bit(10,1));

        // System.out.println(update_ith_bit(10,2,1));
        // System.out.println(clearIbits_range(10,2,4));

        // System.out.println(ispowerof2(16));

        System.out.println(count_set_bits(15+1));
       

    }
}
