package alpha_codes;

import java.util.Arrays;

public class A10_max_sub_array_prefix {
    public static void maxsubarraysum(int num[]){
        int currsum=0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[]= new int[num.length];
        prefix[0]=num[0];

        // calc prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+num[i];
        }

        for(int i=0; i<num.length; i++){
            int start=i;
            for(int j=i; j<num.length; j++){
                int end=j;
                currsum=start == 0 ? prefix[end] : prefix[end]-prefix[start-1];//ternary operator
                // for(int k=start; k<=end;k++){
                //     currsum=currsum+num[k];
                // }
                // System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
                
            }
            // System.out.println();
        }
        System.out.println("max sum= "+ maxsum);
    }

    public static void kadanes(int num[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;

        for(int i=0;i<num.length;i++){
            cs=cs+num[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("max sub array sum is: "+ms);
    }

     public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
            else{
                return false;
            }
        }
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=i+1;j<nums.length;j++){
    //             if(nums[i]==nums[j]){
    //                 return true;
    //             }
    //         }
    //     }
    // return false;
        return false;
    }

    public static void main(String[] args) {
        int num[]={-2,-3,4,-1,-2,1,5,-3};
        // maxsubarraysum(num);
        kadanes(num);
    }
}
