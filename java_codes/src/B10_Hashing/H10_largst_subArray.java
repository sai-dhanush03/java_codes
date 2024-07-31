package B10_Hashing;
import java.util.*;
// return the size of the largest subarray with size zero;

public class H10_largst_subArray {
    public static void main(String[] args) {
        int[] arr={15,-2,2,-8,1,7,10,23};
        HashMap<Integer,Integer> map=new HashMap<>();
        // (sum,idx)
        int sum=0;
        int len=0;
        
        for(int j=0;j<arr.length;j++){//O(n)
            sum=sum+arr[j];
            if(map.containsKey(sum)){
                len=Math.max(len,j-map.get(sum));
            }else{
                map.put(sum,j);
            }
        }

        System.out.println("Largest sub array sum= "+len);

    }
}
